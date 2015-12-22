package com.wangkuo.zxb.coreservice.service.impl;

import com.wangkuo.zxb.coreservice.api.common.StatusAndItem;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeBack;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillFeeParam;
import com.wangkuo.zxb.coreservice.db.dao.*;
import com.wangkuo.zxb.coreservice.db.po.SbCustomer;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoute;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoutePrice;
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
        if (null == goods && !goods.getCustomerId().equals(customer.getId())) {
            //货物不存在
            result.setStatus(-3);
            return result;
        }

        SbCustomerVipRoutePrice routePrice = findVipRoutePrice(param, customer, goods);
        if (null == routePrice) {
            //没有价格
            result.setStatus(-4);
            return result;
        }


        WaybillFeeBack waybillFeeBack = new WaybillFeeBack();
        waybillFeeBack.setTransportFee(routePrice.getPrice());

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
    private SbCustomerVipRoutePrice findVipRoutePrice(WaybillFeeParam param, SbCustomer customer, SbCustomerVipGood goods) {
        double payload = goods.getGoodType() == 1 ? param.getVolume() : param.getWeight();

        SbCustomerVipRoutePrice routePrice = null;

        List<SbCustomerVipRoute> allRoutes = new LinkedList<>();
        List<SbCustomerVipRoute> vipRoutes = sbCustomerVipRouteDao.selectByCustomerAndArea(customer.getId(), param.getEndProvinceId(), param.getEndCityId(), param.getEndCountyId());
        allRoutes.addAll(vipRoutes);

        vipRoutes = sbCustomerVipRouteDao.selectByCustomerAndArea(customer.getId(), param.getEndProvinceId(), param.getEndCityId());
        allRoutes.addAll(vipRoutes);

        if (null != vipRoutes && !vipRoutes.isEmpty()) {
            for (SbCustomerVipRoute vipRoute : vipRoutes) {
                routePrice = sbCustomerVipRoutePriceDao.selectByCustomerAndGoods(customer.getId(), vipRoute.getId(), goods.getGoodType(), payload);
                if (null != routePrice) {
                    break;
                }
            }
        }

        return routePrice;
    }
}
