
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.sat.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Datum {

    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("currentStatus")
    @Expose
    private String currentStatus;
    @SerializedName("sum")
    @Expose
    private Integer sum;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("seatsAmount")
    @Expose
    private Integer seatsAmount;
    @SerializedName("volume")
    @Expose
    private Integer volume;
    @SerializedName("cargoType")
    @Expose
    private String cargoType;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("arrivalDate")
    @Expose
    private String arrivalDate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("rspFrom")
    @Expose
    private String rspFrom;
    @SerializedName("rspTo")
    @Expose
    private String rspTo;
    @SerializedName("payData")
    @Expose
    private List<PayDatum> payData = new ArrayList<PayDatum>();
    @SerializedName("states")
    @Expose
    private List<State> states = new ArrayList<State>();

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
     *     The currentStatus
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 
     * @param currentStatus
     *     The currentStatus
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * 
     * @return
     *     The sum
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * 
     * @param sum
     *     The sum
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The seatsAmount
     */
    public Integer getSeatsAmount() {
        return seatsAmount;
    }

    /**
     * 
     * @param seatsAmount
     *     The seatsAmount
     */
    public void setSeatsAmount(Integer seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    /**
     * 
     * @return
     *     The volume
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * 
     * @param volume
     *     The volume
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * 
     * @return
     *     The cargoType
     */
    public String getCargoType() {
        return cargoType;
    }

    /**
     * 
     * @param cargoType
     *     The cargoType
     */
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 
     * @param arrivalDate
     *     The arrivalDate
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The rspFrom
     */
    public String getRspFrom() {
        return rspFrom;
    }

    /**
     * 
     * @param rspFrom
     *     The rspFrom
     */
    public void setRspFrom(String rspFrom) {
        this.rspFrom = rspFrom;
    }

    /**
     * 
     * @return
     *     The rspTo
     */
    public String getRspTo() {
        return rspTo;
    }

    /**
     * 
     * @param rspTo
     *     The rspTo
     */
    public void setRspTo(String rspTo) {
        this.rspTo = rspTo;
    }

    /**
     * 
     * @return
     *     The payData
     */
    public List<PayDatum> getPayData() {
        return payData;
    }

    /**
     * 
     * @param payData
     *     The payData
     */
    public void setPayData(List<PayDatum> payData) {
        this.payData = payData;
    }

    /**
     * 
     * @return
     *     The states
     */
    public List<State> getStates() {
        return states;
    }

    /**
     * 
     * @param states
     *     The states
     */
    public void setStates(List<State> states) {
        this.states = states;
    }

}
