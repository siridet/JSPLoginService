
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="only-predefines" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="table" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnInfo", propOrder = {
    "id",
    "name",
    "mandatory",
    "onlyPredefines",
    "table"
})
public class GnInfo {

    protected long id;
    @XmlElementRef(name = "name", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> name;
    protected long mandatory;
    @XmlElement(name = "only-predefines")
    protected long onlyPredefines;
    protected long table;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setName(JAXBElement<java.lang.String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public long getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(long value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the onlyPredefines property.
     * 
     */
    public long getOnlyPredefines() {
        return onlyPredefines;
    }

    /**
     * Sets the value of the onlyPredefines property.
     * 
     */
    public void setOnlyPredefines(long value) {
        this.onlyPredefines = value;
    }

    /**
     * Gets the value of the table property.
     * 
     */
    public long getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     */
    public void setTable(long value) {
        this.table = value;
    }

}
