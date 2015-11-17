package com.wangkuo.zxb.coreservice.service.impl;

import com.wangkuo.zxb.coreservice.api.data.waybilltrack.CreateWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.QueryWaybillCustomerTrackParam;
import com.wangkuo.zxb.coreservice.api.data.waybilltrack.WaybillCustomerTrackListBack;
import com.wangkuo.zxb.coreservice.db.dao.ISbWaybillCustomerTrackDao;
import com.wangkuo.zxb.coreservice.db.dao.ISbWaybillDao;
import com.wangkuo.zxb.coreservice.db.po.SbWaybill;
import com.wangkuo.zxb.coreservice.db.po.SbWaybillCustomerTrack;
import com.wangkuo.zxb.coreservice.service.ISbWaybillCustomerTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuihe on 15/11/17.
 */
@Service
public class SbWaybillCustomerTrackServiceImpl  implements ISbWaybillCustomerTrackService{

    @Autowired
    ISbWaybillDao sbWaybillDao;

    @Autowired
    ISbWaybillCustomerTrackDao sbWaybillCustomerTrackDao;


    @Override
    public int createWaybillCustomerTrack(CreateWaybillCustomerTrackParam param) {
        if(param.getWaybillId()==null)
        {
            //如果运单id为空，则根据运单systemId查询到哪运单
            SbWaybill sbWaybill= sbWaybillDao.findBySystemId(param.getWaybillSystemId());
            if(sbWaybill==null) return -1;//运单不存在
            param.setWaybillId(sbWaybill.getId());
        }
        SbWaybillCustomerTrack s=new SbWaybillCustomerTrack();
        s.setWaybillId(param.getWaybillId());
        s.setWaybillSystemId(param.getWaybillSystemId());
        s.setCreateName(param.getCreateName());
        s.setCreateTime(param.getCreateTime());
        s.setMemo(param.getMemo());
        sbWaybillCustomerTrackDao.insertSelective(s);
        return 1;
    }

    @Override
    public List<SbWaybillCustomerTrack> listWaybillCustomerTrack(QueryWaybillCustomerTrackParam param) {
        return sbWaybillCustomerTrackDao.lstBySystemId(param);
    }
}
