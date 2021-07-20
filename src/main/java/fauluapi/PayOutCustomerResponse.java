
package fauluapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayOutCustomerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayOutCustomerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/RensoftBancassure}Status" minOccurs="0"/>
 *         &lt;element name="FUNDSTRANSFERType" type="{http://temenos.com/FUNDSTRANSFER}FUNDSTRANSFERType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayOutCustomerResponse", propOrder = {
    "status",
    "fundstransferType"
})
public class PayOutCustomerResponse {

    @XmlElement(name = "Status", namespace = "")
    protected Status status;
    @XmlElement(name = "FUNDSTRANSFERType", namespace = "")
    protected FUNDSTRANSFERType fundstransferType;

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
     * Gets the value of the fundstransferType property.
     * 
     * @return
     *     possible object is
     *     {@link FUNDSTRANSFERType }
     *     
     */
    public FUNDSTRANSFERType getFUNDSTRANSFERType() {
        return fundstransferType;
    }

    /**
     * Sets the value of the fundstransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUNDSTRANSFERType }
     *     
     */
    public void setFUNDSTRANSFERType(FUNDSTRANSFERType value) {
        this.fundstransferType = value;
    }

}
