
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
 *         &lt;element name="servicesResponse" type="{urn:gndbss}gnServices"/>
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
    "servicesResponse",
    "returnCode"
})
@XmlRootElement(name = "gnServicesResponse")
public class GnServicesResponse {

    @XmlElement(required = true)
    protected GnServices servicesResponse;
    protected int returnCode;

    /**
     * Gets the value of the servicesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnServices }
     *     
     */
    public GnServices getServicesResponse() {
        return servicesResponse;
    }

    /**
     * Sets the value of the servicesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnServices }
     *     
     */
    public void setServicesResponse(GnServices value) {
        this.servicesResponse = value;
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
