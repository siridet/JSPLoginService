
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
 *         &lt;element name="serviceToInfosResponse" type="{urn:gndbss}gnServiceToInfos"/>
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
    "serviceToInfosResponse",
    "returnCode"
})
@XmlRootElement(name = "gnServiceToInfosResponse")
public class GnServiceToInfosResponse {

    @XmlElement(required = true)
    protected GnServiceToInfos serviceToInfosResponse;
    protected int returnCode;

    /**
     * Gets the value of the serviceToInfosResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnServiceToInfos }
     *     
     */
    public GnServiceToInfos getServiceToInfosResponse() {
        return serviceToInfosResponse;
    }

    /**
     * Sets the value of the serviceToInfosResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnServiceToInfos }
     *     
     */
    public void setServiceToInfosResponse(GnServiceToInfos value) {
        this.serviceToInfosResponse = value;
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
