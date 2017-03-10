
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for InfoTTNLiteRespond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoTTNLiteRespond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InfoNumber" type="{http://inr.intime.ua/in-time/integration20}InfoNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoTTNLiteRespond", propOrder = {
    "interfaceState",
    "infoNumber"
})
public class InfoTTNLiteRespond {

    @XmlElement(name = "InterfaceState", required = true)
    protected String interfaceState;
    @XmlElement(name = "InfoNumber")
    protected List<InfoNumber> infoNumber;

    /**
     * Gets the value of the interfaceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceState() {
        return interfaceState;
    }

    /**
     * Sets the value of the interfaceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceState(String value) {
        this.interfaceState = value;
    }

    /**
     * Gets the value of the infoNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoNumber }
     * 
     * 
     */
    public List<InfoNumber> getInfoNumber() {
        if (infoNumber == null) {
            infoNumber = new ArrayList<InfoNumber>();
        }
        return this.infoNumber;
    }

}
