package com.wangkuo.zxb.coreservice.api.data.waybilltrack;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 林守锦
 * @version 1.0
 * @date 2015-12-18
 */
public class WaybillFeeParam implements Serializable {

    /**
     * 客户的systemId
     */
    private String customerDownId;

    /**
     * VIP获取Id
     */
    private Long vipGoodId;


    private Long startProvinceId;

    private String startProvince;

    private Long startCityId;

    private String startCity;

    private Long startCountyId;

    private String startCounty;

    private Long startTownId;

    private String startTown;

    private String startAddress;

    private Long endProvinceId;

    private String endProvince;

    private Long endCityId;

    private String endCity;

    private Long endCountyId;

    private String endCounty;

    private Long endTownId;

    private String endTown;

    private String endAddress;

    private double weight;

    private double volume;

    /**
     * Getter for property 'customerDownId'.
     *
     * @return Value for property 'customerDownId'.
     */
    public String getCustomerDownId() {
        return customerDownId;
    }

    /**
     * Setter for property 'customerDownId'.
     *
     * @param customerDownId Value to set for property 'customerDownId'.
     */
    public void setCustomerDownId(String customerDownId) {
        this.customerDownId = customerDownId;
    }

    /**
     * Getter for property 'vipGoodId'.
     *
     * @return Value for property 'vipGoodId'.
     */
    public Long getVipGoodId() {
        return vipGoodId;
    }

    /**
     * Setter for property 'vipGoodId'.
     *
     * @param vipGoodId Value to set for property 'vipGoodId'.
     */
    public void setVipGoodId(Long vipGoodId) {
        this.vipGoodId = vipGoodId;
    }

    /**
     * Getter for property 'startProvinceId'.
     *
     * @return Value for property 'startProvinceId'.
     */
    public Long getStartProvinceId() {
        return startProvinceId;
    }

    /**
     * Setter for property 'startProvinceId'.
     *
     * @param startProvinceId Value to set for property 'startProvinceId'.
     */
    public void setStartProvinceId(Long startProvinceId) {
        this.startProvinceId = startProvinceId;
    }

    /**
     * Getter for property 'startProvince'.
     *
     * @return Value for property 'startProvince'.
     */
    public String getStartProvince() {
        return startProvince;
    }

    /**
     * Setter for property 'startProvince'.
     *
     * @param startProvince Value to set for property 'startProvince'.
     */
    public void setStartProvince(String startProvince) {
        this.startProvince = startProvince;
    }

    /**
     * Getter for property 'startCityId'.
     *
     * @return Value for property 'startCityId'.
     */
    public Long getStartCityId() {
        return startCityId;
    }

    /**
     * Setter for property 'startCityId'.
     *
     * @param startCityId Value to set for property 'startCityId'.
     */
    public void setStartCityId(Long startCityId) {
        this.startCityId = startCityId;
    }

    /**
     * Getter for property 'startCity'.
     *
     * @return Value for property 'startCity'.
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * Setter for property 'startCity'.
     *
     * @param startCity Value to set for property 'startCity'.
     */
    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    /**
     * Getter for property 'startCountyId'.
     *
     * @return Value for property 'startCountyId'.
     */
    public Long getStartCountyId() {
        return startCountyId;
    }

    /**
     * Setter for property 'startCountyId'.
     *
     * @param startCountyId Value to set for property 'startCountyId'.
     */
    public void setStartCountyId(Long startCountyId) {
        this.startCountyId = startCountyId;
    }

    /**
     * Getter for property 'startCounty'.
     *
     * @return Value for property 'startCounty'.
     */
    public String getStartCounty() {
        return startCounty;
    }

    /**
     * Setter for property 'startCounty'.
     *
     * @param startCounty Value to set for property 'startCounty'.
     */
    public void setStartCounty(String startCounty) {
        this.startCounty = startCounty;
    }

    /**
     * Getter for property 'startTownId'.
     *
     * @return Value for property 'startTownId'.
     */
    public Long getStartTownId() {
        return startTownId;
    }

    /**
     * Setter for property 'startTownId'.
     *
     * @param startTownId Value to set for property 'startTownId'.
     */
    public void setStartTownId(Long startTownId) {
        this.startTownId = startTownId;
    }

