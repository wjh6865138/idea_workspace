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
     * Getter for property 'totalFee'.
     *
     * @return Value for property 'totalFee'.
     */
    public BigDecimal getTotalFee() {
        return totalFee;
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
        return transportFee;
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
        return pickFee;
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
        return deliverFee;
    }

    /**
     * Setter for property 'deliverFee'.
     *
     * @param deliverFee Value to set for property 'deliverFee'.
     */
    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }
}
