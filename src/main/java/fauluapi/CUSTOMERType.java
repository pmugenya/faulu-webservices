
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
 * <p>Java class for CUSTOMERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUSTOMERType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MNEMONIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSHORTNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gNAME1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gNAME2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gSTREET" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gLLADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLLADDRESS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sgLLADDRESS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ADDRESS" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gTOWNCOUNTRY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPOSTCODE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gCOUNTRY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gRELATIONCODE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRELATIONCODE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REVERSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgRELDELIVOPT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="RELDELIVOPT" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RELDELIVOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ROLEMOREINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ROLENOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RELRESERV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELRESERV5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELRESERV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELRESERV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELRESERV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RELRESERV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="SECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNTOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gOTHEROFFICER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OTHEROFFICER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INDUSTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TARGET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTACTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTRODUCER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gTEXT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gLEGALID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mLEGALID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALDOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALISSAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALISSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALEXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gOFFPHONE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OFFPHONE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="REVIEWFREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRTHINCORPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLOBALCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERLIABILITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPOSTINGRESTRICT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DISPOOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPANYBOOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONFIDTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISPOEXEMPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISSUECHEQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLSCPARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FXCOMMGROUPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENCEREGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASSETCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCUSTOMERRATING" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CUSTOMERRATING" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gCRPROFILETYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCRPROFILETYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CRPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="NOUPDATECRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIVENNAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAMILYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MARITALSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOOFDEPENDENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPHONE1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPHONE1" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ADDRLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gEMPLOYMENTSTATUS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mEMPLOYMENTSTATUS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EMPLOYMENTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="JOBTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMPLOYERSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgEMPLOYERSADD" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EMPLOYERSADD" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="EMPLOYERSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EMPLOYERSBUSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMPLOYMENTSTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTOMERCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SALARYDATEFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="NETMONTHLYIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETMONTHLYOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gRESIDENCESTATUS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRESIDENCESTATUS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RESIDENCESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RESIDENCETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RESIDENCESINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RESIDENCEVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MORTGAGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gOTHERFINREL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mOTHERFINREL" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OTHERFINREL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OTHERFININST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gCOMMTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCOMMTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="COMMTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PREFCHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ALLOWBULKPROCESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gLEGALIDDOCNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LEGALIDDOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINTERESTS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INTERESTS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gFAX1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPREVIOUSNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPREVIOUSNAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PREVIOUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHANGEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHANGEREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="CUSTOMERSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED51" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATELASTVERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSPOKENLANGUAGE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPOKENLANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPASTIMES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PASTIMES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gFURTHERDETAILS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FURTHERDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DOMICILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gOTHERNATIONALITY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OTHERNATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CALCRISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANUALRISKCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gOVERRIDEREASON" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OVERRIDEREASON" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gTAXID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gVISTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mVISTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgVISCOMMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="VISCOMMENT" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="VISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="sgVISINTERNALREVIE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="VISINTERNALREVIEW" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="VISINTERNALREVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gFORMERVISTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mFORMERVISTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FORMERVISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgFORMERVISCOMMENT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FORMERVISCOMMENT" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FORMERVISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="gRISKASSETTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRISKASSETTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RISKASSETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RISKLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RISKTOLERANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RISKFROMDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="LASTKYCREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTONEXTKYCREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANUALNEXTKYCREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LASTSUITREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTONEXTSUITREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANUALNEXTSUITREVIEWDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCRELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gMANDATEAPPL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mMANDATEAPPL" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MANDATEAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MANDATEREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MANDATERECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="SECUREMESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMLCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMLRESULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LASTAMLRESULTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCCOMPLETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERNETBANKINGSERVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOBILEBANKINGSERVICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPORTTEMPLATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gHOLDINGSPIVOT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HOLDINGSPIVOT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MERGEDTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERGEDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gALTCUSID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ALTCUSID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gEXTERNSYSID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mEXTERNSYSID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EXTERNSYSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EXTERNCUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gSOCIALNTWIDS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SOCIALNTWIDS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PERSONENTITYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCRUSERPROFILETY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCRUSERPROFILETY" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CRUSERPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRCALCPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRUSERPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CRCALCRESETDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gREFDATAITEM" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mREFDATAITEM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="REFDATAITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="REFDATAVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="RESERVED24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gOVERRIDE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RECORDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINPUTTER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gDATETIME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDITDATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INITIALS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSUBURB.TOWN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SUBURBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gCITY.MUNICIPAL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CITYMUNICIPAL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPROVINCE.STATE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PROVINCESTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POSTALCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPO.BOX.NO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POBOXNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPO.SUBURB.TOWN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POSUBURBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPO.CITY.MUNICIP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POCITYMUNICIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPO.PROV.STATE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POPROVSTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POPOSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gEMPLOY.BUS.ADDR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EMPLOYBUSADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gEMPLOY.SUB.TOWN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EMPLOYSUBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gEMPL.CTY.MUNIC" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EMPLCTYMUNIC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gEMPL.PROV.STATE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EMPLPROVSTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EMPLPOSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELHOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELWORK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELMOBILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDEYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAILADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLOYNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXREGNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAXINVOICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAILINGLIST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BLOCKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAFFOFFICIAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOOFDEPEND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLOYEENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATEOFEMPLOY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAXNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gOTHER.ACCTS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mOTHER.ACCTS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OTHERACCTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BANKBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SORTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEACOPND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OPENINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CORRESPONDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATECURRADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FORMERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTYPES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROFESSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SALARYRANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLASSIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLOYSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTITYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAININCOME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSECOND.INCOME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SECONDINCOME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BUSSTARTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCRESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNALLOCATED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNALLOCATED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNALLOCATED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEMOOFASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARTOFASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTOFINCORP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FOUNDINGSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CERTTOCOMMENC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRUSTDEED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARTAGREEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSTITUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAMECHANGECER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gAUDITOR.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mAUDITOR.NAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AUDITORNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AUDITORTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gBUS.PRINCIPALS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BUSPRINCIPALS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gASS.ENTITIES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ASSENTITIES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPRODUCT.SERVICE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRODUCTSERVICE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPOSIT.CON.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POSITCONNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CURRADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSIGN.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSIGN.NAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SIGNNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIGNIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TYPEIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="MEMBERSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEMBERYEARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVINGSSINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAVINGSYEARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLOYPERIOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUMMYCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEGALIDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPARTNERS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPARTNERS" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PARTNERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="XDATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GENDERGR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PARTNERTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="BUSINESSTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTLANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELATEDCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gNON.IND.TEXT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NONINDTEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gSIGNATORY.CODE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSIGNATORY.CODE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SIGNATORYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIGNATORYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIGNTPPRTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIGNTPPRTEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SIGNTTELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="YRSATCURADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMEASRESADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUSINESSSTDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCONTACT.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCONTACT.NAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CONTACTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTWORKTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTHOMTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTMOBTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTEMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CONTACTFAXNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gALTER.ID.TYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mALTER.ID.TYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ALTERIDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ALTERIDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ACCOMTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPRV.PHY.ADD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRVPHYADD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PRVSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVPOSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVYRSOCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMPLYRSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPOCCUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPEMPNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSP.EMP.ADD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SPEMPADD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SPEMPSUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPEMPCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPEMPSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPEMPPOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAILSTMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAILLETTERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAILLABELS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINBAL55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINBAL60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINBAL65" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MINBAL70" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRDTCHK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRDTIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSDISCLOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATEOFSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPLACE.STUDY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mPLACE.STUDY" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PLACESTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DURCOURSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FIELDSTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="NOMINALFORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINS.MEM.NO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mINS.MEM.NO" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="INSMEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSSURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSPOSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSAMTLEGACY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gBUS.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBUS.NAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSPLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUCCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="C2HELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="C2EXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="AREACODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NONQUAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COPYRESADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPMEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIGNINSTRUC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DECEASEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOANSWOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOOFEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MULTIGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gGROUP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mGROUP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GROUPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GMEMBERSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="GRPAUTOGEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AAARRWOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAULUSECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MARITALSTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OCCUPATION1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NXOFKIDBCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEARESTLMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RETCLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RETDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTGDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTGFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTGTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTGVENUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGFEE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEGACYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gAFYA.BEN.NAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mAFYA.BEN.NAME" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AFYABENNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AFYADOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NATIONALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GOODHEALTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PREXISTCOND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BENGENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BENNHIFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BENMOBILENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PRGOODHEALTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRPREXISTCOND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRNHIFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COVEROPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAMILYSIZE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAFFPFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCCUSCREATED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRECUSOPEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCARD.ISSUED" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCARD.ISSUED" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CARDISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CARDPOLICYNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="FAULUSTAFF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPCATEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOBILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOBILEALERTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MBANKINGREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPDATEINTRCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEGACYCUSLMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERFILEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gNME.STAHLDR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mNME.STAHLDR" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NMESTAHLDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NATSTAKHLDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NOSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STAKHLDDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GENDSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STAKHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTPEPCLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R16SECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R16INDUSTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R16TARGET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R16INI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R16OTHERDAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELOFFICER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTCLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDCARDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDCARDNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFIEDDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPRSRESULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITIZENSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ETHNICGROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAMILYNAMECUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gPLACE.OF.BIRTH" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPLACE.OF.DEATH" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PLACEOFDEATH" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gPLACE.OF.LIVE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PLACEOFLIVE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DATEOFDEATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPCHAIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPSEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPTRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPCHAIRMOBILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPSECMOBILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GPTREMOBILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPGPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEGALDOCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPOUSENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SPOUSENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANDMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INPUTVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDOC.NUMBER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mDOC.NUMBER" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LEGALIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ISSUEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEDOCEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="REGISTERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SECNATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MOBNOTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERIALNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SMSALERTFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSSUBLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIVISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RISKRATING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CUSTOMERType", namespace = "http://temenos.com/CUSTOMER", propOrder = {
    "mnemonic",
    "gshortname",
    "gname1",
    "gname2",
    "gstreet",
    "glladdress",
    "gtowncountry",
    "gpostcode",
    "gcountry",
    "grelationcode",
    "sector",
    "accountofficer",
    "gotherofficer",
    "industry",
    "target",
    "nationality",
    "customerstatus",
    "residence",
    "contactdate",
    "introducer",
    "gtext",
    "glegalid",
    "goffphone",
    "reviewfrequency",
    "birthincorpdate",
    "globalcustomer",
    "customerliability",
    "language",
    "gpostingrestrict",
    "dispoofficer",
    "companybook",
    "confidtxt",
    "dispoexempt",
    "issuecheques",
    "clscparty",
    "fxcommgroupid",
    "residenceregion",
    "assetclass",
    "gcustomerrating",
    "gcrprofiletype",
    "noupdatecrm",
    "title",
    "givennames",
    "familyname",
    "gender",
    "dateofbirth",
    "maritalstatus",
    "noofdependents",
    "gphone1",
    "gemploymentstatus",
    "netmonthlyin",
    "netmonthlyout",
    "gresidencestatus",
    "gotherfinrel",
    "gcommtype",
    "allowbulkprocess",
    "glegaliddocname",
    "ginterests",
    "gfax1",
    "gpreviousname",
    "customersince",
    "customertype",
    "reserved51",
    "datelastverified",
    "gspokenlanguage",
    "gpastimes",
    "gfurtherdetails",
    "domicile",
    "gothernationality",
    "calcriskclass",
    "manualriskclass",
    "goverridereason",
    "gtaxid",
    "gvistype",
    "gformervistype",
    "griskassettype",
    "lastkycreviewdate",
    "autonextkycreviewdate",
    "manualnextkycreviewdate",
    "lastsuitreviewdate",
    "autonextsuitreviewdate",
    "manualnextsuitreviewdate",
    "kycrelationship",
    "gmandateappl",
    "securemessage",
    "amlcheck",
    "amlresult",
    "lastamlresultdate",
    "kyccomplete",
    "internetbankingservice",
    "mobilebankingservice",
    "reporttemplate",
    "gholdingspivot",
    "mergedto",
    "mergedstatus",
    "galtcusid",
    "gexternsysid",
    "gsocialntwids",
    "personentityid",
    "regcountry",
    "gcruserprofilety",
    "grefdataitem",
    "reserved24",
    "reserved23",
    "reserved22",
    "reserved21",
    "reserved20",
    "reserved19",
    "reserved18",
    "reserved17",
    "reserved16",
    "reserved15",
    "reserved14",
    "reserved13",
    "reserved12",
    "reserved11",
    "reserved10",
    "reserved09",
    "reserved08",
    "reserved07",
    "reserved06",
    "reserved05",
    "reserved04",
    "reserved03",
    "reserved02",
    "reserved01",
    "goverride",
    "recordstatus",
    "currno",
    "ginputter",
    "gdatetime",
    "authoriser",
    "cocode",
    "deptcode",
    "auditorcode",
    "auditdatetime",
    "segment",
    "initials",
    "gsuburbtown",
    "gcitymunicipal",
    "gprovincestate",
    "postalcode",
    "gpoboxno",
    "gposuburbtown",
    "gpocitymunicip",
    "gpoprovstate",
    "popostcode",
    "gemploybusaddr",
    "gemploysubtown",
    "gemplctymunic",
    "gemplprovstate",
    "emplpostcode",
    "telhome",
    "telwork",
    "telmobile",
    "resideyn",
    "emailaddress",
    "employname",
    "taxregno",
    "taxinvoice",
    "mailinglist",
    "blocked",
    "staffofficial",
    "noofdepend",
    "employeeno",
    "dateofemploy",
    "faxno",
    "gotheraccts",
    "openingdate",
    "custtype",
    "correspondname",
    "datecurraddr",
    "formername",
    "idtypes",
    "profession",
    "salaryrange",
    "classification",
    "custstatus",
    "employstatus",
    "entitytype",
    "mainincome",
    "gsecondincome",
    "busstartdate",
    "locreserved1",
    "unallocated2",
    "unallocated3",
    "unallocated4",
    "memoofass",
    "artofass",
    "certofincorp",
    "foundingstate",
    "certtocommenc",
    "trustdeed",
    "partagreement",
    "constitution",
    "namechangecer",
    "gauditorname",
    "gbusprincipals",
    "gassentities",
    "gproductservice",
    "gpositconname",
    "curraddress",
    "age",
    "expirydate",
    "gsignname",
    "membersince",
    "memberyears",
    "savingssince",
    "savingsyears",
    "employperiod",
    "dummycust",
    "legalidno",
    "gpartners",
    "businesstype",
    "custlanguage",
    "relatedcust",
    "gnonindtext",
    "gsignatorycode",
    "yrsatcuraddr",
    "sameasresadd",
    "businessstdt",
    "gcontactname",
    "galteridtype",
    "accomtype",
    "gprvphyadd",
    "prvsuburb",
    "prvcity",
    "prvstate",
    "prvpostcode",
    "prvyrsocp",
    "emplyrscode",
    "spname",
    "spoccup",
    "spempname",
    "gspempadd",
    "spempsub",
    "spempcity",
    "spempstate",
    "spemppost",
    "mailstmt",
    "mailletters",
    "maillabels",
    "minbal55",
    "minbal60",
    "minbal65",
    "minbal70",
    "crdtchk",
    "crdtind",
    "consdisclose",
    "dateofsig",
    "gplacestudy",
    "nominalform",
    "ginsmemno",
    "gbusname",
    "areacode",
    "nonqual",
    "student",
    "prvacctype",
    "offrtype",
    "copyresadd",
    "spmemno",
    "signinstruc",
    "deceaseddate",
    "loanswof",
    "noofemp",
    "multigroup",
    "ggroup",
    "grpautogen",
    "aaarrwof",
    "faulusector",
    "title1",
    "maritalsts",
    "sex",
    "occupation1",
    "name",
    "nxofkidbce",
    "telno",
    "nearestlmark",
    "pinno",
    "retclient",
    "retdate",
    "mtgday",
    "mtgfreq",
    "mtgtime",
    "mtgvenue",
    "regfee",
    "legacyid",
    "gafyabenname",
    "prgoodhealth",
    "prprexistcond",
    "prnhifno",
    "coveroption",
    "familysize",
    "staffpfno",
    "loccuscreated",
    "precusopen",
    "stoaccno",
    "gcardissued",
    "faulustaff",
    "groupcateg",
    "mobiletype",
    "mobilealerts",
    "mbankingreg",
    "countycode",
    "updateintrcsv",
    "legacycuslms",
    "interfileid",
    "gnmestahldr",
    "accttype",
    "custpepclas",
    "r16SECTOR",
    "r16INDUSTRY",
    "r16TARGET",
    "r16INI",
    "r16OTHERDAO",
    "relofficer",
    "custclass",
    "idcardtype",
    "idcardnumber",
    "verifieddate",
    "iprsresult",
    "citizenship",
    "clan",
    "ethnicgroup",
    "familynamecus",
    "gplaceofbirth",
    "gplaceofdeath",
    "gplaceoflive",
    "dateofdeath",
    "groupchair",
    "groupsec",
    "grouptre",
    "gpchairmobile",
    "gpsecmobile",
    "gptremobile",
    "grouplocation",
    "groupgps",
    "legaldoctype",
    "county",
    "spousename",
    "spousenumber",
    "landmark",
    "inputversion",
    "gdocnumber",
    "registertype",
    "secnationality",
    "giinno",
    "mobnotype",
    "serialno",
    "smsalertflag",
    "cuslocation",
    "cussubloc",
    "division",
    "district",
    "riskrating"
})
public class CUSTOMERType {

