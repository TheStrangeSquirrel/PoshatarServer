
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reconciliation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reconciliation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Debit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reconciliation", propOrder = {
    "document",
    "debit",
    "credit",
    "paymentMethod"
})
public class Reconciliation {

    @XmlElement(name = "Document", required = true)
    protected String document;
    @XmlElement(name = "Debit")
    protected double debit;
    @XmlElement(name = "Credit")
    protected double credit;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     */
    public double getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     */
    public void setDebit(double value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public double getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(double value) {
        this.credit = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

}
