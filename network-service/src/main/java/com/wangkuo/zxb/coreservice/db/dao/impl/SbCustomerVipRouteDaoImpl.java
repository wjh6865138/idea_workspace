package com.wangkuo.zxb.coreservice.db.dao.impl;

import com.wangkuo.zxb.coreservice.db.common.GenericMyBatisDaoImpl;
import com.wangkuo.zxb.coreservice.db.dao.ISbCustomerVipRouteDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoute;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-21
 */
@Repository
public class SbCustomerVipRouteDaoImpl extends GenericMyBatisDaoImpl<SbCustomerVipRoute, Long> implements ISbCustomerVipRouteDao {
    @Override
    public List<SbCustomerVipRoute> selectByCustomerAndArea(Long customerId, Long provinceId, Long cityId) {
        Map<String, Object> map = new HashMap<>();
        map.put("customerId", customerId);
        map.put("provinceId", provinceId);
        map.put("cityId", cityId);
        SqlSession session = getSqlSession();
        return session.selectList(getMapperNamespace("selectByCustomerAndArea"), map);
    }

    @Override
    public List<SbCustomerVipRoute> selectByCustomerAndArea(Long customerId, Long provinceId, Long cityId, Long countryId) {
        Map<String, Object> map = new HashMap<>();
        map.put("customerId", customerId);
        map.put("provinceId", provinceId);
        map.put("cityId", cityId);
        map.put("countryId", countryId);
        SqlSession session = getSqlSession();
        return session.selectList(getMapperNamespace("selectByCustomerAndArea"), map);
    }
}
