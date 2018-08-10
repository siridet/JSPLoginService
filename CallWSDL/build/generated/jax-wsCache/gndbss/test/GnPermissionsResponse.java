
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gnPermissionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gnPermissionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permissios" type="{urn:gndbss}gnPermissions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gnPermissionsResponse", propOrder = {
    "permissios"
})
public class GnPermissionsResponse {

    @XmlElement(required = true)
    protected GnPermissions permissios;

    /**
     * Gets the value of the permissios property.
     * 
     * @return
     *     possible object is
     *     {@link GnPermissions }
     *     
     */
    public GnPermissions getPermissios() {
        return permissios;
    }

    /**
     * Sets the value of the permissios property.
     * 
     * @param value
     *     allowed object is
     *     {@link GnPermissions }
     *     
     */
    public void setPermissios(GnPermissions value) {
        this.permissios = value;
    }

}
