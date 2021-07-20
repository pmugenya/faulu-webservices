
package fauluapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/RensoftBancassure}Status" minOccurs="0"/>
 *         &lt;element name="EWSBANCASSURECUSTINFOType" type="{http://temenos.com/EWSBANCASSURECUSTINFO}EWSBANCASSURECUSTINFOType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerInfoResponse", propOrder = {
    "status",
    "ewsbancassurecustinfoType"
})
public class GetCustomerInfoResponse {

    @XmlElement(name = "Status", namespace = "")
    protected Status status;
    @XmlElement(name = "EWSBANCASSURECUSTINFOType", namespace = "")
    protected List<EWSBANCASSURECUSTINFOType> ewsbancassurecustinfoType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the ewsbancassurecustinfoType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ewsbancassurecustinfoType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEWSBANCASSURECUSTINFOType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EWSBANCASSURECUSTINFOType }
     * 
     * 
     */
    public List<EWSBANCASSURECUSTINFOType> getEWSBANCASSURECUSTINFOType() {
        if (ewsbancassurecustinfoType == null) {
            ewsbancassurecustinfoType = new ArrayList<EWSBANCASSURECUSTINFOType>();
        }
        return this.ewsbancassurecustinfoType;
    }

}
