package com.wangkuo.zxb.coreservice.api.data.waybilltrack;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mark on 15/7/6.
 */
public class CreateWaybillCustomerTrackParam implements Serializable {

    private Long waybillId;

    private String memo;

    private String createName;

    private Date createTime;

    private String waybillSystemId;

    public Long getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWaybillSystemId() {
        return waybillSystemId;
    }

    public void setWaybillSystemId(String waybillSystemId) {
        this.waybillSystemId = waybillSystemId;
    }
}
