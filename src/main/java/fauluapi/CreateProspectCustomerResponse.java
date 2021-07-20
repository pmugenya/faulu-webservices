
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateProspectCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateProspectCustomerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/RensoftBancassure}Status" minOccurs="0"/>
 *         &lt;element name="CUSTOMERType" type="{http://temenos.com/CUSTOMER}CUSTOMERType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateProspectCustomerResponse", propOrder = {
    "status",
    "customerType"
})
public class CreateProspectCustomerResponse {

    @XmlElement(name = "Status", namespace = "")
    protected Status status;
    @XmlElement(name = "CUSTOMERType", namespace = "")
    protected CUSTOMERType customerType;

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
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMERType }
     *     
     */
    public CUSTOMERType getCUSTOMERType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMERType }
     *     
     */
    public void setCUSTOMERType(CUSTOMERType value) {
        this.customerType = value;
    }

}
