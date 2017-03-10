
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.sh.reality.in_time.integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackagesTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PackagesTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagesType", propOrder = {
    "packagesTypeCode",
    "packagesTypeName"
})
public class PackagesType {

    @XmlElement(name = "PackagesTypeCode", required = true)
    protected String packagesTypeCode;
    @XmlElement(name = "PackagesTypeName", required = true)
    protected String packagesTypeName;

    /**
     * Gets the value of the packagesTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagesTypeCode() {
        return packagesTypeCode;
    }

    /**
     * Sets the value of the packagesTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagesTypeCode(String value) {
        this.packagesTypeCode = value;
    }

    /**
     * Gets the value of the packagesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagesTypeName() {
        return packagesTypeName;
    }

    /**
     * Sets the value of the packagesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagesTypeName(String value) {
        this.packagesTypeName = value;
    }

}