    /**
     * Getter for property 'startTown'.
     *
     * @return Value for property 'startTown'.
     */
    public String getStartTown() {
        return startTown;
    }

    /**
     * Setter for property 'startTown'.
     *
     * @param startTown Value to set for property 'startTown'.
     */
    public void setStartTown(String startTown) {
        this.startTown = startTown;
    }

    /**
     * Getter for property 'startAddress'.
     *
     * @return Value for property 'startAddress'.
     */
    public String getStartAddress() {
        return startAddress;
    }

    /**
     * Setter for property 'startAddress'.
     *
     * @param startAddress Value to set for property 'startAddress'.
     */
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    /**
     * Getter for property 'endProvinceId'.
     *
     * @return Value for property 'endProvinceId'.
     */
    public Long getEndProvinceId() {
        return endProvinceId;
    }

    /**
     * Setter for property 'endProvinceId'.
     *
     * @param endProvinceId Value to set for property 'endProvinceId'.
     */
    public void setEndProvinceId(Long endProvinceId) {
        this.endProvinceId = endProvinceId;
    }

    /**
     * Getter for property 'endProvince'.
     *
     * @return Value for property 'endProvince'.
     */
    public String getEndProvince() {
        return endProvince;
    }

    /**
     * Setter for property 'endProvince'.
     *
     * @param endProvince Value to set for property 'endProvince'.
     */
    public void setEndProvince(String endProvince) {
        this.endProvince = endProvince;
    }

    /**
     * Getter for property 'endCityId'.
     *
     * @return Value for property 'endCityId'.
     */
    public Long getEndCityId() {
        return endCityId;
    }

    /**
     * Setter for property 'endCityId'.
     *
     * @param endCityId Value to set for property 'endCityId'.
     */
    public void setEndCityId(Long endCityId) {
        this.endCityId = endCityId;
    }

    /**
     * Getter for property 'endCity'.
     *
     * @return Value for property 'endCity'.
     */
    public String getEndCity() {
        return endCity;
    }

    /**
     * Setter for property 'endCity'.
     *
     * @param endCity Value to set for property 'endCity'.
     */
    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    /**
     * Getter for property 'endCountyId'.
     *
     * @return Value for property 'endCountyId'.
     */
    public Long getEndCountyId() {
        return endCountyId;
    }

    /**
     * Setter for property 'endCountyId'.
     *
     * @param endCountyId Value to set for property 'endCountyId'.
     */
    public void setEndCountyId(Long endCountyId) {
        this.endCountyId = endCountyId;
    }

    /**
     * Getter for property 'endCounty'.
     *
     * @return Value for property 'endCounty'.
     */
    public String getEndCounty() {
        return endCounty;
    }

    /**
     * Setter for property 'endCounty'.
     *
     * @param endCounty Value to set for property 'endCounty'.
     */
    public void setEndCounty(String endCounty) {
        this.endCounty = endCounty;
    }

    /**
     * Getter for property 'endTownId'.
     *
     * @return Value for property 'endTownId'.
     */
    public Long getEndTownId() {
        return endTownId;
    }

    /**
     * Setter for property 'endTownId'.
     *
     * @param endTownId Value to set for property 'endTownId'.
     */
    public void setEndTownId(Long endTownId) {
        this.endTownId = endTownId;
    }

    /**
     * Getter for property 'endTown'.
     *
     * @return Value for property 'endTown'.
     */
    public String getEndTown() {
        return endTown;
    }

    /**
     * Setter for property 'endTown'.
     *
     * @param endTown Value to set for property 'endTown'.
     */
    public void setEndTown(String endTown) {
        this.endTown = endTown;
    }

    /**
     * Getter for property 'endAddress'.
     *
     * @return Value for property 'endAddress'.
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * Setter for property 'endAddress'.
     *
     * @param endAddress Value to set for property 'endAddress'.
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    /**
     * Getter for property 'weight'.
     *
     * @return Value for property 'weight'.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Setter for property 'weight'.
     *
     * @param weight Value to set for property 'weight'.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Getter for property 'volume'.
     *
     * @return Value for property 'volume'.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for property 'volume'.
     *
     * @param volume Value to set for property 'volume'.
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
