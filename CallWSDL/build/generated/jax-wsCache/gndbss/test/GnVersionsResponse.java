
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnVersionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnVersionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionsResponse" type="{urn:gndbss}gnVersions"/>
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
@XmlType(name = "gnVersionsResponse", propOrder = {
    "versionsResponse",
    "returnCode"
})
public class GnVersionsResponse {

    @XmlElement(required = true)
    protected GnVersions versionsResponse;
    protected int returnCode;

    /**
     * Gets the value of the versionsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnVersions }
     *     
     */
    public GnVersions getVersionsResponse() {
        return versionsResponse;
    }

    /**
     * Sets the value of the versionsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnVersions }
     *     
     */
    public void setVersionsResponse(GnVersions value) {
        this.versionsResponse = value;
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
