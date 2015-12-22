package com.wangkuo.zxb.coreservice.api.data.waybilltrack;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public class WaybillFeeBack implements Serializable {

    /**
     * 总费用
     */
    private BigDecimal totalFee;

    /**
     * 运费
     */
    private BigDecimal transportFee;

    /**
     * 提货费
     */
    private BigDecimal pickFee;

    /**
     * 送货费
     */
    private BigDecimal deliverFee;

    /**
     * 是否含税
     */
    private Boolean isTax;

    /**
     * 是否进仓
     */
    private Boolean isDepot;

    private Integer days;


    /**
     * Getter for property 'totalFee'.
     *
     * @return Value for property 'totalFee'.
     */
    public BigDecimal getTotalFee() {
        return getTransportFee().add(getDeliverFee()).add(getPickFee());
    }

    /**
     * Setter for property 'totalFee'.
     *
     * @param totalFee Value to set for property 'totalFee'.
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * Getter for property 'transportFee'.
     *
     * @return Value for property 'transportFee'.
     */
    public BigDecimal getTransportFee() {
        return null == transportFee ? BigDecimal.ZERO : transportFee;
    }

    /**
     * Setter for property 'transportFee'.
     *
     * @param transportFee Value to set for property 'transportFee'.
     */
    public void setTransportFee(BigDecimal transportFee) {
        this.transportFee = transportFee;
    }

    /**
     * Getter for property 'pickFee'.
     *
     * @return Value for property 'pickFee'.
     */
    public BigDecimal getPickFee() {
        return null == pickFee ? BigDecimal.ZERO : pickFee;
    }

    /**
     * Setter for property 'pickFee'.
     *
     * @param pickFee Value to set for property 'pickFee'.
     */
    public void setPickFee(BigDecimal pickFee) {
        this.pickFee = pickFee;
    }

    /**
     * Getter for property 'deliverFee'.
     *
     * @return Value for property 'deliverFee'.
     */
    public BigDecimal getDeliverFee() {
        return null == deliverFee ? BigDecimal.ZERO : deliverFee;
    }

    /**
     * Setter for property 'deliverFee'.
     *
     * @param deliverFee Value to set for property 'deliverFee'.
     */
    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Boolean getIsTax() {
        return isTax;
    }

    public void setIsTax(Boolean isTax) {
        this.isTax = isTax;
    }

    public Boolean getIsDepot() {
        return isDepot;
    }

    public void setIsDepot(Boolean isDepot) {
        this.isDepot = isDepot;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
