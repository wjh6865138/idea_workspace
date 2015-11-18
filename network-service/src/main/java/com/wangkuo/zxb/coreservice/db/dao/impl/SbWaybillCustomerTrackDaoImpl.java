package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbWaybillCustomerTrackDao;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cuihe on 15/11/17.
 */
@Repository
public class SbWaybillCustomerTrackDaoImpl extends GenericMyBatisDaoImpl<SbWaybillCustomerTrack, Long> implements ISbWaybillCustomerTrackDao
{


    @Override
    public List<SbWaybillCustomerTrack> lstBySystemId(QueryWaybillCustomerTrackParam param) {

        Map<String, Object> condition = new HashMap<>();
        condition.put("waybillSystemId",param.getWaybillSystemId());


        SqlSession session = getSqlSession();
        return session.selectList(getMapperNamespace("lstBySystemId"), condition);
    }
}
