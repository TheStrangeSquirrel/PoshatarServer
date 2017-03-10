
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractorPaysThird complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractorPaysThird">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContractorPaysThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WarehousePaysThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhonePaysThird" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractorPaysThird", propOrder = {
    "contractorPaysThird",
    "warehousePaysThird",
    "phonePaysThird"
})
public class ContractorPaysThird {

    @XmlElement(name = "ContractorPaysThird", required = true, nillable = true)
    protected String contractorPaysThird;
    @XmlElement(name = "WarehousePaysThird", required = true, nillable = true)
    protected String warehousePaysThird;
    @XmlElement(name = "PhonePaysThird", required = true, nillable = true)
    protected String phonePaysThird;

    /**
     * Gets the value of the contractorPaysThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractorPaysThird() {
        return contractorPaysThird;
    }

    /**
     * Sets the value of the contractorPaysThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractorPaysThird(String value) {
        this.contractorPaysThird = value;
    }

    /**
     * Gets the value of the warehousePaysThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehousePaysThird() {
        return warehousePaysThird;
    }

    /**
     * Sets the value of the warehousePaysThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehousePaysThird(String value) {
        this.warehousePaysThird = value;
    }

    /**
     * Gets the value of the phonePaysThird property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonePaysThird() {
        return phonePaysThird;
    }

    /**
     * Sets the value of the phonePaysThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonePaysThird(String value) {
        this.phonePaysThird = value;
    }

}
