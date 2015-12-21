package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoutePrice;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public interface ISbCustomerVipRoutePriceDao extends GenericDao<SbCustomerVipRoutePrice, Long> {

    /**
     * 根据客户和货物属性获取价格
     *
     * @param customerId 客户id
     * @param goodType   货物类型  1:轻货 2:重货
     * @param payload    轻货传入体积 重货传入重量
     * @return
     */
    SbCustomerVipRoutePrice selectByCustomerAndGoods(Long customerId, Long vipRouteId, Integer goodType, Double payload);
}
