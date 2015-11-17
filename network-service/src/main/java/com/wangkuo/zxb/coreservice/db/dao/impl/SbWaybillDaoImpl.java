package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbWaybillDao;
import com.wangkuo.zxb.coreservice.db.po.SbWaybill;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * Created by cuihe on 15/11/17.
 */
@Repository
public class SbWaybillDaoImpl extends GenericMyBatisDaoImpl<SbWaybill, Long> implements ISbWaybillDao {


    @Override
    public SbWaybill findBySystemId(String systemId) {
        SqlSession session = getSqlSession();
        return session.selectOne(getMapperNamespace("findBySystemId"), systemId);
    }
}
