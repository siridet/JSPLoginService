
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnuInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{urn:gndbss}gnInfo"/>
 *         &lt;element name="infoPredefines" type="{urn:gndbss}gnInfoPredefines"/>
 *         &lt;element name="userToInfos" type="{urn:gndbss}gnUserToInfos"/>
 *         &lt;element name="serviceToInfos" type="{urn:gndbss}gnServiceToInfos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnuInfo", propOrder = {
    "info",
    "infoPredefines",
    "userToInfos",
    "serviceToInfos"
})
public class GnuInfo {

    @XmlElement(required = true)
    protected GnInfo info;
    @XmlElement(required = true)
    protected GnInfoPredefines infoPredefines;
    @XmlElement(required = true)
    protected GnUserToInfos userToInfos;
    @XmlElement(required = true)
    protected GnServiceToInfos serviceToInfos;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link GnInfo }
     *     
     */
    public GnInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnInfo }
     *     
     */
    public void setInfo(GnInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the infoPredefines property.
     * 
     * @return
     *     possible object is
     *     {@link GnInfoPredefines }
     *     
     */
    public GnInfoPredefines getInfoPredefines() {
        return infoPredefines;
    }

    /**
     * Sets the value of the infoPredefines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnInfoPredefines }
     *     
     */
    public void setInfoPredefines(GnInfoPredefines value) {
        this.infoPredefines = value;
    }

    /**
     * Gets the value of the userToInfos property.
     * 
     * @return
     *     possible object is
     *     {@link GnUserToInfos }
     *     
     */
    public GnUserToInfos getUserToInfos() {
        return userToInfos;
    }

    /**
     * Sets the value of the userToInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUserToInfos }
     *     
     */
    public void setUserToInfos(GnUserToInfos value) {
        this.userToInfos = value;
    }

    /**
     * Gets the value of the serviceToInfos property.
     * 
     * @return
     *     possible object is
     *     {@link GnServiceToInfos }
     *     
     */
    public GnServiceToInfos getServiceToInfos() {
        return serviceToInfos;
    }

    /**
     * Sets the value of the serviceToInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnServiceToInfos }
     *     
     */
    public void setServiceToInfos(GnServiceToInfos value) {
        this.serviceToInfos = value;
    }

}
