package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGoodFreePickUpInterval;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public interface ISbCustomerVipGoodFreePickUpIntervalDao extends GenericDao<SbCustomerVipGoodFreePickUpInterval,Long> {


    int countByGoodIdAndPayload(Long goodId,Double payload);



}
