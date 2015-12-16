package com.wangkuo.zxb.coreservice.api.data.waybilltrack;

import java.io.Serializable;

/**
 * Created by wangsy on 2015/12/16.
 */
public class VipGoodsListBack implements Serializable {

    private Long id;
    private Long customerId;
    private Integer goodType;
    private String goodName;
    private String goodSpace;
    private String goodsPackType;
    private String goodsStackType;
    private String goodsHandlingType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodSpace() {
        return goodSpace;
    }

    public void setGoodSpace(String goodSpace) {
        this.goodSpace = goodSpace;
    }

    public String getGoodsPackType() {
        return goodsPackType;
    }

    public void setGoodsPackType(String goodsPackType) {
        this.goodsPackType = goodsPackType;
    }

    public String getGoodsStackType() {
        return goodsStackType;
    }

    public void setGoodsStackType(String goodsStackType) {
        this.goodsStackType = goodsStackType;
    }

    public String getGoodsHandlingType() {
        return goodsHandlingType;
    }

    public void setGoodsHandlingType(String goodsHandlingType) {
        this.goodsHandlingType = goodsHandlingType;
    }
}
