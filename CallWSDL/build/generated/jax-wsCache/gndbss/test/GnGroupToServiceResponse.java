
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnGroupToServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnGroupToServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupToServiceResponse" type="{urn:gndbss}gnGroupToService"/>
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
@XmlType(name = "gnGroupToServiceResponse", propOrder = {
    "groupToServiceResponse",
    "returnCode"
})
public class GnGroupToServiceResponse {

    @XmlElement(required = true)
    protected GnGroupToService groupToServiceResponse;
    protected int returnCode;

    /**
     * Gets the value of the groupToServiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroupToService }
     *     
     */
    public GnGroupToService getGroupToServiceResponse() {
        return groupToServiceResponse;
    }

    /**
     * Sets the value of the groupToServiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroupToService }
     *     
     */
    public void setGroupToServiceResponse(GnGroupToService value) {
        this.groupToServiceResponse = value;
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
