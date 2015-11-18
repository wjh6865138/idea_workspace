package com.wangkuo.zxb.coreservice.db.po;

import java.util.Date;

public class SbWaybillCustomerTrack {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.waybill_id
     *
     * @mbggenerated
     */
    private Long waybillId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.create_name
     *
     * @mbggenerated
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sb_waybill_customer_track.waybill_system_id
     *
     * @mbggenerated
     */
    private String waybillSystemId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.id
     *
     * @return the value of sb_waybill_customer_track.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.id
     *
     * @param id the value for sb_waybill_customer_track.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.waybill_id
     *
     * @return the value of sb_waybill_customer_track.waybill_id
     *
     * @mbggenerated
     */
    public Long getWaybillId() {
        return waybillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.waybill_id
     *
     * @param waybillId the value for sb_waybill_customer_track.waybill_id
     *
     * @mbggenerated
     */
    public void setWaybillId(Long waybillId) {
        this.waybillId = waybillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.memo
     *
     * @return the value of sb_waybill_customer_track.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.memo
     *
     * @param memo the value for sb_waybill_customer_track.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.create_name
     *
     * @return the value of sb_waybill_customer_track.create_name
     *
     * @mbggenerated
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.create_name
     *
     * @param createName the value for sb_waybill_customer_track.create_name
     *
     * @mbggenerated
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.create_time
     *
     * @return the value of sb_waybill_customer_track.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.create_time
     *
     * @param createTime the value for sb_waybill_customer_track.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sb_waybill_customer_track.waybill_system_id
     *
     * @return the value of sb_waybill_customer_track.waybill_system_id
     *
     * @mbggenerated
     */
    public String getWaybillSystemId() {
        return waybillSystemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sb_waybill_customer_track.waybill_system_id
     *
     * @param waybillSystemId the value for sb_waybill_customer_track.waybill_system_id
     *
     * @mbggenerated
     */
    public void setWaybillSystemId(String waybillSystemId) {
        this.waybillSystemId = waybillSystemId == null ? null : waybillSystemId.trim();
    }
}