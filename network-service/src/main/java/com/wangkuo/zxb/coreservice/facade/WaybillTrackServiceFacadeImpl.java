package com.wangkuo.zxb.coreservice.facade;

import com.wangkuo.zxb.coreservice.api.IWaybillTrackServiceFacade;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.CreateWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillCustomerTrackListBack;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;
import com.wangkuo.zxb.coreservice.service.ISbWaybillCustomerTrackService;
import com.wangkuo.zxb.coreservice.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuihe on 15/11/17.
 */
@Service("waybillTrackServiceFacade")
public class WaybillTrackServiceFacadeImpl implements IWaybillTrackServiceFacade
{

    @Autowired
    private BeanMapper beanMapper;

    @Autowired
    private ISbWaybillCustomerTrackService sbWaybillCustomerTrackService;


    @Override
    public int createWaybillCustomerTrack(CreateWaybillCustomerTrackParam param) {
        return sbWaybillCustomerTrackService.createWaybillCustomerTrack(param);
    }

    @Override
    public List<WaybillCustomerTrackListBack> listWaybillCustomerTrack(QueryWaybillCustomerTrackParam param) {
        List<SbWaybillCustomerTrack> lst =sbWaybillCustomerTrackService.listWaybillCustomerTrack(param);
        return  beanMapper.mapList(lst,WaybillCustomerTrackListBack.class);
    }
}
