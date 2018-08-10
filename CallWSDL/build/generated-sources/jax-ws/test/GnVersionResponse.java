
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionResponse" type="{urn:gndbss}gnVersion"/>
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
@XmlType(name = "gnVersionResponse", propOrder = {
    "versionResponse",
    "returnCode"
})
public class GnVersionResponse {

    @XmlElement(required = true)
    protected GnVersion versionResponse;
    protected int returnCode;

    /**
     * Gets the value of the versionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnVersion }
     *     
     */
    public GnVersion getVersionResponse() {
        return versionResponse;
    }

    /**
     * Sets the value of the versionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnVersion }
     *     
     */
    public void setVersionResponse(GnVersion value) {
        this.versionResponse = value;
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
