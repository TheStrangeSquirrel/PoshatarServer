
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllCatalog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CatalogNameRus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CatalogNameEng" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllCatalog", propOrder = {
    "catalogNameRus",
    "catalogNameEng"
})
public class AllCatalog {

    @XmlElement(name = "CatalogNameRus", required = true)
    protected String catalogNameRus;
    @XmlElement(name = "CatalogNameEng", required = true)
    protected String catalogNameEng;

    /**
     * Gets the value of the catalogNameRus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogNameRus() {
        return catalogNameRus;
    }

    /**
     * Sets the value of the catalogNameRus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogNameRus(String value) {
        this.catalogNameRus = value;
    }

    /**
     * Gets the value of the catalogNameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogNameEng() {
        return catalogNameEng;
    }

    /**
     * Sets the value of the catalogNameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogNameEng(String value) {
        this.catalogNameEng = value;
    }

}
