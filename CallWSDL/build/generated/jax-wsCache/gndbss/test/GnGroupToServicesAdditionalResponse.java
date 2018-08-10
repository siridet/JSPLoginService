
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
 *         &lt;element name="groupToServicesResponse" type="{urn:gndbss}gnGroupToServices"/>
 *         &lt;element name="additional" type="{urn:gndbss}gnAdditional"/>
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
    "groupToServicesResponse",
    "additional",
    "returnCode"
})
@XmlRootElement(name = "gnGroupToServicesAdditionalResponse")
public class GnGroupToServicesAdditionalResponse {

    @XmlElement(required = true)
    protected GnGroupToServices groupToServicesResponse;
    @XmlElement(required = true)
    protected GnAdditional additional;
    protected int returnCode;

    /**
     * Gets the value of the groupToServicesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroupToServices }
     *     
     */
    public GnGroupToServices getGroupToServicesResponse() {
        return groupToServicesResponse;
    }

    /**
     * Sets the value of the groupToServicesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroupToServices }
     *     
     */
    public void setGroupToServicesResponse(GnGroupToServices value) {
        this.groupToServicesResponse = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link GnAdditional }
     *     
     */
    public GnAdditional getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnAdditional }
     *     
     */
    public void setAdditional(GnAdditional value) {
        this.additional = value;
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
