
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.delivery.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("SendDate")
    @Expose
    private String sendDate;
    @SerializedName("ReceiveDate")
    @Expose
    private String receiveDate;
    @SerializedName("SenderWarehouseName")
    @Expose
    private String senderWarehouseName;
    @SerializedName("RecepientWarehouseName")
    @Expose
    private String recepientWarehouseName;
    @SerializedName("Discount")
    @Expose
    private Double discount;
    @SerializedName("TotalCost")
    @Expose
    private Double totalCost;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("Weight")
    @Expose
    private Double weight;
    @SerializedName("Volume")
    @Expose
    private Double volume;
    @SerializedName("Sites")
    @Expose
    private String sites;
    @SerializedName("PaymentStatus")
    @Expose
    private Boolean paymentStatus;
    @SerializedName("Currency")
    @Expose
    private Integer currency;
    @SerializedName("InsuranceCost")
    @Expose
    private Object insuranceCost;
    @SerializedName("InsuranceCurrency")
    @Expose
    private Object insuranceCurrency;
    @SerializedName("PushStateCode")
    @Expose
    private Object pushStateCode;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The sendDate
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * 
     * @param sendDate
     *     The SendDate
     */
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * 
     * @return
     *     The receiveDate
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * 
     * @param receiveDate
     *     The ReceiveDate
     */
    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**
     * 
     * @return
     *     The senderWarehouseName
     */
    public String getSenderWarehouseName() {
        return senderWarehouseName;
    }

    /**
     * 
     * @param senderWarehouseName
     *     The SenderWarehouseName
     */
    public void setSenderWarehouseName(String senderWarehouseName) {
        this.senderWarehouseName = senderWarehouseName;
    }

    /**
     * 
     * @return
     *     The recepientWarehouseName
     */
    public String getRecepientWarehouseName() {
        return recepientWarehouseName;
    }

    /**
     * 
     * @param recepientWarehouseName
     *     The RecepientWarehouseName
     */
    public void setRecepientWarehouseName(String recepientWarehouseName) {
        this.recepientWarehouseName = recepientWarehouseName;
    }

    /**
     * 
     * @return
     *     The discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The Discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 
     * @return
     *     The totalCost
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * 
     * @param totalCost
     *     The TotalCost
     */
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The Weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The volume
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * 
     * @param volume
     *     The Volume
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return
     *     The sites
     */
    public String getSites() {
        return sites;
    }

    /**
     * 
     * @param sites
     *     The Sites
     */
    public void setSites(String sites) {
        this.sites = sites;
    }

    /**
     * 
     * @return
     *     The paymentStatus
     */
    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 
     * @param paymentStatus
     *     The PaymentStatus
     */
    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public Integer getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The Currency
     */
    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The insuranceCost
     */
    public Object getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * 
     * @param insuranceCost
     *     The InsuranceCost
     */
    public void setInsuranceCost(Object insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /**
     * 
     * @return
     *     The insuranceCurrency
     */
    public Object getInsuranceCurrency() {
        return insuranceCurrency;
    }

    /**
     * 
     * @param insuranceCurrency
     *     The InsuranceCurrency
     */
    public void setInsuranceCurrency(Object insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency;
    }

    /**
     * 
     * @return
     *     The pushStateCode
     */
    public Object getPushStateCode() {
        return pushStateCode;
    }

    /**
     * 
     * @param pushStateCode
     *     The PushStateCode
     */
    public void setPushStateCode(Object pushStateCode) {
        this.pushStateCode = pushStateCode;
    }

}
