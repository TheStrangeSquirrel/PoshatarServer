
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.sat.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PayDatum {

    @SerializedName("payerId")
    @Expose
    private String payerId;
    @SerializedName("sum")
    @Expose
    private Integer sum;

    /**
     * 
     * @return
     *     The payerId
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * 
     * @param payerId
     *     The payerId
     */
    public void setPayerId(String payerId) {
        this.payerId = payerId;
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

}
