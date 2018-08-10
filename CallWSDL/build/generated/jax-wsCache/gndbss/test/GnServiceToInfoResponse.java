
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
 *         &lt;element name="serviceToInfoResponse" type="{urn:gndbss}gnServiceToInfo"/>
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
    "serviceToInfoResponse",
    "returnCode"
})
@XmlRootElement(name = "gnServiceToInfoResponse")
public class GnServiceToInfoResponse {

    @XmlElement(required = true)
    protected GnServiceToInfo serviceToInfoResponse;
    protected int returnCode;

    /**
     * Gets the value of the serviceToInfoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnServiceToInfo }
     *     
     */
    public GnServiceToInfo getServiceToInfoResponse() {
        return serviceToInfoResponse;
    }

    /**
     * Sets the value of the serviceToInfoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnServiceToInfo }
     *     
     */
    public void setServiceToInfoResponse(GnServiceToInfo value) {
        this.serviceToInfoResponse = value;
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
