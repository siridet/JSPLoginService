
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
 *         &lt;element name="infoResponse" type="{urn:gndbss}gnInfo"/>
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
    "infoResponse",
    "returnCode"
})
@XmlRootElement(name = "gnInfoResponse")
public class GnInfoResponse {

    @XmlElement(required = true)
    protected GnInfo infoResponse;
    protected int returnCode;

    /**
     * Gets the value of the infoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnInfo }
     *     
     */
    public GnInfo getInfoResponse() {
        return infoResponse;
    }

    /**
     * Sets the value of the infoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnInfo }
     *     
     */
    public void setInfoResponse(GnInfo value) {
        this.infoResponse = value;
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
