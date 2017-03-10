
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for TransferCargo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberTTN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QuantityCargoPlan" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QuantityCargoFact" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCargo", propOrder = {
    "numberTTN",
    "quantityCargoPlan",
    "quantityCargoFact"
})
public class TransferCargo {

    @XmlElement(name = "NumberTTN", required = true)
    protected String numberTTN;
    @XmlElement(name = "QuantityCargoPlan", required = true)
    protected BigDecimal quantityCargoPlan;
    @XmlElement(name = "QuantityCargoFact", required = true)
    protected BigDecimal quantityCargoFact;

    /**
     * Gets the value of the numberTTN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberTTN() {
        return numberTTN;
    }

    /**
     * Sets the value of the numberTTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberTTN(String value) {
        this.numberTTN = value;
    }

    /**
     * Gets the value of the quantityCargoPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityCargoPlan() {
        return quantityCargoPlan;
    }

    /**
     * Sets the value of the quantityCargoPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityCargoPlan(BigDecimal value) {
        this.quantityCargoPlan = value;
    }

    /**
     * Gets the value of the quantityCargoFact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityCargoFact() {
        return quantityCargoFact;
    }

    /**
     * Sets the value of the quantityCargoFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityCargoFact(BigDecimal value) {
        this.quantityCargoFact = value;
    }

}
