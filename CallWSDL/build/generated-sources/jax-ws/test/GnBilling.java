
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnBilling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="user-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="service-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="job-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="station-mountpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observation-interval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quality" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="still-online" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="exported" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="user-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnBilling", propOrder = {
    "id",
    "userId",
    "serviceId",
    "jobId",
    "quantity",
    "start",
    "end",
    "latitude",
    "longitude",
    "height",
    "stationMountpoint",
    "observationInterval",
    "quality",
    "attributes",
    "stillOnline",
    "exported",
    "userName"
})
public class GnBilling {

    protected long id;
    @XmlElement(name = "user-id")
    protected long userId;
    @XmlElement(name = "service-id")
    protected long serviceId;
    @XmlElement(name = "job-id")
    protected long jobId;
    protected long quantity;
    protected double start;
    protected double end;
    protected double latitude;
    protected double longitude;
    protected double height;
    @XmlElementRef(name = "station-mountpoint", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> stationMountpoint;
    @XmlElement(name = "observation-interval")
    protected long observationInterval;
    protected long quality;
    protected long attributes;
    @XmlElement(name = "still-online")
    protected long stillOnline;
    protected long exported;
    @XmlElementRef(name = "user-name", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> userName;

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
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
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
     * Gets the value of the jobId property.
     * 
     */
    public long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(long value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public double getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(double value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     */
    public double getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     */
    public void setEnd(double value) {
        this.end = value;
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
     * Gets the value of the stationMountpoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getStationMountpoint() {
        return stationMountpoint;
    }

    /**
     * Sets the value of the stationMountpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setStationMountpoint(JAXBElement<java.lang.String> value) {
        this.stationMountpoint = value;
    }

    /**
     * Gets the value of the observationInterval property.
     * 
     */
    public long getObservationInterval() {
        return observationInterval;
    }

    /**
     * Sets the value of the observationInterval property.
     * 
     */
    public void setObservationInterval(long value) {
        this.observationInterval = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     */
    public long getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     */
    public void setQuality(long value) {
        this.quality = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     */
    public long getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     */
    public void setAttributes(long value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the stillOnline property.
     * 
     */
    public long getStillOnline() {
        return stillOnline;
    }

    /**
     * Sets the value of the stillOnline property.
     * 
     */
    public void setStillOnline(long value) {
        this.stillOnline = value;
    }

    /**
     * Gets the value of the exported property.
     * 
     */
    public long getExported() {
        return exported;
    }

    /**
     * Sets the value of the exported property.
     * 
     */
    public void setExported(long value) {
        this.exported = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public JAXBElement<java.lang.String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<java.lang.String> value) {
        this.userName = value;
    }

}
