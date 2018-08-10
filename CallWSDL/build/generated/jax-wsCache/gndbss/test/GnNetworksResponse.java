
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
 *         &lt;element name="networksResponse" type="{urn:gndbss}gnNetworks"/>
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
    "networksResponse",
    "returnCode"
})
@XmlRootElement(name = "gnNetworksResponse")
public class GnNetworksResponse {

    @XmlElement(required = true)
    protected GnNetworks networksResponse;
    protected int returnCode;

    /**
     * Gets the value of the networksResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnNetworks }
     *     
     */
    public GnNetworks getNetworksResponse() {
        return networksResponse;
    }

    /**
     * Sets the value of the networksResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnNetworks }
     *     
     */
    public void setNetworksResponse(GnNetworks value) {
        this.networksResponse = value;
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
