
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
 * <p>Java class for EWSBANCASSURECUSTINFOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EWSBANCASSURECUSTINFOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gEWSBANCASSURECUSTINFODetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mEWSBANCASSURECUSTINFODetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="selFldCUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="selFldLEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CLIENTPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BIRTHINCDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EWSBANCASSURECUSTINFOType", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO", propOrder = {
    "gewsbancassurecustinfoDetailType"
})
public class EWSBANCASSURECUSTINFOType {

    @XmlElement(name = "gEWSBANCASSURECUSTINFODetailType")
    protected GEWSBANCASSURECUSTINFODetailType gewsbancassurecustinfoDetailType;

    /**
     * Gets the value of the gewsbancassurecustinfoDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link GEWSBANCASSURECUSTINFODetailType }
     *     
     */
    public GEWSBANCASSURECUSTINFODetailType getGEWSBANCASSURECUSTINFODetailType() {
        return gewsbancassurecustinfoDetailType;
    }

    /**
     * Sets the value of the gewsbancassurecustinfoDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEWSBANCASSURECUSTINFODetailType }
     *     
     */
    public void setGEWSBANCASSURECUSTINFODetailType(GEWSBANCASSURECUSTINFODetailType value) {
        this.gewsbancassurecustinfoDetailType = value;
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
     *         &lt;element name="mEWSBANCASSURECUSTINFODetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="selFldCUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="selFldLEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CLIENTPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BIRTHINCDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "mewsbancassurecustinfoDetailType"
    })
    public static class GEWSBANCASSURECUSTINFODetailType {

        @XmlElement(name = "mEWSBANCASSURECUSTINFODetailType", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
        protected List<MEWSBANCASSURECUSTINFODetailType> mewsbancassurecustinfoDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mewsbancassurecustinfoDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mewsbancassurecustinfoDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEWSBANCASSURECUSTINFODetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEWSBANCASSURECUSTINFODetailType }
         * 
         * 
         */
        public List<MEWSBANCASSURECUSTINFODetailType> getMEWSBANCASSURECUSTINFODetailType() {
            if (mewsbancassurecustinfoDetailType == null) {
                mewsbancassurecustinfoDetailType = new ArrayList<MEWSBANCASSURECUSTINFODetailType>();
            }
            return this.mewsbancassurecustinfoDetailType;
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
         *         &lt;element name="selFldCUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="selFldLEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTOMERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CLIENTPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BIRTHINCDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "selFldCUSTOMERCODE",
            "selFldLEGALID",
            "customercode",
            "custname",
            "customertype",
            "clientpin",
            "idtype",
            "legalid",
            "title",
            "phone1",
            "sms1",
            "email1",
            "birthincdate",
            "address",
            "accountofficer",
            "country"
        })
        public static class MEWSBANCASSURECUSTINFODetailType {

            @XmlElement(namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String selFldCUSTOMERCODE;
            @XmlElement(namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String selFldLEGALID;
            @XmlElement(name = "CUSTOMERCODE", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String customercode;
            @XmlElement(name = "CUSTNAME", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String custname;
            @XmlElement(name = "CUSTOMERTYPE", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String customertype;
            @XmlElement(name = "CLIENTPIN", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String clientpin;
            @XmlElement(name = "IDTYPE", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String idtype;
            @XmlElement(name = "LEGALID", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String legalid;
            @XmlElement(name = "TITLE", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String title;
            @XmlElement(name = "PHONE1", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String phone1;
            @XmlElement(name = "SMS1", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String sms1;
            @XmlElement(name = "EMAIL1", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String email1;
            @XmlElement(name = "BIRTHINCDATE", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String birthincdate;
            @XmlElement(name = "ADDRESS", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String address;
            @XmlElement(name = "ACCOUNTOFFICER", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String accountofficer;
            @XmlElement(name = "COUNTRY", namespace = "http://temenos.com/EWSBANCASSURECUSTINFO")
            protected String country;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the selFldCUSTOMERCODE property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldCUSTOMERCODE() {
                return selFldCUSTOMERCODE;
            }

            /**
             * Sets the value of the selFldCUSTOMERCODE property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldCUSTOMERCODE(String value) {
                this.selFldCUSTOMERCODE = value;
            }

            /**
             * Gets the value of the selFldLEGALID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldLEGALID() {
                return selFldLEGALID;
            }

            /**
             * Sets the value of the selFldLEGALID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldLEGALID(String value) {
                this.selFldLEGALID = value;
            }

            /**
             * Gets the value of the customercode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMERCODE() {
                return customercode;
            }

            /**
             * Sets the value of the customercode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMERCODE(String value) {
                this.customercode = value;
            }

            /**
             * Gets the value of the custname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTNAME() {
                return custname;
            }

            /**
             * Sets the value of the custname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTNAME(String value) {
                this.custname = value;
            }

            /**
             * Gets the value of the customertype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMERTYPE() {
                return customertype;
            }

            /**
             * Sets the value of the customertype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMERTYPE(String value) {
                this.customertype = value;
            }

            /**
             * Gets the value of the clientpin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCLIENTPIN() {
                return clientpin;
            }

            /**
             * Sets the value of the clientpin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCLIENTPIN(String value) {
                this.clientpin = value;
            }

            /**
             * Gets the value of the idtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDTYPE() {
                return idtype;
            }

            /**
             * Sets the value of the idtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDTYPE(String value) {
                this.idtype = value;
            }

            /**
             * Gets the value of the legalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALID() {
                return legalid;
            }

            /**
             * Sets the value of the legalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALID(String value) {
                this.legalid = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTITLE() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTITLE(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the phone1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPHONE1() {
                return phone1;
            }

            /**
             * Sets the value of the phone1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPHONE1(String value) {
                this.phone1 = value;
            }

            /**
             * Gets the value of the sms1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSMS1() {
                return sms1;
            }

            /**
             * Sets the value of the sms1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSMS1(String value) {
                this.sms1 = value;
            }

            /**
             * Gets the value of the email1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL1() {
                return email1;
            }

            /**
             * Sets the value of the email1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL1(String value) {
                this.email1 = value;
            }

            /**
             * Gets the value of the birthincdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBIRTHINCDATE() {
                return birthincdate;
            }

            /**
             * Sets the value of the birthincdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBIRTHINCDATE(String value) {
                this.birthincdate = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRESS() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRESS(String value) {
                this.address = value;
            }

            /**
             * Gets the value of the accountofficer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTOFFICER() {
                return accountofficer;
            }

            /**
             * Sets the value of the accountofficer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTOFFICER(String value) {
                this.accountofficer = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOUNTRY() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOUNTRY(String value) {
                this.country = value;
            }

            /**
             * Gets the value of the m property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Sets the value of the m property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
