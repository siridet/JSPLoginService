
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataToUpdate" type="{urn:gndbss}fillBillings"/>
 *         &lt;element name="fromRadToDeg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "session",
    "dataToUpdate",
    "fromRadToDeg"
})
@XmlRootElement(name = "gnc-updateBillings")
public class GncUpdateBillings {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElement(required = true)
    protected FillBillings dataToUpdate;
    protected int fromRadToDeg;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setSession(JAXBElement<java.lang.String> value) {
        this.session = value;
    }

    /**
     * Gets the value of the dataToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link FillBillings }
     *     
     */
    public FillBillings getDataToUpdate() {
        return dataToUpdate;
    }

    /**
     * Sets the value of the dataToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillBillings }
     *     
     */
    public void setDataToUpdate(FillBillings value) {
        this.dataToUpdate = value;
    }

    /**
     * Gets the value of the fromRadToDeg property.
     * 
     */
    public int getFromRadToDeg() {
        return fromRadToDeg;
    }

    /**
     * Sets the value of the fromRadToDeg property.
     * 
     */
    public void setFromRadToDeg(int value) {
        this.fromRadToDeg = value;
    }

}
