package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipRoutePriceDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoutePrice;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-21
 */
@Repository
public class SbCustomerVipRoutePriceDaoImpl extends GenericMyBatisDaoImpl<SbCustomerVipRoutePrice, Long> implements ISbCustomerVipRoutePriceDao {

    @Override
    public SbCustomerVipRoutePrice selectByCustomerAndGoods(Long customerId, Long vipRouteId, Integer goodType, Double payload) {
        Map<String, Object> map = new HashMap<>();
        map.put("customerId", customerId);
        map.put("vipRouteId", customerId);
        map.put("goodType", goodType);
        map.put("payload", payload);

        SqlSession session = getSqlSession();
        return session.selectOne(getMapperNamespace("selectByCustomerAndGoods"), map);
    }
}
