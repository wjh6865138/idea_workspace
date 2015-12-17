package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGood;

import java.util.List;

/**
 * Created by wangsy on 2015/12/16.
 */
public interface ISbCustomerVipGoodsDao extends GenericDao<SbCustomerVipGood, Long> {
    /**
     * 根据客户id 获取vip的货物列表
     *
     * @param customerId
     * @return
     */
    List<SbCustomerVipGood> getVipGoodsByCustomerId(Long customerId);

}
