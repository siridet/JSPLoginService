
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
 *         &lt;element name="serviceResponse" type="{urn:gndbss}gnService"/>
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
    "serviceResponse",
    "returnCode"
})
@XmlRootElement(name = "gnServiceResponse")
public class GnServiceResponse {

    @XmlElement(required = true)
    protected GnService serviceResponse;
    protected int returnCode;

    /**
     * Gets the value of the serviceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnService }
     *     
     */
    public GnService getServiceResponse() {
        return serviceResponse;
    }

    /**
     * Sets the value of the serviceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnService }
     *     
     */
    public void setServiceResponse(GnService value) {
        this.serviceResponse = value;
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
