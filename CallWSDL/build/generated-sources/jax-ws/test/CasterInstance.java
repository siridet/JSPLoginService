
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for casterInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="casterInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ip-adress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="service-type" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mountpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "casterInstance", propOrder = {
    "version",
    "length",
    "ipAdress",
    "port",
    "protocol",
    "serviceType",
    "mountpoint"
})
public class CasterInstance {

    protected long version;
    protected long length;
    @XmlElementRef(name = "ip-adress", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> ipAdress;
    protected long port;
    protected long protocol;
    @XmlElement(name = "service-type")
    protected long serviceType;
    @XmlElementRef(name = "mountpoint", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> mountpoint;

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(long value) {
        this.length = value;
    }

    /**
     * Gets the value of the ipAdress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getIpAdress() {
        return ipAdress;
    }

    /**
     * Sets the value of the ipAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setIpAdress(JAXBElement<java.lang.String> value) {
        this.ipAdress = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(long value) {
        this.port = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     */
    public long getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     */
    public void setProtocol(long value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     */
    public long getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     */
    public void setServiceType(long value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the mountpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getMountpoint() {
        return mountpoint;
    }

    /**
     * Sets the value of the mountpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setMountpoint(JAXBElement<java.lang.String> value) {
        this.mountpoint = value;
    }

}
