package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipGoodFreePickUpIntervalDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipGoodFreePickUpInterval;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
@Repository
public class SbCustomerVipGoodFreePickUpIntervalDaoImpl extends GenericMyBatisDaoImpl<SbCustomerVipGoodFreePickUpInterval, Long> implements ISbCustomerVipGoodFreePickUpIntervalDao {

    @Override
    public int countByGoodIdAndPayload(Long goodId, Double payload) {

        SqlSession session = getSqlSession();
        Map<String, Object> map = new HashMap<>();
        map.put("vipGoodId", goodId);
        map.put("payload", payload);

        return (Integer) session.selectOne(getMapperNamespace("countByGoodIdAndPayload"), map);
    }
}
