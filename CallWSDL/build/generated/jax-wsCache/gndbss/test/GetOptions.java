
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getOffset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="getLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="whereClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOptions", propOrder = {
    "sortColumn",
    "sortAscending",
    "getOffset",
    "getLimit",
    "whereClause"
})
public class GetOptions {

    @XmlElementRef(name = "sortColumn", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> sortColumn;
    protected boolean sortAscending;
    protected long getOffset;
    protected long getLimit;
    @XmlElementRef(name = "whereClause", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> whereClause;

    /**
     * Gets the value of the sortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getSortColumn() {
        return sortColumn;
    }

    /**
     * Sets the value of the sortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setSortColumn(JAXBElement<java.lang.String> value) {
        this.sortColumn = value;
    }

    /**
     * Gets the value of the sortAscending property.
     * 
     */
    public boolean isSortAscending() {
        return sortAscending;
    }

    /**
     * Sets the value of the sortAscending property.
     * 
     */
    public void setSortAscending(boolean value) {
        this.sortAscending = value;
    }

    /**
     * Gets the value of the getOffset property.
     * 
     */
    public long getGetOffset() {
        return getOffset;
    }

    /**
     * Sets the value of the getOffset property.
     * 
     */
    public void setGetOffset(long value) {
        this.getOffset = value;
    }

    /**
     * Gets the value of the getLimit property.
     * 
     */
    public long getGetLimit() {
        return getLimit;
    }

    /**
     * Sets the value of the getLimit property.
     * 
     */
    public void setGetLimit(long value) {
        this.getLimit = value;
    }

    /**
     * Gets the value of the whereClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getWhereClause() {
        return whereClause;
    }

    /**
     * Sets the value of the whereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setWhereClause(JAXBElement<java.lang.String> value) {
        this.whereClause = value;
    }

}
