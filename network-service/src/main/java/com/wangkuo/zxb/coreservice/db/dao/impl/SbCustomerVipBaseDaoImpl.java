package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipBaseDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipBase;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
@Repository
public class SbCustomerVipBaseDaoImpl extends GenericMyBatisDaoImpl<SbCustomerVipBase, Long> implements ISbCustomerVipBaseDao {


    @Override
    public SbCustomerVipBase selectByCustomerId(Long customerId) {

        SqlSession session = getSqlSession();
        return session.selectOne(getMapperNamespace("selectByCustomerId"), customerId);
    }
}
