
package introsde.assignment3.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonPreferencesWithIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonPreferencesWithIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personPreferencesWithId" type="{http://soap.assignment3.introsde/}activity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonPreferencesWithIdResponse", propOrder = {
    "personPreferencesWithId"
})
public class ReadPersonPreferencesWithIdResponse {

    protected Activity personPreferencesWithId;

    /**
     * Gets the value of the personPreferencesWithId property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getPersonPreferencesWithId() {
        return personPreferencesWithId;
    }

    /**
     * Sets the value of the personPreferencesWithId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setPersonPreferencesWithId(Activity value) {
        this.personPreferencesWithId = value;
    }

}
