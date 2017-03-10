
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth" type="{http://www.reality.sh/in-time/integration}AuthData"/>
 *         &lt;element name="CalculateTTN" type="{http://www.reality.sh/in-time/integration}CalculateTTN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateRequest", propOrder = {
    "auth",
    "calculateTTN"
})
public class CalculateRequest {

    @XmlElement(name = "Auth", required = true)
    protected AuthData auth;
    @XmlElement(name = "CalculateTTN", required = true)
    protected CalculateTTN calculateTTN;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthData }
     *     
     */
    public AuthData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthData }
     *     
     */
    public void setAuth(AuthData value) {
        this.auth = value;
    }

    /**
     * Gets the value of the calculateTTN property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateTTN }
     *     
     */
    public CalculateTTN getCalculateTTN() {
        return calculateTTN;
    }

    /**
     * Sets the value of the calculateTTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateTTN }
     *     
     */
    public void setCalculateTTN(CalculateTTN value) {
        this.calculateTTN = value;
    }

}
