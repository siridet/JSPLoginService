
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
 *         &lt;element name="billingAttributesResponse" type="{urn:gndbss}gnBillingAttributes"/>
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
    "billingAttributesResponse",
    "returnCode"
})
@XmlRootElement(name = "gnBillingAttributesResponse")
public class GnBillingAttributesResponse {

    @XmlElement(required = true)
    protected GnBillingAttributes billingAttributesResponse;
    protected int returnCode;

    /**
     * Gets the value of the billingAttributesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnBillingAttributes }
     *     
     */
    public GnBillingAttributes getBillingAttributesResponse() {
        return billingAttributesResponse;
    }

    /**
     * Sets the value of the billingAttributesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnBillingAttributes }
     *     
     */
    public void setBillingAttributesResponse(GnBillingAttributes value) {
        this.billingAttributesResponse = value;
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
