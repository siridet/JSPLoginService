
package test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fillBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fillBilling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billing-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="job-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mjd-start" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mjd-end" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bytes-epochs" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="first-pos-lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="first-pos-lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="observation-interval" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="still-online" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="user-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fillBilling", propOrder = {
    "billingId",
    "jobId",
    "mjdStart",
    "mjdEnd",
    "bytesEpochs",
    "firstPosLat",
    "firstPosLon",
    "observationInterval",
    "stillOnline",
    "userName",
    "datatype"
})
public class FillBilling {

    @XmlElement(name = "billing-id")
    protected long billingId;
    @XmlElement(name = "job-id")
    protected long jobId;
    @XmlElement(name = "mjd-start")
    protected double mjdStart;
    @XmlElement(name = "mjd-end")
    protected double mjdEnd;
    @XmlElement(name = "bytes-epochs")
    protected long bytesEpochs;
    @XmlElement(name = "first-pos-lat")
    protected double firstPosLat;
    @XmlElement(name = "first-pos-lon")
    protected double firstPosLon;
    @XmlElement(name = "observation-interval")
    protected double observationInterval;
    @XmlElement(name = "still-online")
    protected long stillOnline;
    @XmlElementRef(name = "user-name", namespace = "urn:gndbss", type = JAXBElement.class, required = false)
    protected JAXBElement<java.lang.String> userName;
    protected long datatype;

    /**
     * Gets the value of the billingId property.
     * 
     */
    public long getBillingId() {
        return billingId;
    }

    /**
     * Sets the value of the billingId property.
     * 
     */
    public void setBillingId(long value) {
        this.billingId = value;
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
     * Gets the value of the mjdStart property.
     * 
     */
    public double getMjdStart() {
        return mjdStart;
    }

    /**
     * Sets the value of the mjdStart property.
     * 
     */
    public void setMjdStart(double value) {
        this.mjdStart = value;
    }

    /**
     * Gets the value of the mjdEnd property.
     * 
     */
    public double getMjdEnd() {
        return mjdEnd;
    }

    /**
     * Sets the value of the mjdEnd property.
     * 
     */
    public void setMjdEnd(double value) {
        this.mjdEnd = value;
    }

    /**
     * Gets the value of the bytesEpochs property.
     * 
     */
    public long getBytesEpochs() {
        return bytesEpochs;
    }

    /**
     * Sets the value of the bytesEpochs property.
     * 
     */
    public void setBytesEpochs(long value) {
        this.bytesEpochs = value;
    }

    /**
     * Gets the value of the firstPosLat property.
     * 
     */
    public double getFirstPosLat() {
        return firstPosLat;
    }

    /**
     * Sets the value of the firstPosLat property.
     * 
     */
    public void setFirstPosLat(double value) {
        this.firstPosLat = value;
    }

    /**
     * Gets the value of the firstPosLon property.
     * 
     */
    public double getFirstPosLon() {
        return firstPosLon;
    }

    /**
     * Sets the value of the firstPosLon property.
     * 
     */
    public void setFirstPosLon(double value) {
        this.firstPosLon = value;
    }

    /**
     * Gets the value of the observationInterval property.
     * 
     */
    public double getObservationInterval() {
        return observationInterval;
    }

    /**
     * Sets the value of the observationInterval property.
     * 
     */
    public void setObservationInterval(double value) {
        this.observationInterval = value;
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

    /**
     * Gets the value of the datatype property.
     * 
     */
    public long getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     */
    public void setDatatype(long value) {
        this.datatype = value;
    }

}
