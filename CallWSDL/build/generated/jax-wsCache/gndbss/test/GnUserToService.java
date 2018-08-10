
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnUserToService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnUserToService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="user-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="service-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="write" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="execute" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="valid-from" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="valid-until" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="area-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="count-max" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="count-current" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="count-total" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="logging-active" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnUserToService", propOrder = {
    "id",
    "userId",
    "serviceId",
    "read",
    "write",
    "execute",
    "active",
    "validFrom",
    "validUntil",
    "areaId",
    "licence",
    "volume",
    "online",
    "countMax",
    "countCurrent",
    "countTotal",
    "loggingActive"
})
public class GnUserToService {

    protected long id;
    @XmlElement(name = "user-id")
    protected long userId;
    @XmlElement(name = "service-id")
    protected long serviceId;
    protected long read;
    protected long write;
    protected long execute;
    protected long active;
    @XmlElement(name = "valid-from")
    protected double validFrom;
    @XmlElement(name = "valid-until")
    protected double validUntil;
    @XmlElement(name = "area-id")
    protected long areaId;
    @XmlElementRef(name = "licence", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> licence;
    protected double volume;
    protected long online;
    @XmlElement(name = "count-max")
    protected long countMax;
    @XmlElement(name = "count-current")
    protected long countCurrent;
    @XmlElement(name = "count-total")
    protected long countTotal;
    @XmlElement(name = "logging-active")
    protected long loggingActive;

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
     * Gets the value of the validFrom property.
     * 
     */
    public double getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     */
    public void setValidFrom(double value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     */
    public double getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     */
    public void setValidUntil(double value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     */
    public long getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     */
    public void setAreaId(long value) {
        this.areaId = value;
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
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the online property.
     * 
     */
    public long getOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(long value) {
        this.online = value;
    }

    /**
     * Gets the value of the countMax property.
     * 
     */
    public long getCountMax() {
        return countMax;
    }

    /**
     * Sets the value of the countMax property.
     * 
     */
    public void setCountMax(long value) {
        this.countMax = value;
    }

    /**
     * Gets the value of the countCurrent property.
     * 
     */
    public long getCountCurrent() {
        return countCurrent;
    }

    /**
     * Sets the value of the countCurrent property.
     * 
     */
    public void setCountCurrent(long value) {
        this.countCurrent = value;
    }

    /**
     * Gets the value of the countTotal property.
     * 
     */
    public long getCountTotal() {
        return countTotal;
    }

    /**
     * Sets the value of the countTotal property.
     * 
     */
    public void setCountTotal(long value) {
        this.countTotal = value;
    }

    /**
     * Gets the value of the loggingActive property.
     * 
     */
    public long getLoggingActive() {
        return loggingActive;
    }

    /**
     * Sets the value of the loggingActive property.
     * 
     */
    public void setLoggingActive(long value) {
        this.loggingActive = value;
    }

}
