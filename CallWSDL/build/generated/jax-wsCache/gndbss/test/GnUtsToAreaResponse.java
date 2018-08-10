
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
 *         &lt;element name="utsToAreaResponse" type="{urn:gndbss}gnUtsToArea"/>
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
    "utsToAreaResponse",
    "returnCode"
})
@XmlRootElement(name = "gnUtsToAreaResponse")
public class GnUtsToAreaResponse {

    @XmlElement(required = true)
    protected GnUtsToArea utsToAreaResponse;
    protected int returnCode;

    /**
     * Gets the value of the utsToAreaResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnUtsToArea }
     *     
     */
    public GnUtsToArea getUtsToAreaResponse() {
        return utsToAreaResponse;
    }

    /**
     * Sets the value of the utsToAreaResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUtsToArea }
     *     
     */
    public void setUtsToAreaResponse(GnUtsToArea value) {
        this.utsToAreaResponse = value;
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
