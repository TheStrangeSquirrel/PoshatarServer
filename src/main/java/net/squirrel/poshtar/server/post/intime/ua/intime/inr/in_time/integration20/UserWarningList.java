
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for UserWarningList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserWarningList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TypeDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumberDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Problem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppendField" type="{http://inr.intime.ua/in-time/integration20}AppendField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Agreed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DateTimeAgreed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserWarningList", propOrder = {
    "data",
    "typeDocument",
    "numberDocument",
    "problem",
    "appendField",
    "agreed",
    "dateTimeAgreed"
})
public class UserWarningList {

    @XmlElement(name = "Data", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "TypeDocument", required = true)
    protected String typeDocument;
    @XmlElement(name = "NumberDocument", required = true)
    protected String numberDocument;
    @XmlElement(name = "Problem", required = true)
    protected String problem;
    @XmlElement(name = "AppendField", nillable = true)
    protected List<AppendField> appendField;
    @XmlElement(name = "Agreed")
    protected boolean agreed;
    @XmlElement(name = "DateTimeAgreed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeAgreed;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the typeDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDocument() {
        return typeDocument;
    }

    /**
     * Sets the value of the typeDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDocument(String value) {
        this.typeDocument = value;
    }

    /**
     * Gets the value of the numberDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberDocument() {
        return numberDocument;
    }

    /**
     * Sets the value of the numberDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberDocument(String value) {
        this.numberDocument = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Sets the value of the problem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem(String value) {
        this.problem = value;
    }

    /**
     * Gets the value of the appendField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appendField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppendField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendField }
     * 
     * 
     */
    public List<AppendField> getAppendField() {
        if (appendField == null) {
            appendField = new ArrayList<AppendField>();
        }
        return this.appendField;
    }

    /**
     * Gets the value of the agreed property.
     * 
     */
    public boolean isAgreed() {
        return agreed;
    }

    /**
     * Sets the value of the agreed property.
     * 
     */
    public void setAgreed(boolean value) {
        this.agreed = value;
    }

    /**
     * Gets the value of the dateTimeAgreed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeAgreed() {
        return dateTimeAgreed;
    }

    /**
     * Sets the value of the dateTimeAgreed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeAgreed(XMLGregorianCalendar value) {
        this.dateTimeAgreed = value;
    }

}
