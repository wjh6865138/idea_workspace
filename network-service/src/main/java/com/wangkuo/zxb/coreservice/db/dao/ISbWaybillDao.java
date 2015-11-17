package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbWaybill;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;

/**
 * Created by cuihe on 15/11/17.
 */
public interface ISbWaybillDao extends GenericDao<SbWaybill,Long> {

    /**
     * 根据系统单号，查询运单
     * @param systemId
     * @return
     */
    SbWaybill findBySystemId(String systemId);
}
