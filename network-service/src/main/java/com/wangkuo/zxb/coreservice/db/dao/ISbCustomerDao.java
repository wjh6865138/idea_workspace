package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomer;

/**
 * Created by wangsy on 2015/12/16.
 */
public interface ISbCustomerDao extends GenericDao<SbCustomer, Long> {

    SbCustomer getCustomerByDownId(String downId);
}
