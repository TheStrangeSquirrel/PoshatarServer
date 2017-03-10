
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
 * <p>Java class for ListCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListCatalog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Catalog" type="{http://inr.intime.ua/in-time/integration20}CatalogElement" maxOccurs="unbounded"/>
 *         &lt;element name="CatalogState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListCatalog", propOrder = {
    "catalog",
    "catalogState"
})
public class ListCatalog {

    @XmlElement(name = "Catalog", required = true)
    protected List<CatalogElement> catalog;
    @XmlElement(name = "CatalogState", required = true)
    protected String catalogState;

    /**
     * Gets the value of the catalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogElement }
     * 
     * 
     */
    public List<CatalogElement> getCatalog() {
        if (catalog == null) {
            catalog = new ArrayList<CatalogElement>();
        }
        return this.catalog;
    }

    /**
     * Gets the value of the catalogState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogState() {
        return catalogState;
    }

    /**
     * Sets the value of the catalogState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogState(String value) {
        this.catalogState = value;
    }

}
