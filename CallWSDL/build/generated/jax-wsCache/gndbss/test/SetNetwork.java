
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
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="network" type="{urn:gndbss}gnNetwork" minOccurs="0"/>
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
    "networkId",
    "network"
})
@XmlRootElement(name = "setNetwork")
public class SetNetwork {

    @XmlElementRef(name = "session", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> session;
    @XmlElementRef(name = "networkId", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> networkId;
    @XmlElementRef(name = "network", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<GnNetwork> network;

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
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNetworkId(JAXBElement<java.lang.String> value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GnNetwork }{@code >}
     *     
     */
    public JAXBElement<GnNetwork> getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GnNetwork }{@code >}
     *     
     */
    public void setNetwork(JAXBElement<GnNetwork> value) {
        this.network = value;
    }

}
