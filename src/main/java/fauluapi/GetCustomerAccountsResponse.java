
package fauluapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerAccountsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerAccountsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/RensoftBancassure}Status" minOccurs="0"/>
 *         &lt;element name="EWSBANCASSUREACCOUNTINFOType" type="{http://temenos.com/EWSBANCASSUREACCOUNTINFO}EWSBANCASSUREACCOUNTINFOType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerAccountsResponse", propOrder = {
    "status",
    "ewsbancassureaccountinfoType"
})
public class GetCustomerAccountsResponse {

    @XmlElement(name = "Status", namespace = "")
    protected Status status;
    @XmlElement(name = "EWSBANCASSUREACCOUNTINFOType", namespace = "")
    protected List<EWSBANCASSUREACCOUNTINFOType> ewsbancassureaccountinfoType;

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
     * Gets the value of the ewsbancassureaccountinfoType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ewsbancassureaccountinfoType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEWSBANCASSUREACCOUNTINFOType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EWSBANCASSUREACCOUNTINFOType }
     * 
     * 
     */
    public List<EWSBANCASSUREACCOUNTINFOType> getEWSBANCASSUREACCOUNTINFOType() {
        if (ewsbancassureaccountinfoType == null) {
            ewsbancassureaccountinfoType = new ArrayList<EWSBANCASSUREACCOUNTINFOType>();
        }
        return this.ewsbancassureaccountinfoType;
    }

}
