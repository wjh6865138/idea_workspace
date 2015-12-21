package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipBase;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public interface ISbCustomerVipBaseDao extends GenericDao<SbCustomerVipBase, Long> {

    /**
     * 根据customerId获取vip基本配置
     * @param customerId
     * @return
     */
    SbCustomerVipBase selectByCustomerId(Long customerId);
}
