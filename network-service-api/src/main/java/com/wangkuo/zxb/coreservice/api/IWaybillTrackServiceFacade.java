package com.wangkuo.zxb.coreservice.api;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.CreateWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillCustomerTrackListBack;

import java.util.List;

/**
 * 运单 跟踪信息
 */
public interface IWaybillTrackServiceFacade {


    /**
     * 新增运单回单（单指给客户查看的跟踪信息）
     *
     * @param param
     * @return
     */
    int createWaybillCustomerTrack(CreateWaybillCustomerTrackParam param);

    /**
     * 查询运单跟踪列表（单指给客户查看的跟踪列表）
     *
     * @param param
     * @return
     */
    List<WaybillCustomerTrackListBack> listWaybillCustomerTrack(QueryWaybillCustomerTrackParam param);


    /**
     * 删除运单跟踪信息
     *
     * @param id 跟踪id
     * @return
     */
    int deleteWaybillCustomerTrack(Long id);

}
