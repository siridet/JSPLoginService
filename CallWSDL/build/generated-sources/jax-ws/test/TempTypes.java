
package test;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tempTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tempTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START"/>
 *     &lt;enumeration value="NEXT"/>
 *     &lt;enumeration value="FINISH"/>
 *     &lt;enumeration value="ABORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tempTypes")
@XmlEnum
public enum TempTypes {

    START,
    NEXT,
    FINISH,
    ABORT;

    public java.lang.String value() {
        return name();
    }

    public static TempTypes fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
