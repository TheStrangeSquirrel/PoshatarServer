
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackagesTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "packagesTypeCode",
    "packageQuantity"
})
public class Package {

    @XmlElement(name = "PackagesTypeCode", required = true, nillable = true)
    protected String packagesTypeCode;
    @XmlElement(name = "PackageQuantity")
    protected int packageQuantity;

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
     * Gets the value of the packageQuantity property.
     * 
     */
    public int getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Sets the value of the packageQuantity property.
     * 
     */
    public void setPackageQuantity(int value) {
        this.packageQuantity = value;
    }

}
