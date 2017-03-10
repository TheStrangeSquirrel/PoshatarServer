
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TakingBackVolume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TakingBackVolume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressLoading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateTakingBack" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TakingBackVolume", propOrder = {
    "city",
    "addressLoading",
    "contactName",
    "contactPhone",
    "dateTakingBack",
    "comment"
})
public class TakingBackVolume {

    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "AddressLoading", required = true)
    protected String addressLoading;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactPhone", required = true)
    protected String contactPhone;
    @XmlElement(name = "DateTakingBack", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTakingBack;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the addressLoading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLoading() {
        return addressLoading;
    }

    /**
     * Sets the value of the addressLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLoading(String value) {
        this.addressLoading = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the dateTakingBack property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTakingBack() {
        return dateTakingBack;
    }

    /**
     * Sets the value of the dateTakingBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTakingBack(XMLGregorianCalendar value) {
        this.dateTakingBack = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
