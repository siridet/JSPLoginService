
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnImportAreasConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnImportAreasConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="epsgCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="charEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnImportAreasConfiguration", propOrder = {
    "nameColumn",
    "descriptionColumn",
    "epsgCode",
    "charEncoding"
})
public class GnImportAreasConfiguration {

    @XmlElementRef(name = "nameColumn", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> nameColumn;
    @XmlElementRef(name = "descriptionColumn", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> descriptionColumn;
    protected int epsgCode;
    @XmlElementRef(name = "charEncoding", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> charEncoding;

    /**
     * Gets the value of the nameColumn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNameColumn() {
        return nameColumn;
    }

    /**
     * Sets the value of the nameColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNameColumn(JAXBElement<java.lang.String> value) {
        this.nameColumn = value;
    }

    /**
     * Gets the value of the descriptionColumn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getDescriptionColumn() {
        return descriptionColumn;
    }

    /**
     * Sets the value of the descriptionColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setDescriptionColumn(JAXBElement<java.lang.String> value) {
        this.descriptionColumn = value;
    }

    /**
     * Gets the value of the epsgCode property.
     * 
     */
    public int getEpsgCode() {
        return epsgCode;
    }

    /**
     * Sets the value of the epsgCode property.
     * 
     */
    public void setEpsgCode(int value) {
        this.epsgCode = value;
    }

    /**
     * Gets the value of the charEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCharEncoding() {
        return charEncoding;
    }

    /**
     * Sets the value of the charEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCharEncoding(JAXBElement<java.lang.String> value) {
        this.charEncoding = value;
    }

}
