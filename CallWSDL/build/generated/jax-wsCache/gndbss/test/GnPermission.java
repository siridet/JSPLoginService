
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="write" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="execute" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valid-time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="directUser" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="directService" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="withGroups" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnPermission", propOrder = {
    "read",
    "write",
    "execute",
    "active",
    "validTime",
    "area",
    "licence",
    "volume",
    "count",
    "latitude",
    "longitude",
    "directUser",
    "directService",
    "withGroups"
})
public class GnPermission {

    protected long read;
    protected long write;
    protected long execute;
    protected long active;
    @XmlElement(name = "valid-time")
    protected long validTime;
    protected long area;
    @XmlElementRef(name = "licence", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> licence;
    protected long volume;
    protected long count;
    protected double latitude;
    protected double longitude;
    protected long directUser;
    protected long directService;
    protected long withGroups;

    /**
     * Gets the value of the read property.
     * 
     */
    public long getRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     */
    public void setRead(long value) {
        this.read = value;
    }

    /**
     * Gets the value of the write property.
     * 
     */
    public long getWrite() {
        return write;
    }

    /**
     * Sets the value of the write property.
     * 
     */
    public void setWrite(long value) {
        this.write = value;
    }

    /**
     * Gets the value of the execute property.
     * 
     */
    public long getExecute() {
        return execute;
    }

    /**
     * Sets the value of the execute property.
     * 
     */
    public void setExecute(long value) {
        this.execute = value;
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
     * Gets the value of the validTime property.
     * 
     */
    public long getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     */
    public void setValidTime(long value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the area property.
     * 
     */
    public long getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(long value) {
        this.area = value;
    }

    /**
     * Gets the value of the licence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getLicence() {
        return licence;
    }

    /**
     * Sets the value of the licence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setLicence(JAXBElement<java.lang.String> value) {
        this.licence = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public long getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(long value) {
        this.volume = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
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
     * Gets the value of the directUser property.
     * 
     */
    public long getDirectUser() {
        return directUser;
    }

    /**
     * Sets the value of the directUser property.
     * 
     */
    public void setDirectUser(long value) {
        this.directUser = value;
    }

    /**
     * Gets the value of the directService property.
     * 
     */
    public long getDirectService() {
        return directService;
    }

    /**
     * Sets the value of the directService property.
     * 
     */
    public void setDirectService(long value) {
        this.directService = value;
    }

    /**
     * Gets the value of the withGroups property.
     * 
     */
    public long getWithGroups() {
        return withGroups;
    }

    /**
     * Sets the value of the withGroups property.
     * 
     */
    public void setWithGroups(long value) {
        this.withGroups = value;
    }

}
