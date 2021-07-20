
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
 * <p>Java class for EWSBANCASSUREACCOUNTINFOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EWSBANCASSUREACCOUNTINFOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gEWSBANCASSUREACCOUNTINFODetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mEWSBANCASSUREACCOUNTINFODetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="selFldCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "EWSBANCASSUREACCOUNTINFOType", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO", propOrder = {
    "gewsbancassureaccountinfoDetailType"
})
public class EWSBANCASSUREACCOUNTINFOType {

    @XmlElement(name = "gEWSBANCASSUREACCOUNTINFODetailType")
    protected GEWSBANCASSUREACCOUNTINFODetailType gewsbancassureaccountinfoDetailType;

    /**
     * Gets the value of the gewsbancassureaccountinfoDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link GEWSBANCASSUREACCOUNTINFODetailType }
     *     
     */
    public GEWSBANCASSUREACCOUNTINFODetailType getGEWSBANCASSUREACCOUNTINFODetailType() {
        return gewsbancassureaccountinfoDetailType;
    }

    /**
     * Sets the value of the gewsbancassureaccountinfoDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEWSBANCASSUREACCOUNTINFODetailType }
     *     
     */
    public void setGEWSBANCASSUREACCOUNTINFODetailType(GEWSBANCASSUREACCOUNTINFODetailType value) {
        this.gewsbancassureaccountinfoDetailType = value;
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
     *         &lt;element name="mEWSBANCASSUREACCOUNTINFODetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="selFldCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mewsbancassureaccountinfoDetailType"
    })
    public static class GEWSBANCASSUREACCOUNTINFODetailType {

        @XmlElement(name = "mEWSBANCASSUREACCOUNTINFODetailType", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
        protected List<MEWSBANCASSUREACCOUNTINFODetailType> mewsbancassureaccountinfoDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mewsbancassureaccountinfoDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mewsbancassureaccountinfoDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEWSBANCASSUREACCOUNTINFODetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEWSBANCASSUREACCOUNTINFODetailType }
         * 
         * 
         */
        public List<MEWSBANCASSUREACCOUNTINFODetailType> getMEWSBANCASSUREACCOUNTINFODetailType() {
            if (mewsbancassureaccountinfoDetailType == null) {
                mewsbancassureaccountinfoDetailType = new ArrayList<MEWSBANCASSUREACCOUNTINFODetailType>();
            }
            return this.mewsbancassureaccountinfoDetailType;
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
         *         &lt;element name="selFldCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCOUNTTITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "selFldCUSTOMER",
            "id",
            "customer",
            "accounttitle1",
            "category",
            "currency",
            "accountofficer"
        })
        public static class MEWSBANCASSUREACCOUNTINFODetailType {

            @XmlElement(namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String selFldCUSTOMER;
            @XmlElement(name = "ID", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String id;
            @XmlElement(name = "CUSTOMER", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String customer;
            @XmlElement(name = "ACCOUNTTITLE1", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String accounttitle1;
            @XmlElement(name = "CATEGORY", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String category;
            @XmlElement(name = "CURRENCY", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String currency;
            @XmlElement(name = "ACCOUNTOFFICER", namespace = "http://temenos.com/EWSBANCASSUREACCOUNTINFO")
            protected String accountofficer;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the selFldCUSTOMER property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelFldCUSTOMER() {
                return selFldCUSTOMER;
            }

            /**
             * Sets the value of the selFldCUSTOMER property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelFldCUSTOMER(String value) {
                this.selFldCUSTOMER = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
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
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the customer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMER() {
                return customer;
            }

            /**
             * Sets the value of the customer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMER(String value) {
                this.customer = value;
            }

            /**
             * Gets the value of the accounttitle1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getACCOUNTTITLE1() {
                return accounttitle1;
            }

            /**
             * Sets the value of the accounttitle1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setACCOUNTTITLE1(String value) {
                this.accounttitle1 = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCATEGORY() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCATEGORY(String value) {
                this.category = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCURRENCY() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCURRENCY(String value) {
                this.currency = value;
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
