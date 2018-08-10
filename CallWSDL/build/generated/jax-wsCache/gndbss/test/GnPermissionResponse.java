
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnPermissionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnPermissionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permission" type="{urn:gndbss}gnPermission"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnPermissionResponse", propOrder = {
    "permission"
})
public class GnPermissionResponse {

    @XmlElement(required = true)
    protected GnPermission permission;

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link GnPermission }
     *     
     */
    public GnPermission getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnPermission }
     *     
     */
    public void setPermission(GnPermission value) {
        this.permission = value;
    }

}
