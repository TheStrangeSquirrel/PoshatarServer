
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.api20;

import net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration.ReserveNumbersRequest;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReserveNumbersRequest" type="{http://www.reality.sh/in-time/integration}ReserveNumbersRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reserveNumbersRequest"
})
@XmlRootElement(name = "ReserveNumbers")
public class ReserveNumbers {

    @XmlElement(name = "ReserveNumbersRequest", required = true)
    protected ReserveNumbersRequest reserveNumbersRequest;

    /**
     * Gets the value of the reserveNumbersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReserveNumbersRequest }
     *     
     */
    public ReserveNumbersRequest getReserveNumbersRequest() {
        return reserveNumbersRequest;
    }

    /**
     * Sets the value of the reserveNumbersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveNumbersRequest }
     *     
     */
    public void setReserveNumbersRequest(ReserveNumbersRequest value) {
        this.reserveNumbersRequest = value;
    }

}
