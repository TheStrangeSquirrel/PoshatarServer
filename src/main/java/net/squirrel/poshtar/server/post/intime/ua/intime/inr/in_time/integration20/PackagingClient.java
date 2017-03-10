
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodePackaging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VolumePackagin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingClient", propOrder = {
    "codePackaging",
    "volumePackagin"
})
public class PackagingClient {

    @XmlElement(name = "CodePackaging", required = true)
    protected String codePackaging;
    @XmlElement(name = "VolumePackagin", required = true)
    protected String volumePackagin;

    /**
     * Gets the value of the codePackaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePackaging() {
        return codePackaging;
    }

    /**
     * Sets the value of the codePackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePackaging(String value) {
        this.codePackaging = value;
    }

    /**
     * Gets the value of the volumePackagin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumePackagin() {
        return volumePackagin;
    }

    /**
     * Sets the value of the volumePackagin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumePackagin(String value) {
        this.volumePackagin = value;
    }

}