    @XmlElement(name = "MNEMONIC")
    protected String mnemonic;
    @XmlElement(name = "gSHORTNAME")
    protected GSHORTNAME gshortname;
    @XmlElement(name = "gNAME1")
    protected GNAME1 gname1;
    @XmlElement(name = "gNAME2")
    protected GNAME2 gname2;
    @XmlElement(name = "gSTREET")
    protected GSTREET gstreet;
    @XmlElement(name = "gLLADDRESS")
    protected GLLADDRESS glladdress;
    @XmlElement(name = "gTOWNCOUNTRY")
    protected GTOWNCOUNTRY gtowncountry;
    @XmlElement(name = "gPOSTCODE")
    protected GPOSTCODE gpostcode;
    @XmlElement(name = "gCOUNTRY")
    protected GCOUNTRY gcountry;
    @XmlElement(name = "gRELATIONCODE")
    protected GRELATIONCODE grelationcode;
    @XmlElement(name = "SECTOR")
    protected String sector;
    @XmlElement(name = "ACCOUNTOFFICER")
    protected String accountofficer;
    @XmlElement(name = "gOTHEROFFICER")
    protected GOTHEROFFICER gotherofficer;
    @XmlElement(name = "INDUSTRY")
    protected String industry;
    @XmlElement(name = "TARGET")
    protected String target;
    @XmlElement(name = "NATIONALITY")
    protected String nationality;
    @XmlElement(name = "CUSTOMERSTATUS")
    protected String customerstatus;
    @XmlElement(name = "RESIDENCE")
    protected String residence;
    @XmlElement(name = "CONTACTDATE")
    protected String contactdate;
    @XmlElement(name = "INTRODUCER")
    protected String introducer;
    @XmlElement(name = "gTEXT")
    protected GTEXT gtext;
    @XmlElement(name = "gLEGALID")
    protected GLEGALID glegalid;
    @XmlElement(name = "gOFFPHONE")
    protected GOFFPHONE goffphone;
    @XmlElement(name = "REVIEWFREQUENCY")
    protected String reviewfrequency;
    @XmlElement(name = "BIRTHINCORPDATE")
    protected String birthincorpdate;
    @XmlElement(name = "GLOBALCUSTOMER")
    protected String globalcustomer;
    @XmlElement(name = "CUSTOMERLIABILITY")
    protected String customerliability;
    @XmlElement(name = "LANGUAGE")
    protected String language;
    @XmlElement(name = "gPOSTINGRESTRICT")
    protected GPOSTINGRESTRICT gpostingrestrict;
    @XmlElement(name = "DISPOOFFICER")
    protected String dispoofficer;
    @XmlElement(name = "COMPANYBOOK")
    protected String companybook;
    @XmlElement(name = "CONFIDTXT")
    protected String confidtxt;
    @XmlElement(name = "DISPOEXEMPT")
    protected String dispoexempt;
    @XmlElement(name = "ISSUECHEQUES")
    protected String issuecheques;
    @XmlElement(name = "CLSCPARTY")
    protected String clscparty;
    @XmlElement(name = "FXCOMMGROUPID")
    protected String fxcommgroupid;
    @XmlElement(name = "RESIDENCEREGION")
    protected String residenceregion;
    @XmlElement(name = "ASSETCLASS")
    protected String assetclass;
    @XmlElement(name = "gCUSTOMERRATING")
    protected GCUSTOMERRATING gcustomerrating;
    @XmlElement(name = "gCRPROFILETYPE")
    protected GCRPROFILETYPE gcrprofiletype;
    @XmlElement(name = "NOUPDATECRM")
    protected String noupdatecrm;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "GIVENNAMES")
    protected String givennames;
    @XmlElement(name = "FAMILYNAME")
    protected String familyname;
    @XmlElement(name = "GENDER")
    protected String gender;
    @XmlElement(name = "DATEOFBIRTH")
    protected String dateofbirth;
    @XmlElement(name = "MARITALSTATUS")
    protected String maritalstatus;
    @XmlElement(name = "NOOFDEPENDENTS")
    protected String noofdependents;
    @XmlElement(name = "gPHONE1")
    protected GPHONE1 gphone1;
    @XmlElement(name = "gEMPLOYMENTSTATUS")
    protected GEMPLOYMENTSTATUS gemploymentstatus;
    @XmlElement(name = "NETMONTHLYIN")
    protected String netmonthlyin;
    @XmlElement(name = "NETMONTHLYOUT")
    protected String netmonthlyout;
    @XmlElement(name = "gRESIDENCESTATUS")
    protected GRESIDENCESTATUS gresidencestatus;
    @XmlElement(name = "gOTHERFINREL")
    protected GOTHERFINREL gotherfinrel;
    @XmlElement(name = "gCOMMTYPE")
    protected GCOMMTYPE gcommtype;
    @XmlElement(name = "ALLOWBULKPROCESS")
    protected String allowbulkprocess;
    @XmlElement(name = "gLEGALIDDOCNAME")
    protected GLEGALIDDOCNAME glegaliddocname;
    @XmlElement(name = "gINTERESTS")
    protected GINTERESTS ginterests;
    @XmlElement(name = "gFAX1")
    protected GFAX1 gfax1;
    @XmlElement(name = "gPREVIOUSNAME")
    protected GPREVIOUSNAME gpreviousname;
    @XmlElement(name = "CUSTOMERSINCE")
    protected String customersince;
    @XmlElement(name = "CUSTOMERTYPE")
    protected String customertype;
    @XmlElement(name = "RESERVED51")
    protected String reserved51;
    @XmlElement(name = "DATELASTVERIFIED")
    protected String datelastverified;
    @XmlElement(name = "gSPOKENLANGUAGE")
    protected GSPOKENLANGUAGE gspokenlanguage;
    @XmlElement(name = "gPASTIMES")
    protected GPASTIMES gpastimes;
    @XmlElement(name = "gFURTHERDETAILS")
    protected GFURTHERDETAILS gfurtherdetails;
    @XmlElement(name = "DOMICILE")
    protected String domicile;
    @XmlElement(name = "gOTHERNATIONALITY")
    protected GOTHERNATIONALITY gothernationality;
    @XmlElement(name = "CALCRISKCLASS")
    protected String calcriskclass;
    @XmlElement(name = "MANUALRISKCLASS")
    protected String manualriskclass;
    @XmlElement(name = "gOVERRIDEREASON")
    protected GOVERRIDEREASON goverridereason;
    @XmlElement(name = "gTAXID")
    protected GTAXID gtaxid;
    @XmlElement(name = "gVISTYPE")
    protected GVISTYPE gvistype;
    @XmlElement(name = "gFORMERVISTYPE")
    protected GFORMERVISTYPE gformervistype;
    @XmlElement(name = "gRISKASSETTYPE")
    protected GRISKASSETTYPE griskassettype;
    @XmlElement(name = "LASTKYCREVIEWDATE")
    protected String lastkycreviewdate;
    @XmlElement(name = "AUTONEXTKYCREVIEWDATE")
    protected String autonextkycreviewdate;
    @XmlElement(name = "MANUALNEXTKYCREVIEWDATE")
    protected String manualnextkycreviewdate;
    @XmlElement(name = "LASTSUITREVIEWDATE")
    protected String lastsuitreviewdate;
    @XmlElement(name = "AUTONEXTSUITREVIEWDATE")
    protected String autonextsuitreviewdate;
    @XmlElement(name = "MANUALNEXTSUITREVIEWDATE")
    protected String manualnextsuitreviewdate;
    @XmlElement(name = "KYCRELATIONSHIP")
    protected String kycrelationship;
    @XmlElement(name = "gMANDATEAPPL")
    protected GMANDATEAPPL gmandateappl;
    @XmlElement(name = "SECUREMESSAGE")
    protected String securemessage;
    @XmlElement(name = "AMLCHECK")
    protected String amlcheck;
    @XmlElement(name = "AMLRESULT")
    protected String amlresult;
    @XmlElement(name = "LASTAMLRESULTDATE")
    protected String lastamlresultdate;
    @XmlElement(name = "KYCCOMPLETE")
    protected String kyccomplete;
    @XmlElement(name = "INTERNETBANKINGSERVICE")
    protected String internetbankingservice;
    @XmlElement(name = "MOBILEBANKINGSERVICE")
    protected String mobilebankingservice;
    @XmlElement(name = "REPORTTEMPLATE")
    protected String reporttemplate;
    @XmlElement(name = "gHOLDINGSPIVOT")
    protected GHOLDINGSPIVOT gholdingspivot;
    @XmlElement(name = "MERGEDTO")
    protected String mergedto;
    @XmlElement(name = "MERGEDSTATUS")
    protected String mergedstatus;
    @XmlElement(name = "gALTCUSID")
    protected GALTCUSID galtcusid;
    @XmlElement(name = "gEXTERNSYSID")
    protected GEXTERNSYSID gexternsysid;
    @XmlElement(name = "gSOCIALNTWIDS")
    protected GSOCIALNTWIDS gsocialntwids;
    @XmlElement(name = "PERSONENTITYID")
    protected String personentityid;
    @XmlElement(name = "REGCOUNTRY")
    protected String regcountry;
    @XmlElement(name = "gCRUSERPROFILETY")
    protected GCRUSERPROFILETY gcruserprofilety;
    @XmlElement(name = "gREFDATAITEM")
    protected GREFDATAITEM grefdataitem;
    @XmlElement(name = "RESERVED24")
    protected String reserved24;
    @XmlElement(name = "RESERVED23")
    protected String reserved23;
    @XmlElement(name = "RESERVED22")
    protected String reserved22;
    @XmlElement(name = "RESERVED21")
    protected String reserved21;
    @XmlElement(name = "RESERVED20")
    protected String reserved20;
    @XmlElement(name = "RESERVED19")
    protected String reserved19;
    @XmlElement(name = "RESERVED18")
    protected String reserved18;
    @XmlElement(name = "RESERVED17")
    protected String reserved17;
    @XmlElement(name = "RESERVED16")
    protected String reserved16;
    @XmlElement(name = "RESERVED15")
    protected String reserved15;
    @XmlElement(name = "RESERVED14")
    protected String reserved14;
    @XmlElement(name = "RESERVED13")
    protected String reserved13;
    @XmlElement(name = "RESERVED12")
    protected String reserved12;
    @XmlElement(name = "RESERVED11")
    protected String reserved11;
    @XmlElement(name = "RESERVED10")
    protected String reserved10;
    @XmlElement(name = "RESERVED09")
    protected String reserved09;
    @XmlElement(name = "RESERVED08")
    protected String reserved08;
    @XmlElement(name = "RESERVED07")
    protected String reserved07;
    @XmlElement(name = "RESERVED06")
    protected String reserved06;
    @XmlElement(name = "RESERVED05")
    protected String reserved05;
    @XmlElement(name = "RESERVED04")
    protected String reserved04;
    @XmlElement(name = "RESERVED03")
    protected String reserved03;
    @XmlElement(name = "RESERVED02")
    protected String reserved02;
    @XmlElement(name = "RESERVED01")
    protected String reserved01;
    @XmlElement(name = "gOVERRIDE")
    protected GOVERRIDE goverride;
    @XmlElement(name = "RECORDSTATUS")
    protected String recordstatus;
    @XmlElement(name = "CURRNO")
    protected String currno;
    @XmlElement(name = "gINPUTTER")
    protected GINPUTTER ginputter;
    @XmlElement(name = "gDATETIME")
    protected GDATETIME gdatetime;
    @XmlElement(name = "AUTHORISER")
    protected String authoriser;
    @XmlElement(name = "COCODE")
    protected String cocode;
    @XmlElement(name = "DEPTCODE")
    protected String deptcode;
    @XmlElement(name = "AUDITORCODE")
    protected String auditorcode;
    @XmlElement(name = "AUDITDATETIME")
    protected String auditdatetime;
    @XmlElement(name = "SEGMENT")
    protected String segment;
    @XmlElement(name = "INITIALS")
    protected String initials;
    @XmlElement(name = "gSUBURB.TOWN")
    protected GSUBURBTOWN gsuburbtown;
    @XmlElement(name = "gCITY.MUNICIPAL")
    protected GCITYMUNICIPAL gcitymunicipal;
    @XmlElement(name = "gPROVINCE.STATE")
    protected GPROVINCESTATE gprovincestate;
    @XmlElement(name = "POSTALCODE")
    protected String postalcode;
    @XmlElement(name = "gPO.BOX.NO")
    protected GPOBOXNO gpoboxno;
    @XmlElement(name = "gPO.SUBURB.TOWN")
    protected GPOSUBURBTOWN gposuburbtown;
    @XmlElement(name = "gPO.CITY.MUNICIP")
    protected GPOCITYMUNICIP gpocitymunicip;
    @XmlElement(name = "gPO.PROV.STATE")
    protected GPOPROVSTATE gpoprovstate;
    @XmlElement(name = "POPOSTCODE")
    protected String popostcode;
    @XmlElement(name = "gEMPLOY.BUS.ADDR")
    protected GEMPLOYBUSADDR gemploybusaddr;
    @XmlElement(name = "gEMPLOY.SUB.TOWN")
    protected GEMPLOYSUBTOWN gemploysubtown;
    @XmlElement(name = "gEMPL.CTY.MUNIC")
    protected GEMPLCTYMUNIC gemplctymunic;
    @XmlElement(name = "gEMPL.PROV.STATE")
    protected GEMPLPROVSTATE gemplprovstate;
    @XmlElement(name = "EMPLPOSTCODE")
    protected String emplpostcode;
    @XmlElement(name = "TELHOME")
    protected String telhome;
    @XmlElement(name = "TELWORK")
    protected String telwork;
    @XmlElement(name = "TELMOBILE")
    protected String telmobile;
    @XmlElement(name = "RESIDEYN")
    protected String resideyn;
    @XmlElement(name = "EMAILADDRESS")
    protected String emailaddress;
    @XmlElement(name = "EMPLOYNAME")
    protected String employname;
    @XmlElement(name = "TAXREGNO")
    protected String taxregno;
    @XmlElement(name = "TAXINVOICE")
    protected String taxinvoice;
    @XmlElement(name = "MAILINGLIST")
    protected String mailinglist;
    @XmlElement(name = "BLOCKED")
    protected String blocked;
    @XmlElement(name = "STAFFOFFICIAL")
    protected String staffofficial;
    @XmlElement(name = "NOOFDEPEND")
    protected String noofdepend;
    @XmlElement(name = "EMPLOYEENO")
    protected String employeeno;
    @XmlElement(name = "DATEOFEMPLOY")
    protected String dateofemploy;
    @XmlElement(name = "FAXNO")
    protected String faxno;
    @XmlElement(name = "gOTHER.ACCTS")
    protected GOTHERACCTS gotheraccts;
    @XmlElement(name = "OPENINGDATE")
    protected String openingdate;
    @XmlElement(name = "CUSTTYPE")
    protected String custtype;
    @XmlElement(name = "CORRESPONDNAME")
    protected String correspondname;
    @XmlElement(name = "DATECURRADDR")
    protected String datecurraddr;
    @XmlElement(name = "FORMERNAME")
    protected String formername;
    @XmlElement(name = "IDTYPES")
    protected String idtypes;
    @XmlElement(name = "PROFESSION")
    protected String profession;
    @XmlElement(name = "SALARYRANGE")
    protected String salaryrange;
    @XmlElement(name = "CLASSIFICATION")
    protected String classification;
    @XmlElement(name = "CUSTSTATUS")
    protected String custstatus;
    @XmlElement(name = "EMPLOYSTATUS")
    protected String employstatus;
    @XmlElement(name = "ENTITYTYPE")
    protected String entitytype;
    @XmlElement(name = "MAININCOME")
    protected String mainincome;
    @XmlElement(name = "gSECOND.INCOME")
    protected GSECONDINCOME gsecondincome;
    @XmlElement(name = "BUSSTARTDATE")
    protected String busstartdate;
    @XmlElement(name = "LOCRESERVED1")
    protected String locreserved1;
    @XmlElement(name = "UNALLOCATED2")
    protected String unallocated2;
    @XmlElement(name = "UNALLOCATED3")
    protected String unallocated3;
    @XmlElement(name = "UNALLOCATED4")
    protected String unallocated4;
    @XmlElement(name = "MEMOOFASS")
    protected String memoofass;
    @XmlElement(name = "ARTOFASS")
    protected String artofass;
    @XmlElement(name = "CERTOFINCORP")
    protected String certofincorp;
    @XmlElement(name = "FOUNDINGSTATE")
    protected String foundingstate;
    @XmlElement(name = "CERTTOCOMMENC")
    protected String certtocommenc;
    @XmlElement(name = "TRUSTDEED")
    protected String trustdeed;
    @XmlElement(name = "PARTAGREEMENT")
    protected String partagreement;
    @XmlElement(name = "CONSTITUTION")
    protected String constitution;
    @XmlElement(name = "NAMECHANGECER")
    protected String namechangecer;
    @XmlElement(name = "gAUDITOR.NAME")
    protected GAUDITORNAME gauditorname;
    @XmlElement(name = "gBUS.PRINCIPALS")
    protected GBUSPRINCIPALS gbusprincipals;
    @XmlElement(name = "gASS.ENTITIES")
    protected GASSENTITIES gassentities;
    @XmlElement(name = "gPRODUCT.SERVICE")
    protected GPRODUCTSERVICE gproductservice;
    @XmlElement(name = "gPOSIT.CON.NAME")
    protected GPOSITCONNAME gpositconname;
    @XmlElement(name = "CURRADDRESS")
    protected String curraddress;
    @XmlElement(name = "AGE")
    protected String age;
    @XmlElement(name = "EXPIRYDATE")
    protected String expirydate;
    @XmlElement(name = "gSIGN.NAME")
    protected GSIGNNAME gsignname;
    @XmlElement(name = "MEMBERSINCE")
    protected String membersince;
    @XmlElement(name = "MEMBERYEARS")
    protected String memberyears;
    @XmlElement(name = "SAVINGSSINCE")
    protected String savingssince;
    @XmlElement(name = "SAVINGSYEARS")
    protected String savingsyears;
    @XmlElement(name = "EMPLOYPERIOD")
    protected String employperiod;
    @XmlElement(name = "DUMMYCUST")
    protected String dummycust;
    @XmlElement(name = "LEGALIDNO")
    protected String legalidno;
    @XmlElement(name = "gPARTNERS")
    protected GPARTNERS gpartners;
    @XmlElement(name = "BUSINESSTYPE")
    protected String businesstype;
    @XmlElement(name = "CUSTLANGUAGE")
    protected String custlanguage;
    @XmlElement(name = "RELATEDCUST")
    protected String relatedcust;
    @XmlElement(name = "gNON.IND.TEXT")
    protected GNONINDTEXT gnonindtext;
    @XmlElement(name = "gSIGNATORY.CODE")
    protected GSIGNATORYCODE gsignatorycode;
    @XmlElement(name = "YRSATCURADDR")
    protected String yrsatcuraddr;
    @XmlElement(name = "SAMEASRESADD")
    protected String sameasresadd;
    @XmlElement(name = "BUSINESSSTDT")
    protected String businessstdt;
    @XmlElement(name = "gCONTACT.NAME")
    protected GCONTACTNAME gcontactname;
    @XmlElement(name = "gALTER.ID.TYPE")
    protected GALTERIDTYPE galteridtype;
    @XmlElement(name = "ACCOMTYPE")
    protected String accomtype;
    @XmlElement(name = "gPRV.PHY.ADD")
    protected GPRVPHYADD gprvphyadd;
    @XmlElement(name = "PRVSUBURB")
    protected String prvsuburb;
    @XmlElement(name = "PRVCITY")
    protected String prvcity;
    @XmlElement(name = "PRVSTATE")
    protected String prvstate;
    @XmlElement(name = "PRVPOSTCODE")
    protected String prvpostcode;
    @XmlElement(name = "PRVYRSOCP")
    protected String prvyrsocp;
    @XmlElement(name = "EMPLYRSCODE")
    protected String emplyrscode;
    @XmlElement(name = "SPNAME")
    protected String spname;
    @XmlElement(name = "SPOCCUP")
    protected String spoccup;
    @XmlElement(name = "SPEMPNAME")
    protected String spempname;
    @XmlElement(name = "gSP.EMP.ADD")
    protected GSPEMPADD gspempadd;
    @XmlElement(name = "SPEMPSUB")
    protected String spempsub;
    @XmlElement(name = "SPEMPCITY")
    protected String spempcity;
    @XmlElement(name = "SPEMPSTATE")
    protected String spempstate;
    @XmlElement(name = "SPEMPPOST")
    protected String spemppost;
    @XmlElement(name = "MAILSTMT")
    protected String mailstmt;
    @XmlElement(name = "MAILLETTERS")
    protected String mailletters;
    @XmlElement(name = "MAILLABELS")
    protected String maillabels;
    @XmlElement(name = "MINBAL55")
    protected String minbal55;
    @XmlElement(name = "MINBAL60")
    protected String minbal60;
    @XmlElement(name = "MINBAL65")
    protected String minbal65;
    @XmlElement(name = "MINBAL70")
    protected String minbal70;
    @XmlElement(name = "CRDTCHK")
    protected String crdtchk;
    @XmlElement(name = "CRDTIND")
    protected String crdtind;
    @XmlElement(name = "CONSDISCLOSE")
    protected String consdisclose;
    @XmlElement(name = "DATEOFSIG")
    protected String dateofsig;
    @XmlElement(name = "gPLACE.STUDY")
    protected GPLACESTUDY gplacestudy;
    @XmlElement(name = "NOMINALFORM")
    protected String nominalform;
    @XmlElement(name = "gINS.MEM.NO")
    protected GINSMEMNO ginsmemno;
    @XmlElement(name = "gBUS.NAME")
    protected GBUSNAME gbusname;
    @XmlElement(name = "AREACODE")
    protected String areacode;
    @XmlElement(name = "NONQUAL")
    protected String nonqual;
    @XmlElement(name = "STUDENT")
    protected String student;
    @XmlElement(name = "PRVACCTYPE")
    protected String prvacctype;
    @XmlElement(name = "OFFRTYPE")
    protected String offrtype;
    @XmlElement(name = "COPYRESADD")
    protected String copyresadd;
    @XmlElement(name = "SPMEMNO")
    protected String spmemno;
    @XmlElement(name = "SIGNINSTRUC")
    protected String signinstruc;
    @XmlElement(name = "DECEASEDDATE")
    protected String deceaseddate;
    @XmlElement(name = "LOANSWOF")
    protected String loanswof;
    @XmlElement(name = "NOOFEMP")
    protected String noofemp;
    @XmlElement(name = "MULTIGROUP")
    protected String multigroup;
    @XmlElement(name = "gGROUP")
    protected GGROUP ggroup;
    @XmlElement(name = "GRPAUTOGEN")
    protected String grpautogen;
    @XmlElement(name = "AAARRWOF")
    protected String aaarrwof;
    @XmlElement(name = "FAULUSECTOR")
    protected String faulusector;
    @XmlElement(name = "TITLE1")
    protected String title1;
    @XmlElement(name = "MARITALSTS")
    protected String maritalsts;
    @XmlElement(name = "SEX")
    protected String sex;
    @XmlElement(name = "OCCUPATION1")
    protected String occupation1;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "NXOFKIDBCE")
    protected String nxofkidbce;
    @XmlElement(name = "TELNO")
    protected String telno;
    @XmlElement(name = "NEARESTLMARK")
    protected String nearestlmark;
    @XmlElement(name = "PINNO")
    protected String pinno;
    @XmlElement(name = "RETCLIENT")
    protected String retclient;
    @XmlElement(name = "RETDATE")
    protected String retdate;
    @XmlElement(name = "MTGDAY")
    protected String mtgday;
    @XmlElement(name = "MTGFREQ")
    protected String mtgfreq;
    @XmlElement(name = "MTGTIME")
    protected String mtgtime;
    @XmlElement(name = "MTGVENUE")
    protected String mtgvenue;
    @XmlElement(name = "REGFEE")
    protected String regfee;
    @XmlElement(name = "LEGACYID")
    protected String legacyid;
    @XmlElement(name = "gAFYA.BEN.NAME")
    protected GAFYABENNAME gafyabenname;
    @XmlElement(name = "PRGOODHEALTH")
    protected String prgoodhealth;
    @XmlElement(name = "PRPREXISTCOND")
    protected String prprexistcond;
    @XmlElement(name = "PRNHIFNO")
    protected String prnhifno;
    @XmlElement(name = "COVEROPTION")
    protected String coveroption;
    @XmlElement(name = "FAMILYSIZE")
    protected String familysize;
    @XmlElement(name = "STAFFPFNO")
    protected String staffpfno;
    @XmlElement(name = "LOCCUSCREATED")
    protected String loccuscreated;
    @XmlElement(name = "PRECUSOPEN")
    protected String precusopen;
    @XmlElement(name = "STOACCNO")
    protected String stoaccno;
    @XmlElement(name = "gCARD.ISSUED")
    protected GCARDISSUED gcardissued;
    @XmlElement(name = "FAULUSTAFF")
    protected String faulustaff;
    @XmlElement(name = "GROUPCATEG")
    protected String groupcateg;
    @XmlElement(name = "MOBILETYPE")
    protected String mobiletype;
    @XmlElement(name = "MOBILEALERTS")
    protected String mobilealerts;
    @XmlElement(name = "MBANKINGREG")
    protected String mbankingreg;
    @XmlElement(name = "COUNTYCODE")
    protected String countycode;
    @XmlElement(name = "UPDATEINTRCSV")
    protected String updateintrcsv;
    @XmlElement(name = "LEGACYCUSLMS")
    protected String legacycuslms;
    @XmlElement(name = "INTERFILEID")
    protected String interfileid;
    @XmlElement(name = "gNME.STAHLDR")
    protected GNMESTAHLDR gnmestahldr;
    @XmlElement(name = "ACCTTYPE")
    protected String accttype;
    @XmlElement(name = "CUSTPEPCLAS")
    protected String custpepclas;
    @XmlElement(name = "R16SECTOR")
    protected String r16SECTOR;
    @XmlElement(name = "R16INDUSTRY")
    protected String r16INDUSTRY;
    @XmlElement(name = "R16TARGET")
    protected String r16TARGET;
    @XmlElement(name = "R16INI")
    protected String r16INI;
    @XmlElement(name = "R16OTHERDAO")
    protected String r16OTHERDAO;
    @XmlElement(name = "RELOFFICER")
    protected String relofficer;
    @XmlElement(name = "CUSTCLASS")
    protected String custclass;
    @XmlElement(name = "IDCARDTYPE")
    protected String idcardtype;
    @XmlElement(name = "IDCARDNUMBER")
    protected String idcardnumber;
    @XmlElement(name = "VERIFIEDDATE")
    protected String verifieddate;
    @XmlElement(name = "IPRSRESULT")
    protected String iprsresult;
    @XmlElement(name = "CITIZENSHIP")
    protected String citizenship;
    @XmlElement(name = "CLAN")
    protected String clan;
    @XmlElement(name = "ETHNICGROUP")
    protected String ethnicgroup;
    @XmlElement(name = "FAMILYNAMECUS")
    protected String familynamecus;
    @XmlElement(name = "gPLACE.OF.BIRTH")
    protected GPLACEOFBIRTH gplaceofbirth;
    @XmlElement(name = "gPLACE.OF.DEATH")
    protected GPLACEOFDEATH gplaceofdeath;
    @XmlElement(name = "gPLACE.OF.LIVE")
    protected GPLACEOFLIVE gplaceoflive;
    @XmlElement(name = "DATEOFDEATH")
    protected String dateofdeath;
    @XmlElement(name = "GROUPCHAIR")
    protected String groupchair;
    @XmlElement(name = "GROUPSEC")
    protected String groupsec;
    @XmlElement(name = "GROUPTRE")
    protected String grouptre;
    @XmlElement(name = "GPCHAIRMOBILE")
    protected String gpchairmobile;
    @XmlElement(name = "GPSECMOBILE")
    protected String gpsecmobile;
    @XmlElement(name = "GPTREMOBILE")
    protected String gptremobile;
    @XmlElement(name = "GROUPLOCATION")
    protected String grouplocation;
    @XmlElement(name = "GROUPGPS")
    protected String groupgps;
    @XmlElement(name = "LEGALDOCTYPE")
    protected String legaldoctype;
    @XmlElement(name = "COUNTY")
    protected String county;
    @XmlElement(name = "SPOUSENAME")
    protected String spousename;
    @XmlElement(name = "SPOUSENUMBER")
    protected String spousenumber;
    @XmlElement(name = "LANDMARK")
    protected String landmark;
    @XmlElement(name = "INPUTVERSION")
    protected String inputversion;
    @XmlElement(name = "gDOC.NUMBER")
    protected GDOCNUMBER gdocnumber;
    @XmlElement(name = "REGISTERTYPE")
    protected String registertype;
    @XmlElement(name = "SECNATIONALITY")
    protected String secnationality;
    @XmlElement(name = "GIINNO")
    protected String giinno;
    @XmlElement(name = "MOBNOTYPE")
    protected String mobnotype;
    @XmlElement(name = "SERIALNO")
    protected String serialno;
    @XmlElement(name = "SMSALERTFLAG")
    protected String smsalertflag;
    @XmlElement(name = "CUSLOCATION")
    protected String cuslocation;
    @XmlElement(name = "CUSSUBLOC")
    protected String cussubloc;
    @XmlElement(name = "DIVISION")
    protected String division;
    @XmlElement(name = "DISTRICT")
    protected String district;
    @XmlElement(name = "RISKRATING")
    protected String riskrating;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNEMONIC() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNEMONIC(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the gshortname property.
     * 
     * @return
     *     possible object is
     *     {@link GSHORTNAME }
     *     
     */
    public GSHORTNAME getGSHORTNAME() {
        return gshortname;
    }

    /**
     * Sets the value of the gshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSHORTNAME }
     *     
     */
    public void setGSHORTNAME(GSHORTNAME value) {
        this.gshortname = value;
    }

    /**
     * Gets the value of the gname1 property.
     * 
     * @return
     *     possible object is
     *     {@link GNAME1 }
     *     
     */
    public GNAME1 getGNAME1() {
        return gname1;
    }

    /**
     * Sets the value of the gname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNAME1 }
     *     
     */
    public void setGNAME1(GNAME1 value) {
        this.gname1 = value;
    }

    /**
     * Gets the value of the gname2 property.
     * 
     * @return
     *     possible object is
     *     {@link GNAME2 }
     *     
     */
    public GNAME2 getGNAME2() {
        return gname2;
    }

    /**
     * Sets the value of the gname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNAME2 }
     *     
     */
    public void setGNAME2(GNAME2 value) {
        this.gname2 = value;
    }

    /**
     * Gets the value of the gstreet property.
     * 
     * @return
     *     possible object is
     *     {@link GSTREET }
     *     
     */
    public GSTREET getGSTREET() {
        return gstreet;
    }

    /**
     * Sets the value of the gstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSTREET }
     *     
     */
    public void setGSTREET(GSTREET value) {
        this.gstreet = value;
    }

    /**
     * Gets the value of the glladdress property.
     * 
     * @return
     *     possible object is
     *     {@link GLLADDRESS }
     *     
     */
    public GLLADDRESS getGLLADDRESS() {
        return glladdress;
    }

    /**
     * Sets the value of the glladdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLLADDRESS }
     *     
     */
    public void setGLLADDRESS(GLLADDRESS value) {
        this.glladdress = value;
    }

    /**
     * Gets the value of the gtowncountry property.
     * 
     * @return
     *     possible object is
     *     {@link GTOWNCOUNTRY }
     *     
     */
    public GTOWNCOUNTRY getGTOWNCOUNTRY() {
        return gtowncountry;
    }

    /**
     * Sets the value of the gtowncountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTOWNCOUNTRY }
     *     
     */
    public void setGTOWNCOUNTRY(GTOWNCOUNTRY value) {
        this.gtowncountry = value;
    }

    /**
     * Gets the value of the gpostcode property.
     * 
     * @return
     *     possible object is
     *     {@link GPOSTCODE }
     *     
     */
    public GPOSTCODE getGPOSTCODE() {
        return gpostcode;
    }

    /**
     * Sets the value of the gpostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOSTCODE }
     *     
     */
    public void setGPOSTCODE(GPOSTCODE value) {
        this.gpostcode = value;
    }

    /**
     * Gets the value of the gcountry property.
     * 
     * @return
     *     possible object is
     *     {@link GCOUNTRY }
     *     
     */
    public GCOUNTRY getGCOUNTRY() {
        return gcountry;
    }

    /**
     * Sets the value of the gcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCOUNTRY }
     *     
     */
    public void setGCOUNTRY(GCOUNTRY value) {
        this.gcountry = value;
    }

    /**
     * Gets the value of the grelationcode property.
     * 
     * @return
     *     possible object is
     *     {@link GRELATIONCODE }
     *     
     */
    public GRELATIONCODE getGRELATIONCODE() {
        return grelationcode;
    }

    /**
     * Sets the value of the grelationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRELATIONCODE }
     *     
     */
    public void setGRELATIONCODE(GRELATIONCODE value) {
        this.grelationcode = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECTOR() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECTOR(String value) {
        this.sector = value;
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
     * Gets the value of the gotherofficer property.
     * 
     * @return
     *     possible object is
     *     {@link GOTHEROFFICER }
     *     
     */
    public GOTHEROFFICER getGOTHEROFFICER() {
        return gotherofficer;
    }

    /**
     * Sets the value of the gotherofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOTHEROFFICER }
     *     
     */
    public void setGOTHEROFFICER(GOTHEROFFICER value) {
        this.gotherofficer = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDUSTRY() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDUSTRY(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGET() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGET(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATIONALITY(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the customerstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERSTATUS() {
        return customerstatus;
    }

    /**
     * Sets the value of the customerstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERSTATUS(String value) {
        this.customerstatus = value;
    }

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDENCE() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDENCE(String value) {
        this.residence = value;
    }

    /**
     * Gets the value of the contactdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACTDATE() {
        return contactdate;
    }

    /**
     * Sets the value of the contactdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACTDATE(String value) {
        this.contactdate = value;
    }

    /**
     * Gets the value of the introducer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRODUCER() {
        return introducer;
    }

    /**
     * Sets the value of the introducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRODUCER(String value) {
        this.introducer = value;
    }

    /**
     * Gets the value of the gtext property.
     * 
     * @return
     *     possible object is
     *     {@link GTEXT }
     *     
     */
    public GTEXT getGTEXT() {
        return gtext;
    }

    /**
     * Sets the value of the gtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTEXT }
     *     
     */
    public void setGTEXT(GTEXT value) {
        this.gtext = value;
    }

    /**
     * Gets the value of the glegalid property.
     * 
     * @return
     *     possible object is
     *     {@link GLEGALID }
     *     
     */
    public GLEGALID getGLEGALID() {
        return glegalid;
    }

    /**
     * Sets the value of the glegalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLEGALID }
     *     
     */
    public void setGLEGALID(GLEGALID value) {
        this.glegalid = value;
    }

    /**
     * Gets the value of the goffphone property.
     * 
     * @return
     *     possible object is
     *     {@link GOFFPHONE }
     *     
     */
    public GOFFPHONE getGOFFPHONE() {
        return goffphone;
    }

    /**
     * Sets the value of the goffphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOFFPHONE }
     *     
     */
    public void setGOFFPHONE(GOFFPHONE value) {
        this.goffphone = value;
    }

    /**
     * Gets the value of the reviewfrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVIEWFREQUENCY() {
        return reviewfrequency;
    }

    /**
     * Sets the value of the reviewfrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVIEWFREQUENCY(String value) {
        this.reviewfrequency = value;
    }

    /**
     * Gets the value of the birthincorpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHINCORPDATE() {
        return birthincorpdate;
    }

    /**
     * Sets the value of the birthincorpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHINCORPDATE(String value) {
        this.birthincorpdate = value;
    }

    /**
     * Gets the value of the globalcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLOBALCUSTOMER() {
        return globalcustomer;
    }

    /**
     * Sets the value of the globalcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLOBALCUSTOMER(String value) {
        this.globalcustomer = value;
    }

    /**
     * Gets the value of the customerliability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERLIABILITY() {
        return customerliability;
    }

    /**
     * Sets the value of the customerliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERLIABILITY(String value) {
        this.customerliability = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANGUAGE(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the gpostingrestrict property.
     * 
     * @return
     *     possible object is
     *     {@link GPOSTINGRESTRICT }
     *     
     */
    public GPOSTINGRESTRICT getGPOSTINGRESTRICT() {
        return gpostingrestrict;
    }

    /**
     * Sets the value of the gpostingrestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOSTINGRESTRICT }
     *     
     */
    public void setGPOSTINGRESTRICT(GPOSTINGRESTRICT value) {
        this.gpostingrestrict = value;
    }

    /**
     * Gets the value of the dispoofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPOOFFICER() {
        return dispoofficer;
    }

    /**
     * Sets the value of the dispoofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPOOFFICER(String value) {
        this.dispoofficer = value;
    }

    /**
     * Gets the value of the companybook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYBOOK() {
        return companybook;
    }

    /**
     * Sets the value of the companybook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYBOOK(String value) {
        this.companybook = value;
    }

    /**
     * Gets the value of the confidtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIDTXT() {
        return confidtxt;
    }

    /**
     * Sets the value of the confidtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIDTXT(String value) {
        this.confidtxt = value;
    }

    /**
     * Gets the value of the dispoexempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPOEXEMPT() {
        return dispoexempt;
    }

    /**
     * Sets the value of the dispoexempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPOEXEMPT(String value) {
        this.dispoexempt = value;
    }

    /**
     * Gets the value of the issuecheques property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUECHEQUES() {
        return issuecheques;
    }

    /**
     * Sets the value of the issuecheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUECHEQUES(String value) {
        this.issuecheques = value;
    }

    /**
     * Gets the value of the clscparty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLSCPARTY() {
        return clscparty;
    }

    /**
     * Sets the value of the clscparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLSCPARTY(String value) {
        this.clscparty = value;
    }

    /**
     * Gets the value of the fxcommgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXCOMMGROUPID() {
        return fxcommgroupid;
    }

    /**
     * Sets the value of the fxcommgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXCOMMGROUPID(String value) {
        this.fxcommgroupid = value;
    }

    /**
     * Gets the value of the residenceregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDENCEREGION() {
        return residenceregion;
    }

    /**
     * Sets the value of the residenceregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDENCEREGION(String value) {
        this.residenceregion = value;
    }

    /**
     * Gets the value of the assetclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSETCLASS() {
        return assetclass;
    }

    /**
     * Sets the value of the assetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSETCLASS(String value) {
        this.assetclass = value;
    }

    /**
     * Gets the value of the gcustomerrating property.
     * 
     * @return
     *     possible object is
     *     {@link GCUSTOMERRATING }
     *     
     */
    public GCUSTOMERRATING getGCUSTOMERRATING() {
        return gcustomerrating;
    }

    /**
     * Sets the value of the gcustomerrating property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCUSTOMERRATING }
     *     
     */
    public void setGCUSTOMERRATING(GCUSTOMERRATING value) {
        this.gcustomerrating = value;
    }

    /**
     * Gets the value of the gcrprofiletype property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPROFILETYPE }
     *     
     */
    public GCRPROFILETYPE getGCRPROFILETYPE() {
        return gcrprofiletype;
    }

    /**
     * Sets the value of the gcrprofiletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPROFILETYPE }
     *     
     */
    public void setGCRPROFILETYPE(GCRPROFILETYPE value) {
        this.gcrprofiletype = value;
    }

    /**
     * Gets the value of the noupdatecrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOUPDATECRM() {
        return noupdatecrm;
    }

    /**
     * Sets the value of the noupdatecrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOUPDATECRM(String value) {
        this.noupdatecrm = value;
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
     * Gets the value of the givennames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIVENNAMES() {
        return givennames;
    }

    /**
     * Sets the value of the givennames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIVENNAMES(String value) {
        this.givennames = value;
    }

    /**
     * Gets the value of the familyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMILYNAME() {
        return familyname;
    }

    /**
     * Sets the value of the familyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMILYNAME(String value) {
        this.familyname = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFBIRTH(String value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the maritalstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARITALSTATUS() {
        return maritalstatus;
    }

    /**
     * Sets the value of the maritalstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARITALSTATUS(String value) {
        this.maritalstatus = value;
    }

    /**
     * Gets the value of the noofdependents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOOFDEPENDENTS() {
        return noofdependents;
    }

    /**
     * Sets the value of the noofdependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOOFDEPENDENTS(String value) {
        this.noofdependents = value;
    }

    /**
     * Gets the value of the gphone1 property.
     * 
     * @return
     *     possible object is
     *     {@link GPHONE1 }
     *     
     */
    public GPHONE1 getGPHONE1() {
        return gphone1;
    }

    /**
     * Sets the value of the gphone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPHONE1 }
     *     
     */
    public void setGPHONE1(GPHONE1 value) {
        this.gphone1 = value;
    }

    /**
     * Gets the value of the gemploymentstatus property.
     * 
     * @return
     *     possible object is
     *     {@link GEMPLOYMENTSTATUS }
     *     
     */
    public GEMPLOYMENTSTATUS getGEMPLOYMENTSTATUS() {
        return gemploymentstatus;
    }

    /**
     * Sets the value of the gemploymentstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEMPLOYMENTSTATUS }
     *     
     */
    public void setGEMPLOYMENTSTATUS(GEMPLOYMENTSTATUS value) {
        this.gemploymentstatus = value;
    }

    /**
     * Gets the value of the netmonthlyin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETMONTHLYIN() {
        return netmonthlyin;
    }

    /**
     * Sets the value of the netmonthlyin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETMONTHLYIN(String value) {
        this.netmonthlyin = value;
    }

    /**
     * Gets the value of the netmonthlyout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETMONTHLYOUT() {
        return netmonthlyout;
    }

    /**
     * Sets the value of the netmonthlyout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETMONTHLYOUT(String value) {
        this.netmonthlyout = value;
    }

    /**
     * Gets the value of the gresidencestatus property.
     * 
     * @return
     *     possible object is
     *     {@link GRESIDENCESTATUS }
     *     
     */
    public GRESIDENCESTATUS getGRESIDENCESTATUS() {
        return gresidencestatus;
    }

    /**
     * Sets the value of the gresidencestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRESIDENCESTATUS }
     *     
     */
    public void setGRESIDENCESTATUS(GRESIDENCESTATUS value) {
        this.gresidencestatus = value;
    }

    /**
     * Gets the value of the gotherfinrel property.
     * 
     * @return
     *     possible object is
     *     {@link GOTHERFINREL }
     *     
     */
    public GOTHERFINREL getGOTHERFINREL() {
        return gotherfinrel;
    }

    /**
     * Sets the value of the gotherfinrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOTHERFINREL }
     *     
     */
    public void setGOTHERFINREL(GOTHERFINREL value) {
        this.gotherfinrel = value;
    }

    /**
     * Gets the value of the gcommtype property.
     * 
     * @return
     *     possible object is
     *     {@link GCOMMTYPE }
     *     
     */
    public GCOMMTYPE getGCOMMTYPE() {
        return gcommtype;
    }

    /**
     * Sets the value of the gcommtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCOMMTYPE }
     *     
     */
    public void setGCOMMTYPE(GCOMMTYPE value) {
        this.gcommtype = value;
    }

    /**
     * Gets the value of the allowbulkprocess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWBULKPROCESS() {
        return allowbulkprocess;
    }

    /**
     * Sets the value of the allowbulkprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWBULKPROCESS(String value) {
        this.allowbulkprocess = value;
    }

    /**
     * Gets the value of the glegaliddocname property.
     * 
     * @return
     *     possible object is
     *     {@link GLEGALIDDOCNAME }
     *     
     */
    public GLEGALIDDOCNAME getGLEGALIDDOCNAME() {
        return glegaliddocname;
    }

    /**
     * Sets the value of the glegaliddocname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLEGALIDDOCNAME }
     *     
     */
    public void setGLEGALIDDOCNAME(GLEGALIDDOCNAME value) {
        this.glegaliddocname = value;
    }

    /**
     * Gets the value of the ginterests property.
     * 
     * @return
     *     possible object is
     *     {@link GINTERESTS }
     *     
     */
    public GINTERESTS getGINTERESTS() {
        return ginterests;
    }

    /**
     * Sets the value of the ginterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINTERESTS }
     *     
     */
    public void setGINTERESTS(GINTERESTS value) {
        this.ginterests = value;
    }

    /**
     * Gets the value of the gfax1 property.
     * 
     * @return
     *     possible object is
     *     {@link GFAX1 }
     *     
     */
    public GFAX1 getGFAX1() {
        return gfax1;
    }

    /**
     * Sets the value of the gfax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFAX1 }
     *     
     */
    public void setGFAX1(GFAX1 value) {
        this.gfax1 = value;
    }

    /**
     * Gets the value of the gpreviousname property.
     * 
     * @return
     *     possible object is
     *     {@link GPREVIOUSNAME }
     *     
     */
    public GPREVIOUSNAME getGPREVIOUSNAME() {
        return gpreviousname;
    }

    /**
     * Sets the value of the gpreviousname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPREVIOUSNAME }
     *     
     */
    public void setGPREVIOUSNAME(GPREVIOUSNAME value) {
        this.gpreviousname = value;
    }

    /**
     * Gets the value of the customersince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERSINCE() {
        return customersince;
    }

    /**
     * Sets the value of the customersince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERSINCE(String value) {
        this.customersince = value;
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
     * Gets the value of the reserved51 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED51() {
        return reserved51;
    }

    /**
     * Sets the value of the reserved51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED51(String value) {
        this.reserved51 = value;
    }

    /**
     * Gets the value of the datelastverified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATELASTVERIFIED() {
        return datelastverified;
    }

    /**
     * Sets the value of the datelastverified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATELASTVERIFIED(String value) {
        this.datelastverified = value;
    }

    /**
     * Gets the value of the gspokenlanguage property.
     * 
     * @return
     *     possible object is
     *     {@link GSPOKENLANGUAGE }
     *     
     */
    public GSPOKENLANGUAGE getGSPOKENLANGUAGE() {
        return gspokenlanguage;
    }

    /**
     * Sets the value of the gspokenlanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSPOKENLANGUAGE }
     *     
     */
    public void setGSPOKENLANGUAGE(GSPOKENLANGUAGE value) {
        this.gspokenlanguage = value;
    }

    /**
     * Gets the value of the gpastimes property.
     * 
     * @return
     *     possible object is
     *     {@link GPASTIMES }
     *     
     */
    public GPASTIMES getGPASTIMES() {
        return gpastimes;
    }

    /**
     * Sets the value of the gpastimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPASTIMES }
     *     
     */
    public void setGPASTIMES(GPASTIMES value) {
        this.gpastimes = value;
    }

    /**
     * Gets the value of the gfurtherdetails property.
     * 
     * @return
     *     possible object is
     *     {@link GFURTHERDETAILS }
     *     
     */
    public GFURTHERDETAILS getGFURTHERDETAILS() {
        return gfurtherdetails;
    }

    /**
     * Sets the value of the gfurtherdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFURTHERDETAILS }
     *     
     */
    public void setGFURTHERDETAILS(GFURTHERDETAILS value) {
        this.gfurtherdetails = value;
    }

    /**
     * Gets the value of the domicile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMICILE() {
        return domicile;
    }

    /**
     * Sets the value of the domicile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMICILE(String value) {
        this.domicile = value;
    }

    /**
     * Gets the value of the gothernationality property.
     * 
     * @return
     *     possible object is
     *     {@link GOTHERNATIONALITY }
     *     
     */
    public GOTHERNATIONALITY getGOTHERNATIONALITY() {
        return gothernationality;
    }

    /**
     * Sets the value of the gothernationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOTHERNATIONALITY }
     *     
     */
    public void setGOTHERNATIONALITY(GOTHERNATIONALITY value) {
        this.gothernationality = value;
    }

    /**
     * Gets the value of the calcriskclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCRISKCLASS() {
        return calcriskclass;
    }

    /**
     * Sets the value of the calcriskclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCRISKCLASS(String value) {
        this.calcriskclass = value;
    }

    /**
     * Gets the value of the manualriskclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUALRISKCLASS() {
        return manualriskclass;
    }

    /**
     * Sets the value of the manualriskclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUALRISKCLASS(String value) {
        this.manualriskclass = value;
    }

    /**
     * Gets the value of the goverridereason property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERRIDEREASON }
     *     
     */
    public GOVERRIDEREASON getGOVERRIDEREASON() {
        return goverridereason;
    }

    /**
     * Sets the value of the goverridereason property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERRIDEREASON }
     *     
     */
    public void setGOVERRIDEREASON(GOVERRIDEREASON value) {
        this.goverridereason = value;
    }

    /**
     * Gets the value of the gtaxid property.
     * 
     * @return
     *     possible object is
     *     {@link GTAXID }
     *     
     */
    public GTAXID getGTAXID() {
        return gtaxid;
    }

    /**
     * Sets the value of the gtaxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTAXID }
     *     
     */
    public void setGTAXID(GTAXID value) {
        this.gtaxid = value;
    }

    /**
     * Gets the value of the gvistype property.
     * 
     * @return
     *     possible object is
     *     {@link GVISTYPE }
     *     
     */
    public GVISTYPE getGVISTYPE() {
        return gvistype;
    }

    /**
     * Sets the value of the gvistype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GVISTYPE }
     *     
     */
    public void setGVISTYPE(GVISTYPE value) {
        this.gvistype = value;
    }

    /**
     * Gets the value of the gformervistype property.
     * 
     * @return
     *     possible object is
     *     {@link GFORMERVISTYPE }
     *     
     */
    public GFORMERVISTYPE getGFORMERVISTYPE() {
        return gformervistype;
    }

    /**
     * Sets the value of the gformervistype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFORMERVISTYPE }
     *     
     */
    public void setGFORMERVISTYPE(GFORMERVISTYPE value) {
        this.gformervistype = value;
    }

    /**
     * Gets the value of the griskassettype property.
     * 
     * @return
     *     possible object is
     *     {@link GRISKASSETTYPE }
     *     
     */
    public GRISKASSETTYPE getGRISKASSETTYPE() {
        return griskassettype;
    }

    /**
     * Sets the value of the griskassettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRISKASSETTYPE }
     *     
     */
    public void setGRISKASSETTYPE(GRISKASSETTYPE value) {
        this.griskassettype = value;
    }

    /**
     * Gets the value of the lastkycreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTKYCREVIEWDATE() {
        return lastkycreviewdate;
    }

    /**
     * Sets the value of the lastkycreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTKYCREVIEWDATE(String value) {
        this.lastkycreviewdate = value;
    }

    /**
     * Gets the value of the autonextkycreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTONEXTKYCREVIEWDATE() {
        return autonextkycreviewdate;
    }

    /**
     * Sets the value of the autonextkycreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTONEXTKYCREVIEWDATE(String value) {
        this.autonextkycreviewdate = value;
    }

    /**
     * Gets the value of the manualnextkycreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUALNEXTKYCREVIEWDATE() {
        return manualnextkycreviewdate;
    }

    /**
     * Sets the value of the manualnextkycreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUALNEXTKYCREVIEWDATE(String value) {
        this.manualnextkycreviewdate = value;
    }

    /**
     * Gets the value of the lastsuitreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTSUITREVIEWDATE() {
        return lastsuitreviewdate;
    }

    /**
     * Sets the value of the lastsuitreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTSUITREVIEWDATE(String value) {
        this.lastsuitreviewdate = value;
    }

    /**
     * Gets the value of the autonextsuitreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTONEXTSUITREVIEWDATE() {
        return autonextsuitreviewdate;
    }

    /**
     * Sets the value of the autonextsuitreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTONEXTSUITREVIEWDATE(String value) {
        this.autonextsuitreviewdate = value;
    }

    /**
     * Gets the value of the manualnextsuitreviewdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUALNEXTSUITREVIEWDATE() {
        return manualnextsuitreviewdate;
    }

    /**
     * Sets the value of the manualnextsuitreviewdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUALNEXTSUITREVIEWDATE(String value) {
        this.manualnextsuitreviewdate = value;
    }

    /**
     * Gets the value of the kycrelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCRELATIONSHIP() {
        return kycrelationship;
    }

    /**
     * Sets the value of the kycrelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCRELATIONSHIP(String value) {
        this.kycrelationship = value;
    }

    /**
     * Gets the value of the gmandateappl property.
     * 
     * @return
     *     possible object is
     *     {@link GMANDATEAPPL }
     *     
     */
    public GMANDATEAPPL getGMANDATEAPPL() {
        return gmandateappl;
    }

    /**
     * Sets the value of the gmandateappl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMANDATEAPPL }
     *     
     */
    public void setGMANDATEAPPL(GMANDATEAPPL value) {
        this.gmandateappl = value;
    }

    /**
     * Gets the value of the securemessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECUREMESSAGE() {
        return securemessage;
    }

    /**
     * Sets the value of the securemessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECUREMESSAGE(String value) {
        this.securemessage = value;
    }

    /**
     * Gets the value of the amlcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMLCHECK() {
        return amlcheck;
    }

    /**
     * Sets the value of the amlcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMLCHECK(String value) {
        this.amlcheck = value;
    }

    /**
     * Gets the value of the amlresult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMLRESULT() {
        return amlresult;
    }

    /**
     * Sets the value of the amlresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMLRESULT(String value) {
        this.amlresult = value;
    }

    /**
     * Gets the value of the lastamlresultdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTAMLRESULTDATE() {
        return lastamlresultdate;
    }

    /**
     * Sets the value of the lastamlresultdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTAMLRESULTDATE(String value) {
        this.lastamlresultdate = value;
    }

    /**
     * Gets the value of the kyccomplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCCOMPLETE() {
        return kyccomplete;
    }

    /**
     * Sets the value of the kyccomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCCOMPLETE(String value) {
        this.kyccomplete = value;
    }

    /**
     * Gets the value of the internetbankingservice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERNETBANKINGSERVICE() {
        return internetbankingservice;
    }

    /**
     * Sets the value of the internetbankingservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERNETBANKINGSERVICE(String value) {
        this.internetbankingservice = value;
    }

    /**
     * Gets the value of the mobilebankingservice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBILEBANKINGSERVICE() {
        return mobilebankingservice;
    }

    /**
     * Sets the value of the mobilebankingservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBILEBANKINGSERVICE(String value) {
        this.mobilebankingservice = value;
    }

    /**
     * Gets the value of the reporttemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTTEMPLATE() {
        return reporttemplate;
    }

    /**
     * Sets the value of the reporttemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTTEMPLATE(String value) {
        this.reporttemplate = value;
    }

    /**
     * Gets the value of the gholdingspivot property.
     * 
     * @return
     *     possible object is
     *     {@link GHOLDINGSPIVOT }
     *     
     */
    public GHOLDINGSPIVOT getGHOLDINGSPIVOT() {
        return gholdingspivot;
    }

    /**
     * Sets the value of the gholdingspivot property.
     * 
     * @param value
     *     allowed object is
     *     {@link GHOLDINGSPIVOT }
     *     
     */
    public void setGHOLDINGSPIVOT(GHOLDINGSPIVOT value) {
        this.gholdingspivot = value;
    }

    /**
     * Gets the value of the mergedto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERGEDTO() {
        return mergedto;
    }

    /**
     * Sets the value of the mergedto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERGEDTO(String value) {
        this.mergedto = value;
    }

    /**
     * Gets the value of the mergedstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERGEDSTATUS() {
        return mergedstatus;
    }

    /**
     * Sets the value of the mergedstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERGEDSTATUS(String value) {
        this.mergedstatus = value;
    }

    /**
     * Gets the value of the galtcusid property.
     * 
     * @return
     *     possible object is
     *     {@link GALTCUSID }
     *     
     */
    public GALTCUSID getGALTCUSID() {
        return galtcusid;
    }

    /**
     * Sets the value of the galtcusid property.
     * 
     * @param value
     *     allowed object is
     *     {@link GALTCUSID }
     *     
     */
    public void setGALTCUSID(GALTCUSID value) {
        this.galtcusid = value;
    }

    /**
     * Gets the value of the gexternsysid property.
     * 
     * @return
     *     possible object is
     *     {@link GEXTERNSYSID }
     *     
     */
    public GEXTERNSYSID getGEXTERNSYSID() {
        return gexternsysid;
    }

    /**
     * Sets the value of the gexternsysid property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEXTERNSYSID }
     *     
     */
    public void setGEXTERNSYSID(GEXTERNSYSID value) {
        this.gexternsysid = value;
    }

    /**
     * Gets the value of the gsocialntwids property.
     * 
     * @return
     *     possible object is
     *     {@link GSOCIALNTWIDS }
     *     
     */
    public GSOCIALNTWIDS getGSOCIALNTWIDS() {
        return gsocialntwids;
    }

    /**
     * Sets the value of the gsocialntwids property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSOCIALNTWIDS }
     *     
     */
    public void setGSOCIALNTWIDS(GSOCIALNTWIDS value) {
        this.gsocialntwids = value;
    }

    /**
     * Gets the value of the personentityid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONENTITYID() {
        return personentityid;
    }

    /**
     * Sets the value of the personentityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONENTITYID(String value) {
        this.personentityid = value;
    }

    /**
     * Gets the value of the regcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGCOUNTRY() {
        return regcountry;
    }

    /**
     * Sets the value of the regcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGCOUNTRY(String value) {
        this.regcountry = value;
    }

    /**
     * Gets the value of the gcruserprofilety property.
     * 
     * @return
     *     possible object is
     *     {@link GCRUSERPROFILETY }
     *     
     */
    public GCRUSERPROFILETY getGCRUSERPROFILETY() {
        return gcruserprofilety;
    }

    /**
     * Sets the value of the gcruserprofilety property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRUSERPROFILETY }
     *     
     */
    public void setGCRUSERPROFILETY(GCRUSERPROFILETY value) {
        this.gcruserprofilety = value;
    }

    /**
     * Gets the value of the grefdataitem property.
     * 
     * @return
     *     possible object is
     *     {@link GREFDATAITEM }
     *     
     */
    public GREFDATAITEM getGREFDATAITEM() {
        return grefdataitem;
    }

    /**
     * Sets the value of the grefdataitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link GREFDATAITEM }
     *     
     */
    public void setGREFDATAITEM(GREFDATAITEM value) {
        this.grefdataitem = value;
    }

    /**
     * Gets the value of the reserved24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED24() {
        return reserved24;
    }

    /**
     * Sets the value of the reserved24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED24(String value) {
        this.reserved24 = value;
    }

    /**
     * Gets the value of the reserved23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED23() {
        return reserved23;
    }

    /**
     * Sets the value of the reserved23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED23(String value) {
        this.reserved23 = value;
    }

    /**
     * Gets the value of the reserved22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED22() {
        return reserved22;
    }

    /**
     * Sets the value of the reserved22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED22(String value) {
        this.reserved22 = value;
    }

    /**
     * Gets the value of the reserved21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED21() {
        return reserved21;
    }

    /**
     * Sets the value of the reserved21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED21(String value) {
        this.reserved21 = value;
    }

    /**
     * Gets the value of the reserved20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED20() {
        return reserved20;
    }

    /**
     * Sets the value of the reserved20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED20(String value) {
        this.reserved20 = value;
    }

    /**
     * Gets the value of the reserved19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED19() {
        return reserved19;
    }

    /**
     * Sets the value of the reserved19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED19(String value) {
        this.reserved19 = value;
    }

    /**
     * Gets the value of the reserved18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED18() {
        return reserved18;
    }

    /**
     * Sets the value of the reserved18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED18(String value) {
        this.reserved18 = value;
    }

    /**
     * Gets the value of the reserved17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED17() {
        return reserved17;
    }

    /**
     * Sets the value of the reserved17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED17(String value) {
        this.reserved17 = value;
    }

    /**
     * Gets the value of the reserved16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED16() {
        return reserved16;
    }

    /**
     * Sets the value of the reserved16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED16(String value) {
        this.reserved16 = value;
    }

    /**
     * Gets the value of the reserved15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED15() {
        return reserved15;
    }

    /**
     * Sets the value of the reserved15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED15(String value) {
        this.reserved15 = value;
    }

    /**
     * Gets the value of the reserved14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED14() {
        return reserved14;
    }

    /**
     * Sets the value of the reserved14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED14(String value) {
        this.reserved14 = value;
    }

    /**
     * Gets the value of the reserved13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED13() {
        return reserved13;
    }

    /**
     * Sets the value of the reserved13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED13(String value) {
        this.reserved13 = value;
    }

    /**
     * Gets the value of the reserved12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED12() {
        return reserved12;
    }

    /**
     * Sets the value of the reserved12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED12(String value) {
        this.reserved12 = value;
    }

    /**
     * Gets the value of the reserved11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED11() {
        return reserved11;
    }

    /**
     * Sets the value of the reserved11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED11(String value) {
        this.reserved11 = value;
    }

    /**
     * Gets the value of the reserved10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED10() {
        return reserved10;
    }

    /**
     * Sets the value of the reserved10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED10(String value) {
        this.reserved10 = value;
    }

    /**
     * Gets the value of the reserved09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED09() {
        return reserved09;
    }

    /**
     * Sets the value of the reserved09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED09(String value) {
        this.reserved09 = value;
    }

    /**
     * Gets the value of the reserved08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED08() {
        return reserved08;
    }

    /**
     * Sets the value of the reserved08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED08(String value) {
        this.reserved08 = value;
    }

    /**
     * Gets the value of the reserved07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED07() {
        return reserved07;
    }

    /**
     * Sets the value of the reserved07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED07(String value) {
        this.reserved07 = value;
    }

    /**
     * Gets the value of the reserved06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED06() {
        return reserved06;
    }

    /**
     * Sets the value of the reserved06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED06(String value) {
        this.reserved06 = value;
    }

    /**
     * Gets the value of the reserved05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED05() {
        return reserved05;
    }

    /**
     * Sets the value of the reserved05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED05(String value) {
        this.reserved05 = value;
    }

    /**
     * Gets the value of the reserved04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED04() {
        return reserved04;
    }

    /**
     * Sets the value of the reserved04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED04(String value) {
        this.reserved04 = value;
    }

    /**
     * Gets the value of the reserved03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED03() {
        return reserved03;
    }

    /**
     * Sets the value of the reserved03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED03(String value) {
        this.reserved03 = value;
    }

    /**
     * Gets the value of the reserved02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED02() {
        return reserved02;
    }

    /**
     * Sets the value of the reserved02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED02(String value) {
        this.reserved02 = value;
    }

    /**
     * Gets the value of the reserved01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED01() {
        return reserved01;
    }

    /**
     * Sets the value of the reserved01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED01(String value) {
        this.reserved01 = value;
    }

    /**
     * Gets the value of the goverride property.
     * 
     * @return
     *     possible object is
     *     {@link GOVERRIDE }
     *     
     */
    public GOVERRIDE getGOVERRIDE() {
        return goverride;
    }

    /**
     * Sets the value of the goverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOVERRIDE }
     *     
     */
    public void setGOVERRIDE(GOVERRIDE value) {
        this.goverride = value;
    }

    /**
     * Gets the value of the recordstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECORDSTATUS() {
        return recordstatus;
    }

    /**
     * Sets the value of the recordstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECORDSTATUS(String value) {
        this.recordstatus = value;
    }

    /**
     * Gets the value of the currno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRNO() {
        return currno;
    }

    /**
     * Sets the value of the currno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRNO(String value) {
        this.currno = value;
    }

    /**
     * Gets the value of the ginputter property.
     * 
     * @return
     *     possible object is
     *     {@link GINPUTTER }
     *     
     */
    public GINPUTTER getGINPUTTER() {
        return ginputter;
    }

    /**
     * Sets the value of the ginputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINPUTTER }
     *     
     */
    public void setGINPUTTER(GINPUTTER value) {
        this.ginputter = value;
    }

    /**
     * Gets the value of the gdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link GDATETIME }
     *     
     */
    public GDATETIME getGDATETIME() {
        return gdatetime;
    }

    /**
     * Sets the value of the gdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDATETIME }
     *     
     */
    public void setGDATETIME(GDATETIME value) {
        this.gdatetime = value;
    }

    /**
     * Gets the value of the authoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORISER() {
        return authoriser;
    }

    /**
     * Sets the value of the authoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORISER(String value) {
        this.authoriser = value;
    }

    /**
     * Gets the value of the cocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCODE() {
        return cocode;
    }

    /**
     * Sets the value of the cocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCODE(String value) {
        this.cocode = value;
    }

    /**
     * Gets the value of the deptcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
        return deptcode;
    }

    /**
     * Sets the value of the deptcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * Gets the value of the auditorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITORCODE() {
        return auditorcode;
    }

    /**
     * Sets the value of the auditorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITORCODE(String value) {
        this.auditorcode = value;
    }

    /**
     * Gets the value of the auditdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITDATETIME() {
        return auditdatetime;
    }

    /**
     * Sets the value of the auditdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITDATETIME(String value) {
        this.auditdatetime = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITIALS() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITIALS(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the gsuburbtown property.
     * 
     * @return
     *     possible object is
     *     {@link GSUBURBTOWN }
     *     
     */
    public GSUBURBTOWN getGSUBURBTOWN() {
        return gsuburbtown;
    }

    /**
     * Sets the value of the gsuburbtown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSUBURBTOWN }
     *     
     */
    public void setGSUBURBTOWN(GSUBURBTOWN value) {
        this.gsuburbtown = value;
    }

    /**
     * Gets the value of the gcitymunicipal property.
     * 
     * @return
     *     possible object is
     *     {@link GCITYMUNICIPAL }
     *     
     */
    public GCITYMUNICIPAL getGCITYMUNICIPAL() {
        return gcitymunicipal;
    }

    /**
     * Sets the value of the gcitymunicipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCITYMUNICIPAL }
     *     
     */
    public void setGCITYMUNICIPAL(GCITYMUNICIPAL value) {
        this.gcitymunicipal = value;
    }

    /**
     * Gets the value of the gprovincestate property.
     * 
     * @return
     *     possible object is
     *     {@link GPROVINCESTATE }
     *     
     */
    public GPROVINCESTATE getGPROVINCESTATE() {
        return gprovincestate;
    }

    /**
     * Sets the value of the gprovincestate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPROVINCESTATE }
     *     
     */
    public void setGPROVINCESTATE(GPROVINCESTATE value) {
        this.gprovincestate = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTALCODE() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTALCODE(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the gpoboxno property.
     * 
     * @return
     *     possible object is
     *     {@link GPOBOXNO }
     *     
     */
    public GPOBOXNO getGPOBOXNO() {
        return gpoboxno;
    }

    /**
     * Sets the value of the gpoboxno property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOBOXNO }
     *     
     */
    public void setGPOBOXNO(GPOBOXNO value) {
        this.gpoboxno = value;
    }

    /**
     * Gets the value of the gposuburbtown property.
     * 
     * @return
     *     possible object is
     *     {@link GPOSUBURBTOWN }
     *     
     */
    public GPOSUBURBTOWN getGPOSUBURBTOWN() {
        return gposuburbtown;
    }

    /**
     * Sets the value of the gposuburbtown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOSUBURBTOWN }
     *     
     */
    public void setGPOSUBURBTOWN(GPOSUBURBTOWN value) {
        this.gposuburbtown = value;
    }

    /**
     * Gets the value of the gpocitymunicip property.
     * 
     * @return
     *     possible object is
     *     {@link GPOCITYMUNICIP }
     *     
     */
    public GPOCITYMUNICIP getGPOCITYMUNICIP() {
        return gpocitymunicip;
    }

    /**
     * Sets the value of the gpocitymunicip property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOCITYMUNICIP }
     *     
     */
    public void setGPOCITYMUNICIP(GPOCITYMUNICIP value) {
        this.gpocitymunicip = value;
    }

    /**
     * Gets the value of the gpoprovstate property.
     * 
     * @return
     *     possible object is
     *     {@link GPOPROVSTATE }
     *     
     */
    public GPOPROVSTATE getGPOPROVSTATE() {
        return gpoprovstate;
    }

    /**
     * Sets the value of the gpoprovstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOPROVSTATE }
     *     
     */
    public void setGPOPROVSTATE(GPOPROVSTATE value) {
        this.gpoprovstate = value;
    }

    /**
     * Gets the value of the popostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOPOSTCODE() {
        return popostcode;
    }

    /**
     * Sets the value of the popostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOPOSTCODE(String value) {
        this.popostcode = value;
    }

    /**
     * Gets the value of the gemploybusaddr property.
     * 
     * @return
     *     possible object is
     *     {@link GEMPLOYBUSADDR }
     *     
     */
    public GEMPLOYBUSADDR getGEMPLOYBUSADDR() {
        return gemploybusaddr;
    }

    /**
     * Sets the value of the gemploybusaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEMPLOYBUSADDR }
     *     
     */
    public void setGEMPLOYBUSADDR(GEMPLOYBUSADDR value) {
        this.gemploybusaddr = value;
    }

    /**
     * Gets the value of the gemploysubtown property.
     * 
     * @return
     *     possible object is
     *     {@link GEMPLOYSUBTOWN }
     *     
     */
    public GEMPLOYSUBTOWN getGEMPLOYSUBTOWN() {
        return gemploysubtown;
    }

    /**
     * Sets the value of the gemploysubtown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEMPLOYSUBTOWN }
     *     
     */
    public void setGEMPLOYSUBTOWN(GEMPLOYSUBTOWN value) {
        this.gemploysubtown = value;
    }

    /**
     * Gets the value of the gemplctymunic property.
     * 
     * @return
     *     possible object is
     *     {@link GEMPLCTYMUNIC }
     *     
     */
    public GEMPLCTYMUNIC getGEMPLCTYMUNIC() {
        return gemplctymunic;
    }

    /**
     * Sets the value of the gemplctymunic property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEMPLCTYMUNIC }
     *     
     */
    public void setGEMPLCTYMUNIC(GEMPLCTYMUNIC value) {
        this.gemplctymunic = value;
    }

    /**
     * Gets the value of the gemplprovstate property.
     * 
     * @return
     *     possible object is
     *     {@link GEMPLPROVSTATE }
     *     
     */
    public GEMPLPROVSTATE getGEMPLPROVSTATE() {
        return gemplprovstate;
    }

    /**
     * Sets the value of the gemplprovstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEMPLPROVSTATE }
     *     
     */
    public void setGEMPLPROVSTATE(GEMPLPROVSTATE value) {
        this.gemplprovstate = value;
    }

    /**
     * Gets the value of the emplpostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLPOSTCODE() {
        return emplpostcode;
    }

    /**
     * Sets the value of the emplpostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLPOSTCODE(String value) {
        this.emplpostcode = value;
    }

    /**
     * Gets the value of the telhome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELHOME() {
        return telhome;
    }

    /**
     * Sets the value of the telhome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELHOME(String value) {
        this.telhome = value;
    }

    /**
     * Gets the value of the telwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELWORK() {
        return telwork;
    }

    /**
     * Sets the value of the telwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELWORK(String value) {
        this.telwork = value;
    }

    /**
     * Gets the value of the telmobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELMOBILE() {
        return telmobile;
    }

    /**
     * Sets the value of the telmobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELMOBILE(String value) {
        this.telmobile = value;
    }

    /**
     * Gets the value of the resideyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDEYN() {
        return resideyn;
    }

    /**
     * Sets the value of the resideyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDEYN(String value) {
        this.resideyn = value;
    }

    /**
     * Gets the value of the emailaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILADDRESS() {
        return emailaddress;
    }

    /**
     * Sets the value of the emailaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILADDRESS(String value) {
        this.emailaddress = value;
    }

    /**
     * Gets the value of the employname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYNAME() {
        return employname;
    }

    /**
     * Sets the value of the employname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYNAME(String value) {
        this.employname = value;
    }

    /**
     * Gets the value of the taxregno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXREGNO() {
        return taxregno;
    }

    /**
     * Sets the value of the taxregno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXREGNO(String value) {
        this.taxregno = value;
    }

    /**
     * Gets the value of the taxinvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAXINVOICE() {
        return taxinvoice;
    }

    /**
     * Sets the value of the taxinvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAXINVOICE(String value) {
        this.taxinvoice = value;
    }

    /**
     * Gets the value of the mailinglist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILINGLIST() {
        return mailinglist;
    }

    /**
     * Sets the value of the mailinglist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILINGLIST(String value) {
        this.mailinglist = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBLOCKED() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBLOCKED(String value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the staffofficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFFOFFICIAL() {
        return staffofficial;
    }

    /**
     * Sets the value of the staffofficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFFOFFICIAL(String value) {
        this.staffofficial = value;
    }

    /**
     * Gets the value of the noofdepend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOOFDEPEND() {
        return noofdepend;
    }

    /**
     * Sets the value of the noofdepend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOOFDEPEND(String value) {
        this.noofdepend = value;
    }

    /**
     * Gets the value of the employeeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYEENO() {
        return employeeno;
    }

    /**
     * Sets the value of the employeeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYEENO(String value) {
        this.employeeno = value;
    }

    /**
     * Gets the value of the dateofemploy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFEMPLOY() {
        return dateofemploy;
    }

    /**
     * Sets the value of the dateofemploy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFEMPLOY(String value) {
        this.dateofemploy = value;
    }

    /**
     * Gets the value of the faxno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNO() {
        return faxno;
    }

    /**
     * Sets the value of the faxno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNO(String value) {
        this.faxno = value;
    }

    /**
     * Gets the value of the gotheraccts property.
     * 
     * @return
     *     possible object is
     *     {@link GOTHERACCTS }
     *     
     */
    public GOTHERACCTS getGOTHERACCTS() {
        return gotheraccts;
    }

    /**
     * Sets the value of the gotheraccts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOTHERACCTS }
     *     
     */
    public void setGOTHERACCTS(GOTHERACCTS value) {
        this.gotheraccts = value;
    }

    /**
     * Gets the value of the openingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPENINGDATE() {
        return openingdate;
    }

    /**
     * Sets the value of the openingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPENINGDATE(String value) {
        this.openingdate = value;
    }

    /**
     * Gets the value of the custtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTTYPE() {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTTYPE(String value) {
        this.custtype = value;
    }

    /**
     * Gets the value of the correspondname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORRESPONDNAME() {
        return correspondname;
    }

    /**
     * Sets the value of the correspondname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORRESPONDNAME(String value) {
        this.correspondname = value;
    }

    /**
     * Gets the value of the datecurraddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATECURRADDR() {
        return datecurraddr;
    }

    /**
     * Sets the value of the datecurraddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATECURRADDR(String value) {
        this.datecurraddr = value;
    }

    /**
     * Gets the value of the formername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMERNAME() {
        return formername;
    }

    /**
     * Sets the value of the formername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMERNAME(String value) {
        this.formername = value;
    }

    /**
     * Gets the value of the idtypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPES() {
        return idtypes;
    }

    /**
     * Sets the value of the idtypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPES(String value) {
        this.idtypes = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFESSION() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFESSION(String value) {
        this.profession = value;
    }

    /**
     * Gets the value of the salaryrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSALARYRANGE() {
        return salaryrange;
    }

    /**
     * Sets the value of the salaryrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSALARYRANGE(String value) {
        this.salaryrange = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATION() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATION(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the custstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTSTATUS() {
        return custstatus;
    }

    /**
     * Sets the value of the custstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTSTATUS(String value) {
        this.custstatus = value;
    }

    /**
     * Gets the value of the employstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYSTATUS() {
        return employstatus;
    }

    /**
     * Sets the value of the employstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYSTATUS(String value) {
        this.employstatus = value;
    }

    /**
     * Gets the value of the entitytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITYTYPE() {
        return entitytype;
    }

    /**
     * Sets the value of the entitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITYTYPE(String value) {
        this.entitytype = value;
    }

    /**
     * Gets the value of the mainincome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAININCOME() {
        return mainincome;
    }

    /**
     * Sets the value of the mainincome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAININCOME(String value) {
        this.mainincome = value;
    }

    /**
     * Gets the value of the gsecondincome property.
     * 
     * @return
     *     possible object is
     *     {@link GSECONDINCOME }
     *     
     */
    public GSECONDINCOME getGSECONDINCOME() {
        return gsecondincome;
    }

    /**
     * Sets the value of the gsecondincome property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSECONDINCOME }
     *     
     */
    public void setGSECONDINCOME(GSECONDINCOME value) {
        this.gsecondincome = value;
    }

    /**
     * Gets the value of the busstartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSSTARTDATE() {
        return busstartdate;
    }

    /**
     * Sets the value of the busstartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSSTARTDATE(String value) {
        this.busstartdate = value;
    }

    /**
     * Gets the value of the locreserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCRESERVED1() {
        return locreserved1;
    }

    /**
     * Sets the value of the locreserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCRESERVED1(String value) {
        this.locreserved1 = value;
    }

    /**
     * Gets the value of the unallocated2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNALLOCATED2() {
        return unallocated2;
    }

    /**
     * Sets the value of the unallocated2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNALLOCATED2(String value) {
        this.unallocated2 = value;
    }

    /**
     * Gets the value of the unallocated3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNALLOCATED3() {
        return unallocated3;
    }

    /**
     * Sets the value of the unallocated3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNALLOCATED3(String value) {
        this.unallocated3 = value;
    }

    /**
     * Gets the value of the unallocated4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNALLOCATED4() {
        return unallocated4;
    }

    /**
     * Sets the value of the unallocated4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNALLOCATED4(String value) {
        this.unallocated4 = value;
    }

    /**
     * Gets the value of the memoofass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMOOFASS() {
        return memoofass;
    }

    /**
     * Sets the value of the memoofass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMOOFASS(String value) {
        this.memoofass = value;
    }

    /**
     * Gets the value of the artofass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTOFASS() {
        return artofass;
    }

    /**
     * Sets the value of the artofass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTOFASS(String value) {
        this.artofass = value;
    }

    /**
     * Gets the value of the certofincorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTOFINCORP() {
        return certofincorp;
    }

    /**
     * Sets the value of the certofincorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTOFINCORP(String value) {
        this.certofincorp = value;
    }

    /**
     * Gets the value of the foundingstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOUNDINGSTATE() {
        return foundingstate;
    }

    /**
     * Sets the value of the foundingstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOUNDINGSTATE(String value) {
        this.foundingstate = value;
    }

    /**
     * Gets the value of the certtocommenc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTTOCOMMENC() {
        return certtocommenc;
    }

    /**
     * Sets the value of the certtocommenc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTTOCOMMENC(String value) {
        this.certtocommenc = value;
    }

    /**
     * Gets the value of the trustdeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRUSTDEED() {
        return trustdeed;
    }

    /**
     * Sets the value of the trustdeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRUSTDEED(String value) {
        this.trustdeed = value;
    }

    /**
     * Gets the value of the partagreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTAGREEMENT() {
        return partagreement;
    }

    /**
     * Sets the value of the partagreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTAGREEMENT(String value) {
        this.partagreement = value;
    }

    /**
     * Gets the value of the constitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSTITUTION() {
        return constitution;
    }

    /**
     * Sets the value of the constitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSTITUTION(String value) {
        this.constitution = value;
    }

    /**
     * Gets the value of the namechangecer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMECHANGECER() {
        return namechangecer;
    }

    /**
     * Sets the value of the namechangecer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMECHANGECER(String value) {
        this.namechangecer = value;
    }

    /**
     * Gets the value of the gauditorname property.
     * 
     * @return
     *     possible object is
     *     {@link GAUDITORNAME }
     *     
     */
    public GAUDITORNAME getGAUDITORNAME() {
        return gauditorname;
    }

    /**
     * Sets the value of the gauditorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GAUDITORNAME }
     *     
     */
    public void setGAUDITORNAME(GAUDITORNAME value) {
        this.gauditorname = value;
    }

    /**
     * Gets the value of the gbusprincipals property.
     * 
     * @return
     *     possible object is
     *     {@link GBUSPRINCIPALS }
     *     
     */
    public GBUSPRINCIPALS getGBUSPRINCIPALS() {
        return gbusprincipals;
    }

    /**
     * Sets the value of the gbusprincipals property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBUSPRINCIPALS }
     *     
     */
    public void setGBUSPRINCIPALS(GBUSPRINCIPALS value) {
        this.gbusprincipals = value;
    }

    /**
     * Gets the value of the gassentities property.
     * 
     * @return
     *     possible object is
     *     {@link GASSENTITIES }
     *     
     */
    public GASSENTITIES getGASSENTITIES() {
        return gassentities;
    }

    /**
     * Sets the value of the gassentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GASSENTITIES }
     *     
     */
    public void setGASSENTITIES(GASSENTITIES value) {
        this.gassentities = value;
    }

    /**
     * Gets the value of the gproductservice property.
     * 
     * @return
     *     possible object is
     *     {@link GPRODUCTSERVICE }
     *     
     */
    public GPRODUCTSERVICE getGPRODUCTSERVICE() {
        return gproductservice;
    }

    /**
     * Sets the value of the gproductservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPRODUCTSERVICE }
     *     
     */
    public void setGPRODUCTSERVICE(GPRODUCTSERVICE value) {
        this.gproductservice = value;
    }

    /**
     * Gets the value of the gpositconname property.
     * 
     * @return
     *     possible object is
     *     {@link GPOSITCONNAME }
     *     
     */
    public GPOSITCONNAME getGPOSITCONNAME() {
        return gpositconname;
    }

    /**
     * Sets the value of the gpositconname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPOSITCONNAME }
     *     
     */
    public void setGPOSITCONNAME(GPOSITCONNAME value) {
        this.gpositconname = value;
    }

    /**
     * Gets the value of the curraddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRADDRESS() {
        return curraddress;
    }

    /**
     * Sets the value of the curraddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRADDRESS(String value) {
        this.curraddress = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGE() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGE(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYDATE(String value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the gsignname property.
     * 
     * @return
     *     possible object is
     *     {@link GSIGNNAME }
     *     
     */
    public GSIGNNAME getGSIGNNAME() {
        return gsignname;
    }

    /**
     * Sets the value of the gsignname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSIGNNAME }
     *     
     */
    public void setGSIGNNAME(GSIGNNAME value) {
        this.gsignname = value;
    }

    /**
     * Gets the value of the membersince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMBERSINCE() {
        return membersince;
    }

    /**
     * Sets the value of the membersince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMBERSINCE(String value) {
        this.membersince = value;
    }

    /**
     * Gets the value of the memberyears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMBERYEARS() {
        return memberyears;
    }

    /**
     * Sets the value of the memberyears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMBERYEARS(String value) {
        this.memberyears = value;
    }

    /**
     * Gets the value of the savingssince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVINGSSINCE() {
        return savingssince;
    }

    /**
     * Sets the value of the savingssince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVINGSSINCE(String value) {
        this.savingssince = value;
    }

    /**
     * Gets the value of the savingsyears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVINGSYEARS() {
        return savingsyears;
    }

    /**
     * Sets the value of the savingsyears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVINGSYEARS(String value) {
        this.savingsyears = value;
    }

    /**
     * Gets the value of the employperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLOYPERIOD() {
        return employperiod;
    }

    /**
     * Sets the value of the employperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLOYPERIOD(String value) {
        this.employperiod = value;
    }

    /**
     * Gets the value of the dummycust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUMMYCUST() {
        return dummycust;
    }

    /**
     * Sets the value of the dummycust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUMMYCUST(String value) {
        this.dummycust = value;
    }

    /**
     * Gets the value of the legalidno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGALIDNO() {
        return legalidno;
    }

    /**
     * Sets the value of the legalidno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGALIDNO(String value) {
        this.legalidno = value;
    }

    /**
     * Gets the value of the gpartners property.
     * 
     * @return
     *     possible object is
     *     {@link GPARTNERS }
     *     
     */
    public GPARTNERS getGPARTNERS() {
        return gpartners;
    }

    /**
     * Sets the value of the gpartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPARTNERS }
     *     
     */
    public void setGPARTNERS(GPARTNERS value) {
        this.gpartners = value;
    }

    /**
     * Gets the value of the businesstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSINESSTYPE() {
        return businesstype;
    }

    /**
     * Sets the value of the businesstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSINESSTYPE(String value) {
        this.businesstype = value;
    }

    /**
     * Gets the value of the custlanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTLANGUAGE() {
        return custlanguage;
    }

    /**
     * Sets the value of the custlanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTLANGUAGE(String value) {
        this.custlanguage = value;
    }

    /**
     * Gets the value of the relatedcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATEDCUST() {
        return relatedcust;
    }

    /**
     * Sets the value of the relatedcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELATEDCUST(String value) {
        this.relatedcust = value;
    }

    /**
     * Gets the value of the gnonindtext property.
     * 
     * @return
     *     possible object is
     *     {@link GNONINDTEXT }
     *     
     */
    public GNONINDTEXT getGNONINDTEXT() {
        return gnonindtext;
    }

    /**
     * Sets the value of the gnonindtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNONINDTEXT }
     *     
     */
    public void setGNONINDTEXT(GNONINDTEXT value) {
        this.gnonindtext = value;
    }

    /**
     * Gets the value of the gsignatorycode property.
     * 
     * @return
     *     possible object is
     *     {@link GSIGNATORYCODE }
     *     
     */
    public GSIGNATORYCODE getGSIGNATORYCODE() {
        return gsignatorycode;
    }

    /**
     * Sets the value of the gsignatorycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSIGNATORYCODE }
     *     
     */
    public void setGSIGNATORYCODE(GSIGNATORYCODE value) {
        this.gsignatorycode = value;
    }

    /**
     * Gets the value of the yrsatcuraddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYRSATCURADDR() {
        return yrsatcuraddr;
    }

    /**
     * Sets the value of the yrsatcuraddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYRSATCURADDR(String value) {
        this.yrsatcuraddr = value;
    }

    /**
     * Gets the value of the sameasresadd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMEASRESADD() {
        return sameasresadd;
    }

    /**
     * Sets the value of the sameasresadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMEASRESADD(String value) {
        this.sameasresadd = value;
    }

    /**
     * Gets the value of the businessstdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUSINESSSTDT() {
        return businessstdt;
    }

    /**
     * Sets the value of the businessstdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUSINESSSTDT(String value) {
        this.businessstdt = value;
    }

    /**
     * Gets the value of the gcontactname property.
     * 
     * @return
     *     possible object is
     *     {@link GCONTACTNAME }
     *     
     */
    public GCONTACTNAME getGCONTACTNAME() {
        return gcontactname;
    }

    /**
     * Sets the value of the gcontactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCONTACTNAME }
     *     
     */
    public void setGCONTACTNAME(GCONTACTNAME value) {
        this.gcontactname = value;
    }

    /**
     * Gets the value of the galteridtype property.
     * 
     * @return
     *     possible object is
     *     {@link GALTERIDTYPE }
     *     
     */
    public GALTERIDTYPE getGALTERIDTYPE() {
        return galteridtype;
    }

    /**
     * Sets the value of the galteridtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GALTERIDTYPE }
     *     
     */
    public void setGALTERIDTYPE(GALTERIDTYPE value) {
        this.galteridtype = value;
    }

    /**
     * Gets the value of the accomtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOMTYPE() {
        return accomtype;
    }

    /**
     * Sets the value of the accomtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOMTYPE(String value) {
        this.accomtype = value;
    }

    /**
     * Gets the value of the gprvphyadd property.
     * 
     * @return
     *     possible object is
     *     {@link GPRVPHYADD }
     *     
     */
    public GPRVPHYADD getGPRVPHYADD() {
        return gprvphyadd;
    }

    /**
     * Sets the value of the gprvphyadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPRVPHYADD }
     *     
     */
    public void setGPRVPHYADD(GPRVPHYADD value) {
        this.gprvphyadd = value;
    }

    /**
     * Gets the value of the prvsuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVSUBURB() {
        return prvsuburb;
    }

    /**
     * Sets the value of the prvsuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVSUBURB(String value) {
        this.prvsuburb = value;
    }

    /**
     * Gets the value of the prvcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVCITY() {
        return prvcity;
    }

    /**
     * Sets the value of the prvcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVCITY(String value) {
        this.prvcity = value;
    }

    /**
     * Gets the value of the prvstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVSTATE() {
        return prvstate;
    }

    /**
     * Sets the value of the prvstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVSTATE(String value) {
        this.prvstate = value;
    }

    /**
     * Gets the value of the prvpostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVPOSTCODE() {
        return prvpostcode;
    }

    /**
     * Sets the value of the prvpostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVPOSTCODE(String value) {
        this.prvpostcode = value;
    }

    /**
     * Gets the value of the prvyrsocp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVYRSOCP() {
        return prvyrsocp;
    }

    /**
     * Sets the value of the prvyrsocp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVYRSOCP(String value) {
        this.prvyrsocp = value;
    }

    /**
     * Gets the value of the emplyrscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPLYRSCODE() {
        return emplyrscode;
    }

    /**
     * Sets the value of the emplyrscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPLYRSCODE(String value) {
        this.emplyrscode = value;
    }

    /**
     * Gets the value of the spname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPNAME() {
        return spname;
    }

    /**
     * Sets the value of the spname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPNAME(String value) {
        this.spname = value;
    }

    /**
     * Gets the value of the spoccup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPOCCUP() {
        return spoccup;
    }

    /**
     * Sets the value of the spoccup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPOCCUP(String value) {
        this.spoccup = value;
    }

    /**
     * Gets the value of the spempname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEMPNAME() {
        return spempname;
    }

    /**
     * Sets the value of the spempname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEMPNAME(String value) {
        this.spempname = value;
    }

    /**
     * Gets the value of the gspempadd property.
     * 
     * @return
     *     possible object is
     *     {@link GSPEMPADD }
     *     
     */
    public GSPEMPADD getGSPEMPADD() {
        return gspempadd;
    }

    /**
     * Sets the value of the gspempadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSPEMPADD }
     *     
     */
    public void setGSPEMPADD(GSPEMPADD value) {
        this.gspempadd = value;
    }

    /**
     * Gets the value of the spempsub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEMPSUB() {
        return spempsub;
    }

    /**
     * Sets the value of the spempsub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEMPSUB(String value) {
        this.spempsub = value;
    }

    /**
     * Gets the value of the spempcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEMPCITY() {
        return spempcity;
    }

    /**
     * Sets the value of the spempcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEMPCITY(String value) {
        this.spempcity = value;
    }

    /**
     * Gets the value of the spempstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEMPSTATE() {
        return spempstate;
    }

    /**
     * Sets the value of the spempstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEMPSTATE(String value) {
        this.spempstate = value;
    }

    /**
     * Gets the value of the spemppost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPEMPPOST() {
        return spemppost;
    }

    /**
     * Sets the value of the spemppost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPEMPPOST(String value) {
        this.spemppost = value;
    }

    /**
     * Gets the value of the mailstmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILSTMT() {
        return mailstmt;
    }

    /**
     * Sets the value of the mailstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILSTMT(String value) {
        this.mailstmt = value;
    }

    /**
     * Gets the value of the mailletters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILLETTERS() {
        return mailletters;
    }

    /**
     * Sets the value of the mailletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILLETTERS(String value) {
        this.mailletters = value;
    }

    /**
     * Gets the value of the maillabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILLABELS() {
        return maillabels;
    }

    /**
     * Sets the value of the maillabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILLABELS(String value) {
        this.maillabels = value;
    }

    /**
     * Gets the value of the minbal55 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINBAL55() {
        return minbal55;
    }

    /**
     * Sets the value of the minbal55 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINBAL55(String value) {
        this.minbal55 = value;
    }

    /**
     * Gets the value of the minbal60 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINBAL60() {
        return minbal60;
    }

    /**
     * Sets the value of the minbal60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINBAL60(String value) {
        this.minbal60 = value;
    }

    /**
     * Gets the value of the minbal65 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINBAL65() {
        return minbal65;
    }

    /**
     * Sets the value of the minbal65 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINBAL65(String value) {
        this.minbal65 = value;
    }

    /**
     * Gets the value of the minbal70 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINBAL70() {
        return minbal70;
    }

    /**
     * Sets the value of the minbal70 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINBAL70(String value) {
        this.minbal70 = value;
    }

    /**
     * Gets the value of the crdtchk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDTCHK() {
        return crdtchk;
    }

    /**
     * Sets the value of the crdtchk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDTCHK(String value) {
        this.crdtchk = value;
    }

    /**
     * Gets the value of the crdtind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRDTIND() {
        return crdtind;
    }

    /**
     * Sets the value of the crdtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRDTIND(String value) {
        this.crdtind = value;
    }

    /**
     * Gets the value of the consdisclose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONSDISCLOSE() {
        return consdisclose;
    }

    /**
     * Sets the value of the consdisclose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONSDISCLOSE(String value) {
        this.consdisclose = value;
    }

    /**
     * Gets the value of the dateofsig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFSIG() {
        return dateofsig;
    }

    /**
     * Sets the value of the dateofsig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFSIG(String value) {
        this.dateofsig = value;
    }

    /**
     * Gets the value of the gplacestudy property.
     * 
     * @return
     *     possible object is
     *     {@link GPLACESTUDY }
     *     
     */
    public GPLACESTUDY getGPLACESTUDY() {
        return gplacestudy;
    }

    /**
     * Sets the value of the gplacestudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPLACESTUDY }
     *     
     */
    public void setGPLACESTUDY(GPLACESTUDY value) {
        this.gplacestudy = value;
    }

    /**
     * Gets the value of the nominalform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMINALFORM() {
        return nominalform;
    }

    /**
     * Sets the value of the nominalform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMINALFORM(String value) {
        this.nominalform = value;
    }

    /**
     * Gets the value of the ginsmemno property.
     * 
     * @return
     *     possible object is
     *     {@link GINSMEMNO }
     *     
     */
    public GINSMEMNO getGINSMEMNO() {
        return ginsmemno;
    }

    /**
     * Sets the value of the ginsmemno property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINSMEMNO }
     *     
     */
    public void setGINSMEMNO(GINSMEMNO value) {
        this.ginsmemno = value;
    }

    /**
     * Gets the value of the gbusname property.
     * 
     * @return
     *     possible object is
     *     {@link GBUSNAME }
     *     
     */
    public GBUSNAME getGBUSNAME() {
        return gbusname;
    }

    /**
     * Sets the value of the gbusname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBUSNAME }
     *     
     */
    public void setGBUSNAME(GBUSNAME value) {
        this.gbusname = value;
    }

    /**
     * Gets the value of the areacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREACODE() {
        return areacode;
    }

    /**
     * Sets the value of the areacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREACODE(String value) {
        this.areacode = value;
    }

    /**
     * Gets the value of the nonqual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNONQUAL() {
        return nonqual;
    }

    /**
     * Sets the value of the nonqual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNONQUAL(String value) {
        this.nonqual = value;
    }

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTUDENT() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTUDENT(String value) {
        this.student = value;
    }

    /**
     * Gets the value of the prvacctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRVACCTYPE() {
        return prvacctype;
    }

    /**
     * Sets the value of the prvacctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRVACCTYPE(String value) {
        this.prvacctype = value;
    }

    /**
     * Gets the value of the offrtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFRTYPE() {
        return offrtype;
    }

    /**
     * Sets the value of the offrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFRTYPE(String value) {
        this.offrtype = value;
    }

    /**
     * Gets the value of the copyresadd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOPYRESADD() {
        return copyresadd;
    }

    /**
     * Sets the value of the copyresadd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOPYRESADD(String value) {
        this.copyresadd = value;
    }

    /**
     * Gets the value of the spmemno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPMEMNO() {
        return spmemno;
    }

    /**
     * Sets the value of the spmemno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPMEMNO(String value) {
        this.spmemno = value;
    }

    /**
     * Gets the value of the signinstruc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNINSTRUC() {
        return signinstruc;
    }

    /**
     * Sets the value of the signinstruc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNINSTRUC(String value) {
        this.signinstruc = value;
    }

    /**
     * Gets the value of the deceaseddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECEASEDDATE() {
        return deceaseddate;
    }

    /**
     * Sets the value of the deceaseddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECEASEDDATE(String value) {
        this.deceaseddate = value;
    }

    /**
     * Gets the value of the loanswof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOANSWOF() {
        return loanswof;
    }

    /**
     * Sets the value of the loanswof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOANSWOF(String value) {
        this.loanswof = value;
    }

    /**
     * Gets the value of the noofemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOOFEMP() {
        return noofemp;
    }

    /**
     * Sets the value of the noofemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOOFEMP(String value) {
        this.noofemp = value;
    }

    /**
     * Gets the value of the multigroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTIGROUP() {
        return multigroup;
    }

    /**
     * Sets the value of the multigroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTIGROUP(String value) {
        this.multigroup = value;
    }

    /**
     * Gets the value of the ggroup property.
     * 
     * @return
     *     possible object is
     *     {@link GGROUP }
     *     
     */
    public GGROUP getGGROUP() {
        return ggroup;
    }

    /**
     * Sets the value of the ggroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGROUP }
     *     
     */
    public void setGGROUP(GGROUP value) {
        this.ggroup = value;
    }

    /**
     * Gets the value of the grpautogen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRPAUTOGEN() {
        return grpautogen;
    }

    /**
     * Sets the value of the grpautogen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRPAUTOGEN(String value) {
        this.grpautogen = value;
    }

    /**
     * Gets the value of the aaarrwof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAARRWOF() {
        return aaarrwof;
    }

    /**
     * Sets the value of the aaarrwof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAARRWOF(String value) {
        this.aaarrwof = value;
    }

    /**
     * Gets the value of the faulusector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAULUSECTOR() {
        return faulusector;
    }

    /**
     * Sets the value of the faulusector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAULUSECTOR(String value) {
        this.faulusector = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITLE1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITLE1(String value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the maritalsts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARITALSTS() {
        return maritalsts;
    }

    /**
     * Sets the value of the maritalsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARITALSTS(String value) {
        this.maritalsts = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEX() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEX(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the occupation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCCUPATION1() {
        return occupation1;
    }

    /**
     * Sets the value of the occupation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCCUPATION1(String value) {
        this.occupation1 = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nxofkidbce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNXOFKIDBCE() {
        return nxofkidbce;
    }

    /**
     * Sets the value of the nxofkidbce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNXOFKIDBCE(String value) {
        this.nxofkidbce = value;
    }

    /**
     * Gets the value of the telno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNO() {
        return telno;
    }

    /**
     * Sets the value of the telno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNO(String value) {
        this.telno = value;
    }

    /**
     * Gets the value of the nearestlmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEARESTLMARK() {
        return nearestlmark;
    }

    /**
     * Sets the value of the nearestlmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEARESTLMARK(String value) {
        this.nearestlmark = value;
    }

    /**
     * Gets the value of the pinno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINNO() {
        return pinno;
    }

    /**
     * Sets the value of the pinno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINNO(String value) {
        this.pinno = value;
    }

    /**
     * Gets the value of the retclient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETCLIENT() {
        return retclient;
    }

    /**
     * Sets the value of the retclient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETCLIENT(String value) {
        this.retclient = value;
    }

    /**
     * Gets the value of the retdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETDATE() {
        return retdate;
    }

    /**
     * Sets the value of the retdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETDATE(String value) {
        this.retdate = value;
    }

    /**
     * Gets the value of the mtgday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTGDAY() {
        return mtgday;
    }

    /**
     * Sets the value of the mtgday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTGDAY(String value) {
        this.mtgday = value;
    }

    /**
     * Gets the value of the mtgfreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTGFREQ() {
        return mtgfreq;
    }

    /**
     * Sets the value of the mtgfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTGFREQ(String value) {
        this.mtgfreq = value;
    }

    /**
     * Gets the value of the mtgtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTGTIME() {
        return mtgtime;
    }

    /**
     * Sets the value of the mtgtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTGTIME(String value) {
        this.mtgtime = value;
    }

    /**
     * Gets the value of the mtgvenue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTGVENUE() {
        return mtgvenue;
    }

    /**
     * Sets the value of the mtgvenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTGVENUE(String value) {
        this.mtgvenue = value;
    }

    /**
     * Gets the value of the regfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGFEE() {
        return regfee;
    }

    /**
     * Sets the value of the regfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGFEE(String value) {
        this.regfee = value;
    }

    /**
     * Gets the value of the legacyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGACYID() {
        return legacyid;
    }

    /**
     * Sets the value of the legacyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGACYID(String value) {
        this.legacyid = value;
    }

    /**
     * Gets the value of the gafyabenname property.
     * 
     * @return
     *     possible object is
     *     {@link GAFYABENNAME }
     *     
     */
    public GAFYABENNAME getGAFYABENNAME() {
        return gafyabenname;
    }

    /**
     * Sets the value of the gafyabenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GAFYABENNAME }
     *     
     */
    public void setGAFYABENNAME(GAFYABENNAME value) {
        this.gafyabenname = value;
    }

    /**
     * Gets the value of the prgoodhealth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRGOODHEALTH() {
        return prgoodhealth;
    }

    /**
     * Sets the value of the prgoodhealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRGOODHEALTH(String value) {
        this.prgoodhealth = value;
    }

    /**
     * Gets the value of the prprexistcond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRPREXISTCOND() {
        return prprexistcond;
    }

    /**
     * Sets the value of the prprexistcond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRPREXISTCOND(String value) {
        this.prprexistcond = value;
    }

    /**
     * Gets the value of the prnhifno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRNHIFNO() {
        return prnhifno;
    }

    /**
     * Sets the value of the prnhifno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRNHIFNO(String value) {
        this.prnhifno = value;
    }

    /**
     * Gets the value of the coveroption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVEROPTION() {
        return coveroption;
    }

    /**
     * Sets the value of the coveroption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVEROPTION(String value) {
        this.coveroption = value;
    }

    /**
     * Gets the value of the familysize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMILYSIZE() {
        return familysize;
    }

    /**
     * Sets the value of the familysize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMILYSIZE(String value) {
        this.familysize = value;
    }

    /**
     * Gets the value of the staffpfno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAFFPFNO() {
        return staffpfno;
    }

    /**
     * Sets the value of the staffpfno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAFFPFNO(String value) {
        this.staffpfno = value;
    }

    /**
     * Gets the value of the loccuscreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCCUSCREATED() {
        return loccuscreated;
    }

    /**
     * Sets the value of the loccuscreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCCUSCREATED(String value) {
        this.loccuscreated = value;
    }

    /**
     * Gets the value of the precusopen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRECUSOPEN() {
        return precusopen;
    }

    /**
     * Sets the value of the precusopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRECUSOPEN(String value) {
        this.precusopen = value;
    }

    /**
     * Gets the value of the stoaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOACCNO() {
        return stoaccno;
    }

    /**
     * Sets the value of the stoaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOACCNO(String value) {
        this.stoaccno = value;
    }

    /**
     * Gets the value of the gcardissued property.
     * 
     * @return
     *     possible object is
     *     {@link GCARDISSUED }
     *     
     */
    public GCARDISSUED getGCARDISSUED() {
        return gcardissued;
    }

    /**
     * Sets the value of the gcardissued property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCARDISSUED }
     *     
     */
    public void setGCARDISSUED(GCARDISSUED value) {
        this.gcardissued = value;
    }

    /**
     * Gets the value of the faulustaff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAULUSTAFF() {
        return faulustaff;
    }

    /**
     * Sets the value of the faulustaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAULUSTAFF(String value) {
        this.faulustaff = value;
    }

    /**
     * Gets the value of the groupcateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPCATEG() {
        return groupcateg;
    }

    /**
     * Sets the value of the groupcateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPCATEG(String value) {
        this.groupcateg = value;
    }

    /**
     * Gets the value of the mobiletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBILETYPE() {
        return mobiletype;
    }

    /**
     * Sets the value of the mobiletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBILETYPE(String value) {
        this.mobiletype = value;
    }

    /**
     * Gets the value of the mobilealerts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBILEALERTS() {
        return mobilealerts;
    }

    /**
     * Sets the value of the mobilealerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBILEALERTS(String value) {
        this.mobilealerts = value;
    }

    /**
     * Gets the value of the mbankingreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBANKINGREG() {
        return mbankingreg;
    }

    /**
     * Sets the value of the mbankingreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBANKINGREG(String value) {
        this.mbankingreg = value;
    }

    /**
     * Gets the value of the countycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTYCODE() {
        return countycode;
    }

    /**
     * Sets the value of the countycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTYCODE(String value) {
        this.countycode = value;
    }

    /**
     * Gets the value of the updateintrcsv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPDATEINTRCSV() {
        return updateintrcsv;
    }

    /**
     * Sets the value of the updateintrcsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPDATEINTRCSV(String value) {
        this.updateintrcsv = value;
    }

    /**
     * Gets the value of the legacycuslms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGACYCUSLMS() {
        return legacycuslms;
    }

    /**
     * Sets the value of the legacycuslms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGACYCUSLMS(String value) {
        this.legacycuslms = value;
    }

    /**
     * Gets the value of the interfileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERFILEID() {
        return interfileid;
    }

    /**
     * Sets the value of the interfileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERFILEID(String value) {
        this.interfileid = value;
    }

    /**
     * Gets the value of the gnmestahldr property.
     * 
     * @return
     *     possible object is
     *     {@link GNMESTAHLDR }
     *     
     */
    public GNMESTAHLDR getGNMESTAHLDR() {
        return gnmestahldr;
    }

    /**
     * Sets the value of the gnmestahldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNMESTAHLDR }
     *     
     */
    public void setGNMESTAHLDR(GNMESTAHLDR value) {
        this.gnmestahldr = value;
    }

    /**
     * Gets the value of the accttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTTYPE() {
        return accttype;
    }

    /**
     * Sets the value of the accttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTTYPE(String value) {
        this.accttype = value;
    }

    /**
     * Gets the value of the custpepclas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTPEPCLAS() {
        return custpepclas;
    }

    /**
     * Sets the value of the custpepclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTPEPCLAS(String value) {
        this.custpepclas = value;
    }

    /**
     * Gets the value of the r16SECTOR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR16SECTOR() {
        return r16SECTOR;
    }

    /**
     * Sets the value of the r16SECTOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR16SECTOR(String value) {
        this.r16SECTOR = value;
    }

    /**
     * Gets the value of the r16INDUSTRY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR16INDUSTRY() {
        return r16INDUSTRY;
    }

    /**
     * Sets the value of the r16INDUSTRY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR16INDUSTRY(String value) {
        this.r16INDUSTRY = value;
    }

    /**
     * Gets the value of the r16TARGET property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR16TARGET() {
        return r16TARGET;
    }

    /**
     * Sets the value of the r16TARGET property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR16TARGET(String value) {
        this.r16TARGET = value;
    }

    /**
     * Gets the value of the r16INI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR16INI() {
        return r16INI;
    }

    /**
     * Sets the value of the r16INI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR16INI(String value) {
        this.r16INI = value;
    }

    /**
     * Gets the value of the r16OTHERDAO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR16OTHERDAO() {
        return r16OTHERDAO;
    }

    /**
     * Sets the value of the r16OTHERDAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR16OTHERDAO(String value) {
        this.r16OTHERDAO = value;
    }

    /**
     * Gets the value of the relofficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELOFFICER() {
        return relofficer;
    }

    /**
     * Sets the value of the relofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELOFFICER(String value) {
        this.relofficer = value;
    }

    /**
     * Gets the value of the custclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTCLASS() {
        return custclass;
    }

    /**
     * Sets the value of the custclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTCLASS(String value) {
        this.custclass = value;
    }

    /**
     * Gets the value of the idcardtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCARDTYPE() {
        return idcardtype;
    }

    /**
     * Sets the value of the idcardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCARDTYPE(String value) {
        this.idcardtype = value;
    }

    /**
     * Gets the value of the idcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCARDNUMBER() {
        return idcardnumber;
    }

    /**
     * Sets the value of the idcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCARDNUMBER(String value) {
        this.idcardnumber = value;
    }

    /**
     * Gets the value of the verifieddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFIEDDATE() {
        return verifieddate;
    }

    /**
     * Sets the value of the verifieddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFIEDDATE(String value) {
        this.verifieddate = value;
    }

    /**
     * Gets the value of the iprsresult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPRSRESULT() {
        return iprsresult;
    }

    /**
     * Sets the value of the iprsresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPRSRESULT(String value) {
        this.iprsresult = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITIZENSHIP() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITIZENSHIP(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the clan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLAN() {
        return clan;
    }

    /**
     * Sets the value of the clan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLAN(String value) {
        this.clan = value;
    }

    /**
     * Gets the value of the ethnicgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETHNICGROUP() {
        return ethnicgroup;
    }

    /**
     * Sets the value of the ethnicgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETHNICGROUP(String value) {
        this.ethnicgroup = value;
    }

    /**
     * Gets the value of the familynamecus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAMILYNAMECUS() {
        return familynamecus;
    }

    /**
     * Sets the value of the familynamecus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAMILYNAMECUS(String value) {
        this.familynamecus = value;
    }

    /**
     * Gets the value of the gplaceofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link GPLACEOFBIRTH }
     *     
     */
    public GPLACEOFBIRTH getGPLACEOFBIRTH() {
        return gplaceofbirth;
    }

    /**
     * Sets the value of the gplaceofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPLACEOFBIRTH }
     *     
     */
    public void setGPLACEOFBIRTH(GPLACEOFBIRTH value) {
        this.gplaceofbirth = value;
    }

    /**
     * Gets the value of the gplaceofdeath property.
     * 
     * @return
     *     possible object is
     *     {@link GPLACEOFDEATH }
     *     
     */
    public GPLACEOFDEATH getGPLACEOFDEATH() {
        return gplaceofdeath;
    }

    /**
     * Sets the value of the gplaceofdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPLACEOFDEATH }
     *     
     */
    public void setGPLACEOFDEATH(GPLACEOFDEATH value) {
        this.gplaceofdeath = value;
    }

    /**
     * Gets the value of the gplaceoflive property.
     * 
     * @return
     *     possible object is
     *     {@link GPLACEOFLIVE }
     *     
     */
    public GPLACEOFLIVE getGPLACEOFLIVE() {
        return gplaceoflive;
    }

    /**
     * Sets the value of the gplaceoflive property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPLACEOFLIVE }
     *     
     */
    public void setGPLACEOFLIVE(GPLACEOFLIVE value) {
        this.gplaceoflive = value;
    }

    /**
     * Gets the value of the dateofdeath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOFDEATH() {
        return dateofdeath;
    }

    /**
     * Sets the value of the dateofdeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOFDEATH(String value) {
        this.dateofdeath = value;
    }

    /**
     * Gets the value of the groupchair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPCHAIR() {
        return groupchair;
    }

    /**
     * Sets the value of the groupchair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPCHAIR(String value) {
        this.groupchair = value;
    }

    /**
     * Gets the value of the groupsec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPSEC() {
        return groupsec;
    }

    /**
     * Sets the value of the groupsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPSEC(String value) {
        this.groupsec = value;
    }

    /**
     * Gets the value of the grouptre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPTRE() {
        return grouptre;
    }

    /**
     * Sets the value of the grouptre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPTRE(String value) {
        this.grouptre = value;
    }

    /**
     * Gets the value of the gpchairmobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPCHAIRMOBILE() {
        return gpchairmobile;
    }

    /**
     * Sets the value of the gpchairmobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPCHAIRMOBILE(String value) {
        this.gpchairmobile = value;
    }

    /**
     * Gets the value of the gpsecmobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSECMOBILE() {
        return gpsecmobile;
    }

    /**
     * Sets the value of the gpsecmobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSECMOBILE(String value) {
        this.gpsecmobile = value;
    }

    /**
     * Gets the value of the gptremobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPTREMOBILE() {
        return gptremobile;
    }

    /**
     * Sets the value of the gptremobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPTREMOBILE(String value) {
        this.gptremobile = value;
    }

    /**
     * Gets the value of the grouplocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPLOCATION() {
        return grouplocation;
    }

    /**
     * Sets the value of the grouplocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPLOCATION(String value) {
        this.grouplocation = value;
    }

    /**
     * Gets the value of the groupgps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPGPS() {
        return groupgps;
    }

    /**
     * Sets the value of the groupgps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPGPS(String value) {
        this.groupgps = value;
    }

    /**
     * Gets the value of the legaldoctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEGALDOCTYPE() {
        return legaldoctype;
    }

    /**
     * Sets the value of the legaldoctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEGALDOCTYPE(String value) {
        this.legaldoctype = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOUNTY() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOUNTY(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the spousename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPOUSENAME() {
        return spousename;
    }

    /**
     * Sets the value of the spousename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPOUSENAME(String value) {
        this.spousename = value;
    }

    /**
     * Gets the value of the spousenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPOUSENUMBER() {
        return spousenumber;
    }

    /**
     * Sets the value of the spousenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPOUSENUMBER(String value) {
        this.spousenumber = value;
    }

    /**
     * Gets the value of the landmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANDMARK() {
        return landmark;
    }

    /**
     * Sets the value of the landmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANDMARK(String value) {
        this.landmark = value;
    }

    /**
     * Gets the value of the inputversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTVERSION() {
        return inputversion;
    }

    /**
     * Sets the value of the inputversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTVERSION(String value) {
        this.inputversion = value;
    }

    /**
     * Gets the value of the gdocnumber property.
     * 
     * @return
     *     possible object is
     *     {@link GDOCNUMBER }
     *     
     */
    public GDOCNUMBER getGDOCNUMBER() {
        return gdocnumber;
    }

    /**
     * Sets the value of the gdocnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDOCNUMBER }
     *     
     */
    public void setGDOCNUMBER(GDOCNUMBER value) {
        this.gdocnumber = value;
    }

    /**
     * Gets the value of the registertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTERTYPE() {
        return registertype;
    }

    /**
     * Sets the value of the registertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTERTYPE(String value) {
        this.registertype = value;
    }

    /**
     * Gets the value of the secnationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECNATIONALITY() {
        return secnationality;
    }

    /**
     * Sets the value of the secnationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECNATIONALITY(String value) {
        this.secnationality = value;
    }

    /**
     * Gets the value of the giinno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIINNO() {
        return giinno;
    }

    /**
     * Sets the value of the giinno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIINNO(String value) {
        this.giinno = value;
    }

    /**
     * Gets the value of the mobnotype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBNOTYPE() {
        return mobnotype;
    }

    /**
     * Sets the value of the mobnotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBNOTYPE(String value) {
        this.mobnotype = value;
    }

    /**
     * Gets the value of the serialno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIALNO() {
        return serialno;
    }

    /**
     * Sets the value of the serialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIALNO(String value) {
        this.serialno = value;
    }

    /**
     * Gets the value of the smsalertflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSALERTFLAG() {
        return smsalertflag;
    }

    /**
     * Sets the value of the smsalertflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSALERTFLAG(String value) {
        this.smsalertflag = value;
    }

    /**
     * Gets the value of the cuslocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSLOCATION() {
        return cuslocation;
    }

    /**
     * Sets the value of the cuslocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSLOCATION(String value) {
        this.cuslocation = value;
    }

    /**
     * Gets the value of the cussubloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSSUBLOC() {
        return cussubloc;
    }

    /**
     * Sets the value of the cussubloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSSUBLOC(String value) {
        this.cussubloc = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIVISION() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIVISION(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRICT() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRICT(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the riskrating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRISKRATING() {
        return riskrating;
    }

    /**
     * Sets the value of the riskrating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRISKRATING(String value) {
        this.riskrating = value;
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
     *         &lt;element name="mAFYA.BEN.NAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AFYABENNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AFYADOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NATIONALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GOODHEALTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PREXISTCOND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BENGENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BENNHIFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BENMOBILENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mafyabenname"
    })
    public static class GAFYABENNAME {

        @XmlElement(name = "mAFYA.BEN.NAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MAFYABENNAME> mafyabenname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mafyabenname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mafyabenname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMAFYABENNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MAFYABENNAME }
         * 
         * 
         */
        public List<MAFYABENNAME> getMAFYABENNAME() {
            if (mafyabenname == null) {
                mafyabenname = new ArrayList<MAFYABENNAME>();
            }
            return this.mafyabenname;
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
         *         &lt;element name="AFYABENNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AFYADOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NATIONALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GOODHEALTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PREXISTCOND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BENGENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BENNHIFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BENMOBILENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Relation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "afyabenname",
            "afyadob",
            "nationalid",
            "goodhealth",
            "prexistcond",
            "bengender",
            "bennhifno",
            "benmobileno",
            "relation"
        })
        public static class MAFYABENNAME {

            @XmlElement(name = "AFYABENNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String afyabenname;
            @XmlElement(name = "AFYADOB", namespace = "http://temenos.com/CUSTOMER")
            protected String afyadob;
            @XmlElement(name = "NATIONALID", namespace = "http://temenos.com/CUSTOMER")
            protected String nationalid;
            @XmlElement(name = "GOODHEALTH", namespace = "http://temenos.com/CUSTOMER")
            protected String goodhealth;
            @XmlElement(name = "PREXISTCOND", namespace = "http://temenos.com/CUSTOMER")
            protected String prexistcond;
            @XmlElement(name = "BENGENDER", namespace = "http://temenos.com/CUSTOMER")
            protected String bengender;
            @XmlElement(name = "BENNHIFNO", namespace = "http://temenos.com/CUSTOMER")
            protected String bennhifno;
            @XmlElement(name = "BENMOBILENO", namespace = "http://temenos.com/CUSTOMER")
            protected String benmobileno;
            @XmlElement(name = "Relation", namespace = "http://temenos.com/CUSTOMER")
            protected String relation;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the afyabenname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAFYABENNAME() {
                return afyabenname;
            }

            /**
             * Sets the value of the afyabenname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAFYABENNAME(String value) {
                this.afyabenname = value;
            }

            /**
             * Gets the value of the afyadob property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAFYADOB() {
                return afyadob;
            }

            /**
             * Sets the value of the afyadob property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAFYADOB(String value) {
                this.afyadob = value;
            }

            /**
             * Gets the value of the nationalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATIONALID() {
                return nationalid;
            }

            /**
             * Sets the value of the nationalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATIONALID(String value) {
                this.nationalid = value;
            }

            /**
             * Gets the value of the goodhealth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGOODHEALTH() {
                return goodhealth;
            }

            /**
             * Sets the value of the goodhealth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGOODHEALTH(String value) {
                this.goodhealth = value;
            }

            /**
             * Gets the value of the prexistcond property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREXISTCOND() {
                return prexistcond;
            }

            /**
             * Sets the value of the prexistcond property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREXISTCOND(String value) {
                this.prexistcond = value;
            }

            /**
             * Gets the value of the bengender property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENGENDER() {
                return bengender;
            }

            /**
             * Sets the value of the bengender property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENGENDER(String value) {
                this.bengender = value;
            }

            /**
             * Gets the value of the bennhifno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENNHIFNO() {
                return bennhifno;
            }

            /**
             * Sets the value of the bennhifno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENNHIFNO(String value) {
                this.bennhifno = value;
            }

            /**
             * Gets the value of the benmobileno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBENMOBILENO() {
                return benmobileno;
            }

            /**
             * Sets the value of the benmobileno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBENMOBILENO(String value) {
                this.benmobileno = value;
            }

            /**
             * Gets the value of the relation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelation() {
                return relation;
            }

            /**
             * Sets the value of the relation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelation(String value) {
                this.relation = value;
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
     *         &lt;element name="ALTCUSID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "altcusid"
    })
    public static class GALTCUSID {

        @XmlElement(name = "ALTCUSID", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> altcusid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the altcusid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the altcusid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getALTCUSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getALTCUSID() {
            if (altcusid == null) {
                altcusid = new ArrayList<String>();
            }
            return this.altcusid;
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
     *         &lt;element name="mALTER.ID.TYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ALTERIDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ALTERIDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "malteridtype"
    })
    public static class GALTERIDTYPE {

        @XmlElement(name = "mALTER.ID.TYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MALTERIDTYPE> malteridtype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the malteridtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the malteridtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMALTERIDTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MALTERIDTYPE }
         * 
         * 
         */
        public List<MALTERIDTYPE> getMALTERIDTYPE() {
            if (malteridtype == null) {
                malteridtype = new ArrayList<MALTERIDTYPE>();
            }
            return this.malteridtype;
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
         *         &lt;element name="ALTERIDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ALTERIDNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "alteridtype",
            "alteridno"
        })
        public static class MALTERIDTYPE {

            @XmlElement(name = "ALTERIDTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String alteridtype;
            @XmlElement(name = "ALTERIDNO", namespace = "http://temenos.com/CUSTOMER")
            protected String alteridno;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the alteridtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getALTERIDTYPE() {
                return alteridtype;
            }

            /**
             * Sets the value of the alteridtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setALTERIDTYPE(String value) {
                this.alteridtype = value;
            }

            /**
             * Gets the value of the alteridno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getALTERIDNO() {
                return alteridno;
            }

            /**
             * Sets the value of the alteridno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setALTERIDNO(String value) {
                this.alteridno = value;
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
     *         &lt;element name="ASSENTITIES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "assentities"
    })
    public static class GASSENTITIES {

        @XmlElement(name = "ASSENTITIES", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> assentities;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the assentities property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assentities property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASSENTITIES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getASSENTITIES() {
            if (assentities == null) {
                assentities = new ArrayList<String>();
            }
            return this.assentities;
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
     *         &lt;element name="mAUDITOR.NAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AUDITORNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AUDITORTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mauditorname"
    })
    public static class GAUDITORNAME {

        @XmlElement(name = "mAUDITOR.NAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MAUDITORNAME> mauditorname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mauditorname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mauditorname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMAUDITORNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MAUDITORNAME }
         * 
         * 
         */
        public List<MAUDITORNAME> getMAUDITORNAME() {
            if (mauditorname == null) {
                mauditorname = new ArrayList<MAUDITORNAME>();
            }
            return this.mauditorname;
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
         *         &lt;element name="AUDITORNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AUDITORTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "auditorname",
            "auditortel"
        })
        public static class MAUDITORNAME {

            @XmlElement(name = "AUDITORNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String auditorname;
            @XmlElement(name = "AUDITORTEL", namespace = "http://temenos.com/CUSTOMER")
            protected String auditortel;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the auditorname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUDITORNAME() {
                return auditorname;
            }

            /**
             * Sets the value of the auditorname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUDITORNAME(String value) {
                this.auditorname = value;
            }

            /**
             * Gets the value of the auditortel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAUDITORTEL() {
                return auditortel;
            }

            /**
             * Sets the value of the auditortel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAUDITORTEL(String value) {
                this.auditortel = value;
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
     *         &lt;element name="mBUS.NAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSPLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUCCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="C2HELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="C2EXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbusname"
    })
    public static class GBUSNAME {

        @XmlElement(name = "mBUS.NAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MBUSNAME> mbusname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbusname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbusname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBUSNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MBUSNAME }
         * 
         * 
         */
        public List<MBUSNAME> getMBUSNAME() {
            if (mbusname == null) {
                mbusname = new ArrayList<MBUSNAME>();
            }
            return this.mbusname;
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
         *         &lt;element name="BUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSPLAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUCCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="C2HELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="C2EXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "busname",
            "busnature",
            "bustype",
            "busplan",
            "busrole",
            "busadd",
            "bussuburb",
            "buccity",
            "busstate",
            "c2HELD",
            "c2EXPDATE"
        })
        public static class MBUSNAME {

            @XmlElement(name = "BUSNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String busname;
            @XmlElement(name = "BUSNATURE", namespace = "http://temenos.com/CUSTOMER")
            protected String busnature;
            @XmlElement(name = "BUSTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String bustype;
            @XmlElement(name = "BUSPLAN", namespace = "http://temenos.com/CUSTOMER")
            protected String busplan;
            @XmlElement(name = "BUSROLE", namespace = "http://temenos.com/CUSTOMER")
            protected String busrole;
            @XmlElement(name = "BUSADD", namespace = "http://temenos.com/CUSTOMER")
            protected String busadd;
            @XmlElement(name = "BUSSUBURB", namespace = "http://temenos.com/CUSTOMER")
            protected String bussuburb;
            @XmlElement(name = "BUCCITY", namespace = "http://temenos.com/CUSTOMER")
            protected String buccity;
            @XmlElement(name = "BUSSTATE", namespace = "http://temenos.com/CUSTOMER")
            protected String busstate;
            @XmlElement(name = "C2HELD", namespace = "http://temenos.com/CUSTOMER")
            protected String c2HELD;
            @XmlElement(name = "C2EXPDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String c2EXPDATE;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the busname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSNAME() {
                return busname;
            }

            /**
             * Sets the value of the busname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSNAME(String value) {
                this.busname = value;
            }

            /**
             * Gets the value of the busnature property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSNATURE() {
                return busnature;
            }

            /**
             * Sets the value of the busnature property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSNATURE(String value) {
                this.busnature = value;
            }

            /**
             * Gets the value of the bustype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSTYPE() {
                return bustype;
            }

            /**
             * Sets the value of the bustype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSTYPE(String value) {
                this.bustype = value;
            }

            /**
             * Gets the value of the busplan property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSPLAN() {
                return busplan;
            }

            /**
             * Sets the value of the busplan property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSPLAN(String value) {
                this.busplan = value;
            }

            /**
             * Gets the value of the busrole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSROLE() {
                return busrole;
            }

            /**
             * Sets the value of the busrole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSROLE(String value) {
                this.busrole = value;
            }

            /**
             * Gets the value of the busadd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSADD() {
                return busadd;
            }

            /**
             * Sets the value of the busadd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSADD(String value) {
                this.busadd = value;
            }

            /**
             * Gets the value of the bussuburb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSSUBURB() {
                return bussuburb;
            }

            /**
             * Sets the value of the bussuburb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSSUBURB(String value) {
                this.bussuburb = value;
            }

            /**
             * Gets the value of the buccity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUCCITY() {
                return buccity;
            }

            /**
             * Sets the value of the buccity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUCCITY(String value) {
                this.buccity = value;
            }

            /**
             * Gets the value of the busstate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBUSSTATE() {
                return busstate;
            }

            /**
             * Sets the value of the busstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBUSSTATE(String value) {
                this.busstate = value;
            }

            /**
             * Gets the value of the c2HELD property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC2HELD() {
                return c2HELD;
            }

            /**
             * Sets the value of the c2HELD property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC2HELD(String value) {
                this.c2HELD = value;
            }

            /**
             * Gets the value of the c2EXPDATE property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getC2EXPDATE() {
                return c2EXPDATE;
            }

            /**
             * Sets the value of the c2EXPDATE property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setC2EXPDATE(String value) {
                this.c2EXPDATE = value;
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
     *         &lt;element name="BUSPRINCIPALS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "busprincipals"
    })
    public static class GBUSPRINCIPALS {

        @XmlElement(name = "BUSPRINCIPALS", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> busprincipals;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the busprincipals property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the busprincipals property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBUSPRINCIPALS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBUSPRINCIPALS() {
            if (busprincipals == null) {
                busprincipals = new ArrayList<String>();
            }
            return this.busprincipals;
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
     *         &lt;element name="mCARD.ISSUED" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CARDISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CARDPOLICYNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcardissued"
    })
    public static class GCARDISSUED {

        @XmlElement(name = "mCARD.ISSUED", namespace = "http://temenos.com/CUSTOMER")
        protected List<MCARDISSUED> mcardissued;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcardissued property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcardissued property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCARDISSUED().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCARDISSUED }
         * 
         * 
         */
        public List<MCARDISSUED> getMCARDISSUED() {
            if (mcardissued == null) {
                mcardissued = new ArrayList<MCARDISSUED>();
            }
            return this.mcardissued;
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
         *         &lt;element name="CARDISSUED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CARDPOLICYNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cardissued",
            "cardpolicyno"
        })
        public static class MCARDISSUED {

            @XmlElement(name = "CARDISSUED", namespace = "http://temenos.com/CUSTOMER")
            protected String cardissued;
            @XmlElement(name = "CARDPOLICYNO", namespace = "http://temenos.com/CUSTOMER")
            protected String cardpolicyno;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the cardissued property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARDISSUED() {
                return cardissued;
            }

            /**
             * Sets the value of the cardissued property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARDISSUED(String value) {
                this.cardissued = value;
            }

            /**
             * Gets the value of the cardpolicyno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCARDPOLICYNO() {
                return cardpolicyno;
            }

            /**
             * Sets the value of the cardpolicyno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCARDPOLICYNO(String value) {
                this.cardpolicyno = value;
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
     *         &lt;element name="CITYMUNICIPAL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "citymunicipal"
    })
    public static class GCITYMUNICIPAL {

        @XmlElement(name = "CITYMUNICIPAL", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> citymunicipal;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the citymunicipal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the citymunicipal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCITYMUNICIPAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCITYMUNICIPAL() {
            if (citymunicipal == null) {
                citymunicipal = new ArrayList<String>();
            }
            return this.citymunicipal;
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
     *         &lt;element name="mCOMMTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="COMMTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PREFCHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcommtype"
    })
    public static class GCOMMTYPE {

        @XmlElement(name = "mCOMMTYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MCOMMTYPE> mcommtype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcommtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcommtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCOMMTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCOMMTYPE }
         * 
         * 
         */
        public List<MCOMMTYPE> getMCOMMTYPE() {
            if (mcommtype == null) {
                mcommtype = new ArrayList<MCOMMTYPE>();
            }
            return this.mcommtype;
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
         *         &lt;element name="COMMTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PREFCHANNEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "commtype",
            "prefchannel"
        })
        public static class MCOMMTYPE {

            @XmlElement(name = "COMMTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String commtype;
            @XmlElement(name = "PREFCHANNEL", namespace = "http://temenos.com/CUSTOMER")
            protected String prefchannel;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the commtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMTYPE() {
                return commtype;
            }

            /**
             * Sets the value of the commtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMTYPE(String value) {
                this.commtype = value;
            }

            /**
             * Gets the value of the prefchannel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREFCHANNEL() {
                return prefchannel;
            }

            /**
             * Sets the value of the prefchannel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREFCHANNEL(String value) {
                this.prefchannel = value;
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
     *         &lt;element name="mCONTACT.NAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CONTACTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTWORKTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTHOMTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTMOBTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTEMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CONTACTFAXNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcontactname"
    })
    public static class GCONTACTNAME {

        @XmlElement(name = "mCONTACT.NAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MCONTACTNAME> mcontactname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcontactname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcontactname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCONTACTNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCONTACTNAME }
         * 
         * 
         */
        public List<MCONTACTNAME> getMCONTACTNAME() {
            if (mcontactname == null) {
                mcontactname = new ArrayList<MCONTACTNAME>();
            }
            return this.mcontactname;
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
         *         &lt;element name="CONTACTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTPOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTWORKTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTHOMTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTMOBTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTEMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CONTACTFAXNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "contactname",
            "contactpos",
            "contactworktel",
            "contacthomtel",
            "contactmobtel",
            "contactemail",
            "contactfaxno"
        })
        public static class MCONTACTNAME {

            @XmlElement(name = "CONTACTNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String contactname;
            @XmlElement(name = "CONTACTPOS", namespace = "http://temenos.com/CUSTOMER")
            protected String contactpos;
            @XmlElement(name = "CONTACTWORKTEL", namespace = "http://temenos.com/CUSTOMER")
            protected String contactworktel;
            @XmlElement(name = "CONTACTHOMTEL", namespace = "http://temenos.com/CUSTOMER")
            protected String contacthomtel;
            @XmlElement(name = "CONTACTMOBTEL", namespace = "http://temenos.com/CUSTOMER")
            protected String contactmobtel;
            @XmlElement(name = "CONTACTEMAIL", namespace = "http://temenos.com/CUSTOMER")
            protected String contactemail;
            @XmlElement(name = "CONTACTFAXNO", namespace = "http://temenos.com/CUSTOMER")
            protected String contactfaxno;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the contactname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTNAME() {
                return contactname;
            }

            /**
             * Sets the value of the contactname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTNAME(String value) {
                this.contactname = value;
            }

            /**
             * Gets the value of the contactpos property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTPOS() {
                return contactpos;
            }

            /**
             * Sets the value of the contactpos property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTPOS(String value) {
                this.contactpos = value;
            }

            /**
             * Gets the value of the contactworktel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTWORKTEL() {
                return contactworktel;
            }

            /**
             * Sets the value of the contactworktel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTWORKTEL(String value) {
                this.contactworktel = value;
            }

            /**
             * Gets the value of the contacthomtel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTHOMTEL() {
                return contacthomtel;
            }

            /**
             * Sets the value of the contacthomtel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTHOMTEL(String value) {
                this.contacthomtel = value;
            }

            /**
             * Gets the value of the contactmobtel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTMOBTEL() {
                return contactmobtel;
            }

            /**
             * Sets the value of the contactmobtel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTMOBTEL(String value) {
                this.contactmobtel = value;
            }

            /**
             * Gets the value of the contactemail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTEMAIL() {
                return contactemail;
            }

            /**
             * Sets the value of the contactemail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTEMAIL(String value) {
                this.contactemail = value;
            }

            /**
             * Gets the value of the contactfaxno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCONTACTFAXNO() {
                return contactfaxno;
            }

            /**
             * Sets the value of the contactfaxno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCONTACTFAXNO(String value) {
                this.contactfaxno = value;
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
     *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "country"
    })
    public static class GCOUNTRY {

        @XmlElement(name = "COUNTRY", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> country;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the country property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the country property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOUNTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCOUNTRY() {
            if (country == null) {
                country = new ArrayList<String>();
            }
            return this.country;
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
     *         &lt;element name="mCRPROFILETYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CRPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcrprofiletype"
    })
    public static class GCRPROFILETYPE {

        @XmlElement(name = "mCRPROFILETYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MCRPROFILETYPE> mcrprofiletype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcrprofiletype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcrprofiletype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCRPROFILETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCRPROFILETYPE }
         * 
         * 
         */
        public List<MCRPROFILETYPE> getMCRPROFILETYPE() {
            if (mcrprofiletype == null) {
                mcrprofiletype = new ArrayList<MCRPROFILETYPE>();
            }
            return this.mcrprofiletype;
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
         *         &lt;element name="CRPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "crprofiletype",
            "crprofile"
        })
        public static class MCRPROFILETYPE {

            @XmlElement(name = "CRPROFILETYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String crprofiletype;
            @XmlElement(name = "CRPROFILE", namespace = "http://temenos.com/CUSTOMER")
            protected String crprofile;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the crprofiletype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRPROFILETYPE() {
                return crprofiletype;
            }

            /**
             * Sets the value of the crprofiletype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRPROFILETYPE(String value) {
                this.crprofiletype = value;
            }

            /**
             * Gets the value of the crprofile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRPROFILE() {
                return crprofile;
            }

            /**
             * Sets the value of the crprofile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRPROFILE(String value) {
                this.crprofile = value;
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
     *         &lt;element name="mCRUSERPROFILETY" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CRUSERPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRCALCPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRUSERPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CRCALCRESETDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcruserprofilety"
    })
    public static class GCRUSERPROFILETY {

        @XmlElement(name = "mCRUSERPROFILETY", namespace = "http://temenos.com/CUSTOMER")
        protected List<MCRUSERPROFILETY> mcruserprofilety;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcruserprofilety property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcruserprofilety property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCRUSERPROFILETY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCRUSERPROFILETY }
         * 
         * 
         */
        public List<MCRUSERPROFILETY> getMCRUSERPROFILETY() {
            if (mcruserprofilety == null) {
                mcruserprofilety = new ArrayList<MCRUSERPROFILETY>();
            }
            return this.mcruserprofilety;
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
         *         &lt;element name="CRUSERPROFILETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRCALCPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRUSERPROFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CRCALCRESETDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cruserprofiletype",
            "crcalcprofile",
            "cruserprofile",
            "crcalcresetdate"
        })
        public static class MCRUSERPROFILETY {

            @XmlElement(name = "CRUSERPROFILETYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String cruserprofiletype;
            @XmlElement(name = "CRCALCPROFILE", namespace = "http://temenos.com/CUSTOMER")
            protected String crcalcprofile;
            @XmlElement(name = "CRUSERPROFILE", namespace = "http://temenos.com/CUSTOMER")
            protected String cruserprofile;
            @XmlElement(name = "CRCALCRESETDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String crcalcresetdate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the cruserprofiletype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRUSERPROFILETYPE() {
                return cruserprofiletype;
            }

            /**
             * Sets the value of the cruserprofiletype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRUSERPROFILETYPE(String value) {
                this.cruserprofiletype = value;
            }

            /**
             * Gets the value of the crcalcprofile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRCALCPROFILE() {
                return crcalcprofile;
            }

            /**
             * Sets the value of the crcalcprofile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRCALCPROFILE(String value) {
                this.crcalcprofile = value;
            }

            /**
             * Gets the value of the cruserprofile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRUSERPROFILE() {
                return cruserprofile;
            }

            /**
             * Sets the value of the cruserprofile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRUSERPROFILE(String value) {
                this.cruserprofile = value;
            }

            /**
             * Gets the value of the crcalcresetdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRCALCRESETDATE() {
                return crcalcresetdate;
            }

            /**
             * Sets the value of the crcalcresetdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRCALCRESETDATE(String value) {
                this.crcalcresetdate = value;
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
     *         &lt;element name="CUSTOMERRATING" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "customerrating"
    })
    public static class GCUSTOMERRATING {

        @XmlElement(name = "CUSTOMERRATING", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> customerrating;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the customerrating property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerrating property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCUSTOMERRATING().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCUSTOMERRATING() {
            if (customerrating == null) {
                customerrating = new ArrayList<String>();
            }
            return this.customerrating;
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
     *         &lt;element name="DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "datetime"
    })
    public static class GDATETIME {

        @XmlElement(name = "DATETIME", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> datetime;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the datetime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datetime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDATETIME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDATETIME() {
            if (datetime == null) {
                datetime = new ArrayList<String>();
            }
            return this.datetime;
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
     *         &lt;element name="mDOC.NUMBER" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ISSUEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEDOCEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mdocnumber"
    })
    public static class GDOCNUMBER {

        @XmlElement(name = "mDOC.NUMBER", namespace = "http://temenos.com/CUSTOMER")
        protected List<MDOCNUMBER> mdocnumber;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mdocnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mdocnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMDOCNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MDOCNUMBER }
         * 
         * 
         */
        public List<MDOCNUMBER> getMDOCNUMBER() {
            if (mdocnumber == null) {
                mdocnumber = new ArrayList<MDOCNUMBER>();
            }
            return this.mdocnumber;
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
         *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALIDNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ISSUEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEDOCEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "docnumber",
            "legalidname",
            "docname",
            "issueauth",
            "dateissue",
            "datedocexpiry"
        })
        public static class MDOCNUMBER {

            @XmlElement(name = "DOCNUMBER", namespace = "http://temenos.com/CUSTOMER")
            protected String docnumber;
            @XmlElement(name = "LEGALIDNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String legalidname;
            @XmlElement(name = "DOCNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String docname;
            @XmlElement(name = "ISSUEAUTH", namespace = "http://temenos.com/CUSTOMER")
            protected String issueauth;
            @XmlElement(name = "DATEISSUE", namespace = "http://temenos.com/CUSTOMER")
            protected String dateissue;
            @XmlElement(name = "DATEDOCEXPIRY", namespace = "http://temenos.com/CUSTOMER")
            protected String datedocexpiry;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the docnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCNUMBER() {
                return docnumber;
            }

            /**
             * Sets the value of the docnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCNUMBER(String value) {
                this.docnumber = value;
            }

            /**
             * Gets the value of the legalidname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALIDNAME() {
                return legalidname;
            }

            /**
             * Sets the value of the legalidname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALIDNAME(String value) {
                this.legalidname = value;
            }

            /**
             * Gets the value of the docname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDOCNAME() {
                return docname;
            }

            /**
             * Sets the value of the docname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDOCNAME(String value) {
                this.docname = value;
            }

            /**
             * Gets the value of the issueauth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISSUEAUTH() {
                return issueauth;
            }

            /**
             * Sets the value of the issueauth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISSUEAUTH(String value) {
                this.issueauth = value;
            }

            /**
             * Gets the value of the dateissue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEISSUE() {
                return dateissue;
            }

            /**
             * Sets the value of the dateissue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEISSUE(String value) {
                this.dateissue = value;
            }

            /**
             * Gets the value of the datedocexpiry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEDOCEXPIRY() {
                return datedocexpiry;
            }

            /**
             * Sets the value of the datedocexpiry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEDOCEXPIRY(String value) {
                this.datedocexpiry = value;
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
     *         &lt;element name="EMPLCTYMUNIC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "emplctymunic"
    })
    public static class GEMPLCTYMUNIC {

        @XmlElement(name = "EMPLCTYMUNIC", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> emplctymunic;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the emplctymunic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emplctymunic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMPLCTYMUNIC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEMPLCTYMUNIC() {
            if (emplctymunic == null) {
                emplctymunic = new ArrayList<String>();
            }
            return this.emplctymunic;
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
     *         &lt;element name="EMPLOYBUSADDR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "employbusaddr"
    })
    public static class GEMPLOYBUSADDR {

        @XmlElement(name = "EMPLOYBUSADDR", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> employbusaddr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the employbusaddr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employbusaddr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMPLOYBUSADDR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEMPLOYBUSADDR() {
            if (employbusaddr == null) {
                employbusaddr = new ArrayList<String>();
            }
            return this.employbusaddr;
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
     *         &lt;element name="mEMPLOYMENTSTATUS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EMPLOYMENTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="JOBTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMPLOYERSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgEMPLOYERSADD" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="EMPLOYERSADD" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="EMPLOYERSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EMPLOYERSBUSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMPLOYMENTSTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTOMERCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SALARYDATEFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "memploymentstatus"
    })
    public static class GEMPLOYMENTSTATUS {

        @XmlElement(name = "mEMPLOYMENTSTATUS", namespace = "http://temenos.com/CUSTOMER")
        protected List<MEMPLOYMENTSTATUS> memploymentstatus;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the memploymentstatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memploymentstatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEMPLOYMENTSTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEMPLOYMENTSTATUS }
         * 
         * 
         */
        public List<MEMPLOYMENTSTATUS> getMEMPLOYMENTSTATUS() {
            if (memploymentstatus == null) {
                memploymentstatus = new ArrayList<MEMPLOYMENTSTATUS>();
            }
            return this.memploymentstatus;
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
         *         &lt;element name="EMPLOYMENTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="JOBTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMPLOYERSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgEMPLOYERSADD" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="EMPLOYERSADD" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="EMPLOYERSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EMPLOYERSBUSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMPLOYMENTSTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTOMERCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SALARY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ANNUALBONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SALARYDATEFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "employmentstatus",
            "occupation",
            "jobtitle",
            "employersname",
            "sgEMPLOYERSADD",
            "employersbuss",
            "employmentstart",
            "customercurrency",
            "salary",
            "annualbonus",
            "salarydatefreq"
        })
        public static class MEMPLOYMENTSTATUS {

            @XmlElement(name = "EMPLOYMENTSTATUS", namespace = "http://temenos.com/CUSTOMER")
            protected String employmentstatus;
            @XmlElement(name = "OCCUPATION", namespace = "http://temenos.com/CUSTOMER")
            protected String occupation;
            @XmlElement(name = "JOBTITLE", namespace = "http://temenos.com/CUSTOMER")
            protected String jobtitle;
            @XmlElement(name = "EMPLOYERSNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String employersname;
            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgEMPLOYERSADD sgEMPLOYERSADD;
            @XmlElement(name = "EMPLOYERSBUSS", namespace = "http://temenos.com/CUSTOMER")
            protected String employersbuss;
            @XmlElement(name = "EMPLOYMENTSTART", namespace = "http://temenos.com/CUSTOMER")
            protected String employmentstart;
            @XmlElement(name = "CUSTOMERCURRENCY", namespace = "http://temenos.com/CUSTOMER")
            protected String customercurrency;
            @XmlElement(name = "SALARY", namespace = "http://temenos.com/CUSTOMER")
            protected String salary;
            @XmlElement(name = "ANNUALBONUS", namespace = "http://temenos.com/CUSTOMER")
            protected String annualbonus;
            @XmlElement(name = "SALARYDATEFREQ", namespace = "http://temenos.com/CUSTOMER")
            protected String salarydatefreq;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the employmentstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYMENTSTATUS() {
                return employmentstatus;
            }

            /**
             * Sets the value of the employmentstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYMENTSTATUS(String value) {
                this.employmentstatus = value;
            }

            /**
             * Gets the value of the occupation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOCCUPATION() {
                return occupation;
            }

            /**
             * Sets the value of the occupation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOCCUPATION(String value) {
                this.occupation = value;
            }

            /**
             * Gets the value of the jobtitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJOBTITLE() {
                return jobtitle;
            }

            /**
             * Sets the value of the jobtitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJOBTITLE(String value) {
                this.jobtitle = value;
            }

            /**
             * Gets the value of the employersname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYERSNAME() {
                return employersname;
            }

            /**
             * Sets the value of the employersname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYERSNAME(String value) {
                this.employersname = value;
            }

            /**
             * Gets the value of the sgEMPLOYERSADD property.
             * 
             * @return
             *     possible object is
             *     {@link SgEMPLOYERSADD }
             *     
             */
            public SgEMPLOYERSADD getSgEMPLOYERSADD() {
                return sgEMPLOYERSADD;
            }

            /**
             * Sets the value of the sgEMPLOYERSADD property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgEMPLOYERSADD }
             *     
             */
            public void setSgEMPLOYERSADD(SgEMPLOYERSADD value) {
                this.sgEMPLOYERSADD = value;
            }

            /**
             * Gets the value of the employersbuss property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYERSBUSS() {
                return employersbuss;
            }

            /**
             * Sets the value of the employersbuss property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYERSBUSS(String value) {
                this.employersbuss = value;
            }

            /**
             * Gets the value of the employmentstart property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMPLOYMENTSTART() {
                return employmentstart;
            }

            /**
             * Sets the value of the employmentstart property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMPLOYMENTSTART(String value) {
                this.employmentstart = value;
            }

            /**
             * Gets the value of the customercurrency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUSTOMERCURRENCY() {
                return customercurrency;
            }

            /**
             * Sets the value of the customercurrency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUSTOMERCURRENCY(String value) {
                this.customercurrency = value;
            }

            /**
             * Gets the value of the salary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSALARY() {
                return salary;
            }

            /**
             * Sets the value of the salary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSALARY(String value) {
                this.salary = value;
            }

            /**
             * Gets the value of the annualbonus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getANNUALBONUS() {
                return annualbonus;
            }

            /**
             * Sets the value of the annualbonus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setANNUALBONUS(String value) {
                this.annualbonus = value;
            }

            /**
             * Gets the value of the salarydatefreq property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSALARYDATEFREQ() {
                return salarydatefreq;
            }

            /**
             * Sets the value of the salarydatefreq property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSALARYDATEFREQ(String value) {
                this.salarydatefreq = value;
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
             *         &lt;element name="EMPLOYERSADD" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="EMPLOYERSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "employersadd"
            })
            public static class SgEMPLOYERSADD {

                @XmlElement(name = "EMPLOYERSADD", namespace = "http://temenos.com/CUSTOMER")
                protected List<EMPLOYERSADD> employersadd;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the employersadd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the employersadd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEMPLOYERSADD().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EMPLOYERSADD }
                 * 
                 * 
                 */
                public List<EMPLOYERSADD> getEMPLOYERSADD() {
                    if (employersadd == null) {
                        employersadd = new ArrayList<EMPLOYERSADD>();
                    }
                    return this.employersadd;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="EMPLOYERSADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "employersadd"
                })
                public static class EMPLOYERSADD {

                    @XmlElement(name = "EMPLOYERSADD", namespace = "http://temenos.com/CUSTOMER")
                    protected String employersadd;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the employersadd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEMPLOYERSADD() {
                        return employersadd;
                    }

                    /**
                     * Sets the value of the employersadd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEMPLOYERSADD(String value) {
                        this.employersadd = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="EMPLOYSUBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "employsubtown"
    })
    public static class GEMPLOYSUBTOWN {

        @XmlElement(name = "EMPLOYSUBTOWN", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> employsubtown;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the employsubtown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employsubtown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMPLOYSUBTOWN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEMPLOYSUBTOWN() {
            if (employsubtown == null) {
                employsubtown = new ArrayList<String>();
            }
            return this.employsubtown;
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
     *         &lt;element name="EMPLPROVSTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "emplprovstate"
    })
    public static class GEMPLPROVSTATE {

        @XmlElement(name = "EMPLPROVSTATE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> emplprovstate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the emplprovstate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emplprovstate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEMPLPROVSTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEMPLPROVSTATE() {
            if (emplprovstate == null) {
                emplprovstate = new ArrayList<String>();
            }
            return this.emplprovstate;
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
     *         &lt;element name="mEXTERNSYSID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EXTERNSYSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EXTERNCUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mexternsysid"
    })
    public static class GEXTERNSYSID {

        @XmlElement(name = "mEXTERNSYSID", namespace = "http://temenos.com/CUSTOMER")
        protected List<MEXTERNSYSID> mexternsysid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mexternsysid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mexternsysid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMEXTERNSYSID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MEXTERNSYSID }
         * 
         * 
         */
        public List<MEXTERNSYSID> getMEXTERNSYSID() {
            if (mexternsysid == null) {
                mexternsysid = new ArrayList<MEXTERNSYSID>();
            }
            return this.mexternsysid;
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
         *         &lt;element name="EXTERNSYSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EXTERNCUSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "externsysid",
            "externcusid"
        })
        public static class MEXTERNSYSID {

            @XmlElement(name = "EXTERNSYSID", namespace = "http://temenos.com/CUSTOMER")
            protected String externsysid;
            @XmlElement(name = "EXTERNCUSID", namespace = "http://temenos.com/CUSTOMER")
            protected String externcusid;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the externsysid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTERNSYSID() {
                return externsysid;
            }

            /**
             * Sets the value of the externsysid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTERNSYSID(String value) {
                this.externsysid = value;
            }

            /**
             * Gets the value of the externcusid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEXTERNCUSID() {
                return externcusid;
            }

            /**
             * Sets the value of the externcusid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEXTERNCUSID(String value) {
                this.externcusid = value;
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
     *         &lt;element name="FAX1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "fax1"
    })
    public static class GFAX1 {

        @XmlElement(name = "FAX1", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> fax1;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the fax1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fax1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFAX1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFAX1() {
            if (fax1 == null) {
                fax1 = new ArrayList<String>();
            }
            return this.fax1;
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
     *         &lt;element name="mFORMERVISTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FORMERVISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgFORMERVISCOMMENT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FORMERVISCOMMENT" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FORMERVISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mformervistype"
    })
    public static class GFORMERVISTYPE {

        @XmlElement(name = "mFORMERVISTYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MFORMERVISTYPE> mformervistype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mformervistype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mformervistype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMFORMERVISTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MFORMERVISTYPE }
         * 
         * 
         */
        public List<MFORMERVISTYPE> getMFORMERVISTYPE() {
            if (mformervistype == null) {
                mformervistype = new ArrayList<MFORMERVISTYPE>();
            }
            return this.mformervistype;
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
         *         &lt;element name="FORMERVISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgFORMERVISCOMMENT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FORMERVISCOMMENT" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FORMERVISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "formervistype",
            "sgFORMERVISCOMMENT"
        })
        public static class MFORMERVISTYPE {

            @XmlElement(name = "FORMERVISTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String formervistype;
            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgFORMERVISCOMMENT sgFORMERVISCOMMENT;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the formervistype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFORMERVISTYPE() {
                return formervistype;
            }

            /**
             * Sets the value of the formervistype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFORMERVISTYPE(String value) {
                this.formervistype = value;
            }

            /**
             * Gets the value of the sgFORMERVISCOMMENT property.
             * 
             * @return
             *     possible object is
             *     {@link SgFORMERVISCOMMENT }
             *     
             */
            public SgFORMERVISCOMMENT getSgFORMERVISCOMMENT() {
                return sgFORMERVISCOMMENT;
            }

            /**
             * Sets the value of the sgFORMERVISCOMMENT property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgFORMERVISCOMMENT }
             *     
             */
            public void setSgFORMERVISCOMMENT(SgFORMERVISCOMMENT value) {
                this.sgFORMERVISCOMMENT = value;
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
             *         &lt;element name="FORMERVISCOMMENT" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FORMERVISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "formerviscomment"
            })
            public static class SgFORMERVISCOMMENT {

                @XmlElement(name = "FORMERVISCOMMENT", namespace = "http://temenos.com/CUSTOMER")
                protected List<FORMERVISCOMMENT> formerviscomment;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the formerviscomment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the formerviscomment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFORMERVISCOMMENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FORMERVISCOMMENT }
                 * 
                 * 
                 */
                public List<FORMERVISCOMMENT> getFORMERVISCOMMENT() {
                    if (formerviscomment == null) {
                        formerviscomment = new ArrayList<FORMERVISCOMMENT>();
                    }
                    return this.formerviscomment;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="FORMERVISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "formerviscomment"
                })
                public static class FORMERVISCOMMENT {

                    @XmlElement(name = "FORMERVISCOMMENT", namespace = "http://temenos.com/CUSTOMER")
                    protected String formerviscomment;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the formerviscomment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFORMERVISCOMMENT() {
                        return formerviscomment;
                    }

                    /**
                     * Sets the value of the formerviscomment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFORMERVISCOMMENT(String value) {
                        this.formerviscomment = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="FURTHERDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "furtherdetails"
    })
    public static class GFURTHERDETAILS {

        @XmlElement(name = "FURTHERDETAILS", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> furtherdetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the furtherdetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the furtherdetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFURTHERDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFURTHERDETAILS() {
            if (furtherdetails == null) {
                furtherdetails = new ArrayList<String>();
            }
            return this.furtherdetails;
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
     *         &lt;element name="mGROUP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GROUPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GMEMBERSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mgroup"
    })
    public static class GGROUP {

        @XmlElement(name = "mGROUP", namespace = "http://temenos.com/CUSTOMER")
        protected List<MGROUP> mgroup;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MGROUP }
         * 
         * 
         */
        public List<MGROUP> getMGROUP() {
            if (mgroup == null) {
                mgroup = new ArrayList<MGROUP>();
            }
            return this.mgroup;
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
         *         &lt;element name="GROUP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GROUPTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GMEMBERSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "group",
            "cycle",
            "grouptype",
            "gmemberstatus"
        })
        public static class MGROUP {

            @XmlElement(name = "GROUP", namespace = "http://temenos.com/CUSTOMER")
            protected String group;
            @XmlElement(name = "CYCLE", namespace = "http://temenos.com/CUSTOMER")
            protected String cycle;
            @XmlElement(name = "GROUPTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String grouptype;
            @XmlElement(name = "GMEMBERSTATUS", namespace = "http://temenos.com/CUSTOMER")
            protected String gmemberstatus;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGROUP() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGROUP(String value) {
                this.group = value;
            }

            /**
             * Gets the value of the cycle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCYCLE() {
                return cycle;
            }

            /**
             * Sets the value of the cycle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCYCLE(String value) {
                this.cycle = value;
            }

            /**
             * Gets the value of the grouptype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGROUPTYPE() {
                return grouptype;
            }

            /**
             * Sets the value of the grouptype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGROUPTYPE(String value) {
                this.grouptype = value;
            }

            /**
             * Gets the value of the gmemberstatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGMEMBERSTATUS() {
                return gmemberstatus;
            }

            /**
             * Sets the value of the gmemberstatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGMEMBERSTATUS(String value) {
                this.gmemberstatus = value;
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
     *         &lt;element name="HOLDINGSPIVOT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "holdingspivot"
    })
    public static class GHOLDINGSPIVOT {

        @XmlElement(name = "HOLDINGSPIVOT", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> holdingspivot;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the holdingspivot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the holdingspivot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHOLDINGSPIVOT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getHOLDINGSPIVOT() {
            if (holdingspivot == null) {
                holdingspivot = new ArrayList<String>();
            }
            return this.holdingspivot;
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
     *         &lt;element name="INPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inputter"
    })
    public static class GINPUTTER {

        @XmlElement(name = "INPUTTER", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> inputter;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inputter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPUTTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPUTTER() {
            if (inputter == null) {
                inputter = new ArrayList<String>();
            }
            return this.inputter;
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
     *         &lt;element name="mINS.MEM.NO" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="INSMEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSSURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSPOSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSAMTLEGACY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "minsmemno"
    })
    public static class GINSMEMNO {

        @XmlElement(name = "mINS.MEM.NO", namespace = "http://temenos.com/CUSTOMER")
        protected List<MINSMEMNO> minsmemno;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the minsmemno property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the minsmemno property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMINSMEMNO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MINSMEMNO }
         * 
         * 
         */
        public List<MINSMEMNO> getMINSMEMNO() {
            if (minsmemno == null) {
                minsmemno = new ArrayList<MINSMEMNO>();
            }
            return this.minsmemno;
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
         *         &lt;element name="INSMEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSSURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSPOSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSPHONENO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSAMTLEGACY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "insmemno",
            "inssurname",
            "insaddress",
            "inssuburb",
            "inscity",
            "insstate",
            "insposcode",
            "insphoneno",
            "insrelcode",
            "insamtlegacy"
        })
        public static class MINSMEMNO {

            @XmlElement(name = "INSMEMNO", namespace = "http://temenos.com/CUSTOMER")
            protected String insmemno;
            @XmlElement(name = "INSSURNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String inssurname;
            @XmlElement(name = "INSADDRESS", namespace = "http://temenos.com/CUSTOMER")
            protected String insaddress;
            @XmlElement(name = "INSSUBURB", namespace = "http://temenos.com/CUSTOMER")
            protected String inssuburb;
            @XmlElement(name = "INSCITY", namespace = "http://temenos.com/CUSTOMER")
            protected String inscity;
            @XmlElement(name = "INSSTATE", namespace = "http://temenos.com/CUSTOMER")
            protected String insstate;
            @XmlElement(name = "INSPOSCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String insposcode;
            @XmlElement(name = "INSPHONENO", namespace = "http://temenos.com/CUSTOMER")
            protected String insphoneno;
            @XmlElement(name = "INSRELCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String insrelcode;
            @XmlElement(name = "INSAMTLEGACY", namespace = "http://temenos.com/CUSTOMER")
            protected String insamtlegacy;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the insmemno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSMEMNO() {
                return insmemno;
            }

            /**
             * Sets the value of the insmemno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSMEMNO(String value) {
                this.insmemno = value;
            }

            /**
             * Gets the value of the inssurname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSSURNAME() {
                return inssurname;
            }

            /**
             * Sets the value of the inssurname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSSURNAME(String value) {
                this.inssurname = value;
            }

            /**
             * Gets the value of the insaddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSADDRESS() {
                return insaddress;
            }

            /**
             * Sets the value of the insaddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSADDRESS(String value) {
                this.insaddress = value;
            }

            /**
             * Gets the value of the inssuburb property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSSUBURB() {
                return inssuburb;
            }

            /**
             * Sets the value of the inssuburb property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSSUBURB(String value) {
                this.inssuburb = value;
            }

            /**
             * Gets the value of the inscity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSCITY() {
                return inscity;
            }

            /**
             * Sets the value of the inscity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSCITY(String value) {
                this.inscity = value;
            }

            /**
             * Gets the value of the insstate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSSTATE() {
                return insstate;
            }

            /**
             * Sets the value of the insstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSSTATE(String value) {
                this.insstate = value;
            }

            /**
             * Gets the value of the insposcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSPOSCODE() {
                return insposcode;
            }

            /**
             * Sets the value of the insposcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSPOSCODE(String value) {
                this.insposcode = value;
            }

            /**
             * Gets the value of the insphoneno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSPHONENO() {
                return insphoneno;
            }

            /**
             * Sets the value of the insphoneno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSPHONENO(String value) {
                this.insphoneno = value;
            }

            /**
             * Gets the value of the insrelcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSRELCODE() {
                return insrelcode;
            }

            /**
             * Sets the value of the insrelcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSRELCODE(String value) {
                this.insrelcode = value;
            }

            /**
             * Gets the value of the insamtlegacy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSAMTLEGACY() {
                return insamtlegacy;
            }

            /**
             * Sets the value of the insamtlegacy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSAMTLEGACY(String value) {
                this.insamtlegacy = value;
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
     *         &lt;element name="INTERESTS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "interests"
    })
    public static class GINTERESTS {

        @XmlElement(name = "INTERESTS", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> interests;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the interests property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interests property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERESTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINTERESTS() {
            if (interests == null) {
                interests = new ArrayList<String>();
            }
            return this.interests;
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
     *         &lt;element name="mLEGALID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALDOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALISSAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALISSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LEGALEXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mlegalid"
    })
    public static class GLEGALID {

        @XmlElement(name = "mLEGALID", namespace = "http://temenos.com/CUSTOMER")
        protected List<MLEGALID> mlegalid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlegalid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlegalid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLEGALID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MLEGALID }
         * 
         * 
         */
        public List<MLEGALID> getMLEGALID() {
            if (mlegalid == null) {
                mlegalid = new ArrayList<MLEGALID>();
            }
            return this.mlegalid;
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
         *         &lt;element name="LEGALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALDOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALHOLDERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALISSAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALISSDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LEGALEXPDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "legalid",
            "legaldocname",
            "legalholdername",
            "legalissauth",
            "legalissdate",
            "legalexpdate"
        })
        public static class MLEGALID {

            @XmlElement(name = "LEGALID", namespace = "http://temenos.com/CUSTOMER")
            protected String legalid;
            @XmlElement(name = "LEGALDOCNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String legaldocname;
            @XmlElement(name = "LEGALHOLDERNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String legalholdername;
            @XmlElement(name = "LEGALISSAUTH", namespace = "http://temenos.com/CUSTOMER")
            protected String legalissauth;
            @XmlElement(name = "LEGALISSDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String legalissdate;
            @XmlElement(name = "LEGALEXPDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String legalexpdate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Gets the value of the legaldocname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALDOCNAME() {
                return legaldocname;
            }

            /**
             * Sets the value of the legaldocname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALDOCNAME(String value) {
                this.legaldocname = value;
            }

            /**
             * Gets the value of the legalholdername property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALHOLDERNAME() {
                return legalholdername;
            }

            /**
             * Sets the value of the legalholdername property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALHOLDERNAME(String value) {
                this.legalholdername = value;
            }

            /**
             * Gets the value of the legalissauth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALISSAUTH() {
                return legalissauth;
            }

            /**
             * Sets the value of the legalissauth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALISSAUTH(String value) {
                this.legalissauth = value;
            }

            /**
             * Gets the value of the legalissdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALISSDATE() {
                return legalissdate;
            }

            /**
             * Sets the value of the legalissdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALISSDATE(String value) {
                this.legalissdate = value;
            }

            /**
             * Gets the value of the legalexpdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLEGALEXPDATE() {
                return legalexpdate;
            }

            /**
             * Sets the value of the legalexpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLEGALEXPDATE(String value) {
                this.legalexpdate = value;
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
     *         &lt;element name="LEGALIDDOCNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "legaliddocname"
    })
    public static class GLEGALIDDOCNAME {

        @XmlElement(name = "LEGALIDDOCNAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> legaliddocname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the legaliddocname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legaliddocname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLEGALIDDOCNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLEGALIDDOCNAME() {
            if (legaliddocname == null) {
                legaliddocname = new ArrayList<String>();
            }
            return this.legaliddocname;
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
     *         &lt;element name="mLLADDRESS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sgLLADDRESS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ADDRESS" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mlladdress"
    })
    public static class GLLADDRESS {

        @XmlElement(name = "mLLADDRESS", namespace = "http://temenos.com/CUSTOMER")
        protected List<MLLADDRESS> mlladdress;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mlladdress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mlladdress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMLLADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MLLADDRESS }
         * 
         * 
         */
        public List<MLLADDRESS> getMLLADDRESS() {
            if (mlladdress == null) {
                mlladdress = new ArrayList<MLLADDRESS>();
            }
            return this.mlladdress;
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
         *         &lt;element name="sgLLADDRESS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ADDRESS" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "sgLLADDRESS"
        })
        public static class MLLADDRESS {

            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgLLADDRESS sgLLADDRESS;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the sgLLADDRESS property.
             * 
             * @return
             *     possible object is
             *     {@link SgLLADDRESS }
             *     
             */
            public SgLLADDRESS getSgLLADDRESS() {
                return sgLLADDRESS;
            }

            /**
             * Sets the value of the sgLLADDRESS property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgLLADDRESS }
             *     
             */
            public void setSgLLADDRESS(SgLLADDRESS value) {
                this.sgLLADDRESS = value;
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
             *         &lt;element name="ADDRESS" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "address"
            })
            public static class SgLLADDRESS {

                @XmlElement(name = "ADDRESS", namespace = "http://temenos.com/CUSTOMER")
                protected List<ADDRESS> address;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the address property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the address property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getADDRESS().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ADDRESS }
                 * 
                 * 
                 */
                public List<ADDRESS> getADDRESS() {
                    if (address == null) {
                        address = new ArrayList<ADDRESS>();
                    }
                    return this.address;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "address"
                })
                public static class ADDRESS {

                    @XmlElement(name = "ADDRESS", namespace = "http://temenos.com/CUSTOMER")
                    protected String address;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

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
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mMANDATEAPPL" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MANDATEAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MANDATEREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MANDATERECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mmandateappl"
    })
    public static class GMANDATEAPPL {

        @XmlElement(name = "mMANDATEAPPL", namespace = "http://temenos.com/CUSTOMER")
        protected List<MMANDATEAPPL> mmandateappl;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mmandateappl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mmandateappl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMMANDATEAPPL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MMANDATEAPPL }
         * 
         * 
         */
        public List<MMANDATEAPPL> getMMANDATEAPPL() {
            if (mmandateappl == null) {
                mmandateappl = new ArrayList<MMANDATEAPPL>();
            }
            return this.mmandateappl;
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
         *         &lt;element name="MANDATEAPPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MANDATEREG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MANDATERECORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "mandateappl",
            "mandatereg",
            "mandaterecord"
        })
        public static class MMANDATEAPPL {

            @XmlElement(name = "MANDATEAPPL", namespace = "http://temenos.com/CUSTOMER")
            protected String mandateappl;
            @XmlElement(name = "MANDATEREG", namespace = "http://temenos.com/CUSTOMER")
            protected String mandatereg;
            @XmlElement(name = "MANDATERECORD", namespace = "http://temenos.com/CUSTOMER")
            protected String mandaterecord;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the mandateappl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMANDATEAPPL() {
                return mandateappl;
            }

            /**
             * Sets the value of the mandateappl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMANDATEAPPL(String value) {
                this.mandateappl = value;
            }

            /**
             * Gets the value of the mandatereg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMANDATEREG() {
                return mandatereg;
            }

            /**
             * Sets the value of the mandatereg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMANDATEREG(String value) {
                this.mandatereg = value;
            }

            /**
             * Gets the value of the mandaterecord property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMANDATERECORD() {
                return mandaterecord;
            }

            /**
             * Sets the value of the mandaterecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMANDATERECORD(String value) {
                this.mandaterecord = value;
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
     *         &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "name1"
    })
    public static class GNAME1 {

        @XmlElement(name = "NAME1", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> name1;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the name1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNAME1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNAME1() {
            if (name1 == null) {
                name1 = new ArrayList<String>();
            }
            return this.name1;
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
     *         &lt;element name="NAME2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "name2"
    })
    public static class GNAME2 {

        @XmlElement(name = "NAME2", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> name2;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the name2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNAME2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNAME2() {
            if (name2 == null) {
                name2 = new ArrayList<String>();
            }
            return this.name2;
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
     *         &lt;element name="mNME.STAHLDR" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NMESTAHLDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NATSTAKHLDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NOSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STAKHLDDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GENDSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STAKHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mnmestahldr"
    })
    public static class GNMESTAHLDR {

        @XmlElement(name = "mNME.STAHLDR", namespace = "http://temenos.com/CUSTOMER")
        protected List<MNMESTAHLDR> mnmestahldr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mnmestahldr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mnmestahldr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMNMESTAHLDR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MNMESTAHLDR }
         * 
         * 
         */
        public List<MNMESTAHLDR> getMNMESTAHLDR() {
            if (mnmestahldr == null) {
                mnmestahldr = new ArrayList<MNMESTAHLDR>();
            }
            return this.mnmestahldr;
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
         *         &lt;element name="NMESTAHLDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NATSTAKHLDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NOSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STAKHLDDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GENDSTAKHLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STAKHLDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "nmestahldr",
            "natstakhldid",
            "nostakhld",
            "stakhlddob",
            "gendstakhld",
            "stakhldtyp"
        })
        public static class MNMESTAHLDR {

            @XmlElement(name = "NMESTAHLDR", namespace = "http://temenos.com/CUSTOMER")
            protected String nmestahldr;
            @XmlElement(name = "NATSTAKHLDID", namespace = "http://temenos.com/CUSTOMER")
            protected String natstakhldid;
            @XmlElement(name = "NOSTAKHLD", namespace = "http://temenos.com/CUSTOMER")
            protected String nostakhld;
            @XmlElement(name = "STAKHLDDOB", namespace = "http://temenos.com/CUSTOMER")
            protected String stakhlddob;
            @XmlElement(name = "GENDSTAKHLD", namespace = "http://temenos.com/CUSTOMER")
            protected String gendstakhld;
            @XmlElement(name = "STAKHLDTYP", namespace = "http://temenos.com/CUSTOMER")
            protected String stakhldtyp;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the nmestahldr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNMESTAHLDR() {
                return nmestahldr;
            }

            /**
             * Sets the value of the nmestahldr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNMESTAHLDR(String value) {
                this.nmestahldr = value;
            }

            /**
             * Gets the value of the natstakhldid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNATSTAKHLDID() {
                return natstakhldid;
            }

            /**
             * Sets the value of the natstakhldid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNATSTAKHLDID(String value) {
                this.natstakhldid = value;
            }

            /**
             * Gets the value of the nostakhld property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNOSTAKHLD() {
                return nostakhld;
            }

            /**
             * Sets the value of the nostakhld property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNOSTAKHLD(String value) {
                this.nostakhld = value;
            }

            /**
             * Gets the value of the stakhlddob property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTAKHLDDOB() {
                return stakhlddob;
            }

            /**
             * Sets the value of the stakhlddob property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTAKHLDDOB(String value) {
                this.stakhlddob = value;
            }

            /**
             * Gets the value of the gendstakhld property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENDSTAKHLD() {
                return gendstakhld;
            }

            /**
             * Sets the value of the gendstakhld property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENDSTAKHLD(String value) {
                this.gendstakhld = value;
            }

            /**
             * Gets the value of the stakhldtyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTAKHLDTYP() {
                return stakhldtyp;
            }

            /**
             * Sets the value of the stakhldtyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTAKHLDTYP(String value) {
                this.stakhldtyp = value;
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
     *         &lt;element name="NONINDTEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "nonindtext"
    })
    public static class GNONINDTEXT {

        @XmlElement(name = "NONINDTEXT", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> nonindtext;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the nonindtext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonindtext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNONINDTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNONINDTEXT() {
            if (nonindtext == null) {
                nonindtext = new ArrayList<String>();
            }
            return this.nonindtext;
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
     *         &lt;element name="OFFPHONE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "offphone"
    })
    public static class GOFFPHONE {

        @XmlElement(name = "OFFPHONE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> offphone;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the offphone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offphone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOFFPHONE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOFFPHONE() {
            if (offphone == null) {
                offphone = new ArrayList<String>();
            }
            return this.offphone;
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
     *         &lt;element name="mOTHER.ACCTS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OTHERACCTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BANKBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SORTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEACOPND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "motheraccts"
    })
    public static class GOTHERACCTS {

        @XmlElement(name = "mOTHER.ACCTS", namespace = "http://temenos.com/CUSTOMER")
        protected List<MOTHERACCTS> motheraccts;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the motheraccts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motheraccts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOTHERACCTS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MOTHERACCTS }
         * 
         * 
         */
        public List<MOTHERACCTS> getMOTHERACCTS() {
            if (motheraccts == null) {
                motheraccts = new ArrayList<MOTHERACCTS>();
            }
            return this.motheraccts;
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
         *         &lt;element name="OTHERACCTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BANKBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SORTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEACOPND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "otheraccts",
            "bankbranch",
            "sortcode",
            "dateacopnd"
        })
        public static class MOTHERACCTS {

            @XmlElement(name = "OTHERACCTS", namespace = "http://temenos.com/CUSTOMER")
            protected String otheraccts;
            @XmlElement(name = "BANKBRANCH", namespace = "http://temenos.com/CUSTOMER")
            protected String bankbranch;
            @XmlElement(name = "SORTCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String sortcode;
            @XmlElement(name = "DATEACOPND", namespace = "http://temenos.com/CUSTOMER")
            protected String dateacopnd;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the otheraccts property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOTHERACCTS() {
                return otheraccts;
            }

            /**
             * Sets the value of the otheraccts property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOTHERACCTS(String value) {
                this.otheraccts = value;
            }

            /**
             * Gets the value of the bankbranch property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANKBRANCH() {
                return bankbranch;
            }

            /**
             * Sets the value of the bankbranch property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANKBRANCH(String value) {
                this.bankbranch = value;
            }

            /**
             * Gets the value of the sortcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSORTCODE() {
                return sortcode;
            }

            /**
             * Sets the value of the sortcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSORTCODE(String value) {
                this.sortcode = value;
            }

            /**
             * Gets the value of the dateacopnd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEACOPND() {
                return dateacopnd;
            }

            /**
             * Sets the value of the dateacopnd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEACOPND(String value) {
                this.dateacopnd = value;
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
     *         &lt;element name="mOTHERFINREL" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OTHERFINREL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OTHERFININST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "motherfinrel"
    })
    public static class GOTHERFINREL {

        @XmlElement(name = "mOTHERFINREL", namespace = "http://temenos.com/CUSTOMER")
        protected List<MOTHERFINREL> motherfinrel;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the motherfinrel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motherfinrel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMOTHERFINREL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MOTHERFINREL }
         * 
         * 
         */
        public List<MOTHERFINREL> getMOTHERFINREL() {
            if (motherfinrel == null) {
                motherfinrel = new ArrayList<MOTHERFINREL>();
            }
            return this.motherfinrel;
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
         *         &lt;element name="OTHERFINREL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OTHERFININST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "otherfinrel",
            "otherfininst"
        })
        public static class MOTHERFINREL {

            @XmlElement(name = "OTHERFINREL", namespace = "http://temenos.com/CUSTOMER")
            protected String otherfinrel;
            @XmlElement(name = "OTHERFININST", namespace = "http://temenos.com/CUSTOMER")
            protected String otherfininst;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the otherfinrel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOTHERFINREL() {
                return otherfinrel;
            }

            /**
             * Sets the value of the otherfinrel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOTHERFINREL(String value) {
                this.otherfinrel = value;
            }

            /**
             * Gets the value of the otherfininst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOTHERFININST() {
                return otherfininst;
            }

            /**
             * Sets the value of the otherfininst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOTHERFININST(String value) {
                this.otherfininst = value;
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
     *         &lt;element name="OTHERNATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "othernationality"
    })
    public static class GOTHERNATIONALITY {

        @XmlElement(name = "OTHERNATIONALITY", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> othernationality;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the othernationality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the othernationality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOTHERNATIONALITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOTHERNATIONALITY() {
            if (othernationality == null) {
                othernationality = new ArrayList<String>();
            }
            return this.othernationality;
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
     *         &lt;element name="OTHEROFFICER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "otherofficer"
    })
    public static class GOTHEROFFICER {

        @XmlElement(name = "OTHEROFFICER", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> otherofficer;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the otherofficer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherofficer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOTHEROFFICER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOTHEROFFICER() {
            if (otherofficer == null) {
                otherofficer = new ArrayList<String>();
            }
            return this.otherofficer;
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
     *         &lt;element name="OVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "override"
    })
    public static class GOVERRIDE {

        @XmlElement(name = "OVERRIDE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> override;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the override property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the override property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOVERRIDE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOVERRIDE() {
            if (override == null) {
                override = new ArrayList<String>();
            }
            return this.override;
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
     *         &lt;element name="OVERRIDEREASON" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "overridereason"
    })
    public static class GOVERRIDEREASON {

        @XmlElement(name = "OVERRIDEREASON", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> overridereason;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the overridereason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overridereason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOVERRIDEREASON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOVERRIDEREASON() {
            if (overridereason == null) {
                overridereason = new ArrayList<String>();
            }
            return this.overridereason;
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
     *         &lt;element name="mPARTNERS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PARTNERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="XDATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GENDERGR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PARTNERTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mpartners"
    })
    public static class GPARTNERS {

        @XmlElement(name = "mPARTNERS", namespace = "http://temenos.com/CUSTOMER")
        protected List<MPARTNERS> mpartners;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpartners property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpartners property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPARTNERS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MPARTNERS }
         * 
         * 
         */
        public List<MPARTNERS> getMPARTNERS() {
            if (mpartners == null) {
                mpartners = new ArrayList<MPARTNERS>();
            }
            return this.mpartners;
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
         *         &lt;element name="PARTNERS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="XDATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GENDERGR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PARTNERTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "partners",
            "xdateofbirth",
            "gendergr",
            "partnertext"
        })
        public static class MPARTNERS {

            @XmlElement(name = "PARTNERS", namespace = "http://temenos.com/CUSTOMER")
            protected String partners;
            @XmlElement(name = "XDATEOFBIRTH", namespace = "http://temenos.com/CUSTOMER")
            protected String xdateofbirth;
            @XmlElement(name = "GENDERGR", namespace = "http://temenos.com/CUSTOMER")
            protected String gendergr;
            @XmlElement(name = "PARTNERTEXT", namespace = "http://temenos.com/CUSTOMER")
            protected String partnertext;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the partners property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARTNERS() {
                return partners;
            }

            /**
             * Sets the value of the partners property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARTNERS(String value) {
                this.partners = value;
            }

            /**
             * Gets the value of the xdateofbirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDATEOFBIRTH() {
                return xdateofbirth;
            }

            /**
             * Sets the value of the xdateofbirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDATEOFBIRTH(String value) {
                this.xdateofbirth = value;
            }

            /**
             * Gets the value of the gendergr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGENDERGR() {
                return gendergr;
            }

            /**
             * Sets the value of the gendergr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGENDERGR(String value) {
                this.gendergr = value;
            }

            /**
             * Gets the value of the partnertext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPARTNERTEXT() {
                return partnertext;
            }

            /**
             * Sets the value of the partnertext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPARTNERTEXT(String value) {
                this.partnertext = value;
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
     *         &lt;element name="PASTIMES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "pastimes"
    })
    public static class GPASTIMES {

        @XmlElement(name = "PASTIMES", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> pastimes;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the pastimes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pastimes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPASTIMES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPASTIMES() {
            if (pastimes == null) {
                pastimes = new ArrayList<String>();
            }
            return this.pastimes;
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
     *         &lt;element name="mPHONE1" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ADDRLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mphone1"
    })
    public static class GPHONE1 {

        @XmlElement(name = "mPHONE1", namespace = "http://temenos.com/CUSTOMER")
        protected List<MPHONE1> mphone1;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mphone1 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mphone1 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPHONE1().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GPHONE1 .MPHONE1 }
         * 
         * 
         */
        public List<MPHONE1> getMPHONE1() {
            if (mphone1 == null) {
                mphone1 = new ArrayList<MPHONE1>();
            }
            return this.mphone1;
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
         *         &lt;element name="PHONE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SMS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMAIL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ADDRLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "phone1",
            "sms1",
            "email1",
            "addrlocation"
        })
        public static class MPHONE1 {

            @XmlElement(name = "PHONE1", namespace = "http://temenos.com/CUSTOMER")
            protected String phone1;
            @XmlElement(name = "SMS1", namespace = "http://temenos.com/CUSTOMER")
            protected String sms1;
            @XmlElement(name = "EMAIL1", namespace = "http://temenos.com/CUSTOMER")
            protected String email1;
            @XmlElement(name = "ADDRLOCATION", namespace = "http://temenos.com/CUSTOMER")
            protected String addrlocation;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

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
             * Gets the value of the addrlocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDRLOCATION() {
                return addrlocation;
            }

            /**
             * Sets the value of the addrlocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDRLOCATION(String value) {
                this.addrlocation = value;
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
     *         &lt;element name="PLACEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "placeofbirth"
    })
    public static class GPLACEOFBIRTH {

        @XmlElement(name = "PLACEOFBIRTH", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> placeofbirth;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the placeofbirth property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeofbirth property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLACEOFBIRTH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPLACEOFBIRTH() {
            if (placeofbirth == null) {
                placeofbirth = new ArrayList<String>();
            }
            return this.placeofbirth;
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
     *         &lt;element name="PLACEOFDEATH" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "placeofdeath"
    })
    public static class GPLACEOFDEATH {

        @XmlElement(name = "PLACEOFDEATH", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> placeofdeath;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the placeofdeath property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeofdeath property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLACEOFDEATH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPLACEOFDEATH() {
            if (placeofdeath == null) {
                placeofdeath = new ArrayList<String>();
            }
            return this.placeofdeath;
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
     *         &lt;element name="PLACEOFLIVE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "placeoflive"
    })
    public static class GPLACEOFLIVE {

        @XmlElement(name = "PLACEOFLIVE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> placeoflive;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the placeoflive property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placeoflive property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLACEOFLIVE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPLACEOFLIVE() {
            if (placeoflive == null) {
                placeoflive = new ArrayList<String>();
            }
            return this.placeoflive;
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
     *         &lt;element name="mPLACE.STUDY" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PLACESTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DURCOURSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FIELDSTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mplacestudy"
    })
    public static class GPLACESTUDY {

        @XmlElement(name = "mPLACE.STUDY", namespace = "http://temenos.com/CUSTOMER")
        protected List<MPLACESTUDY> mplacestudy;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mplacestudy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mplacestudy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPLACESTUDY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MPLACESTUDY }
         * 
         * 
         */
        public List<MPLACESTUDY> getMPLACESTUDY() {
            if (mplacestudy == null) {
                mplacestudy = new ArrayList<MPLACESTUDY>();
            }
            return this.mplacestudy;
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
         *         &lt;element name="PLACESTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DURCOURSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FIELDSTUDY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "placestudy",
            "durcourse",
            "fieldstudy"
        })
        public static class MPLACESTUDY {

            @XmlElement(name = "PLACESTUDY", namespace = "http://temenos.com/CUSTOMER")
            protected String placestudy;
            @XmlElement(name = "DURCOURSE", namespace = "http://temenos.com/CUSTOMER")
            protected String durcourse;
            @XmlElement(name = "FIELDSTUDY", namespace = "http://temenos.com/CUSTOMER")
            protected String fieldstudy;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the placestudy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPLACESTUDY() {
                return placestudy;
            }

            /**
             * Sets the value of the placestudy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPLACESTUDY(String value) {
                this.placestudy = value;
            }

            /**
             * Gets the value of the durcourse property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDURCOURSE() {
                return durcourse;
            }

            /**
             * Sets the value of the durcourse property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDURCOURSE(String value) {
                this.durcourse = value;
            }

            /**
             * Gets the value of the fieldstudy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIELDSTUDY() {
                return fieldstudy;
            }

            /**
             * Sets the value of the fieldstudy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFIELDSTUDY(String value) {
                this.fieldstudy = value;
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
     *         &lt;element name="POBOXNO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "poboxno"
    })
    public static class GPOBOXNO {

        @XmlElement(name = "POBOXNO", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> poboxno;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the poboxno property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the poboxno property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOBOXNO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOBOXNO() {
            if (poboxno == null) {
                poboxno = new ArrayList<String>();
            }
            return this.poboxno;
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
     *         &lt;element name="POCITYMUNICIP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "pocitymunicip"
    })
    public static class GPOCITYMUNICIP {

        @XmlElement(name = "POCITYMUNICIP", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> pocitymunicip;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the pocitymunicip property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pocitymunicip property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOCITYMUNICIP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOCITYMUNICIP() {
            if (pocitymunicip == null) {
                pocitymunicip = new ArrayList<String>();
            }
            return this.pocitymunicip;
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
     *         &lt;element name="POPROVSTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "poprovstate"
    })
    public static class GPOPROVSTATE {

        @XmlElement(name = "POPROVSTATE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> poprovstate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the poprovstate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the poprovstate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOPROVSTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOPROVSTATE() {
            if (poprovstate == null) {
                poprovstate = new ArrayList<String>();
            }
            return this.poprovstate;
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
     *         &lt;element name="POSITCONNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "positconname"
    })
    public static class GPOSITCONNAME {

        @XmlElement(name = "POSITCONNAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> positconname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the positconname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the positconname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSITCONNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOSITCONNAME() {
            if (positconname == null) {
                positconname = new ArrayList<String>();
            }
            return this.positconname;
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
     *         &lt;element name="POSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "postcode"
    })
    public static class GPOSTCODE {

        @XmlElement(name = "POSTCODE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> postcode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the postcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the postcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSTCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOSTCODE() {
            if (postcode == null) {
                postcode = new ArrayList<String>();
            }
            return this.postcode;
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
     *         &lt;element name="POSTINGRESTRICT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "postingrestrict"
    })
    public static class GPOSTINGRESTRICT {

        @XmlElement(name = "POSTINGRESTRICT", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> postingrestrict;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the postingrestrict property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the postingrestrict property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSTINGRESTRICT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOSTINGRESTRICT() {
            if (postingrestrict == null) {
                postingrestrict = new ArrayList<String>();
            }
            return this.postingrestrict;
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
     *         &lt;element name="POSUBURBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "posuburbtown"
    })
    public static class GPOSUBURBTOWN {

        @XmlElement(name = "POSUBURBTOWN", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> posuburbtown;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the posuburbtown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the posuburbtown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOSUBURBTOWN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOSUBURBTOWN() {
            if (posuburbtown == null) {
                posuburbtown = new ArrayList<String>();
            }
            return this.posuburbtown;
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
     *         &lt;element name="mPREVIOUSNAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PREVIOUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHANGEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHANGEREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mpreviousname"
    })
    public static class GPREVIOUSNAME {

        @XmlElement(name = "mPREVIOUSNAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MPREVIOUSNAME> mpreviousname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mpreviousname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mpreviousname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMPREVIOUSNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MPREVIOUSNAME }
         * 
         * 
         */
        public List<MPREVIOUSNAME> getMPREVIOUSNAME() {
            if (mpreviousname == null) {
                mpreviousname = new ArrayList<MPREVIOUSNAME>();
            }
            return this.mpreviousname;
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
         *         &lt;element name="PREVIOUSNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHANGEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHANGEREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "previousname",
            "changedate",
            "changereason"
        })
        public static class MPREVIOUSNAME {

            @XmlElement(name = "PREVIOUSNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String previousname;
            @XmlElement(name = "CHANGEDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String changedate;
            @XmlElement(name = "CHANGEREASON", namespace = "http://temenos.com/CUSTOMER")
            protected String changereason;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the previousname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPREVIOUSNAME() {
                return previousname;
            }

            /**
             * Sets the value of the previousname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPREVIOUSNAME(String value) {
                this.previousname = value;
            }

            /**
             * Gets the value of the changedate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHANGEDATE() {
                return changedate;
            }

            /**
             * Sets the value of the changedate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHANGEDATE(String value) {
                this.changedate = value;
            }

            /**
             * Gets the value of the changereason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHANGEREASON() {
                return changereason;
            }

            /**
             * Sets the value of the changereason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHANGEREASON(String value) {
                this.changereason = value;
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
     *         &lt;element name="PRODUCTSERVICE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "productservice"
    })
    public static class GPRODUCTSERVICE {

        @XmlElement(name = "PRODUCTSERVICE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> productservice;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the productservice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productservice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRODUCTSERVICE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPRODUCTSERVICE() {
            if (productservice == null) {
                productservice = new ArrayList<String>();
            }
            return this.productservice;
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
     *         &lt;element name="PROVINCESTATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "provincestate"
    })
    public static class GPROVINCESTATE {

        @XmlElement(name = "PROVINCESTATE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> provincestate;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the provincestate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provincestate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPROVINCESTATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPROVINCESTATE() {
            if (provincestate == null) {
                provincestate = new ArrayList<String>();
            }
            return this.provincestate;
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
     *         &lt;element name="PRVPHYADD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "prvphyadd"
    })
    public static class GPRVPHYADD {

        @XmlElement(name = "PRVPHYADD", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> prvphyadd;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the prvphyadd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prvphyadd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRVPHYADD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPRVPHYADD() {
            if (prvphyadd == null) {
                prvphyadd = new ArrayList<String>();
            }
            return this.prvphyadd;
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
     *         &lt;element name="mREFDATAITEM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="REFDATAITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REFDATAVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mrefdataitem"
    })
    public static class GREFDATAITEM {

        @XmlElement(name = "mREFDATAITEM", namespace = "http://temenos.com/CUSTOMER")
        protected List<MREFDATAITEM> mrefdataitem;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mrefdataitem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mrefdataitem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMREFDATAITEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MREFDATAITEM }
         * 
         * 
         */
        public List<MREFDATAITEM> getMREFDATAITEM() {
            if (mrefdataitem == null) {
                mrefdataitem = new ArrayList<MREFDATAITEM>();
            }
            return this.mrefdataitem;
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
         *         &lt;element name="REFDATAITEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REFDATAVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "refdataitem",
            "refdatavalue"
        })
        public static class MREFDATAITEM {

            @XmlElement(name = "REFDATAITEM", namespace = "http://temenos.com/CUSTOMER")
            protected String refdataitem;
            @XmlElement(name = "REFDATAVALUE", namespace = "http://temenos.com/CUSTOMER")
            protected String refdatavalue;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the refdataitem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFDATAITEM() {
                return refdataitem;
            }

            /**
             * Sets the value of the refdataitem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFDATAITEM(String value) {
                this.refdataitem = value;
            }

            /**
             * Gets the value of the refdatavalue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREFDATAVALUE() {
                return refdatavalue;
            }

            /**
             * Sets the value of the refdatavalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREFDATAVALUE(String value) {
                this.refdatavalue = value;
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
     *         &lt;element name="mRELATIONCODE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="REVERSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgRELDELIVOPT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RELDELIVOPT" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="RELDELIVOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ROLEMOREINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ROLENOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RELRESERV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELRESERV5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELRESERV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELRESERV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELRESERV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RELRESERV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mrelationcode"
    })
    public static class GRELATIONCODE {

        @XmlElement(name = "mRELATIONCODE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MRELATIONCODE> mrelationcode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mrelationcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mrelationcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMRELATIONCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MRELATIONCODE }
         * 
         * 
         */
        public List<MRELATIONCODE> getMRELATIONCODE() {
            if (mrelationcode == null) {
                mrelationcode = new ArrayList<MRELATIONCODE>();
            }
            return this.mrelationcode;
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
         *         &lt;element name="RELATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="REVERSRELCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgRELDELIVOPT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RELDELIVOPT" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="RELDELIVOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ROLEMOREINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ROLENOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RELRESERV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELRESERV5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELRESERV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELRESERV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELRESERV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RELRESERV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "relationcode",
            "relcustomer",
            "reversrelcode",
            "sgRELDELIVOPT",
            "relreserv6",
            "relreserv5",
            "relreserv4",
            "relreserv3",
            "relreserv2",
            "relreserv1"
        })
        public static class MRELATIONCODE {

            @XmlElement(name = "RELATIONCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String relationcode;
            @XmlElement(name = "RELCUSTOMER", namespace = "http://temenos.com/CUSTOMER")
            protected String relcustomer;
            @XmlElement(name = "REVERSRELCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String reversrelcode;
            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgRELDELIVOPT sgRELDELIVOPT;
            @XmlElement(name = "RELRESERV6", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv6;
            @XmlElement(name = "RELRESERV5", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv5;
            @XmlElement(name = "RELRESERV4", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv4;
            @XmlElement(name = "RELRESERV3", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv3;
            @XmlElement(name = "RELRESERV2", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv2;
            @XmlElement(name = "RELRESERV1", namespace = "http://temenos.com/CUSTOMER")
            protected String relreserv1;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the relationcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATIONCODE() {
                return relationcode;
            }

            /**
             * Sets the value of the relationcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATIONCODE(String value) {
                this.relationcode = value;
            }

            /**
             * Gets the value of the relcustomer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELCUSTOMER() {
                return relcustomer;
            }

            /**
             * Sets the value of the relcustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELCUSTOMER(String value) {
                this.relcustomer = value;
            }

            /**
             * Gets the value of the reversrelcode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREVERSRELCODE() {
                return reversrelcode;
            }

            /**
             * Sets the value of the reversrelcode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREVERSRELCODE(String value) {
                this.reversrelcode = value;
            }

            /**
             * Gets the value of the sgRELDELIVOPT property.
             * 
             * @return
             *     possible object is
             *     {@link SgRELDELIVOPT }
             *     
             */
            public SgRELDELIVOPT getSgRELDELIVOPT() {
                return sgRELDELIVOPT;
            }

            /**
             * Sets the value of the sgRELDELIVOPT property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgRELDELIVOPT }
             *     
             */
            public void setSgRELDELIVOPT(SgRELDELIVOPT value) {
                this.sgRELDELIVOPT = value;
            }

            /**
             * Gets the value of the relreserv6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV6() {
                return relreserv6;
            }

            /**
             * Sets the value of the relreserv6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV6(String value) {
                this.relreserv6 = value;
            }

            /**
             * Gets the value of the relreserv5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV5() {
                return relreserv5;
            }

            /**
             * Sets the value of the relreserv5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV5(String value) {
                this.relreserv5 = value;
            }

            /**
             * Gets the value of the relreserv4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV4() {
                return relreserv4;
            }

            /**
             * Sets the value of the relreserv4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV4(String value) {
                this.relreserv4 = value;
            }

            /**
             * Gets the value of the relreserv3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV3() {
                return relreserv3;
            }

            /**
             * Sets the value of the relreserv3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV3(String value) {
                this.relreserv3 = value;
            }

            /**
             * Gets the value of the relreserv2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV2() {
                return relreserv2;
            }

            /**
             * Sets the value of the relreserv2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV2(String value) {
                this.relreserv2 = value;
            }

            /**
             * Gets the value of the relreserv1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELRESERV1() {
                return relreserv1;
            }

            /**
             * Sets the value of the relreserv1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELRESERV1(String value) {
                this.relreserv1 = value;
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
             *         &lt;element name="RELDELIVOPT" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="RELDELIVOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ROLEMOREINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ROLENOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reldelivopt"
            })
            public static class SgRELDELIVOPT {

                @XmlElement(name = "RELDELIVOPT", namespace = "http://temenos.com/CUSTOMER")
                protected List<RELDELIVOPT> reldelivopt;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the reldelivopt property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the reldelivopt property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRELDELIVOPT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RELDELIVOPT }
                 * 
                 * 
                 */
                public List<RELDELIVOPT> getRELDELIVOPT() {
                    if (reldelivopt == null) {
                        reldelivopt = new ArrayList<RELDELIVOPT>();
                    }
                    return this.reldelivopt;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="RELDELIVOPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ROLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ROLEMOREINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ROLENOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "reldelivopt",
                    "role",
                    "rolemoreinfo",
                    "rolenotes"
                })
                public static class RELDELIVOPT {

                    @XmlElement(name = "RELDELIVOPT", namespace = "http://temenos.com/CUSTOMER")
                    protected String reldelivopt;
                    @XmlElement(name = "ROLE", namespace = "http://temenos.com/CUSTOMER")
                    protected String role;
                    @XmlElement(name = "ROLEMOREINFO", namespace = "http://temenos.com/CUSTOMER")
                    protected String rolemoreinfo;
                    @XmlElement(name = "ROLENOTES", namespace = "http://temenos.com/CUSTOMER")
                    protected String rolenotes;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the reldelivopt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRELDELIVOPT() {
                        return reldelivopt;
                    }

                    /**
                     * Sets the value of the reldelivopt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRELDELIVOPT(String value) {
                        this.reldelivopt = value;
                    }

                    /**
                     * Gets the value of the role property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getROLE() {
                        return role;
                    }

                    /**
                     * Sets the value of the role property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setROLE(String value) {
                        this.role = value;
                    }

                    /**
                     * Gets the value of the rolemoreinfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getROLEMOREINFO() {
                        return rolemoreinfo;
                    }

                    /**
                     * Sets the value of the rolemoreinfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setROLEMOREINFO(String value) {
                        this.rolemoreinfo = value;
                    }

                    /**
                     * Gets the value of the rolenotes property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getROLENOTES() {
                        return rolenotes;
                    }

                    /**
                     * Sets the value of the rolenotes property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setROLENOTES(String value) {
                        this.rolenotes = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

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
     *         &lt;element name="mRESIDENCESTATUS" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RESIDENCESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RESIDENCETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RESIDENCESINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RESIDENCEVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MORTGAGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mresidencestatus"
    })
    public static class GRESIDENCESTATUS {

        @XmlElement(name = "mRESIDENCESTATUS", namespace = "http://temenos.com/CUSTOMER")
        protected List<MRESIDENCESTATUS> mresidencestatus;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mresidencestatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mresidencestatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMRESIDENCESTATUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MRESIDENCESTATUS }
         * 
         * 
         */
        public List<MRESIDENCESTATUS> getMRESIDENCESTATUS() {
            if (mresidencestatus == null) {
                mresidencestatus = new ArrayList<MRESIDENCESTATUS>();
            }
            return this.mresidencestatus;
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
         *         &lt;element name="RESIDENCESTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RESIDENCETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RESIDENCESINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RESIDENCEVALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MORTGAGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "residencestatus",
            "residencetype",
            "residencesince",
            "residencevalue",
            "mortgageamt"
        })
        public static class MRESIDENCESTATUS {

            @XmlElement(name = "RESIDENCESTATUS", namespace = "http://temenos.com/CUSTOMER")
            protected String residencestatus;
            @XmlElement(name = "RESIDENCETYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String residencetype;
            @XmlElement(name = "RESIDENCESINCE", namespace = "http://temenos.com/CUSTOMER")
            protected String residencesince;
            @XmlElement(name = "RESIDENCEVALUE", namespace = "http://temenos.com/CUSTOMER")
            protected String residencevalue;
            @XmlElement(name = "MORTGAGEAMT", namespace = "http://temenos.com/CUSTOMER")
            protected String mortgageamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the residencestatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENCESTATUS() {
                return residencestatus;
            }

            /**
             * Sets the value of the residencestatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENCESTATUS(String value) {
                this.residencestatus = value;
            }

            /**
             * Gets the value of the residencetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENCETYPE() {
                return residencetype;
            }

            /**
             * Sets the value of the residencetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENCETYPE(String value) {
                this.residencetype = value;
            }

            /**
             * Gets the value of the residencesince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENCESINCE() {
                return residencesince;
            }

            /**
             * Sets the value of the residencesince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENCESINCE(String value) {
                this.residencesince = value;
            }

            /**
             * Gets the value of the residencevalue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRESIDENCEVALUE() {
                return residencevalue;
            }

            /**
             * Sets the value of the residencevalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRESIDENCEVALUE(String value) {
                this.residencevalue = value;
            }

            /**
             * Gets the value of the mortgageamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMORTGAGEAMT() {
                return mortgageamt;
            }

            /**
             * Sets the value of the mortgageamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMORTGAGEAMT(String value) {
                this.mortgageamt = value;
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
     *         &lt;element name="mRISKASSETTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RISKASSETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RISKLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RISKTOLERANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RISKFROMDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mriskassettype"
    })
    public static class GRISKASSETTYPE {

        @XmlElement(name = "mRISKASSETTYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MRISKASSETTYPE> mriskassettype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mriskassettype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mriskassettype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMRISKASSETTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MRISKASSETTYPE }
         * 
         * 
         */
        public List<MRISKASSETTYPE> getMRISKASSETTYPE() {
            if (mriskassettype == null) {
                mriskassettype = new ArrayList<MRISKASSETTYPE>();
            }
            return this.mriskassettype;
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
         *         &lt;element name="RISKASSETTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RISKLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RISKTOLERANCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RISKFROMDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "riskassettype",
            "risklevel",
            "risktolerance",
            "riskfromdate"
        })
        public static class MRISKASSETTYPE {

            @XmlElement(name = "RISKASSETTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String riskassettype;
            @XmlElement(name = "RISKLEVEL", namespace = "http://temenos.com/CUSTOMER")
            protected String risklevel;
            @XmlElement(name = "RISKTOLERANCE", namespace = "http://temenos.com/CUSTOMER")
            protected String risktolerance;
            @XmlElement(name = "RISKFROMDATE", namespace = "http://temenos.com/CUSTOMER")
            protected String riskfromdate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the riskassettype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRISKASSETTYPE() {
                return riskassettype;
            }

            /**
             * Sets the value of the riskassettype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRISKASSETTYPE(String value) {
                this.riskassettype = value;
            }

            /**
             * Gets the value of the risklevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRISKLEVEL() {
                return risklevel;
            }

            /**
             * Sets the value of the risklevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRISKLEVEL(String value) {
                this.risklevel = value;
            }

            /**
             * Gets the value of the risktolerance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRISKTOLERANCE() {
                return risktolerance;
            }

            /**
             * Sets the value of the risktolerance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRISKTOLERANCE(String value) {
                this.risktolerance = value;
            }

            /**
             * Gets the value of the riskfromdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRISKFROMDATE() {
                return riskfromdate;
            }

            /**
             * Sets the value of the riskfromdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRISKFROMDATE(String value) {
                this.riskfromdate = value;
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
     *         &lt;element name="SECONDINCOME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "secondincome"
    })
    public static class GSECONDINCOME {

        @XmlElement(name = "SECONDINCOME", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> secondincome;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the secondincome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondincome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSECONDINCOME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSECONDINCOME() {
            if (secondincome == null) {
                secondincome = new ArrayList<String>();
            }
            return this.secondincome;
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
     *         &lt;element name="SHORTNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "shortname"
    })
    public static class GSHORTNAME {

        @XmlElement(name = "SHORTNAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> shortname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the shortname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shortname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSHORTNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSHORTNAME() {
            if (shortname == null) {
                shortname = new ArrayList<String>();
            }
            return this.shortname;
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
     *         &lt;element name="mSIGNATORY.CODE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SIGNATORYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIGNATORYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIGNTPPRTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIGNTPPRTEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIGNTTELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "msignatorycode"
    })
    public static class GSIGNATORYCODE {

        @XmlElement(name = "mSIGNATORY.CODE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MSIGNATORYCODE> msignatorycode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msignatorycode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msignatorycode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSIGNATORYCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MSIGNATORYCODE }
         * 
         * 
         */
        public List<MSIGNATORYCODE> getMSIGNATORYCODE() {
            if (msignatorycode == null) {
                msignatorycode = new ArrayList<MSIGNATORYCODE>();
            }
            return this.msignatorycode;
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
         *         &lt;element name="SIGNATORYCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIGNATORYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIGNTPPRTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIGNTPPRTEXP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIGNTTELNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "signatorycode",
            "signatoryid",
            "signtpprtno",
            "signtpprtexp",
            "signttelno"
        })
        public static class MSIGNATORYCODE {

            @XmlElement(name = "SIGNATORYCODE", namespace = "http://temenos.com/CUSTOMER")
            protected String signatorycode;
            @XmlElement(name = "SIGNATORYID", namespace = "http://temenos.com/CUSTOMER")
            protected String signatoryid;
            @XmlElement(name = "SIGNTPPRTNO", namespace = "http://temenos.com/CUSTOMER")
            protected String signtpprtno;
            @XmlElement(name = "SIGNTPPRTEXP", namespace = "http://temenos.com/CUSTOMER")
            protected String signtpprtexp;
            @XmlElement(name = "SIGNTTELNO", namespace = "http://temenos.com/CUSTOMER")
            protected String signttelno;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the signatorycode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNATORYCODE() {
                return signatorycode;
            }

            /**
             * Sets the value of the signatorycode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNATORYCODE(String value) {
                this.signatorycode = value;
            }

            /**
             * Gets the value of the signatoryid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNATORYID() {
                return signatoryid;
            }

            /**
             * Sets the value of the signatoryid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNATORYID(String value) {
                this.signatoryid = value;
            }

            /**
             * Gets the value of the signtpprtno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNTPPRTNO() {
                return signtpprtno;
            }

            /**
             * Sets the value of the signtpprtno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNTPPRTNO(String value) {
                this.signtpprtno = value;
            }

            /**
             * Gets the value of the signtpprtexp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNTPPRTEXP() {
                return signtpprtexp;
            }

            /**
             * Sets the value of the signtpprtexp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNTPPRTEXP(String value) {
                this.signtpprtexp = value;
            }

            /**
             * Gets the value of the signttelno property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNTTELNO() {
                return signttelno;
            }

            /**
             * Sets the value of the signttelno property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNTTELNO(String value) {
                this.signttelno = value;
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
     *         &lt;element name="mSIGN.NAME" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SIGNNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SIGNIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TYPEIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "msignname"
    })
    public static class GSIGNNAME {

        @XmlElement(name = "mSIGN.NAME", namespace = "http://temenos.com/CUSTOMER")
        protected List<MSIGNNAME> msignname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msignname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msignname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSIGNNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MSIGNNAME }
         * 
         * 
         */
        public List<MSIGNNAME> getMSIGNNAME() {
            if (msignname == null) {
                msignname = new ArrayList<MSIGNNAME>();
            }
            return this.msignname;
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
         *         &lt;element name="SIGNNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SIGNIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TYPEIDPASSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEEXPIRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "signname",
            "signidpassp",
            "typeidpassp",
            "dateexpiry"
        })
        public static class MSIGNNAME {

            @XmlElement(name = "SIGNNAME", namespace = "http://temenos.com/CUSTOMER")
            protected String signname;
            @XmlElement(name = "SIGNIDPASSP", namespace = "http://temenos.com/CUSTOMER")
            protected String signidpassp;
            @XmlElement(name = "TYPEIDPASSP", namespace = "http://temenos.com/CUSTOMER")
            protected String typeidpassp;
            @XmlElement(name = "DATEEXPIRY", namespace = "http://temenos.com/CUSTOMER")
            protected String dateexpiry;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the signname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNNAME() {
                return signname;
            }

            /**
             * Sets the value of the signname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNNAME(String value) {
                this.signname = value;
            }

            /**
             * Gets the value of the signidpassp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSIGNIDPASSP() {
                return signidpassp;
            }

            /**
             * Sets the value of the signidpassp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSIGNIDPASSP(String value) {
                this.signidpassp = value;
            }

            /**
             * Gets the value of the typeidpassp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEIDPASSP() {
                return typeidpassp;
            }

            /**
             * Sets the value of the typeidpassp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEIDPASSP(String value) {
                this.typeidpassp = value;
            }

            /**
             * Gets the value of the dateexpiry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEEXPIRY() {
                return dateexpiry;
            }

            /**
             * Sets the value of the dateexpiry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEEXPIRY(String value) {
                this.dateexpiry = value;
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
     *         &lt;element name="SOCIALNTWIDS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "socialntwids"
    })
    public static class GSOCIALNTWIDS {

        @XmlElement(name = "SOCIALNTWIDS", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> socialntwids;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the socialntwids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socialntwids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSOCIALNTWIDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSOCIALNTWIDS() {
            if (socialntwids == null) {
                socialntwids = new ArrayList<String>();
            }
            return this.socialntwids;
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
     *         &lt;element name="SPEMPADD" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "spempadd"
    })
    public static class GSPEMPADD {

        @XmlElement(name = "SPEMPADD", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> spempadd;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the spempadd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spempadd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSPEMPADD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSPEMPADD() {
            if (spempadd == null) {
                spempadd = new ArrayList<String>();
            }
            return this.spempadd;
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
     *         &lt;element name="SPOKENLANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "spokenlanguage"
    })
    public static class GSPOKENLANGUAGE {

        @XmlElement(name = "SPOKENLANGUAGE", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> spokenlanguage;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the spokenlanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spokenlanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSPOKENLANGUAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSPOKENLANGUAGE() {
            if (spokenlanguage == null) {
                spokenlanguage = new ArrayList<String>();
            }
            return this.spokenlanguage;
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
     *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "street"
    })
    public static class GSTREET {

        @XmlElement(name = "STREET", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> street;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the street property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the street property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTREET().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSTREET() {
            if (street == null) {
                street = new ArrayList<String>();
            }
            return this.street;
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
     *         &lt;element name="SUBURBTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "suburbtown"
    })
    public static class GSUBURBTOWN {

        @XmlElement(name = "SUBURBTOWN", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> suburbtown;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the suburbtown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suburbtown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSUBURBTOWN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSUBURBTOWN() {
            if (suburbtown == null) {
                suburbtown = new ArrayList<String>();
            }
            return this.suburbtown;
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
     *         &lt;element name="TAXID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "taxid"
    })
    public static class GTAXID {

        @XmlElement(name = "TAXID", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> taxid;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the taxid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTAXID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTAXID() {
            if (taxid == null) {
                taxid = new ArrayList<String>();
            }
            return this.taxid;
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
     *         &lt;element name="TEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "text"
    })
    public static class GTEXT {

        @XmlElement(name = "TEXT", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> text;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTEXT() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
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
     *         &lt;element name="TOWNCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "towncountry"
    })
    public static class GTOWNCOUNTRY {

        @XmlElement(name = "TOWNCOUNTRY", namespace = "http://temenos.com/CUSTOMER")
        protected List<String> towncountry;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the towncountry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the towncountry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTOWNCOUNTRY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTOWNCOUNTRY() {
            if (towncountry == null) {
                towncountry = new ArrayList<String>();
            }
            return this.towncountry;
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
     *         &lt;element name="mVISTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgVISCOMMENT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="VISCOMMENT" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="VISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="sgVISINTERNALREVIE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="VISINTERNALREVIEW" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="VISINTERNALREVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "mvistype"
    })
    public static class GVISTYPE {

        @XmlElement(name = "mVISTYPE", namespace = "http://temenos.com/CUSTOMER")
        protected List<MVISTYPE> mvistype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mvistype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mvistype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMVISTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MVISTYPE }
         * 
         * 
         */
        public List<MVISTYPE> getMVISTYPE() {
            if (mvistype == null) {
                mvistype = new ArrayList<MVISTYPE>();
            }
            return this.mvistype;
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
         *         &lt;element name="VISTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgVISCOMMENT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="VISCOMMENT" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="VISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="sgVISINTERNALREVIE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="VISINTERNALREVIEW" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="VISINTERNALREVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "vistype",
            "sgVISCOMMENT",
            "sgVISINTERNALREVIE"
        })
        public static class MVISTYPE {

            @XmlElement(name = "VISTYPE", namespace = "http://temenos.com/CUSTOMER")
            protected String vistype;
            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgVISCOMMENT sgVISCOMMENT;
            @XmlElement(namespace = "http://temenos.com/CUSTOMER")
            protected SgVISINTERNALREVIE sgVISINTERNALREVIE;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the vistype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVISTYPE() {
                return vistype;
            }

            /**
             * Sets the value of the vistype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVISTYPE(String value) {
                this.vistype = value;
            }

            /**
             * Gets the value of the sgVISCOMMENT property.
             * 
             * @return
             *     possible object is
             *     {@link SgVISCOMMENT }
             *     
             */
            public SgVISCOMMENT getSgVISCOMMENT() {
                return sgVISCOMMENT;
            }

            /**
             * Sets the value of the sgVISCOMMENT property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgVISCOMMENT }
             *     
             */
            public void setSgVISCOMMENT(SgVISCOMMENT value) {
                this.sgVISCOMMENT = value;
            }

            /**
             * Gets the value of the sgVISINTERNALREVIE property.
             * 
             * @return
             *     possible object is
             *     {@link SgVISINTERNALREVIE }
             *     
             */
            public SgVISINTERNALREVIE getSgVISINTERNALREVIE() {
                return sgVISINTERNALREVIE;
            }

            /**
             * Sets the value of the sgVISINTERNALREVIE property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgVISINTERNALREVIE }
             *     
             */
            public void setSgVISINTERNALREVIE(SgVISINTERNALREVIE value) {
                this.sgVISINTERNALREVIE = value;
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
             *         &lt;element name="VISCOMMENT" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="VISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "viscomment"
            })
            public static class SgVISCOMMENT {

                @XmlElement(name = "VISCOMMENT", namespace = "http://temenos.com/CUSTOMER")
                protected List<VISCOMMENT> viscomment;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the viscomment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the viscomment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVISCOMMENT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VISCOMMENT }
                 * 
                 * 
                 */
                public List<VISCOMMENT> getVISCOMMENT() {
                    if (viscomment == null) {
                        viscomment = new ArrayList<VISCOMMENT>();
                    }
                    return this.viscomment;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="VISCOMMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "viscomment"
                })
                public static class VISCOMMENT {

                    @XmlElement(name = "VISCOMMENT", namespace = "http://temenos.com/CUSTOMER")
                    protected String viscomment;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the viscomment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVISCOMMENT() {
                        return viscomment;
                    }

                    /**
                     * Sets the value of the viscomment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVISCOMMENT(String value) {
                        this.viscomment = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

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
             *         &lt;element name="VISINTERNALREVIEW" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="VISINTERNALREVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="sg" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "visinternalreview"
            })
            public static class SgVISINTERNALREVIE {

                @XmlElement(name = "VISINTERNALREVIEW", namespace = "http://temenos.com/CUSTOMER")
                protected List<VISINTERNALREVIEW> visinternalreview;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the visinternalreview property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the visinternalreview property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVISINTERNALREVIEW().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VISINTERNALREVIEW }
                 * 
                 * 
                 */
                public List<VISINTERNALREVIEW> getVISINTERNALREVIEW() {
                    if (visinternalreview == null) {
                        visinternalreview = new ArrayList<VISINTERNALREVIEW>();
                    }
                    return this.visinternalreview;
                }

                /**
                 * Gets the value of the sg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSg() {
                    return sg;
                }

                /**
                 * Sets the value of the sg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSg(BigInteger value) {
                    this.sg = value;
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
                 *         &lt;element name="VISINTERNALREVIEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="s" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "visinternalreview"
                })
                public static class VISINTERNALREVIEW {

                    @XmlElement(name = "VISINTERNALREVIEW", namespace = "http://temenos.com/CUSTOMER")
                    protected String visinternalreview;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the visinternalreview property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVISINTERNALREVIEW() {
                        return visinternalreview;
                    }

                    /**
                     * Sets the value of the visinternalreview property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVISINTERNALREVIEW(String value) {
                        this.visinternalreview = value;
                    }

                    /**
                     * Gets the value of the s property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getS() {
                        return s;
                    }

                    /**
                     * Sets the value of the s property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setS(BigInteger value) {
                        this.s = value;
                    }

                }

            }

        }

    }

}
