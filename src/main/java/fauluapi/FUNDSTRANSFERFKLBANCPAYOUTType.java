
package fauluapi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FUNDSTRANSFERFKLBANCPAYOUTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERFKLBANCPAYOUTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPAYMENTDETAILS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PAYMENTDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FUNDSTRANSFERFKLBANCPAYOUTType", namespace = "http://temenos.com/FUNDSTRANSFERFKLBANCPAYOUT", propOrder = {
    "debitacctno",
    "debitcurrency",
    "debitamount",
    "creditacctno",
    "gpaymentdetails"
})
public class FUNDSTRANSFERFKLBANCPAYOUTType {

    @XmlElement(name = "DEBITACCTNO")
    protected String debitacctno;
    @XmlElement(name = "DEBITCURRENCY")
    protected String debitcurrency;
    @XmlElement(name = "DEBITAMOUNT")
    protected String debitamount;
    @XmlElement(name = "CREDITACCTNO")
    protected String creditacctno;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected GPAYMENTDETAILS gpaymentdetails;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the debitacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITACCTNO() {
        return debitacctno;
    }

    /**
     * Sets the value of the debitacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITACCTNO(String value) {
        this.debitacctno = value;
    }

    /**
     * Gets the value of the debitcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITCURRENCY() {
        return debitcurrency;
    }

    /**
     * Sets the value of the debitcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITCURRENCY(String value) {
        this.debitcurrency = value;
    }

    /**
     * Gets the value of the debitamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITAMOUNT() {
        return debitamount;
    }

    /**
     * Sets the value of the debitamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITAMOUNT(String value) {
        this.debitamount = value;
    }

    /**
     * Gets the value of the creditacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITACCTNO() {
        return creditacctno;
    }

    /**
     * Sets the value of the creditacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITACCTNO(String value) {
        this.creditacctno = value;
    }

    /**
     * Gets the value of the gpaymentdetails property.
     * 
     * @return
     *     possible object is
     *     {@link GPAYMENTDETAILS }
     *     
     */
    public GPAYMENTDETAILS getGPAYMENTDETAILS() {
        return gpaymentdetails;
    }

    /**
     * Sets the value of the gpaymentdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPAYMENTDETAILS }
     *     
     */
    public void setGPAYMENTDETAILS(GPAYMENTDETAILS value) {
        this.gpaymentdetails = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


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
     *         &lt;element name="PAYMENTDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentdetails"
    })
    public static class GPAYMENTDETAILS {

        @XmlElement(name = "PAYMENTDETAILS", namespace = "http://temenos.com/FUNDSTRANSFERFKLBANCPAYOUT")
        protected List<String> paymentdetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the paymentdetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentdetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPAYMENTDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPAYMENTDETAILS() {
            if (paymentdetails == null) {
                paymentdetails = new ArrayList<String>();
            }
            return this.paymentdetails;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }

    }

}
