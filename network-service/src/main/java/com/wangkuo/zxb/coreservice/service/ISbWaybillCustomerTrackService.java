package com.wangkuo.zxb.coreservice.service;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.CreateWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillCustomerTrackListBack;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;

import java.util.List;

/**
 * Created by cuihe on 15/11/17.
 */
public interface ISbWaybillCustomerTrackService {


    /**
     * 添加运单跟踪（只指客户可查看的跟踪信息）
     * @param param
     * @return
     */
    int createWaybillCustomerTrack(CreateWaybillCustomerTrackParam param);


    List<SbWaybillCustomerTrack> listWaybillCustomerTrack(QueryWaybillCustomerTrackParam param);

    /**
     * 删除运单跟踪信息
     *
     * @param id 跟踪id
     * @return
     */
    int deleteWaybillCustomerTrack(Long id);
}
