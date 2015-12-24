package com.wangkuo.zxb.coreservice.service.impl;

import com.wangkuo.zxb.coreservice.api.common.StatusAndItem;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeBack;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeParam;
import com.wangkuo.zxb.coreservice.db.dao.*;
import com.wangkuo.zxb.coreservice.db.po.*;
import com.wangkuo.zxb.coreservice.service.ISbCustomerService;
import com.wangkuo.zxb.coreservice.service.IVipWaybillFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-21
 */
@Service
public class VipWaybillFeeServiceImpl implements IVipWaybillFeeService {

    @Autowired
    private ISbCustomerVipBaseDao sbCustomerVipBaseDao;

    @Autowired
    private ISbCustomerVipGoodsDao sbCustomerVipGoodsDao;

    @Autowired
    private ISbCustomerVipRouteDao sbCustomerVipRouteDao;

    @Autowired
    private ISbCustomerVipRoutePriceDao sbCustomerVipRoutePriceDao;

    @Autowired
    private ISbCustomerVipGoodFreePickUpIntervalDao sbCustomerVipGoodFreePickUpIntervalDao;

    @Autowired
    private ISbCustomerService sbCustomerService;

    @Override
    public StatusAndItem<WaybillFeeBack> calculateWaybillFee(WaybillFeeParam param) {

        Assert.notNull(param);
        //TODO:发货地需要判断是否该网点


        StatusAndItem result = new StatusAndItem();

        SbCustomer customer = sbCustomerService.getCustomerByDownId(param.getCustomerDownId());
        if (null == customer) {
            //客户不存在
            result.setStatus(-1);
            return result;
        }


        if (sbCustomerService.isVip(customer) != 1) {
            //非vip
            result.setStatus(-2);
            return result;
        }


        SbCustomerVipGood goods = sbCustomerVipGoodsDao.selectByPrimaryKey(param.getVipGoodId());
        if (null == goods || !goods.getCustomerId().equals(customer.getId())) {
            //货物不存在
            result.setStatus(-3);
            return result;
        }

        StatusAndItem<SbCustomerVipRoutePrice> statusAndItem = findVipRoutePrice(param, customer, goods);
        if (statusAndItem.getStatus() != 1) {
            //没有价格-6,没有线路-4
            result.setStatus(statusAndItem.getStatus());
            return result;
        }
        SbCustomerVipRoutePrice routePrice = statusAndItem.getItem();
        BigDecimal transportFee = BigDecimal.ZERO;
        if (routePrice.getGoodType() == 1) {
            transportFee = routePrice.getPrice().multiply(new BigDecimal(param.getVolume()));
        } else {
            transportFee = routePrice.getPrice().multiply(new BigDecimal(param.getWeight()));
        }

        WaybillFeeBack waybillFeeBack = new WaybillFeeBack();
        waybillFeeBack.setTransportFee(transportFee);

        routePrice.getVipRouteId();

        SbCustomerVipRoute customerVipRoute = sbCustomerVipRouteDao.selectByPrimaryKey(routePrice.getVipRouteId());
        waybillFeeBack.setDays(customerVipRoute.getHoursLimit());

        SbCustomerVipBase base = sbCustomerVipBaseDao.selectByCustomerId(customer.getId());
        if (base != null) {
            if (base.getIsTax() != null && base.getIsTax() == 1) {
                waybillFeeBack.setIsTax(true);
            } else {
                waybillFeeBack.setIsTax(false);
            }
            if (base.getIsDepot() != null && base.getIsDepot() == 1) {
                waybillFeeBack.setIsDepot(true);
            } else {
                waybillFeeBack.setIsDepot(false);
            }
        }

        double payload = goods.getGoodType() == 1 ? param.getVolume() : param.getWeight();

        if (sbCustomerVipGoodFreePickUpIntervalDao.countByGoodIdAndPayload(goods.getId(), payload) > 0) {
            waybillFeeBack.setPickFee(BigDecimal.ZERO);
            waybillFeeBack.setDeliverFee(BigDecimal.ZERO);
            result.setStatus(1);
        } else {
            //TODO:不存在免费区间,根据规则计算提/送费用
            result.setStatus(-5);
        }
        result.setItem(waybillFeeBack);
        return result;
    }

    /**
     * 获取线路价格
     *
     * @param param
     * @param customer
     * @param goods
     * @return
     */
    private StatusAndItem<SbCustomerVipRoutePrice> findVipRoutePrice(WaybillFeeParam param, SbCustomer customer, SbCustomerVipGood goods) {
        double payload = goods.getGoodType() == 1 ? param.getVolume() : param.getWeight();

        StatusAndItem<SbCustomerVipRoutePrice> statusAndItem = new StatusAndItem<>();
        SbCustomerVipRoutePrice price = null;

        List<SbCustomerVipRoute> allRoutes = new LinkedList<>();
        List<SbCustomerVipRoute> countyVipRoutes = sbCustomerVipRouteDao.selectByCustomerAndArea(customer.getId(), param.getEndProvinceId(), param.getEndCityId(), param.getEndCountyId());
        allRoutes.addAll(countyVipRoutes);

        List<SbCustomerVipRoute> cityVipRoutes = sbCustomerVipRouteDao.selectByCustomerAndArea(customer.getId(), param.getEndProvinceId(), param.getEndCityId());
        allRoutes.addAll(cityVipRoutes);

        if (null != allRoutes && !allRoutes.isEmpty()) {
            for (SbCustomerVipRoute vipRoute : allRoutes) {
                price = sbCustomerVipRoutePriceDao.selectByCustomerAndGoods(customer.getId(), vipRoute.getId(), goods.getGoodType(), payload);
                if (null != price) {
                    break;
                }
            }
            if (price == null) {
                //没有价格
                statusAndItem.setStatus(-6);
            } else {
                statusAndItem.setStatus(1);
                statusAndItem.setItem(price);
            }
        } else {
            //没有线路
            statusAndItem.setStatus(-4);
        }
        return statusAndItem;
    }
}
