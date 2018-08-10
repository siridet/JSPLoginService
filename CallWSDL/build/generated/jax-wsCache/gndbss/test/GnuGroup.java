
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnuGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnuGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" type="{urn:gndbss}gnGroup"/>
 *         &lt;element name="selectedUsers" type="{urn:gndbss}gnUsers"/>
 *         &lt;element name="selectedServices" type="{urn:gndbss}gnGroupToServices"/>
 *         &lt;element name="gtsToAreas" type="{urn:gndbss}gnGtsToAreas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnuGroup", propOrder = {
    "group",
    "selectedUsers",
    "selectedServices",
    "gtsToAreas"
})
public class GnuGroup {

    @XmlElement(required = true)
    protected GnGroup group;
    @XmlElement(required = true)
    protected GnUsers selectedUsers;
    @XmlElement(required = true)
    protected GnGroupToServices selectedServices;
    @XmlElement(required = true)
    protected GnGtsToAreas gtsToAreas;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroup }
     *     
     */
    public GnGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroup }
     *     
     */
    public void setGroup(GnGroup value) {
        this.group = value;
    }

    /**
     * Gets the value of the selectedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link GnUsers }
     *     
     */
    public GnUsers getSelectedUsers() {
        return selectedUsers;
    }

    /**
     * Sets the value of the selectedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnUsers }
     *     
     */
    public void setSelectedUsers(GnUsers value) {
        this.selectedUsers = value;
    }

    /**
     * Gets the value of the selectedServices property.
     * 
     * @return
     *     possible object is
     *     {@link GnGroupToServices }
     *     
     */
    public GnGroupToServices getSelectedServices() {
        return selectedServices;
    }

    /**
     * Sets the value of the selectedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGroupToServices }
     *     
     */
    public void setSelectedServices(GnGroupToServices value) {
        this.selectedServices = value;
    }

    /**
     * Gets the value of the gtsToAreas property.
     * 
     * @return
     *     possible object is
     *     {@link GnGtsToAreas }
     *     
     */
    public GnGtsToAreas getGtsToAreas() {
        return gtsToAreas;
    }

    /**
     * Sets the value of the gtsToAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnGtsToAreas }
     *     
     */
    public void setGtsToAreas(GnGtsToAreas value) {
        this.gtsToAreas = value;
    }

}
