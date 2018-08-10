
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
 *         &lt;element name="infosResponse" type="{urn:gndbss}gnInfos"/>
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
    "infosResponse",
    "returnCode"
})
@XmlRootElement(name = "gnInfosResponse")
public class GnInfosResponse {

    @XmlElement(required = true)
    protected GnInfos infosResponse;
    protected int returnCode;

    /**
     * Gets the value of the infosResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnInfos }
     *     
     */
    public GnInfos getInfosResponse() {
        return infosResponse;
    }

    /**
     * Sets the value of the infosResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnInfos }
     *     
     */
    public void setInfosResponse(GnInfos value) {
        this.infosResponse = value;
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
