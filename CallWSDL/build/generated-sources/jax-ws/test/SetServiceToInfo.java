
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="infoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="serviceToInfo" type="{urn:gndbss}gnServiceToInfo" minOccurs="0"/>
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
    "serviceId",
    "infoId",
    "serviceToInfo"
})
@XmlRootElement(name = "setServiceToInfo")
public class SetServiceToInfo {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    protected long serviceId;
    protected long infoId;
    @XmlElementRef(name = "serviceToInfo", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnServiceToInfo> serviceToInfo;

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
     * Gets the value of the serviceId property.
     * 
     */
    public long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the infoId property.
     * 
     */
    public long getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     */
    public void setInfoId(long value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the serviceToInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnServiceToInfo }{@code >}
     *     
     */
    public JAXBElement<GnServiceToInfo> getServiceToInfo() {
        return serviceToInfo;
    }

    /**
     * Sets the value of the serviceToInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnServiceToInfo }{@code >}
     *     
     */
    public void setServiceToInfo(JAXBElement<GnServiceToInfo> value) {
        this.serviceToInfo = value;
    }

}
