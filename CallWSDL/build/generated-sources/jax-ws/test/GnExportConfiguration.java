
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnExportConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnExportConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columns" type="{urn:gndbss}Strings"/>
 *         &lt;element name="tables" type="{urn:gndbss}Strings"/>
 *         &lt;element name="ids" type="{urn:gndbss}Strings"/>
 *         &lt;element name="selection" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notExported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="seperator" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areas" type="{urn:gndbss}gnAreas"/>
 *         &lt;element name="setExported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnExportConfiguration", propOrder = {
    "type",
    "columns",
    "tables",
    "ids",
    "selection",
    "notExported",
    "notOnline",
    "seperator",
    "filter",
    "areas",
    "setExported",
    "header"
})
public class GnExportConfiguration {

    @XmlElementRef(name = "type", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> type;
    @XmlElement(required = true)
    protected Strings columns;
    @XmlElement(required = true)
    protected Strings tables;
    @XmlElement(required = true)
    protected Strings ids;
    protected int selection;
    protected boolean notExported;
    protected boolean notOnline;
    protected byte seperator;
    @XmlElementRef(name = "filter", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> filter;
    @XmlElement(required = true)
    protected GnAreas areas;
    protected boolean setExported;
    @XmlElementRef(name = "header", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> header;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setType(JAXBElement<java.lang.String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setColumns(Strings value) {
        this.columns = value;
    }

    /**
     * Gets the value of the tables property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getTables() {
        return tables;
    }

    /**
     * Sets the value of the tables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setTables(Strings value) {
        this.tables = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setIds(Strings value) {
        this.ids = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     */
    public int getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     */
    public void setSelection(int value) {
        this.selection = value;
    }

    /**
     * Gets the value of the notExported property.
     * 
     */
    public boolean isNotExported() {
        return notExported;
    }

    /**
     * Sets the value of the notExported property.
     * 
     */
    public void setNotExported(boolean value) {
        this.notExported = value;
    }

    /**
     * Gets the value of the notOnline property.
     * 
     */
    public boolean isNotOnline() {
        return notOnline;
    }

    /**
     * Sets the value of the notOnline property.
     * 
     */
    public void setNotOnline(boolean value) {
        this.notOnline = value;
    }

    /**
     * Gets the value of the seperator property.
     * 
     */
    public byte getSeperator() {
        return seperator;
    }

    /**
     * Sets the value of the seperator property.
     * 
     */
    public void setSeperator(byte value) {
        this.seperator = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setFilter(JAXBElement<java.lang.String> value) {
        this.filter = value;
    }

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link GnAreas }
     *     
     */
    public GnAreas getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnAreas }
     *     
     */
    public void setAreas(GnAreas value) {
        this.areas = value;
    }

    /**
     * Gets the value of the setExported property.
     * 
     */
    public boolean isSetExported() {
        return setExported;
    }

    /**
     * Sets the value of the setExported property.
     * 
     */
    public void setSetExported(boolean value) {
        this.setExported = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setHeader(JAXBElement<java.lang.String> value) {
        this.header = value;
    }

}
