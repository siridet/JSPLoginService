
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="casters" type="{urn:gndbss}GNC-CASTERs"/>
 *         &lt;element name="networks" type="{urn:gndbss}GNC-NETWORKs"/>
 *         &lt;element name="streams" type="{urn:gndbss}GNC-STREAMs"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "casters",
    "networks",
    "streams",
    "returnCode"
})
@XmlRootElement(name = "GNC-Response")
public class GNCResponse {

    @XmlElement(required = true)
    protected GNCCASTERs casters;
    @XmlElement(required = true)
    protected GNCNETWORKs networks;
    @XmlElement(required = true)
    protected GNCSTREAMs streams;
    protected int returnCode;

    /**
     * Gets the value of the casters property.
     * 
     * @return
     *     possible object is
     *     {@link GNCCASTERs }
     *     
     */
    public GNCCASTERs getCasters() {
        return casters;
    }

    /**
     * Sets the value of the casters property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNCCASTERs }
     *     
     */
    public void setCasters(GNCCASTERs value) {
        this.casters = value;
    }

    /**
     * Gets the value of the networks property.
     * 
     * @return
     *     possible object is
     *     {@link GNCNETWORKs }
     *     
     */
    public GNCNETWORKs getNetworks() {
        return networks;
    }

    /**
     * Sets the value of the networks property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNCNETWORKs }
     *     
     */
    public void setNetworks(GNCNETWORKs value) {
        this.networks = value;
    }

    /**
     * Gets the value of the streams property.
     * 
     * @return
     *     possible object is
     *     {@link GNCSTREAMs }
     *     
     */
    public GNCSTREAMs getStreams() {
        return streams;
    }

    /**
     * Sets the value of the streams property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNCSTREAMs }
     *     
     */
    public void setStreams(GNCSTREAMs value) {
        this.streams = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

}
