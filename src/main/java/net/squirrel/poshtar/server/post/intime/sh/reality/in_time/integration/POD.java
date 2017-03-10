
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for POD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PodPays" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PodAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ReceiverPODThird" type="{http://www.reality.sh/in-time/integration}ReceiverPODThird"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POD", propOrder = {
    "podPays",
    "podAmount",
    "receiverPODThird"
})
public class POD {

    @XmlElement(name = "PodPays", required = true)
    protected String podPays;
    @XmlElement(name = "PodAmount", required = true)
    protected BigDecimal podAmount;
    @XmlElement(name = "ReceiverPODThird", required = true)
    protected ReceiverPODThird receiverPODThird;

    /**
     * Gets the value of the podPays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodPays() {
        return podPays;
    }

    /**
     * Sets the value of the podPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodPays(String value) {
        this.podPays = value;
    }

    /**
     * Gets the value of the podAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPodAmount() {
        return podAmount;
    }

    /**
     * Sets the value of the podAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPodAmount(BigDecimal value) {
        this.podAmount = value;
    }

    /**
     * Gets the value of the receiverPODThird property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverPODThird }
     *     
     */
    public ReceiverPODThird getReceiverPODThird() {
        return receiverPODThird;
    }

    /**
     * Sets the value of the receiverPODThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverPODThird }
     *     
     */
    public void setReceiverPODThird(ReceiverPODThird value) {
        this.receiverPODThird = value;
    }

}
