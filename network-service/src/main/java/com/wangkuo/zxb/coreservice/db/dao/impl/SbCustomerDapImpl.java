package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomer;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by wangsy on 2015/12/16.
 */
public class SbCustomerDapImpl extends GenericMyBatisDaoImpl<SbCustomer, Long> implements ISbCustomerDao {


    @Override
    public SbCustomer getCustomerByDownId(String downId) {
        SqlSession session = getSqlSession();
        return  session.selectOne(getMapperNamespace("selectByDownId"), downId);
    }
}
