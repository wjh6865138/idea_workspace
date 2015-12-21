package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbCustomerVipRoute;

import java.util.List;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public interface ISbCustomerVipRouteDao extends GenericDao<SbCustomerVipRoute, Long> {

    List<SbCustomerVipRoute> selectByCustomerAndArea(Long customerId, Long provinceId, Long cityId);

    List<SbCustomerVipRoute> selectByCustomerAndArea(Long customerId, Long provinceId, Long cityId, Long countryId);
}
