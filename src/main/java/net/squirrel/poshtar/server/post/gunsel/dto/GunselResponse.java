
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.gunsel.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class GunselResponse {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("FromCity")
    @Expose
    private FromCity fromCity;
    @SerializedName("ToCity")
    @Expose
    private ToCity toCity;
    @SerializedName("State")
    @Expose
    private List<State> state = new ArrayList<State>();

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The fromCity
     */
    public FromCity getFromCity() {
        return fromCity;
    }

    /**
     * 
     * @param fromCity
     *     The FromCity
     */
    public void setFromCity(FromCity fromCity) {
        this.fromCity = fromCity;
    }

    /**
     * 
     * @return
     *     The toCity
     */
    public ToCity getToCity() {
        return toCity;
    }

    /**
     * 
     * @param toCity
     *     The ToCity
     */
    public void setToCity(ToCity toCity) {
        this.toCity = toCity;
    }

    /**
     * 
     * @return
     *     The state
     */
    public List<State> getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The State
     */
    public void setState(List<State> state) {
        this.state = state;
    }

}
