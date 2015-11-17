package com.wangkuo.zxb.coreservice.api.data.waybilltrack;

import com.wangkuo.zxb.coreservice.api.common.PageParam;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mark on 15/7/6.
 */
public class QueryWaybillCustomerTrackParam extends PageParam implements Serializable {

    private String waybillSystemId;

    public String getWaybillSystemId() {
        return waybillSystemId;
    }

    public void setWaybillSystemId(String waybillSystemId) {
        this.waybillSystemId = waybillSystemId;
    }
}
