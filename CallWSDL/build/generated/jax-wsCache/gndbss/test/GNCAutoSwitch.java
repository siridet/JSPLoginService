
package test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GNC-AutoSwitch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNC-AutoSwitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from-idx" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNC-AutoSwitch", propOrder = {
    "fromIdx",
    "item"
})
public class GNCAutoSwitch {

    @XmlElement(name = "from-idx")
    @XmlSchemaType(name = "unsignedShort")
    protected int fromIdx;
    @XmlElement(type = java.lang.Integer.class)
    @XmlSchemaType(name = "unsignedShort")
    protected List<java.lang.Integer> item;

    /**
     * Gets the value of the fromIdx property.
     * 
     */
    public int getFromIdx() {
        return fromIdx;
    }

    /**
     * Sets the value of the fromIdx property.
     * 
     */
    public void setFromIdx(int value) {
        this.fromIdx = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Integer }
     * 
     * 
     */
    public List<java.lang.Integer> getItem() {
        if (item == null) {
            item = new ArrayList<java.lang.Integer>();
        }
        return this.item;
    }

}
