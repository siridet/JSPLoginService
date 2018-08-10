
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mountpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format-details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nav-systems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nmea" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="solution" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compr-encryp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="misc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client-user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client-password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="server-ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="server-password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active-source" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="network-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="server-mountpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnStream", propOrder = {
    "id",
    "mountpoint",
    "identifier",
    "dataFormat",
    "formatDetails",
    "carrier",
    "navSystems",
    "country",
    "latitude",
    "longitude",
    "height",
    "nmea",
    "solution",
    "generator",
    "comprEncryp",
    "authentication",
    "fee",
    "bitrate",
    "misc",
    "clientUser",
    "clientPassword",
    "serverIp",
    "serverPassword",
    "activeSource",
    "active",
    "service",
    "networkId",
    "serverMountpoint"
})
public class GnStream {

    protected long id;
    @XmlElementRef(name = "mountpoint", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> mountpoint;
    @XmlElementRef(name = "identifier", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> identifier;
    @XmlElementRef(name = "data-format", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> dataFormat;
    @XmlElementRef(name = "format-details", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> formatDetails;
    protected long carrier;
    @XmlElementRef(name = "nav-systems", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> navSystems;
    @XmlElementRef(name = "country", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> country;
    protected double latitude;
    protected double longitude;
    protected double height;
    protected long nmea;
    protected long solution;
    @XmlElementRef(name = "generator", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> generator;
    @XmlElementRef(name = "compr-encryp", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> comprEncryp;
    @XmlElementRef(name = "authentication", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> authentication;
    @XmlElementRef(name = "fee", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> fee;
    protected long bitrate;
    @XmlElementRef(name = "misc", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> misc;
    @XmlElementRef(name = "client-user", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> clientUser;
    @XmlElementRef(name = "client-password", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> clientPassword;
    @XmlElementRef(name = "server-ip", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> serverIp;
    @XmlElementRef(name = "server-password", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> serverPassword;
    @XmlElement(name = "active-source")
    protected long activeSource;
    protected long active;
    @XmlElementRef(name = "service", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> service;
    @XmlElement(name = "network-id")
    protected long networkId;
    @XmlElementRef(name = "server-mountpoint", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> serverMountpoint;

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

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<java.lang.String> value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setDataFormat(JAXBElement<java.lang.String> value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the formatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getFormatDetails() {
        return formatDetails;
    }

    /**
     * Sets the value of the formatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setFormatDetails(JAXBElement<java.lang.String> value) {
        this.formatDetails = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     */
    public long getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     */
    public void setCarrier(long value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the navSystems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getNavSystems() {
        return navSystems;
    }

    /**
     * Sets the value of the navSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setNavSystems(JAXBElement<java.lang.String> value) {
        this.navSystems = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<java.lang.String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the nmea property.
     * 
     */
    public long getNmea() {
        return nmea;
    }

    /**
     * Sets the value of the nmea property.
     * 
     */
    public void setNmea(long value) {
        this.nmea = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     */
    public long getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     */
    public void setSolution(long value) {
        this.solution = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setGenerator(JAXBElement<java.lang.String> value) {
        this.generator = value;
    }

    /**
     * Gets the value of the comprEncryp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getComprEncryp() {
        return comprEncryp;
    }

    /**
     * Sets the value of the comprEncryp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setComprEncryp(JAXBElement<java.lang.String> value) {
        this.comprEncryp = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setAuthentication(JAXBElement<java.lang.String> value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setFee(JAXBElement<java.lang.String> value) {
        this.fee = value;
    }

    /**
     * Gets the value of the bitrate property.
     * 
     */
    public long getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     */
    public void setBitrate(long value) {
        this.bitrate = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setMisc(JAXBElement<java.lang.String> value) {
        this.misc = value;
    }

    /**
     * Gets the value of the clientUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getClientUser() {
        return clientUser;
    }

    /**
     * Sets the value of the clientUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setClientUser(JAXBElement<java.lang.String> value) {
        this.clientUser = value;
    }

    /**
     * Gets the value of the clientPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getClientPassword() {
        return clientPassword;
    }

    /**
     * Sets the value of the clientPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setClientPassword(JAXBElement<java.lang.String> value) {
        this.clientPassword = value;
    }

    /**
     * Gets the value of the serverIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getServerIp() {
        return serverIp;
    }

    /**
     * Sets the value of the serverIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setServerIp(JAXBElement<java.lang.String> value) {
        this.serverIp = value;
    }

    /**
     * Gets the value of the serverPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getServerPassword() {
        return serverPassword;
    }

    /**
     * Sets the value of the serverPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setServerPassword(JAXBElement<java.lang.String> value) {
        this.serverPassword = value;
    }

    /**
     * Gets the value of the activeSource property.
     * 
     */
    public long getActiveSource() {
        return activeSource;
    }

    /**
     * Sets the value of the activeSource property.
     * 
     */
    public void setActiveSource(long value) {
        this.activeSource = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public long getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(long value) {
        this.active = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setService(JAXBElement<java.lang.String> value) {
        this.service = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     */
    public long getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     */
    public void setNetworkId(long value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the serverMountpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getServerMountpoint() {
        return serverMountpoint;
    }

    /**
     * Sets the value of the serverMountpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setServerMountpoint(JAXBElement<java.lang.String> value) {
        this.serverMountpoint = value;
    }

}
