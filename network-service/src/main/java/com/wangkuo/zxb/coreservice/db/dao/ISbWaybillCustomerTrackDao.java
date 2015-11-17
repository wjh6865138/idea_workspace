package com.wangkuo.zxb.coreservice.db.dao;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.db.common.GenericDao;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;

import java.util.List;

/**
 * Created by cuihe on 15/11/17.
 */
public interface ISbWaybillCustomerTrackDao extends GenericDao<SbWaybillCustomerTrack,Long> {

    /**
     * 根据systemId,查询列表
     * @param param
     * @return
     */
    List<SbWaybillCustomerTrack> lstBySystemId(QueryWaybillCustomerTrackParam param);


}
