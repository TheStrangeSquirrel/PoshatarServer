
/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.post.intime.ua.intime.inr.in_time.integration20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogListRespond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogListRespond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListCatalog" type="{http://inr.intime.ua/in-time/integration20}ListCatalog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogListRespond", propOrder = {
    "interfaceState",
    "listCatalog"
})
public class CatalogListRespond {

    @XmlElement(name = "InterfaceState", required = true)
    protected String interfaceState;
    @XmlElement(name = "ListCatalog")
    protected ListCatalog listCatalog;

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
     * Gets the value of the listCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ListCatalog }
     *     
     */
    public ListCatalog getListCatalog() {
        return listCatalog;
    }

    /**
     * Sets the value of the listCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCatalog }
     *     
     */
    public void setListCatalog(ListCatalog value) {
        this.listCatalog = value;
    }

}
