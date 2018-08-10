
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
 *         &lt;element name="first" type="{urn:gndbss}Strings"/>
 *         &lt;element name="second" type="{urn:gndbss}Strings"/>
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
    "first",
    "second"
})
@XmlRootElement(name = "gnPair")
public class GnPair {

    @XmlElement(required = true)
    protected Strings first;
    @XmlElement(required = true)
    protected Strings second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setFirst(Strings value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setSecond(Strings value) {
        this.second = value;
    }

}
