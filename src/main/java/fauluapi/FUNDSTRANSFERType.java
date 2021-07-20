
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
 * <p>Java class for FUNDSTRANSFERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FUNDSTRANSFERType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANSACTIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDEBITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCYMKTDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITVALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDEBITVDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITTHEIRREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITTHEIRREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCYMKTCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITCURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITVALUEDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TREASURYRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEGDEALERREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROCESSINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gORDERINGCUST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ORDERINGCUST" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINORDERINGCUS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INORDERINGCUS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gORDERINGBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ORDERINGBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINORDERINGBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INORDERINGBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gACCTWITHBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCTWITHBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gACCTWITHBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCTWITHBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BENACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INBENACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBENCUSTOMER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BENCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINBENCUSTOMER" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBENCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gBENBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BENBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINBENBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBENBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CHEQUENUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gINPAYDETAILS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INPAYDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BCBANKSORTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVERBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gRECCORRBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RECCORRBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINTERMEDBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INTERMEDBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gININTMEDBANK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ININTMEDBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MAILING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENOURCHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INBENOURCHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGESACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGECOMDISPLAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMMISSIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCOMMISSIONTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="COMMISSIONFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="CHARGECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCHARGETYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mCHARGETYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CHARGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CHARGEFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="CUSTOMERSPREAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASECURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROFITCENTRECUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROFITCENTREDEPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RETURNTODEPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIORITYTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBKTOBKINFO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BKTOBKINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINBKTOBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBKTOBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXPOSUREDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FEDFUNDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOOFBATCHITEMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gFREETEXTMSGTO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FREETEXTMSGTO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gMESSAGE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gTAXTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mTAXTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TAXTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TAXAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="AMOUNTDEBITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMOUNTCREDITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTALCHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTALTAXAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTOMERRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINRECCORRBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INRECCORRBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INWARDPAYTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINSENDCORRBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSENDCORRBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TELEXFROMCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERYINREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gDELIVERYOUTREF" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DELIVERYOUTREF" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CREDITCOMPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITCOMPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELIVERYMKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDCUSTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCTWITHBKACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCAMTDEBITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCAMTCREDITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCTOTTAXAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCALCHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCPOSCHGSAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MKTGEXCHPROFIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATEINPUTMKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUSTGROUPLEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEBITCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREDITCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDPAYMENTYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRADVICEREQDYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRADVICEREQDYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEALMARKET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARGEDCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINREASONOVE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INREASONOVE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DEALERDESK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECALCFWDRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RETURNCHEQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWNACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNTINGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINSTRCTNCODE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSTRCTNCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="COLLREMBK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPECTEDRECSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTRECCOMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTRECCOMMLCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTRECCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTRECCHGLCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHEQTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gRELATEDMSG" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mRELATEDMSG" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RELATEDMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgTIMEIND" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TIMEIND" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gINTIMEIND" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INTIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gSENDTOPARTY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mSENDTOPARTY" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SENDTOPARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sgBKTOBKOUT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BKTOBKOUT" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BKTOBKOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="MESSAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="REVERSALMKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELATEDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gININSTRCODE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ININSTRCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINPROCESSERR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INPROCESSERR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINSWIFTMSG" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSWIFTMSG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ACCTWITHBANKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INACCTBANKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECCORRBANKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INRECCORRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERMEDBANKACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ININTERMEDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSTRUCTEDAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gININTERMEDBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ININTERMEDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INEXCHRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RATEFIXING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COVERMETHOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gIN3RDREIMBBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IN3RDREIMBBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IN3RDREIMBACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MT103TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXTENDFORMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gEXTENDINFO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EXTENDINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RATEFIXINGIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INWSENDBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINSENDCHG" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INSENDCHG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INRECCHG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCHGREQID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTRECCHGCRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTSNDCHGCRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHGADVICEMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPECTEDCOVERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NETTINGSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTHDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BKOPERATIONCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMINFLOWRATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PARENTTXNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ROUNDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BENEFICIARYID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gMSGTYPE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mMSGTYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MSGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="gSIGNATORY" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SIGNATORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CARDNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gCARDTXNDETAIL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CARDTXNDETAIL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINCORDBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INCORDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINCINTMEDBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INCINTMEDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINCACCWITBK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INCACCWITBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINCBKTBKIN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INCBKTBKIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TFSREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHEQUEDRAWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISSUECHEQUETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOCKNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYEENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOCKREGISTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERIESID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORDCUSTACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INORDCUSTACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANDEBIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANCREDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANBEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANACCTWITHBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANRECCORRBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANINTERMEDBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANORDCUSTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBANCHARGESACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BICIBANBEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBICIBANBENNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BICIBANBENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BICIBANBENCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBENNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gBENADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BENADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BENCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gBENTOWN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BENTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINBENNAME" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gINBENADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBENADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="INBENCOUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gINBENTOWN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="INBENTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="gLOCEQUIVCHGS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOCEQUIVCHGS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gFOREQUIVCHGS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FOREQUIVCHGS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RESERVED6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESERVED1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gSTMTNOS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STMTNOS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="INSPOSCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRVACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFRTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WHLTTAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMMEDIATELY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FUTUREDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYTO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCTWORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="MEMBERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRVDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRDINSREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATEDEPART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DATERETURN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WINTERSPORTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="POLNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="AMTARREARS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRFULLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRWORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRFULLNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRWORKBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REPAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTREPAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERESTDUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONSDISCLOSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWACCTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWBRCHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMFTBITEMID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECOVERYACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATUNIQUEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALAFTTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATAUTHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ATTERMINALID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BINNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRACCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COVERAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHEQUEBOUNCED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FTVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFYAINSCOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXDUT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXCISEDUTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHQACCTDBCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODORGLIMAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERFILEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFYAPREMIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTHBNQACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWCHQNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DRAWCUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITORNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITERCONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITIDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSITIDNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TYPEPAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SMSREFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMENTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MPESAREFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AADEPOSITID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FKLCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BALAFTTXN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INPUTVERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AALOANID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOSAAID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FKLINPUTTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FKLAUTHORISER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FKLUPLOADFILE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FKLREPAYAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FUNDSTRANSFERType", namespace = "http://temenos.com/FUNDSTRANSFER", propOrder = {
    "transactiontype",
    "debitacctno",
    "indebitacctno",
    "currencymktdr",
    "debitcurrency",
    "debitamount",
    "debitvaluedate",
    "indebitvdate",
    "debittheirref",
    "credittheirref",
    "creditacctno",
    "currencymktcr",
    "creditcurrency",
    "creditamount",
    "creditvaluedate",
    "treasuryrate",
    "negdealerrefno",
    "processingdate",
    "gorderingcust",
    "ginorderingcus",
    "gorderingbank",
    "ginorderingbk",
    "gacctwithbank",
    "gacctwithbk",
    "benacctno",
    "inbenacctno",
    "gbencustomer",
    "ginbencustomer",
    "gbenbank",
    "ginbenbank",
    "chequenumber",
    "gpaymentdetails",
    "ginpaydetails",
    "bcbanksortcode",
    "receiverbank",
    "greccorrbank",
    "gintermedbank",
    "ginintmedbank",
    "mailing",
    "paymethod",
    "benourcharges",
    "inbenourcharges",
    "chargesacctno",
    "chargecomdisplay",
    "commissioncode",
    "gcommissiontype",
    "chargecode",
    "gchargetype",
    "customerspread",
    "basecurrency",
    "profitcentrecust",
    "profitcentredept",
    "returntodept",
    "prioritytxn",
    "gbktobkinfo",
    "ginbktobk",
    "exposuredate",
    "fedfunds",
    "positiontype",
    "noofbatchitems",
    "gfreetextmsgto",
    "gmessage",
    "gtaxtype",
    "amountdebited",
    "amountcredited",
    "totalchargeamt",
    "totaltaxamount",
    "customerrate",
    "ginreccorrbk",
    "inwardpaytype",
    "ginsendcorrbk",
    "telexfromcust",
    "deliveryinref",
    "gdeliveryoutref",
    "creditcompcode",
    "debitcompcode",
    "status",
    "deliverymkr",
    "ordcustcode",
    "acctwithbkacno",
    "locamtdebited",
    "locamtcredited",
    "loctottaxamt",
    "localchargeamt",
    "locposchgsamt",
    "mktgexchprofit",
    "rateinputmkr",
    "custgrouplevel",
    "debitcustomer",
    "creditcustomer",
    "sendpaymentyn",
    "dradvicereqdyn",
    "cradvicereqdyn",
    "dealmarket",
    "chargedcustomer",
    "ginreasonove",
    "dealerdesk",
    "recalcfwdrate",
    "returncheque",
    "drawnaccount",
    "accountingdate",
    "ginstrctncode",
    "collrembk",
    "expectedrecsid",
    "totreccomm",
    "totreccommlcl",
    "totrecchg",
    "totrecchglcl",
    "cheqtype",
    "grelatedmsg",
    "gintimeind",
    "gsendtoparty",
    "reversalmkr",
    "relatedref",
    "gininstrcode",
    "ginprocesserr",
    "ginswiftmsg",
    "acctwithbankacc",
    "inacctbankacc",
    "reccorrbankacc",
    "inreccorracc",
    "intermedbankacc",
    "inintermedacc",
    "instructedamt",
    "ginintermedbk",
    "inexchrate",
    "ratefixing",
    "covermethod",
    "gin3RDREIMBBK",
    "in3RDREIMBACC",
    "mt103TYPE",
    "extendformat",
    "gextendinfo",
    "ratefixingind",
    "inwsendbic",
    "ginsendchg",
    "inrecchg",
    "acchgreqid",
    "totrecchgcrccy",
    "totsndchgcrccy",
    "chgadvicemsg",
    "expectedcoverid",
    "nettingstatus",
    "authdate",
    "bkoperationcode",
    "aminflowrate",
    "parenttxnid",
    "roundtype",
    "beneficiaryid",
    "gmsgtype",
    "gsignatory",
    "cardnumber",
    "gcardtxndetail",
    "gincordbk",
    "gincintmedbk",
    "gincaccwitbk",
    "gincbktbkin",
    "tfsreference",
    "chequedrawn",
    "issuechequetype",
    "stocknumber",
    "payeename",
    "stockregister",
    "seriesid",
    "ordcustacct",
    "inordcustacct",
    "ibandebit",
    "ibancredit",
    "ibanben",
    "ibanacctwithbank",
    "ibanreccorrbank",
    "ibanintermedbank",
    "ibanordcustacc",
    "ibanchargesacct",
    "bicibanben",
    "gbicibanbenname",
    "bicibanbencity",
    "gbenname",
    "gbenaddress",
    "bencountry",
    "gbentown",
    "ginbenname",
    "ginbenaddress",
    "inbencountry",
    "ginbentown",
    "grefdataitem",
    "glocequivchgs",
    "gforequivchgs",
    "reserved6",
    "reserved5",
    "reserved4",
    "reserved3",
    "reserved2",
    "reserved1",
    "gstmtnos",
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
    "insposcode",
    "prvacctype",
    "offrtype",
    "whlttax",
    "immediately",
    "futuredate",
    "payto",
    "acctworkbal",
    "ginsmemno",
    "amtarrears",
    "drfullname",
    "drworkbal",
    "crfullname",
    "crworkbal",
    "repayment",
    "intrepayment",
    "interestdue",
    "consdisclose",
    "accttype",
    "drawacctno",
    "drawbrchcode",
    "emftbitemid",
    "recoveryacct",
    "groupid",
    "productcode",
    "atuniqueid",
    "balafttxn",
    "atauthcode",
    "atterminalid",
    "binno",
    "draccttype",
    "craccttype",
    "coveramount",
    "chequebounced",
    "ftversion",
    "afyainscom",
    "exdut1",
    "exciseduty",
    "chqacctdbcr",
    "odorglimamt",
    "odamount",
    "odexpirydate",
    "interfileid",
    "afyapremium",
    "othbnqacct",
    "filename",
    "drawchqno",
    "drawcustname",
    "depositorname",
    "depositercont",
    "depositiddesc",
    "depositidnum",
    "typepayment",
    "smsrefid",
    "paymenttype",
    "mpesareference",
    "aadepositid",
    "fklcustomer",
    "balafttxn1",
    "losid",
    "inputversion",
    "aaloanid",
    "losaaid",
    "fklinputter",
    "fklauthoriser",
    "fkluploadfile",
    "fklrepayamt"
})
public class FUNDSTRANSFERType {

    @XmlElement(name = "TRANSACTIONTYPE")
    protected String transactiontype;
    @XmlElement(name = "DEBITACCTNO")
    protected String debitacctno;
    @XmlElement(name = "INDEBITACCTNO")
    protected String indebitacctno;
    @XmlElement(name = "CURRENCYMKTDR")
    protected String currencymktdr;
    @XmlElement(name = "DEBITCURRENCY")
    protected String debitcurrency;
    @XmlElement(name = "DEBITAMOUNT")
    protected String debitamount;
    @XmlElement(name = "DEBITVALUEDATE")
    protected String debitvaluedate;
    @XmlElement(name = "INDEBITVDATE")
    protected String indebitvdate;
    @XmlElement(name = "DEBITTHEIRREF")
    protected String debittheirref;
    @XmlElement(name = "CREDITTHEIRREF")
    protected String credittheirref;
    @XmlElement(name = "CREDITACCTNO")
    protected String creditacctno;
    @XmlElement(name = "CURRENCYMKTCR")
    protected String currencymktcr;
    @XmlElement(name = "CREDITCURRENCY")
    protected String creditcurrency;
    @XmlElement(name = "CREDITAMOUNT")
    protected String creditamount;
    @XmlElement(name = "CREDITVALUEDATE")
    protected String creditvaluedate;
    @XmlElement(name = "TREASURYRATE")
    protected String treasuryrate;
    @XmlElement(name = "NEGDEALERREFNO")
    protected String negdealerrefno;
    @XmlElement(name = "PROCESSINGDATE")
    protected String processingdate;
    @XmlElement(name = "gORDERINGCUST")
    protected GORDERINGCUST gorderingcust;
    @XmlElement(name = "gINORDERINGCUS")
    protected GINORDERINGCUS ginorderingcus;
    @XmlElement(name = "gORDERINGBANK")
    protected GORDERINGBANK gorderingbank;
    @XmlElement(name = "gINORDERINGBK")
    protected GINORDERINGBK ginorderingbk;
    @XmlElement(name = "gACCTWITHBANK")
    protected GACCTWITHBANK gacctwithbank;
    @XmlElement(name = "gACCTWITHBK")
    protected GACCTWITHBK gacctwithbk;
    @XmlElement(name = "BENACCTNO")
    protected String benacctno;
    @XmlElement(name = "INBENACCTNO")
    protected String inbenacctno;
    @XmlElement(name = "gBENCUSTOMER")
    protected GBENCUSTOMER gbencustomer;
    @XmlElement(name = "gINBENCUSTOMER")
    protected GINBENCUSTOMER ginbencustomer;
    @XmlElement(name = "gBENBANK")
    protected GBENBANK gbenbank;
    @XmlElement(name = "gINBENBANK")
    protected GINBENBANK ginbenbank;
    @XmlElement(name = "CHEQUENUMBER")
    protected String chequenumber;
    @XmlElement(name = "gPAYMENTDETAILS")
    protected GPAYMENTDETAILS gpaymentdetails;
    @XmlElement(name = "gINPAYDETAILS")
    protected GINPAYDETAILS ginpaydetails;
    @XmlElement(name = "BCBANKSORTCODE")
    protected String bcbanksortcode;
    @XmlElement(name = "RECEIVERBANK")
    protected String receiverbank;
    @XmlElement(name = "gRECCORRBANK")
    protected GRECCORRBANK greccorrbank;
    @XmlElement(name = "gINTERMEDBANK")
    protected GINTERMEDBANK gintermedbank;
    @XmlElement(name = "gININTMEDBANK")
    protected GININTMEDBANK ginintmedbank;
    @XmlElement(name = "MAILING")
    protected String mailing;
    @XmlElement(name = "PAYMETHOD")
    protected String paymethod;
    @XmlElement(name = "BENOURCHARGES")
    protected String benourcharges;
    @XmlElement(name = "INBENOURCHARGES")
    protected String inbenourcharges;
    @XmlElement(name = "CHARGESACCTNO")
    protected String chargesacctno;
    @XmlElement(name = "CHARGECOMDISPLAY")
    protected String chargecomdisplay;
    @XmlElement(name = "COMMISSIONCODE")
    protected String commissioncode;
    @XmlElement(name = "gCOMMISSIONTYPE")
    protected GCOMMISSIONTYPE gcommissiontype;
    @XmlElement(name = "CHARGECODE")
    protected String chargecode;
    @XmlElement(name = "gCHARGETYPE")
    protected GCHARGETYPE gchargetype;
    @XmlElement(name = "CUSTOMERSPREAD")
    protected String customerspread;
    @XmlElement(name = "BASECURRENCY")
    protected String basecurrency;
    @XmlElement(name = "PROFITCENTRECUST")
    protected String profitcentrecust;
    @XmlElement(name = "PROFITCENTREDEPT")
    protected String profitcentredept;
    @XmlElement(name = "RETURNTODEPT")
    protected String returntodept;
    @XmlElement(name = "PRIORITYTXN")
    protected String prioritytxn;
    @XmlElement(name = "gBKTOBKINFO")
    protected GBKTOBKINFO gbktobkinfo;
    @XmlElement(name = "gINBKTOBK")
    protected GINBKTOBK ginbktobk;
    @XmlElement(name = "EXPOSUREDATE")
    protected String exposuredate;
    @XmlElement(name = "FEDFUNDS")
    protected String fedfunds;
    @XmlElement(name = "POSITIONTYPE")
    protected String positiontype;
    @XmlElement(name = "NOOFBATCHITEMS")
    protected String noofbatchitems;
    @XmlElement(name = "gFREETEXTMSGTO")
    protected GFREETEXTMSGTO gfreetextmsgto;
    @XmlElement(name = "gMESSAGE")
    protected GMESSAGE gmessage;
    @XmlElement(name = "gTAXTYPE")
    protected GTAXTYPE gtaxtype;
    @XmlElement(name = "AMOUNTDEBITED")
    protected String amountdebited;
    @XmlElement(name = "AMOUNTCREDITED")
    protected String amountcredited;
    @XmlElement(name = "TOTALCHARGEAMT")
    protected String totalchargeamt;
    @XmlElement(name = "TOTALTAXAMOUNT")
    protected String totaltaxamount;
    @XmlElement(name = "CUSTOMERRATE")
    protected String customerrate;
    @XmlElement(name = "gINRECCORRBK")
    protected GINRECCORRBK ginreccorrbk;
    @XmlElement(name = "INWARDPAYTYPE")
    protected String inwardpaytype;
    @XmlElement(name = "gINSENDCORRBK")
    protected GINSENDCORRBK ginsendcorrbk;
    @XmlElement(name = "TELEXFROMCUST")
    protected String telexfromcust;
    @XmlElement(name = "DELIVERYINREF")
    protected String deliveryinref;
    @XmlElement(name = "gDELIVERYOUTREF")
    protected GDELIVERYOUTREF gdeliveryoutref;
    @XmlElement(name = "CREDITCOMPCODE")
    protected String creditcompcode;
    @XmlElement(name = "DEBITCOMPCODE")
    protected String debitcompcode;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "DELIVERYMKR")
    protected String deliverymkr;
    @XmlElement(name = "ORDCUSTCODE")
    protected String ordcustcode;
    @XmlElement(name = "ACCTWITHBKACNO")
    protected String acctwithbkacno;
    @XmlElement(name = "LOCAMTDEBITED")
    protected String locamtdebited;
    @XmlElement(name = "LOCAMTCREDITED")
    protected String locamtcredited;
    @XmlElement(name = "LOCTOTTAXAMT")
    protected String loctottaxamt;
    @XmlElement(name = "LOCALCHARGEAMT")
    protected String localchargeamt;
    @XmlElement(name = "LOCPOSCHGSAMT")
    protected String locposchgsamt;
    @XmlElement(name = "MKTGEXCHPROFIT")
    protected String mktgexchprofit;
    @XmlElement(name = "RATEINPUTMKR")
    protected String rateinputmkr;
    @XmlElement(name = "CUSTGROUPLEVEL")
    protected String custgrouplevel;
    @XmlElement(name = "DEBITCUSTOMER")
    protected String debitcustomer;
    @XmlElement(name = "CREDITCUSTOMER")
    protected String creditcustomer;
    @XmlElement(name = "SENDPAYMENTYN")
    protected String sendpaymentyn;
    @XmlElement(name = "DRADVICEREQDYN")
    protected String dradvicereqdyn;
    @XmlElement(name = "CRADVICEREQDYN")
    protected String cradvicereqdyn;
    @XmlElement(name = "DEALMARKET")
    protected String dealmarket;
    @XmlElement(name = "CHARGEDCUSTOMER")
    protected String chargedcustomer;
    @XmlElement(name = "gINREASONOVE")
    protected GINREASONOVE ginreasonove;
    @XmlElement(name = "DEALERDESK")
    protected String dealerdesk;
    @XmlElement(name = "RECALCFWDRATE")
    protected String recalcfwdrate;
    @XmlElement(name = "RETURNCHEQUE")
    protected String returncheque;
    @XmlElement(name = "DRAWNACCOUNT")
    protected String drawnaccount;
    @XmlElement(name = "ACCOUNTINGDATE")
    protected String accountingdate;
    @XmlElement(name = "gINSTRCTNCODE")
    protected GINSTRCTNCODE ginstrctncode;
    @XmlElement(name = "COLLREMBK")
    protected String collrembk;
    @XmlElement(name = "EXPECTEDRECSID")
    protected String expectedrecsid;
    @XmlElement(name = "TOTRECCOMM")
    protected String totreccomm;
    @XmlElement(name = "TOTRECCOMMLCL")
    protected String totreccommlcl;
    @XmlElement(name = "TOTRECCHG")
    protected String totrecchg;
    @XmlElement(name = "TOTRECCHGLCL")
    protected String totrecchglcl;
    @XmlElement(name = "CHEQTYPE")
    protected String cheqtype;
    @XmlElement(name = "gRELATEDMSG")
    protected GRELATEDMSG grelatedmsg;
    @XmlElement(name = "gINTIMEIND")
    protected GINTIMEIND gintimeind;
    @XmlElement(name = "gSENDTOPARTY")
    protected GSENDTOPARTY gsendtoparty;
    @XmlElement(name = "REVERSALMKR")
    protected String reversalmkr;
    @XmlElement(name = "RELATEDREF")
    protected String relatedref;
    @XmlElement(name = "gININSTRCODE")
    protected GININSTRCODE gininstrcode;
    @XmlElement(name = "gINPROCESSERR")
    protected GINPROCESSERR ginprocesserr;
    @XmlElement(name = "gINSWIFTMSG")
    protected GINSWIFTMSG ginswiftmsg;
    @XmlElement(name = "ACCTWITHBANKACC")
    protected String acctwithbankacc;
    @XmlElement(name = "INACCTBANKACC")
    protected String inacctbankacc;
    @XmlElement(name = "RECCORRBANKACC")
    protected String reccorrbankacc;
    @XmlElement(name = "INRECCORRACC")
    protected String inreccorracc;
    @XmlElement(name = "INTERMEDBANKACC")
    protected String intermedbankacc;
    @XmlElement(name = "ININTERMEDACC")
    protected String inintermedacc;
    @XmlElement(name = "INSTRUCTEDAMT")
    protected String instructedamt;
    @XmlElement(name = "gININTERMEDBK")
    protected GININTERMEDBK ginintermedbk;
    @XmlElement(name = "INEXCHRATE")
    protected String inexchrate;
    @XmlElement(name = "RATEFIXING")
    protected String ratefixing;
    @XmlElement(name = "COVERMETHOD")
    protected String covermethod;
    @XmlElement(name = "gIN3RDREIMBBK")
    protected GIN3RDREIMBBK gin3RDREIMBBK;
    @XmlElement(name = "IN3RDREIMBACC")
    protected String in3RDREIMBACC;
    @XmlElement(name = "MT103TYPE")
    protected String mt103TYPE;
    @XmlElement(name = "EXTENDFORMAT")
    protected String extendformat;
    @XmlElement(name = "gEXTENDINFO")
    protected GEXTENDINFO gextendinfo;
    @XmlElement(name = "RATEFIXINGIND")
    protected String ratefixingind;
    @XmlElement(name = "INWSENDBIC")
    protected String inwsendbic;
    @XmlElement(name = "gINSENDCHG")
    protected GINSENDCHG ginsendchg;
    @XmlElement(name = "INRECCHG")
    protected String inrecchg;
    @XmlElement(name = "ACCHGREQID")
    protected String acchgreqid;
    @XmlElement(name = "TOTRECCHGCRCCY")
    protected String totrecchgcrccy;
    @XmlElement(name = "TOTSNDCHGCRCCY")
    protected String totsndchgcrccy;
    @XmlElement(name = "CHGADVICEMSG")
    protected String chgadvicemsg;
    @XmlElement(name = "EXPECTEDCOVERID")
    protected String expectedcoverid;
    @XmlElement(name = "NETTINGSTATUS")
    protected String nettingstatus;
    @XmlElement(name = "AUTHDATE")
    protected String authdate;
    @XmlElement(name = "BKOPERATIONCODE")
    protected String bkoperationcode;
    @XmlElement(name = "AMINFLOWRATE")
    protected String aminflowrate;
    @XmlElement(name = "PARENTTXNID")
    protected String parenttxnid;
    @XmlElement(name = "ROUNDTYPE")
    protected String roundtype;
    @XmlElement(name = "BENEFICIARYID")
    protected String beneficiaryid;
    @XmlElement(name = "gMSGTYPE")
    protected GMSGTYPE gmsgtype;
    @XmlElement(name = "gSIGNATORY")
    protected GSIGNATORY gsignatory;
    @XmlElement(name = "CARDNUMBER")
    protected String cardnumber;
    @XmlElement(name = "gCARDTXNDETAIL")
    protected GCARDTXNDETAIL gcardtxndetail;
    @XmlElement(name = "gINCORDBK")
    protected GINCORDBK gincordbk;
    @XmlElement(name = "gINCINTMEDBK")
    protected GINCINTMEDBK gincintmedbk;
    @XmlElement(name = "gINCACCWITBK")
    protected GINCACCWITBK gincaccwitbk;
    @XmlElement(name = "gINCBKTBKIN")
    protected GINCBKTBKIN gincbktbkin;
    @XmlElement(name = "TFSREFERENCE")
    protected String tfsreference;
    @XmlElement(name = "CHEQUEDRAWN")
    protected String chequedrawn;
    @XmlElement(name = "ISSUECHEQUETYPE")
    protected String issuechequetype;
    @XmlElement(name = "STOCKNUMBER")
    protected String stocknumber;
    @XmlElement(name = "PAYEENAME")
    protected String payeename;
    @XmlElement(name = "STOCKREGISTER")
    protected String stockregister;
    @XmlElement(name = "SERIESID")
    protected String seriesid;
    @XmlElement(name = "ORDCUSTACCT")
    protected String ordcustacct;
    @XmlElement(name = "INORDCUSTACCT")
    protected String inordcustacct;
    @XmlElement(name = "IBANDEBIT")
    protected String ibandebit;
    @XmlElement(name = "IBANCREDIT")
    protected String ibancredit;
    @XmlElement(name = "IBANBEN")
    protected String ibanben;
    @XmlElement(name = "IBANACCTWITHBANK")
    protected String ibanacctwithbank;
    @XmlElement(name = "IBANRECCORRBANK")
    protected String ibanreccorrbank;
    @XmlElement(name = "IBANINTERMEDBANK")
    protected String ibanintermedbank;
    @XmlElement(name = "IBANORDCUSTACC")
    protected String ibanordcustacc;
    @XmlElement(name = "IBANCHARGESACCT")
    protected String ibanchargesacct;
    @XmlElement(name = "BICIBANBEN")
    protected String bicibanben;
    @XmlElement(name = "gBICIBANBENNAME")
    protected GBICIBANBENNAME gbicibanbenname;
    @XmlElement(name = "BICIBANBENCITY")
    protected String bicibanbencity;
    @XmlElement(name = "gBENNAME")
    protected GBENNAME gbenname;
    @XmlElement(name = "gBENADDRESS")
    protected GBENADDRESS gbenaddress;
    @XmlElement(name = "BENCOUNTRY")
    protected String bencountry;
    @XmlElement(name = "gBENTOWN")
    protected GBENTOWN gbentown;
    @XmlElement(name = "gINBENNAME")
    protected GINBENNAME ginbenname;
    @XmlElement(name = "gINBENADDRESS")
    protected GINBENADDRESS ginbenaddress;
    @XmlElement(name = "INBENCOUNTRY")
    protected String inbencountry;
    @XmlElement(name = "gINBENTOWN")
    protected GINBENTOWN ginbentown;
    @XmlElement(name = "gREFDATAITEM")
    protected GREFDATAITEM grefdataitem;
    @XmlElement(name = "gLOCEQUIVCHGS")
    protected GLOCEQUIVCHGS glocequivchgs;
    @XmlElement(name = "gFOREQUIVCHGS")
    protected GFOREQUIVCHGS gforequivchgs;
    @XmlElement(name = "RESERVED6")
    protected String reserved6;
    @XmlElement(name = "RESERVED5")
    protected String reserved5;
    @XmlElement(name = "RESERVED4")
    protected String reserved4;
    @XmlElement(name = "RESERVED3")
    protected String reserved3;
    @XmlElement(name = "RESERVED2")
    protected String reserved2;
    @XmlElement(name = "RESERVED1")
    protected String reserved1;
    @XmlElement(name = "gSTMTNOS")
    protected GSTMTNOS gstmtnos;
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
    @XmlElement(name = "INSPOSCODE")
    protected String insposcode;
    @XmlElement(name = "PRVACCTYPE")
    protected String prvacctype;
    @XmlElement(name = "OFFRTYPE")
    protected String offrtype;
    @XmlElement(name = "WHLTTAX")
    protected String whlttax;
    @XmlElement(name = "IMMEDIATELY")
    protected String immediately;
    @XmlElement(name = "FUTUREDATE")
    protected String futuredate;
    @XmlElement(name = "PAYTO")
    protected String payto;
    @XmlElement(name = "ACCTWORKBAL")
    protected String acctworkbal;
    @XmlElement(name = "gINS.MEM.NO")
    protected GINSMEMNO ginsmemno;
    @XmlElement(name = "AMTARREARS")
    protected String amtarrears;
    @XmlElement(name = "DRFULLNAME")
    protected String drfullname;
    @XmlElement(name = "DRWORKBAL")
    protected String drworkbal;
    @XmlElement(name = "CRFULLNAME")
    protected String crfullname;
    @XmlElement(name = "CRWORKBAL")
    protected String crworkbal;
    @XmlElement(name = "REPAYMENT")
    protected String repayment;
    @XmlElement(name = "INTREPAYMENT")
    protected String intrepayment;
    @XmlElement(name = "INTERESTDUE")
    protected String interestdue;
    @XmlElement(name = "CONSDISCLOSE")
    protected String consdisclose;
    @XmlElement(name = "ACCTTYPE")
    protected String accttype;
    @XmlElement(name = "DRAWACCTNO")
    protected String drawacctno;
    @XmlElement(name = "DRAWBRCHCODE")
    protected String drawbrchcode;
    @XmlElement(name = "EMFTBITEMID")
    protected String emftbitemid;
    @XmlElement(name = "RECOVERYACCT")
    protected String recoveryacct;
    @XmlElement(name = "GROUPID")
    protected String groupid;
    @XmlElement(name = "PRODUCTCODE")
    protected String productcode;
    @XmlElement(name = "ATUNIQUEID")
    protected String atuniqueid;
    @XmlElement(name = "BALAFTTXN")
    protected String balafttxn;
    @XmlElement(name = "ATAUTHCODE")
    protected String atauthcode;
    @XmlElement(name = "ATTERMINALID")
    protected String atterminalid;
    @XmlElement(name = "BINNO")
    protected String binno;
    @XmlElement(name = "DRACCTTYPE")
    protected String draccttype;
    @XmlElement(name = "CRACCTTYPE")
    protected String craccttype;
    @XmlElement(name = "COVERAMOUNT")
    protected String coveramount;
    @XmlElement(name = "CHEQUEBOUNCED")
    protected String chequebounced;
    @XmlElement(name = "FTVERSION")
    protected String ftversion;
    @XmlElement(name = "AFYAINSCOM")
    protected String afyainscom;
    @XmlElement(name = "EXDUT1")
    protected String exdut1;
    @XmlElement(name = "EXCISEDUTY")
    protected String exciseduty;
    @XmlElement(name = "CHQACCTDBCR")
    protected String chqacctdbcr;
    @XmlElement(name = "ODORGLIMAMT")
    protected String odorglimamt;
    @XmlElement(name = "ODAMOUNT")
    protected String odamount;
    @XmlElement(name = "ODEXPIRYDATE")
    protected String odexpirydate;
    @XmlElement(name = "INTERFILEID")
    protected String interfileid;
    @XmlElement(name = "AFYAPREMIUM")
    protected String afyapremium;
    @XmlElement(name = "OTHBNQACCT")
    protected String othbnqacct;
    @XmlElement(name = "FILENAME")
    protected String filename;
    @XmlElement(name = "DRAWCHQNO")
    protected String drawchqno;
    @XmlElement(name = "DRAWCUSTNAME")
    protected String drawcustname;
    @XmlElement(name = "DEPOSITORNAME")
    protected String depositorname;
    @XmlElement(name = "DEPOSITERCONT")
    protected String depositercont;
    @XmlElement(name = "DEPOSITIDDESC")
    protected String depositiddesc;
    @XmlElement(name = "DEPOSITIDNUM")
    protected String depositidnum;
    @XmlElement(name = "TYPEPAYMENT")
    protected String typepayment;
    @XmlElement(name = "SMSREFID")
    protected String smsrefid;
    @XmlElement(name = "PAYMENTTYPE")
    protected String paymenttype;
    @XmlElement(name = "MPESAREFERENCE")
    protected String mpesareference;
    @XmlElement(name = "AADEPOSITID")
    protected String aadepositid;
    @XmlElement(name = "FKLCUSTOMER")
    protected String fklcustomer;
    @XmlElement(name = "BALAFTTXN1")
    protected String balafttxn1;
    @XmlElement(name = "LOSID")
    protected String losid;
    @XmlElement(name = "INPUTVERSION")
    protected String inputversion;
    @XmlElement(name = "AALOANID")
    protected String aaloanid;
    @XmlElement(name = "LOSAAID")
    protected String losaaid;
    @XmlElement(name = "FKLINPUTTER")
    protected String fklinputter;
    @XmlElement(name = "FKLAUTHORISER")
    protected String fklauthoriser;
    @XmlElement(name = "FKLUPLOADFILE")
    protected String fkluploadfile;
    @XmlElement(name = "FKLREPAYAMT")
    protected String fklrepayamt;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSACTIONTYPE() {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSACTIONTYPE(String value) {
        this.transactiontype = value;
    }

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
     * Gets the value of the indebitacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDEBITACCTNO() {
        return indebitacctno;
    }

    /**
     * Sets the value of the indebitacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDEBITACCTNO(String value) {
        this.indebitacctno = value;
    }

    /**
     * Gets the value of the currencymktdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYMKTDR() {
        return currencymktdr;
    }

    /**
     * Sets the value of the currencymktdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYMKTDR(String value) {
        this.currencymktdr = value;
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
     * Gets the value of the debitvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITVALUEDATE() {
        return debitvaluedate;
    }

    /**
     * Sets the value of the debitvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITVALUEDATE(String value) {
        this.debitvaluedate = value;
    }

    /**
     * Gets the value of the indebitvdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDEBITVDATE() {
        return indebitvdate;
    }

    /**
     * Sets the value of the indebitvdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDEBITVDATE(String value) {
        this.indebitvdate = value;
    }

    /**
     * Gets the value of the debittheirref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITTHEIRREF() {
        return debittheirref;
    }

    /**
     * Sets the value of the debittheirref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITTHEIRREF(String value) {
        this.debittheirref = value;
    }

    /**
     * Gets the value of the credittheirref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITTHEIRREF() {
        return credittheirref;
    }

    /**
     * Sets the value of the credittheirref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITTHEIRREF(String value) {
        this.credittheirref = value;
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
     * Gets the value of the currencymktcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYMKTCR() {
        return currencymktcr;
    }

    /**
     * Sets the value of the currencymktcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYMKTCR(String value) {
        this.currencymktcr = value;
    }

    /**
     * Gets the value of the creditcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCURRENCY() {
        return creditcurrency;
    }

    /**
     * Sets the value of the creditcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCURRENCY(String value) {
        this.creditcurrency = value;
    }

    /**
     * Gets the value of the creditamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITAMOUNT() {
        return creditamount;
    }

    /**
     * Sets the value of the creditamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITAMOUNT(String value) {
        this.creditamount = value;
    }

    /**
     * Gets the value of the creditvaluedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITVALUEDATE() {
        return creditvaluedate;
    }

    /**
     * Sets the value of the creditvaluedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITVALUEDATE(String value) {
        this.creditvaluedate = value;
    }

    /**
     * Gets the value of the treasuryrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTREASURYRATE() {
        return treasuryrate;
    }

    /**
     * Sets the value of the treasuryrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTREASURYRATE(String value) {
        this.treasuryrate = value;
    }

    /**
     * Gets the value of the negdealerrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEGDEALERREFNO() {
        return negdealerrefno;
    }

    /**
     * Sets the value of the negdealerrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEGDEALERREFNO(String value) {
        this.negdealerrefno = value;
    }

    /**
     * Gets the value of the processingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSINGDATE() {
        return processingdate;
    }

    /**
     * Sets the value of the processingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSINGDATE(String value) {
        this.processingdate = value;
    }

    /**
     * Gets the value of the gorderingcust property.
     * 
     * @return
     *     possible object is
     *     {@link GORDERINGCUST }
     *     
     */
    public GORDERINGCUST getGORDERINGCUST() {
        return gorderingcust;
    }

    /**
     * Sets the value of the gorderingcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link GORDERINGCUST }
     *     
     */
    public void setGORDERINGCUST(GORDERINGCUST value) {
        this.gorderingcust = value;
    }

    /**
     * Gets the value of the ginorderingcus property.
     * 
     * @return
     *     possible object is
     *     {@link GINORDERINGCUS }
     *     
     */
    public GINORDERINGCUS getGINORDERINGCUS() {
        return ginorderingcus;
    }

    /**
     * Sets the value of the ginorderingcus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINORDERINGCUS }
     *     
     */
    public void setGINORDERINGCUS(GINORDERINGCUS value) {
        this.ginorderingcus = value;
    }

    /**
     * Gets the value of the gorderingbank property.
     * 
     * @return
     *     possible object is
     *     {@link GORDERINGBANK }
     *     
     */
    public GORDERINGBANK getGORDERINGBANK() {
        return gorderingbank;
    }

    /**
     * Sets the value of the gorderingbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GORDERINGBANK }
     *     
     */
    public void setGORDERINGBANK(GORDERINGBANK value) {
        this.gorderingbank = value;
    }

    /**
     * Gets the value of the ginorderingbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINORDERINGBK }
     *     
     */
    public GINORDERINGBK getGINORDERINGBK() {
        return ginorderingbk;
    }

    /**
     * Sets the value of the ginorderingbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINORDERINGBK }
     *     
     */
    public void setGINORDERINGBK(GINORDERINGBK value) {
        this.ginorderingbk = value;
    }

    /**
     * Gets the value of the gacctwithbank property.
     * 
     * @return
     *     possible object is
     *     {@link GACCTWITHBANK }
     *     
     */
    public GACCTWITHBANK getGACCTWITHBANK() {
        return gacctwithbank;
    }

    /**
     * Sets the value of the gacctwithbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GACCTWITHBANK }
     *     
     */
    public void setGACCTWITHBANK(GACCTWITHBANK value) {
        this.gacctwithbank = value;
    }

    /**
     * Gets the value of the gacctwithbk property.
     * 
     * @return
     *     possible object is
     *     {@link GACCTWITHBK }
     *     
     */
    public GACCTWITHBK getGACCTWITHBK() {
        return gacctwithbk;
    }

    /**
     * Sets the value of the gacctwithbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GACCTWITHBK }
     *     
     */
    public void setGACCTWITHBK(GACCTWITHBK value) {
        this.gacctwithbk = value;
    }

    /**
     * Gets the value of the benacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENACCTNO() {
        return benacctno;
    }

    /**
     * Sets the value of the benacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENACCTNO(String value) {
        this.benacctno = value;
    }

    /**
     * Gets the value of the inbenacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINBENACCTNO() {
        return inbenacctno;
    }

    /**
     * Sets the value of the inbenacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINBENACCTNO(String value) {
        this.inbenacctno = value;
    }

    /**
     * Gets the value of the gbencustomer property.
     * 
     * @return
     *     possible object is
     *     {@link GBENCUSTOMER }
     *     
     */
    public GBENCUSTOMER getGBENCUSTOMER() {
        return gbencustomer;
    }

    /**
     * Sets the value of the gbencustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBENCUSTOMER }
     *     
     */
    public void setGBENCUSTOMER(GBENCUSTOMER value) {
        this.gbencustomer = value;
    }

    /**
     * Gets the value of the ginbencustomer property.
     * 
     * @return
     *     possible object is
     *     {@link GINBENCUSTOMER }
     *     
     */
    public GINBENCUSTOMER getGINBENCUSTOMER() {
        return ginbencustomer;
    }

    /**
     * Sets the value of the ginbencustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBENCUSTOMER }
     *     
     */
    public void setGINBENCUSTOMER(GINBENCUSTOMER value) {
        this.ginbencustomer = value;
    }

    /**
     * Gets the value of the gbenbank property.
     * 
     * @return
     *     possible object is
     *     {@link GBENBANK }
     *     
     */
    public GBENBANK getGBENBANK() {
        return gbenbank;
    }

    /**
     * Sets the value of the gbenbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBENBANK }
     *     
     */
    public void setGBENBANK(GBENBANK value) {
        this.gbenbank = value;
    }

    /**
     * Gets the value of the ginbenbank property.
     * 
     * @return
     *     possible object is
     *     {@link GINBENBANK }
     *     
     */
    public GINBENBANK getGINBENBANK() {
        return ginbenbank;
    }

    /**
     * Sets the value of the ginbenbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBENBANK }
     *     
     */
    public void setGINBENBANK(GINBENBANK value) {
        this.ginbenbank = value;
    }

    /**
     * Gets the value of the chequenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUENUMBER() {
        return chequenumber;
    }

    /**
     * Sets the value of the chequenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUENUMBER(String value) {
        this.chequenumber = value;
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
     * Gets the value of the ginpaydetails property.
     * 
     * @return
     *     possible object is
     *     {@link GINPAYDETAILS }
     *     
     */
    public GINPAYDETAILS getGINPAYDETAILS() {
        return ginpaydetails;
    }

    /**
     * Sets the value of the ginpaydetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINPAYDETAILS }
     *     
     */
    public void setGINPAYDETAILS(GINPAYDETAILS value) {
        this.ginpaydetails = value;
    }

    /**
     * Gets the value of the bcbanksortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCBANKSORTCODE() {
        return bcbanksortcode;
    }

    /**
     * Sets the value of the bcbanksortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCBANKSORTCODE(String value) {
        this.bcbanksortcode = value;
    }

    /**
     * Gets the value of the receiverbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERBANK() {
        return receiverbank;
    }

    /**
     * Sets the value of the receiverbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERBANK(String value) {
        this.receiverbank = value;
    }

    /**
     * Gets the value of the greccorrbank property.
     * 
     * @return
     *     possible object is
     *     {@link GRECCORRBANK }
     *     
     */
    public GRECCORRBANK getGRECCORRBANK() {
        return greccorrbank;
    }

    /**
     * Sets the value of the greccorrbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRECCORRBANK }
     *     
     */
    public void setGRECCORRBANK(GRECCORRBANK value) {
        this.greccorrbank = value;
    }

    /**
     * Gets the value of the gintermedbank property.
     * 
     * @return
     *     possible object is
     *     {@link GINTERMEDBANK }
     *     
     */
    public GINTERMEDBANK getGINTERMEDBANK() {
        return gintermedbank;
    }

    /**
     * Sets the value of the gintermedbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINTERMEDBANK }
     *     
     */
    public void setGINTERMEDBANK(GINTERMEDBANK value) {
        this.gintermedbank = value;
    }

    /**
     * Gets the value of the ginintmedbank property.
     * 
     * @return
     *     possible object is
     *     {@link GININTMEDBANK }
     *     
     */
    public GININTMEDBANK getGININTMEDBANK() {
        return ginintmedbank;
    }

    /**
     * Sets the value of the ginintmedbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link GININTMEDBANK }
     *     
     */
    public void setGININTMEDBANK(GININTMEDBANK value) {
        this.ginintmedbank = value;
    }

    /**
     * Gets the value of the mailing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILING() {
        return mailing;
    }

    /**
     * Sets the value of the mailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILING(String value) {
        this.mailing = value;
    }

    /**
     * Gets the value of the paymethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMETHOD() {
        return paymethod;
    }

    /**
     * Sets the value of the paymethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMETHOD(String value) {
        this.paymethod = value;
    }

    /**
     * Gets the value of the benourcharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENOURCHARGES() {
        return benourcharges;
    }

    /**
     * Sets the value of the benourcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENOURCHARGES(String value) {
        this.benourcharges = value;
    }

    /**
     * Gets the value of the inbenourcharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINBENOURCHARGES() {
        return inbenourcharges;
    }

    /**
     * Sets the value of the inbenourcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINBENOURCHARGES(String value) {
        this.inbenourcharges = value;
    }

    /**
     * Gets the value of the chargesacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGESACCTNO() {
        return chargesacctno;
    }

    /**
     * Sets the value of the chargesacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGESACCTNO(String value) {
        this.chargesacctno = value;
    }

    /**
     * Gets the value of the chargecomdisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGECOMDISPLAY() {
        return chargecomdisplay;
    }

    /**
     * Sets the value of the chargecomdisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGECOMDISPLAY(String value) {
        this.chargecomdisplay = value;
    }

    /**
     * Gets the value of the commissioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMISSIONCODE() {
        return commissioncode;
    }

    /**
     * Sets the value of the commissioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMISSIONCODE(String value) {
        this.commissioncode = value;
    }

    /**
     * Gets the value of the gcommissiontype property.
     * 
     * @return
     *     possible object is
     *     {@link GCOMMISSIONTYPE }
     *     
     */
    public GCOMMISSIONTYPE getGCOMMISSIONTYPE() {
        return gcommissiontype;
    }

    /**
     * Sets the value of the gcommissiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCOMMISSIONTYPE }
     *     
     */
    public void setGCOMMISSIONTYPE(GCOMMISSIONTYPE value) {
        this.gcommissiontype = value;
    }

    /**
     * Gets the value of the chargecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGECODE() {
        return chargecode;
    }

    /**
     * Sets the value of the chargecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGECODE(String value) {
        this.chargecode = value;
    }

    /**
     * Gets the value of the gchargetype property.
     * 
     * @return
     *     possible object is
     *     {@link GCHARGETYPE }
     *     
     */
    public GCHARGETYPE getGCHARGETYPE() {
        return gchargetype;
    }

    /**
     * Sets the value of the gchargetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCHARGETYPE }
     *     
     */
    public void setGCHARGETYPE(GCHARGETYPE value) {
        this.gchargetype = value;
    }

    /**
     * Gets the value of the customerspread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERSPREAD() {
        return customerspread;
    }

    /**
     * Sets the value of the customerspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERSPREAD(String value) {
        this.customerspread = value;
    }

    /**
     * Gets the value of the basecurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASECURRENCY() {
        return basecurrency;
    }

    /**
     * Sets the value of the basecurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBASECURRENCY(String value) {
        this.basecurrency = value;
    }

    /**
     * Gets the value of the profitcentrecust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFITCENTRECUST() {
        return profitcentrecust;
    }

    /**
     * Sets the value of the profitcentrecust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFITCENTRECUST(String value) {
        this.profitcentrecust = value;
    }

    /**
     * Gets the value of the profitcentredept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFITCENTREDEPT() {
        return profitcentredept;
    }

    /**
     * Sets the value of the profitcentredept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFITCENTREDEPT(String value) {
        this.profitcentredept = value;
    }

    /**
     * Gets the value of the returntodept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETURNTODEPT() {
        return returntodept;
    }

    /**
     * Sets the value of the returntodept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETURNTODEPT(String value) {
        this.returntodept = value;
    }

    /**
     * Gets the value of the prioritytxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITYTXN() {
        return prioritytxn;
    }

    /**
     * Sets the value of the prioritytxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITYTXN(String value) {
        this.prioritytxn = value;
    }

    /**
     * Gets the value of the gbktobkinfo property.
     * 
     * @return
     *     possible object is
     *     {@link GBKTOBKINFO }
     *     
     */
    public GBKTOBKINFO getGBKTOBKINFO() {
        return gbktobkinfo;
    }

    /**
     * Sets the value of the gbktobkinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBKTOBKINFO }
     *     
     */
    public void setGBKTOBKINFO(GBKTOBKINFO value) {
        this.gbktobkinfo = value;
    }

    /**
     * Gets the value of the ginbktobk property.
     * 
     * @return
     *     possible object is
     *     {@link GINBKTOBK }
     *     
     */
    public GINBKTOBK getGINBKTOBK() {
        return ginbktobk;
    }

    /**
     * Sets the value of the ginbktobk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBKTOBK }
     *     
     */
    public void setGINBKTOBK(GINBKTOBK value) {
        this.ginbktobk = value;
    }

    /**
     * Gets the value of the exposuredate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPOSUREDATE() {
        return exposuredate;
    }

    /**
     * Sets the value of the exposuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPOSUREDATE(String value) {
        this.exposuredate = value;
    }

    /**
     * Gets the value of the fedfunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEDFUNDS() {
        return fedfunds;
    }

    /**
     * Sets the value of the fedfunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEDFUNDS(String value) {
        this.fedfunds = value;
    }

    /**
     * Gets the value of the positiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSITIONTYPE() {
        return positiontype;
    }

    /**
     * Sets the value of the positiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSITIONTYPE(String value) {
        this.positiontype = value;
    }

    /**
     * Gets the value of the noofbatchitems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOOFBATCHITEMS() {
        return noofbatchitems;
    }

    /**
     * Sets the value of the noofbatchitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOOFBATCHITEMS(String value) {
        this.noofbatchitems = value;
    }

    /**
     * Gets the value of the gfreetextmsgto property.
     * 
     * @return
     *     possible object is
     *     {@link GFREETEXTMSGTO }
     *     
     */
    public GFREETEXTMSGTO getGFREETEXTMSGTO() {
        return gfreetextmsgto;
    }

    /**
     * Sets the value of the gfreetextmsgto property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFREETEXTMSGTO }
     *     
     */
    public void setGFREETEXTMSGTO(GFREETEXTMSGTO value) {
        this.gfreetextmsgto = value;
    }

    /**
     * Gets the value of the gmessage property.
     * 
     * @return
     *     possible object is
     *     {@link GMESSAGE }
     *     
     */
    public GMESSAGE getGMESSAGE() {
        return gmessage;
    }

    /**
     * Sets the value of the gmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMESSAGE }
     *     
     */
    public void setGMESSAGE(GMESSAGE value) {
        this.gmessage = value;
    }

    /**
     * Gets the value of the gtaxtype property.
     * 
     * @return
     *     possible object is
     *     {@link GTAXTYPE }
     *     
     */
    public GTAXTYPE getGTAXTYPE() {
        return gtaxtype;
    }

    /**
     * Sets the value of the gtaxtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTAXTYPE }
     *     
     */
    public void setGTAXTYPE(GTAXTYPE value) {
        this.gtaxtype = value;
    }

    /**
     * Gets the value of the amountdebited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTDEBITED() {
        return amountdebited;
    }

    /**
     * Sets the value of the amountdebited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTDEBITED(String value) {
        this.amountdebited = value;
    }

    /**
     * Gets the value of the amountcredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNTCREDITED() {
        return amountcredited;
    }

    /**
     * Sets the value of the amountcredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNTCREDITED(String value) {
        this.amountcredited = value;
    }

    /**
     * Gets the value of the totalchargeamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALCHARGEAMT() {
        return totalchargeamt;
    }

    /**
     * Sets the value of the totalchargeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALCHARGEAMT(String value) {
        this.totalchargeamt = value;
    }

    /**
     * Gets the value of the totaltaxamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTALTAXAMOUNT() {
        return totaltaxamount;
    }

    /**
     * Sets the value of the totaltaxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTALTAXAMOUNT(String value) {
        this.totaltaxamount = value;
    }

    /**
     * Gets the value of the customerrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERRATE() {
        return customerrate;
    }

    /**
     * Sets the value of the customerrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERRATE(String value) {
        this.customerrate = value;
    }

    /**
     * Gets the value of the ginreccorrbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINRECCORRBK }
     *     
     */
    public GINRECCORRBK getGINRECCORRBK() {
        return ginreccorrbk;
    }

    /**
     * Sets the value of the ginreccorrbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINRECCORRBK }
     *     
     */
    public void setGINRECCORRBK(GINRECCORRBK value) {
        this.ginreccorrbk = value;
    }

    /**
     * Gets the value of the inwardpaytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINWARDPAYTYPE() {
        return inwardpaytype;
    }

    /**
     * Sets the value of the inwardpaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINWARDPAYTYPE(String value) {
        this.inwardpaytype = value;
    }

    /**
     * Gets the value of the ginsendcorrbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINSENDCORRBK }
     *     
     */
    public GINSENDCORRBK getGINSENDCORRBK() {
        return ginsendcorrbk;
    }

    /**
     * Sets the value of the ginsendcorrbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINSENDCORRBK }
     *     
     */
    public void setGINSENDCORRBK(GINSENDCORRBK value) {
        this.ginsendcorrbk = value;
    }

    /**
     * Gets the value of the telexfromcust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELEXFROMCUST() {
        return telexfromcust;
    }

    /**
     * Sets the value of the telexfromcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELEXFROMCUST(String value) {
        this.telexfromcust = value;
    }

    /**
     * Gets the value of the deliveryinref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYINREF() {
        return deliveryinref;
    }

    /**
     * Sets the value of the deliveryinref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYINREF(String value) {
        this.deliveryinref = value;
    }

    /**
     * Gets the value of the gdeliveryoutref property.
     * 
     * @return
     *     possible object is
     *     {@link GDELIVERYOUTREF }
     *     
     */
    public GDELIVERYOUTREF getGDELIVERYOUTREF() {
        return gdeliveryoutref;
    }

    /**
     * Sets the value of the gdeliveryoutref property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDELIVERYOUTREF }
     *     
     */
    public void setGDELIVERYOUTREF(GDELIVERYOUTREF value) {
        this.gdeliveryoutref = value;
    }

    /**
     * Gets the value of the creditcompcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCOMPCODE() {
        return creditcompcode;
    }

    /**
     * Sets the value of the creditcompcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCOMPCODE(String value) {
        this.creditcompcode = value;
    }

    /**
     * Gets the value of the debitcompcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITCOMPCODE() {
        return debitcompcode;
    }

    /**
     * Sets the value of the debitcompcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITCOMPCODE(String value) {
        this.debitcompcode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the deliverymkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMKR() {
        return deliverymkr;
    }

    /**
     * Sets the value of the deliverymkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMKR(String value) {
        this.deliverymkr = value;
    }

    /**
     * Gets the value of the ordcustcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDCUSTCODE() {
        return ordcustcode;
    }

    /**
     * Sets the value of the ordcustcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDCUSTCODE(String value) {
        this.ordcustcode = value;
    }

    /**
     * Gets the value of the acctwithbkacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTWITHBKACNO() {
        return acctwithbkacno;
    }

    /**
     * Sets the value of the acctwithbkacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTWITHBKACNO(String value) {
        this.acctwithbkacno = value;
    }

    /**
     * Gets the value of the locamtdebited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAMTDEBITED() {
        return locamtdebited;
    }

    /**
     * Sets the value of the locamtdebited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAMTDEBITED(String value) {
        this.locamtdebited = value;
    }

    /**
     * Gets the value of the locamtcredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAMTCREDITED() {
        return locamtcredited;
    }

    /**
     * Sets the value of the locamtcredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAMTCREDITED(String value) {
        this.locamtcredited = value;
    }

    /**
     * Gets the value of the loctottaxamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCTOTTAXAMT() {
        return loctottaxamt;
    }

    /**
     * Sets the value of the loctottaxamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCTOTTAXAMT(String value) {
        this.loctottaxamt = value;
    }

    /**
     * Gets the value of the localchargeamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALCHARGEAMT() {
        return localchargeamt;
    }

    /**
     * Sets the value of the localchargeamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALCHARGEAMT(String value) {
        this.localchargeamt = value;
    }

    /**
     * Gets the value of the locposchgsamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCPOSCHGSAMT() {
        return locposchgsamt;
    }

    /**
     * Sets the value of the locposchgsamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCPOSCHGSAMT(String value) {
        this.locposchgsamt = value;
    }

    /**
     * Gets the value of the mktgexchprofit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMKTGEXCHPROFIT() {
        return mktgexchprofit;
    }

    /**
     * Sets the value of the mktgexchprofit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMKTGEXCHPROFIT(String value) {
        this.mktgexchprofit = value;
    }

    /**
     * Gets the value of the rateinputmkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEINPUTMKR() {
        return rateinputmkr;
    }

    /**
     * Sets the value of the rateinputmkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEINPUTMKR(String value) {
        this.rateinputmkr = value;
    }

    /**
     * Gets the value of the custgrouplevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTGROUPLEVEL() {
        return custgrouplevel;
    }

    /**
     * Sets the value of the custgrouplevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTGROUPLEVEL(String value) {
        this.custgrouplevel = value;
    }

    /**
     * Gets the value of the debitcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEBITCUSTOMER() {
        return debitcustomer;
    }

    /**
     * Sets the value of the debitcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEBITCUSTOMER(String value) {
        this.debitcustomer = value;
    }

    /**
     * Gets the value of the creditcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREDITCUSTOMER() {
        return creditcustomer;
    }

    /**
     * Sets the value of the creditcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREDITCUSTOMER(String value) {
        this.creditcustomer = value;
    }

    /**
     * Gets the value of the sendpaymentyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDPAYMENTYN() {
        return sendpaymentyn;
    }

    /**
     * Sets the value of the sendpaymentyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDPAYMENTYN(String value) {
        this.sendpaymentyn = value;
    }

    /**
     * Gets the value of the dradvicereqdyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRADVICEREQDYN() {
        return dradvicereqdyn;
    }

    /**
     * Sets the value of the dradvicereqdyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRADVICEREQDYN(String value) {
        this.dradvicereqdyn = value;
    }

    /**
     * Gets the value of the cradvicereqdyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRADVICEREQDYN() {
        return cradvicereqdyn;
    }

    /**
     * Sets the value of the cradvicereqdyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRADVICEREQDYN(String value) {
        this.cradvicereqdyn = value;
    }

    /**
     * Gets the value of the dealmarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALMARKET() {
        return dealmarket;
    }

    /**
     * Sets the value of the dealmarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALMARKET(String value) {
        this.dealmarket = value;
    }

    /**
     * Gets the value of the chargedcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARGEDCUSTOMER() {
        return chargedcustomer;
    }

    /**
     * Sets the value of the chargedcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARGEDCUSTOMER(String value) {
        this.chargedcustomer = value;
    }

    /**
     * Gets the value of the ginreasonove property.
     * 
     * @return
     *     possible object is
     *     {@link GINREASONOVE }
     *     
     */
    public GINREASONOVE getGINREASONOVE() {
        return ginreasonove;
    }

    /**
     * Sets the value of the ginreasonove property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINREASONOVE }
     *     
     */
    public void setGINREASONOVE(GINREASONOVE value) {
        this.ginreasonove = value;
    }

    /**
     * Gets the value of the dealerdesk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEALERDESK() {
        return dealerdesk;
    }

    /**
     * Sets the value of the dealerdesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEALERDESK(String value) {
        this.dealerdesk = value;
    }

    /**
     * Gets the value of the recalcfwdrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECALCFWDRATE() {
        return recalcfwdrate;
    }

    /**
     * Sets the value of the recalcfwdrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECALCFWDRATE(String value) {
        this.recalcfwdrate = value;
    }

    /**
     * Gets the value of the returncheque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRETURNCHEQUE() {
        return returncheque;
    }

    /**
     * Sets the value of the returncheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRETURNCHEQUE(String value) {
        this.returncheque = value;
    }

    /**
     * Gets the value of the drawnaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWNACCOUNT() {
        return drawnaccount;
    }

    /**
     * Sets the value of the drawnaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWNACCOUNT(String value) {
        this.drawnaccount = value;
    }

    /**
     * Gets the value of the accountingdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTINGDATE() {
        return accountingdate;
    }

    /**
     * Sets the value of the accountingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTINGDATE(String value) {
        this.accountingdate = value;
    }

    /**
     * Gets the value of the ginstrctncode property.
     * 
     * @return
     *     possible object is
     *     {@link GINSTRCTNCODE }
     *     
     */
    public GINSTRCTNCODE getGINSTRCTNCODE() {
        return ginstrctncode;
    }

    /**
     * Sets the value of the ginstrctncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINSTRCTNCODE }
     *     
     */
    public void setGINSTRCTNCODE(GINSTRCTNCODE value) {
        this.ginstrctncode = value;
    }

    /**
     * Gets the value of the collrembk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLREMBK() {
        return collrembk;
    }

    /**
     * Sets the value of the collrembk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLREMBK(String value) {
        this.collrembk = value;
    }

    /**
     * Gets the value of the expectedrecsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPECTEDRECSID() {
        return expectedrecsid;
    }

    /**
     * Sets the value of the expectedrecsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPECTEDRECSID(String value) {
        this.expectedrecsid = value;
    }

    /**
     * Gets the value of the totreccomm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTRECCOMM() {
        return totreccomm;
    }

    /**
     * Sets the value of the totreccomm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTRECCOMM(String value) {
        this.totreccomm = value;
    }

    /**
     * Gets the value of the totreccommlcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTRECCOMMLCL() {
        return totreccommlcl;
    }

    /**
     * Sets the value of the totreccommlcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTRECCOMMLCL(String value) {
        this.totreccommlcl = value;
    }

    /**
     * Gets the value of the totrecchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTRECCHG() {
        return totrecchg;
    }

    /**
     * Sets the value of the totrecchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTRECCHG(String value) {
        this.totrecchg = value;
    }

    /**
     * Gets the value of the totrecchglcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTRECCHGLCL() {
        return totrecchglcl;
    }

    /**
     * Sets the value of the totrecchglcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTRECCHGLCL(String value) {
        this.totrecchglcl = value;
    }

    /**
     * Gets the value of the cheqtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQTYPE() {
        return cheqtype;
    }

    /**
     * Sets the value of the cheqtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQTYPE(String value) {
        this.cheqtype = value;
    }

    /**
     * Gets the value of the grelatedmsg property.
     * 
     * @return
     *     possible object is
     *     {@link GRELATEDMSG }
     *     
     */
    public GRELATEDMSG getGRELATEDMSG() {
        return grelatedmsg;
    }

    /**
     * Sets the value of the grelatedmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRELATEDMSG }
     *     
     */
    public void setGRELATEDMSG(GRELATEDMSG value) {
        this.grelatedmsg = value;
    }

    /**
     * Gets the value of the gintimeind property.
     * 
     * @return
     *     possible object is
     *     {@link GINTIMEIND }
     *     
     */
    public GINTIMEIND getGINTIMEIND() {
        return gintimeind;
    }

    /**
     * Sets the value of the gintimeind property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINTIMEIND }
     *     
     */
    public void setGINTIMEIND(GINTIMEIND value) {
        this.gintimeind = value;
    }

    /**
     * Gets the value of the gsendtoparty property.
     * 
     * @return
     *     possible object is
     *     {@link GSENDTOPARTY }
     *     
     */
    public GSENDTOPARTY getGSENDTOPARTY() {
        return gsendtoparty;
    }

    /**
     * Sets the value of the gsendtoparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSENDTOPARTY }
     *     
     */
    public void setGSENDTOPARTY(GSENDTOPARTY value) {
        this.gsendtoparty = value;
    }

    /**
     * Gets the value of the reversalmkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVERSALMKR() {
        return reversalmkr;
    }

    /**
     * Sets the value of the reversalmkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVERSALMKR(String value) {
        this.reversalmkr = value;
    }

    /**
     * Gets the value of the relatedref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELATEDREF() {
        return relatedref;
    }

    /**
     * Sets the value of the relatedref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELATEDREF(String value) {
        this.relatedref = value;
    }

    /**
     * Gets the value of the gininstrcode property.
     * 
     * @return
     *     possible object is
     *     {@link GININSTRCODE }
     *     
     */
    public GININSTRCODE getGININSTRCODE() {
        return gininstrcode;
    }

    /**
     * Sets the value of the gininstrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GININSTRCODE }
     *     
     */
    public void setGININSTRCODE(GININSTRCODE value) {
        this.gininstrcode = value;
    }

    /**
     * Gets the value of the ginprocesserr property.
     * 
     * @return
     *     possible object is
     *     {@link GINPROCESSERR }
     *     
     */
    public GINPROCESSERR getGINPROCESSERR() {
        return ginprocesserr;
    }

    /**
     * Sets the value of the ginprocesserr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINPROCESSERR }
     *     
     */
    public void setGINPROCESSERR(GINPROCESSERR value) {
        this.ginprocesserr = value;
    }

    /**
     * Gets the value of the ginswiftmsg property.
     * 
     * @return
     *     possible object is
     *     {@link GINSWIFTMSG }
     *     
     */
    public GINSWIFTMSG getGINSWIFTMSG() {
        return ginswiftmsg;
    }

    /**
     * Sets the value of the ginswiftmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINSWIFTMSG }
     *     
     */
    public void setGINSWIFTMSG(GINSWIFTMSG value) {
        this.ginswiftmsg = value;
    }

    /**
     * Gets the value of the acctwithbankacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTWITHBANKACC() {
        return acctwithbankacc;
    }

    /**
     * Sets the value of the acctwithbankacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTWITHBANKACC(String value) {
        this.acctwithbankacc = value;
    }

    /**
     * Gets the value of the inacctbankacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINACCTBANKACC() {
        return inacctbankacc;
    }

    /**
     * Sets the value of the inacctbankacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINACCTBANKACC(String value) {
        this.inacctbankacc = value;
    }

    /**
     * Gets the value of the reccorrbankacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECCORRBANKACC() {
        return reccorrbankacc;
    }

    /**
     * Sets the value of the reccorrbankacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECCORRBANKACC(String value) {
        this.reccorrbankacc = value;
    }

    /**
     * Gets the value of the inreccorracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINRECCORRACC() {
        return inreccorracc;
    }

    /**
     * Sets the value of the inreccorracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINRECCORRACC(String value) {
        this.inreccorracc = value;
    }

    /**
     * Gets the value of the intermedbankacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERMEDBANKACC() {
        return intermedbankacc;
    }

    /**
     * Sets the value of the intermedbankacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERMEDBANKACC(String value) {
        this.intermedbankacc = value;
    }

    /**
     * Gets the value of the inintermedacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getININTERMEDACC() {
        return inintermedacc;
    }

    /**
     * Sets the value of the inintermedacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setININTERMEDACC(String value) {
        this.inintermedacc = value;
    }

    /**
     * Gets the value of the instructedamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRUCTEDAMT() {
        return instructedamt;
    }

    /**
     * Sets the value of the instructedamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRUCTEDAMT(String value) {
        this.instructedamt = value;
    }

    /**
     * Gets the value of the ginintermedbk property.
     * 
     * @return
     *     possible object is
     *     {@link GININTERMEDBK }
     *     
     */
    public GININTERMEDBK getGININTERMEDBK() {
        return ginintermedbk;
    }

    /**
     * Sets the value of the ginintermedbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GININTERMEDBK }
     *     
     */
    public void setGININTERMEDBK(GININTERMEDBK value) {
        this.ginintermedbk = value;
    }

    /**
     * Gets the value of the inexchrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINEXCHRATE() {
        return inexchrate;
    }

    /**
     * Sets the value of the inexchrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINEXCHRATE(String value) {
        this.inexchrate = value;
    }

    /**
     * Gets the value of the ratefixing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEFIXING() {
        return ratefixing;
    }

    /**
     * Sets the value of the ratefixing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEFIXING(String value) {
        this.ratefixing = value;
    }

    /**
     * Gets the value of the covermethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVERMETHOD() {
        return covermethod;
    }

    /**
     * Sets the value of the covermethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVERMETHOD(String value) {
        this.covermethod = value;
    }

    /**
     * Gets the value of the gin3RDREIMBBK property.
     * 
     * @return
     *     possible object is
     *     {@link GIN3RDREIMBBK }
     *     
     */
    public GIN3RDREIMBBK getGIN3RDREIMBBK() {
        return gin3RDREIMBBK;
    }

    /**
     * Sets the value of the gin3RDREIMBBK property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIN3RDREIMBBK }
     *     
     */
    public void setGIN3RDREIMBBK(GIN3RDREIMBBK value) {
        this.gin3RDREIMBBK = value;
    }

    /**
     * Gets the value of the in3RDREIMBACC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIN3RDREIMBACC() {
        return in3RDREIMBACC;
    }

    /**
     * Sets the value of the in3RDREIMBACC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIN3RDREIMBACC(String value) {
        this.in3RDREIMBACC = value;
    }

    /**
     * Gets the value of the mt103TYPE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT103TYPE() {
        return mt103TYPE;
    }

    /**
     * Sets the value of the mt103TYPE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT103TYPE(String value) {
        this.mt103TYPE = value;
    }

    /**
     * Gets the value of the extendformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTENDFORMAT() {
        return extendformat;
    }

    /**
     * Sets the value of the extendformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTENDFORMAT(String value) {
        this.extendformat = value;
    }

    /**
     * Gets the value of the gextendinfo property.
     * 
     * @return
     *     possible object is
     *     {@link GEXTENDINFO }
     *     
     */
    public GEXTENDINFO getGEXTENDINFO() {
        return gextendinfo;
    }

    /**
     * Sets the value of the gextendinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEXTENDINFO }
     *     
     */
    public void setGEXTENDINFO(GEXTENDINFO value) {
        this.gextendinfo = value;
    }

    /**
     * Gets the value of the ratefixingind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEFIXINGIND() {
        return ratefixingind;
    }

    /**
     * Sets the value of the ratefixingind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEFIXINGIND(String value) {
        this.ratefixingind = value;
    }

    /**
     * Gets the value of the inwsendbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINWSENDBIC() {
        return inwsendbic;
    }

    /**
     * Sets the value of the inwsendbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINWSENDBIC(String value) {
        this.inwsendbic = value;
    }

    /**
     * Gets the value of the ginsendchg property.
     * 
     * @return
     *     possible object is
     *     {@link GINSENDCHG }
     *     
     */
    public GINSENDCHG getGINSENDCHG() {
        return ginsendchg;
    }

    /**
     * Sets the value of the ginsendchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINSENDCHG }
     *     
     */
    public void setGINSENDCHG(GINSENDCHG value) {
        this.ginsendchg = value;
    }

    /**
     * Gets the value of the inrecchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINRECCHG() {
        return inrecchg;
    }

    /**
     * Sets the value of the inrecchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINRECCHG(String value) {
        this.inrecchg = value;
    }

    /**
     * Gets the value of the acchgreqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCHGREQID() {
        return acchgreqid;
    }

    /**
     * Sets the value of the acchgreqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCHGREQID(String value) {
        this.acchgreqid = value;
    }

    /**
     * Gets the value of the totrecchgcrccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTRECCHGCRCCY() {
        return totrecchgcrccy;
    }

    /**
     * Sets the value of the totrecchgcrccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTRECCHGCRCCY(String value) {
        this.totrecchgcrccy = value;
    }

    /**
     * Gets the value of the totsndchgcrccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTSNDCHGCRCCY() {
        return totsndchgcrccy;
    }

    /**
     * Sets the value of the totsndchgcrccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTSNDCHGCRCCY(String value) {
        this.totsndchgcrccy = value;
    }

    /**
     * Gets the value of the chgadvicemsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGADVICEMSG() {
        return chgadvicemsg;
    }

    /**
     * Sets the value of the chgadvicemsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGADVICEMSG(String value) {
        this.chgadvicemsg = value;
    }

    /**
     * Gets the value of the expectedcoverid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPECTEDCOVERID() {
        return expectedcoverid;
    }

    /**
     * Sets the value of the expectedcoverid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPECTEDCOVERID(String value) {
        this.expectedcoverid = value;
    }

    /**
     * Gets the value of the nettingstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNETTINGSTATUS() {
        return nettingstatus;
    }

    /**
     * Sets the value of the nettingstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNETTINGSTATUS(String value) {
        this.nettingstatus = value;
    }

    /**
     * Gets the value of the authdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHDATE() {
        return authdate;
    }

    /**
     * Sets the value of the authdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHDATE(String value) {
        this.authdate = value;
    }

    /**
     * Gets the value of the bkoperationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKOPERATIONCODE() {
        return bkoperationcode;
    }

    /**
     * Sets the value of the bkoperationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKOPERATIONCODE(String value) {
        this.bkoperationcode = value;
    }

    /**
     * Gets the value of the aminflowrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMINFLOWRATE() {
        return aminflowrate;
    }

    /**
     * Sets the value of the aminflowrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMINFLOWRATE(String value) {
        this.aminflowrate = value;
    }

    /**
     * Gets the value of the parenttxnid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTTXNID() {
        return parenttxnid;
    }

    /**
     * Sets the value of the parenttxnid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTTXNID(String value) {
        this.parenttxnid = value;
    }

    /**
     * Gets the value of the roundtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUNDTYPE() {
        return roundtype;
    }

    /**
     * Sets the value of the roundtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUNDTYPE(String value) {
        this.roundtype = value;
    }

    /**
     * Gets the value of the beneficiaryid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENEFICIARYID() {
        return beneficiaryid;
    }

    /**
     * Sets the value of the beneficiaryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENEFICIARYID(String value) {
        this.beneficiaryid = value;
    }

    /**
     * Gets the value of the gmsgtype property.
     * 
     * @return
     *     possible object is
     *     {@link GMSGTYPE }
     *     
     */
    public GMSGTYPE getGMSGTYPE() {
        return gmsgtype;
    }

    /**
     * Sets the value of the gmsgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSGTYPE }
     *     
     */
    public void setGMSGTYPE(GMSGTYPE value) {
        this.gmsgtype = value;
    }

    /**
     * Gets the value of the gsignatory property.
     * 
     * @return
     *     possible object is
     *     {@link GSIGNATORY }
     *     
     */
    public GSIGNATORY getGSIGNATORY() {
        return gsignatory;
    }

    /**
     * Sets the value of the gsignatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSIGNATORY }
     *     
     */
    public void setGSIGNATORY(GSIGNATORY value) {
        this.gsignatory = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the gcardtxndetail property.
     * 
     * @return
     *     possible object is
     *     {@link GCARDTXNDETAIL }
     *     
     */
    public GCARDTXNDETAIL getGCARDTXNDETAIL() {
        return gcardtxndetail;
    }

    /**
     * Sets the value of the gcardtxndetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCARDTXNDETAIL }
     *     
     */
    public void setGCARDTXNDETAIL(GCARDTXNDETAIL value) {
        this.gcardtxndetail = value;
    }

    /**
     * Gets the value of the gincordbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINCORDBK }
     *     
     */
    public GINCORDBK getGINCORDBK() {
        return gincordbk;
    }

    /**
     * Sets the value of the gincordbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINCORDBK }
     *     
     */
    public void setGINCORDBK(GINCORDBK value) {
        this.gincordbk = value;
    }

    /**
     * Gets the value of the gincintmedbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINCINTMEDBK }
     *     
     */
    public GINCINTMEDBK getGINCINTMEDBK() {
        return gincintmedbk;
    }

    /**
     * Sets the value of the gincintmedbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINCINTMEDBK }
     *     
     */
    public void setGINCINTMEDBK(GINCINTMEDBK value) {
        this.gincintmedbk = value;
    }

    /**
     * Gets the value of the gincaccwitbk property.
     * 
     * @return
     *     possible object is
     *     {@link GINCACCWITBK }
     *     
     */
    public GINCACCWITBK getGINCACCWITBK() {
        return gincaccwitbk;
    }

    /**
     * Sets the value of the gincaccwitbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINCACCWITBK }
     *     
     */
    public void setGINCACCWITBK(GINCACCWITBK value) {
        this.gincaccwitbk = value;
    }

    /**
     * Gets the value of the gincbktbkin property.
     * 
     * @return
     *     possible object is
     *     {@link GINCBKTBKIN }
     *     
     */
    public GINCBKTBKIN getGINCBKTBKIN() {
        return gincbktbkin;
    }

    /**
     * Sets the value of the gincbktbkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINCBKTBKIN }
     *     
     */
    public void setGINCBKTBKIN(GINCBKTBKIN value) {
        this.gincbktbkin = value;
    }

    /**
     * Gets the value of the tfsreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFSREFERENCE() {
        return tfsreference;
    }

    /**
     * Sets the value of the tfsreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFSREFERENCE(String value) {
        this.tfsreference = value;
    }

    /**
     * Gets the value of the chequedrawn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUEDRAWN() {
        return chequedrawn;
    }

    /**
     * Sets the value of the chequedrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUEDRAWN(String value) {
        this.chequedrawn = value;
    }

    /**
     * Gets the value of the issuechequetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSUECHEQUETYPE() {
        return issuechequetype;
    }

    /**
     * Sets the value of the issuechequetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSUECHEQUETYPE(String value) {
        this.issuechequetype = value;
    }

    /**
     * Gets the value of the stocknumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKNUMBER() {
        return stocknumber;
    }

    /**
     * Sets the value of the stocknumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKNUMBER(String value) {
        this.stocknumber = value;
    }

    /**
     * Gets the value of the payeename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYEENAME() {
        return payeename;
    }

    /**
     * Sets the value of the payeename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYEENAME(String value) {
        this.payeename = value;
    }

    /**
     * Gets the value of the stockregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKREGISTER() {
        return stockregister;
    }

    /**
     * Sets the value of the stockregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKREGISTER(String value) {
        this.stockregister = value;
    }

    /**
     * Gets the value of the seriesid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIESID() {
        return seriesid;
    }

    /**
     * Sets the value of the seriesid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIESID(String value) {
        this.seriesid = value;
    }

    /**
     * Gets the value of the ordcustacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDCUSTACCT() {
        return ordcustacct;
    }

    /**
     * Sets the value of the ordcustacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDCUSTACCT(String value) {
        this.ordcustacct = value;
    }

    /**
     * Gets the value of the inordcustacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINORDCUSTACCT() {
        return inordcustacct;
    }

    /**
     * Sets the value of the inordcustacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINORDCUSTACCT(String value) {
        this.inordcustacct = value;
    }

    /**
     * Gets the value of the ibandebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANDEBIT() {
        return ibandebit;
    }

    /**
     * Sets the value of the ibandebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANDEBIT(String value) {
        this.ibandebit = value;
    }

    /**
     * Gets the value of the ibancredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANCREDIT() {
        return ibancredit;
    }

    /**
     * Sets the value of the ibancredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANCREDIT(String value) {
        this.ibancredit = value;
    }

    /**
     * Gets the value of the ibanben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANBEN() {
        return ibanben;
    }

    /**
     * Sets the value of the ibanben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANBEN(String value) {
        this.ibanben = value;
    }

    /**
     * Gets the value of the ibanacctwithbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANACCTWITHBANK() {
        return ibanacctwithbank;
    }

    /**
     * Sets the value of the ibanacctwithbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANACCTWITHBANK(String value) {
        this.ibanacctwithbank = value;
    }

    /**
     * Gets the value of the ibanreccorrbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANRECCORRBANK() {
        return ibanreccorrbank;
    }

    /**
     * Sets the value of the ibanreccorrbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANRECCORRBANK(String value) {
        this.ibanreccorrbank = value;
    }

    /**
     * Gets the value of the ibanintermedbank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANINTERMEDBANK() {
        return ibanintermedbank;
    }

    /**
     * Sets the value of the ibanintermedbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANINTERMEDBANK(String value) {
        this.ibanintermedbank = value;
    }

    /**
     * Gets the value of the ibanordcustacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANORDCUSTACC() {
        return ibanordcustacc;
    }

    /**
     * Sets the value of the ibanordcustacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANORDCUSTACC(String value) {
        this.ibanordcustacc = value;
    }

    /**
     * Gets the value of the ibanchargesacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBANCHARGESACCT() {
        return ibanchargesacct;
    }

    /**
     * Sets the value of the ibanchargesacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBANCHARGESACCT(String value) {
        this.ibanchargesacct = value;
    }

    /**
     * Gets the value of the bicibanben property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICIBANBEN() {
        return bicibanben;
    }

    /**
     * Sets the value of the bicibanben property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICIBANBEN(String value) {
        this.bicibanben = value;
    }

    /**
     * Gets the value of the gbicibanbenname property.
     * 
     * @return
     *     possible object is
     *     {@link GBICIBANBENNAME }
     *     
     */
    public GBICIBANBENNAME getGBICIBANBENNAME() {
        return gbicibanbenname;
    }

    /**
     * Sets the value of the gbicibanbenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBICIBANBENNAME }
     *     
     */
    public void setGBICIBANBENNAME(GBICIBANBENNAME value) {
        this.gbicibanbenname = value;
    }

    /**
     * Gets the value of the bicibanbencity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICIBANBENCITY() {
        return bicibanbencity;
    }

    /**
     * Sets the value of the bicibanbencity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICIBANBENCITY(String value) {
        this.bicibanbencity = value;
    }

    /**
     * Gets the value of the gbenname property.
     * 
     * @return
     *     possible object is
     *     {@link GBENNAME }
     *     
     */
    public GBENNAME getGBENNAME() {
        return gbenname;
    }

    /**
     * Sets the value of the gbenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBENNAME }
     *     
     */
    public void setGBENNAME(GBENNAME value) {
        this.gbenname = value;
    }

    /**
     * Gets the value of the gbenaddress property.
     * 
     * @return
     *     possible object is
     *     {@link GBENADDRESS }
     *     
     */
    public GBENADDRESS getGBENADDRESS() {
        return gbenaddress;
    }

    /**
     * Sets the value of the gbenaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBENADDRESS }
     *     
     */
    public void setGBENADDRESS(GBENADDRESS value) {
        this.gbenaddress = value;
    }

    /**
     * Gets the value of the bencountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENCOUNTRY() {
        return bencountry;
    }

    /**
     * Sets the value of the bencountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENCOUNTRY(String value) {
        this.bencountry = value;
    }

    /**
     * Gets the value of the gbentown property.
     * 
     * @return
     *     possible object is
     *     {@link GBENTOWN }
     *     
     */
    public GBENTOWN getGBENTOWN() {
        return gbentown;
    }

    /**
     * Sets the value of the gbentown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBENTOWN }
     *     
     */
    public void setGBENTOWN(GBENTOWN value) {
        this.gbentown = value;
    }

    /**
     * Gets the value of the ginbenname property.
     * 
     * @return
     *     possible object is
     *     {@link GINBENNAME }
     *     
     */
    public GINBENNAME getGINBENNAME() {
        return ginbenname;
    }

    /**
     * Sets the value of the ginbenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBENNAME }
     *     
     */
    public void setGINBENNAME(GINBENNAME value) {
        this.ginbenname = value;
    }

    /**
     * Gets the value of the ginbenaddress property.
     * 
     * @return
     *     possible object is
     *     {@link GINBENADDRESS }
     *     
     */
    public GINBENADDRESS getGINBENADDRESS() {
        return ginbenaddress;
    }

    /**
     * Sets the value of the ginbenaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBENADDRESS }
     *     
     */
    public void setGINBENADDRESS(GINBENADDRESS value) {
        this.ginbenaddress = value;
    }

    /**
     * Gets the value of the inbencountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINBENCOUNTRY() {
        return inbencountry;
    }

    /**
     * Sets the value of the inbencountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINBENCOUNTRY(String value) {
        this.inbencountry = value;
    }

    /**
     * Gets the value of the ginbentown property.
     * 
     * @return
     *     possible object is
     *     {@link GINBENTOWN }
     *     
     */
    public GINBENTOWN getGINBENTOWN() {
        return ginbentown;
    }

    /**
     * Sets the value of the ginbentown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GINBENTOWN }
     *     
     */
    public void setGINBENTOWN(GINBENTOWN value) {
        this.ginbentown = value;
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
     * Gets the value of the glocequivchgs property.
     * 
     * @return
     *     possible object is
     *     {@link GLOCEQUIVCHGS }
     *     
     */
    public GLOCEQUIVCHGS getGLOCEQUIVCHGS() {
        return glocequivchgs;
    }

    /**
     * Sets the value of the glocequivchgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLOCEQUIVCHGS }
     *     
     */
    public void setGLOCEQUIVCHGS(GLOCEQUIVCHGS value) {
        this.glocequivchgs = value;
    }

    /**
     * Gets the value of the gforequivchgs property.
     * 
     * @return
     *     possible object is
     *     {@link GFOREQUIVCHGS }
     *     
     */
    public GFOREQUIVCHGS getGFOREQUIVCHGS() {
        return gforequivchgs;
    }

    /**
     * Sets the value of the gforequivchgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GFOREQUIVCHGS }
     *     
     */
    public void setGFOREQUIVCHGS(GFOREQUIVCHGS value) {
        this.gforequivchgs = value;
    }

    /**
     * Gets the value of the reserved6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED6() {
        return reserved6;
    }

    /**
     * Sets the value of the reserved6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED6(String value) {
        this.reserved6 = value;
    }

    /**
     * Gets the value of the reserved5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED5() {
        return reserved5;
    }

    /**
     * Sets the value of the reserved5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED5(String value) {
        this.reserved5 = value;
    }

    /**
     * Gets the value of the reserved4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED4() {
        return reserved4;
    }

    /**
     * Sets the value of the reserved4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED4(String value) {
        this.reserved4 = value;
    }

    /**
     * Gets the value of the reserved3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED3() {
        return reserved3;
    }

    /**
     * Sets the value of the reserved3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED3(String value) {
        this.reserved3 = value;
    }

    /**
     * Gets the value of the reserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED2() {
        return reserved2;
    }

    /**
     * Sets the value of the reserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED2(String value) {
        this.reserved2 = value;
    }

    /**
     * Gets the value of the reserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVED1() {
        return reserved1;
    }

    /**
     * Sets the value of the reserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVED1(String value) {
        this.reserved1 = value;
    }

    /**
     * Gets the value of the gstmtnos property.
     * 
     * @return
     *     possible object is
     *     {@link GSTMTNOS }
     *     
     */
    public GSTMTNOS getGSTMTNOS() {
        return gstmtnos;
    }

    /**
     * Sets the value of the gstmtnos property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSTMTNOS }
     *     
     */
    public void setGSTMTNOS(GSTMTNOS value) {
        this.gstmtnos = value;
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
     * Gets the value of the whlttax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHLTTAX() {
        return whlttax;
    }

    /**
     * Sets the value of the whlttax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHLTTAX(String value) {
        this.whlttax = value;
    }

    /**
     * Gets the value of the immediately property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMMEDIATELY() {
        return immediately;
    }

    /**
     * Sets the value of the immediately property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMMEDIATELY(String value) {
        this.immediately = value;
    }

    /**
     * Gets the value of the futuredate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUTUREDATE() {
        return futuredate;
    }

    /**
     * Sets the value of the futuredate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUTUREDATE(String value) {
        this.futuredate = value;
    }

    /**
     * Gets the value of the payto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYTO() {
        return payto;
    }

    /**
     * Sets the value of the payto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYTO(String value) {
        this.payto = value;
    }

    /**
     * Gets the value of the acctworkbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTWORKBAL() {
        return acctworkbal;
    }

    /**
     * Sets the value of the acctworkbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTWORKBAL(String value) {
        this.acctworkbal = value;
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
     * Gets the value of the amtarrears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMTARREARS() {
        return amtarrears;
    }

    /**
     * Sets the value of the amtarrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMTARREARS(String value) {
        this.amtarrears = value;
    }

    /**
     * Gets the value of the drfullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRFULLNAME() {
        return drfullname;
    }

    /**
     * Sets the value of the drfullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRFULLNAME(String value) {
        this.drfullname = value;
    }

    /**
     * Gets the value of the drworkbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRWORKBAL() {
        return drworkbal;
    }

    /**
     * Sets the value of the drworkbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRWORKBAL(String value) {
        this.drworkbal = value;
    }

    /**
     * Gets the value of the crfullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRFULLNAME() {
        return crfullname;
    }

    /**
     * Sets the value of the crfullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRFULLNAME(String value) {
        this.crfullname = value;
    }

    /**
     * Gets the value of the crworkbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRWORKBAL() {
        return crworkbal;
    }

    /**
     * Sets the value of the crworkbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRWORKBAL(String value) {
        this.crworkbal = value;
    }

    /**
     * Gets the value of the repayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPAYMENT() {
        return repayment;
    }

    /**
     * Sets the value of the repayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPAYMENT(String value) {
        this.repayment = value;
    }

    /**
     * Gets the value of the intrepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTREPAYMENT() {
        return intrepayment;
    }

    /**
     * Sets the value of the intrepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTREPAYMENT(String value) {
        this.intrepayment = value;
    }

    /**
     * Gets the value of the interestdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTERESTDUE() {
        return interestdue;
    }

    /**
     * Sets the value of the interestdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTERESTDUE(String value) {
        this.interestdue = value;
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
     * Gets the value of the drawacctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWACCTNO() {
        return drawacctno;
    }

    /**
     * Sets the value of the drawacctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWACCTNO(String value) {
        this.drawacctno = value;
    }

    /**
     * Gets the value of the drawbrchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWBRCHCODE() {
        return drawbrchcode;
    }

    /**
     * Sets the value of the drawbrchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWBRCHCODE(String value) {
        this.drawbrchcode = value;
    }

    /**
     * Gets the value of the emftbitemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMFTBITEMID() {
        return emftbitemid;
    }

    /**
     * Sets the value of the emftbitemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMFTBITEMID(String value) {
        this.emftbitemid = value;
    }

    /**
     * Gets the value of the recoveryacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOVERYACCT() {
        return recoveryacct;
    }

    /**
     * Sets the value of the recoveryacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOVERYACCT(String value) {
        this.recoveryacct = value;
    }

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the productcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTCODE() {
        return productcode;
    }

    /**
     * Sets the value of the productcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTCODE(String value) {
        this.productcode = value;
    }

    /**
     * Gets the value of the atuniqueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATUNIQUEID() {
        return atuniqueid;
    }

    /**
     * Sets the value of the atuniqueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATUNIQUEID(String value) {
        this.atuniqueid = value;
    }

    /**
     * Gets the value of the balafttxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALAFTTXN() {
        return balafttxn;
    }

    /**
     * Sets the value of the balafttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALAFTTXN(String value) {
        this.balafttxn = value;
    }

    /**
     * Gets the value of the atauthcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATAUTHCODE() {
        return atauthcode;
    }

    /**
     * Sets the value of the atauthcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATAUTHCODE(String value) {
        this.atauthcode = value;
    }

    /**
     * Gets the value of the atterminalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTERMINALID() {
        return atterminalid;
    }

    /**
     * Sets the value of the atterminalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTERMINALID(String value) {
        this.atterminalid = value;
    }

    /**
     * Gets the value of the binno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBINNO() {
        return binno;
    }

    /**
     * Sets the value of the binno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBINNO(String value) {
        this.binno = value;
    }

    /**
     * Gets the value of the draccttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRACCTTYPE() {
        return draccttype;
    }

    /**
     * Sets the value of the draccttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRACCTTYPE(String value) {
        this.draccttype = value;
    }

    /**
     * Gets the value of the craccttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRACCTTYPE() {
        return craccttype;
    }

    /**
     * Sets the value of the craccttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRACCTTYPE(String value) {
        this.craccttype = value;
    }

    /**
     * Gets the value of the coveramount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVERAMOUNT() {
        return coveramount;
    }

    /**
     * Sets the value of the coveramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVERAMOUNT(String value) {
        this.coveramount = value;
    }

    /**
     * Gets the value of the chequebounced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUEBOUNCED() {
        return chequebounced;
    }

    /**
     * Sets the value of the chequebounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUEBOUNCED(String value) {
        this.chequebounced = value;
    }

    /**
     * Gets the value of the ftversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTVERSION() {
        return ftversion;
    }

    /**
     * Sets the value of the ftversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTVERSION(String value) {
        this.ftversion = value;
    }

    /**
     * Gets the value of the afyainscom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFYAINSCOM() {
        return afyainscom;
    }

    /**
     * Sets the value of the afyainscom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFYAINSCOM(String value) {
        this.afyainscom = value;
    }

    /**
     * Gets the value of the exdut1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXDUT1() {
        return exdut1;
    }

    /**
     * Sets the value of the exdut1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXDUT1(String value) {
        this.exdut1 = value;
    }

    /**
     * Gets the value of the exciseduty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCISEDUTY() {
        return exciseduty;
    }

    /**
     * Sets the value of the exciseduty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCISEDUTY(String value) {
        this.exciseduty = value;
    }

    /**
     * Gets the value of the chqacctdbcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHQACCTDBCR() {
        return chqacctdbcr;
    }

    /**
     * Sets the value of the chqacctdbcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHQACCTDBCR(String value) {
        this.chqacctdbcr = value;
    }

    /**
     * Gets the value of the odorglimamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODORGLIMAMT() {
        return odorglimamt;
    }

    /**
     * Sets the value of the odorglimamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODORGLIMAMT(String value) {
        this.odorglimamt = value;
    }

    /**
     * Gets the value of the odamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODAMOUNT() {
        return odamount;
    }

    /**
     * Sets the value of the odamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODAMOUNT(String value) {
        this.odamount = value;
    }

    /**
     * Gets the value of the odexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODEXPIRYDATE() {
        return odexpirydate;
    }

    /**
     * Sets the value of the odexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODEXPIRYDATE(String value) {
        this.odexpirydate = value;
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
     * Gets the value of the afyapremium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFYAPREMIUM() {
        return afyapremium;
    }

    /**
     * Sets the value of the afyapremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFYAPREMIUM(String value) {
        this.afyapremium = value;
    }

    /**
     * Gets the value of the othbnqacct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHBNQACCT() {
        return othbnqacct;
    }

    /**
     * Sets the value of the othbnqacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHBNQACCT(String value) {
        this.othbnqacct = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILENAME() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILENAME(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the drawchqno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWCHQNO() {
        return drawchqno;
    }

    /**
     * Sets the value of the drawchqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWCHQNO(String value) {
        this.drawchqno = value;
    }

    /**
     * Gets the value of the drawcustname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRAWCUSTNAME() {
        return drawcustname;
    }

    /**
     * Sets the value of the drawcustname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRAWCUSTNAME(String value) {
        this.drawcustname = value;
    }

    /**
     * Gets the value of the depositorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITORNAME() {
        return depositorname;
    }

    /**
     * Sets the value of the depositorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITORNAME(String value) {
        this.depositorname = value;
    }

    /**
     * Gets the value of the depositercont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITERCONT() {
        return depositercont;
    }

    /**
     * Sets the value of the depositercont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITERCONT(String value) {
        this.depositercont = value;
    }

    /**
     * Gets the value of the depositiddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITIDDESC() {
        return depositiddesc;
    }

    /**
     * Sets the value of the depositiddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITIDDESC(String value) {
        this.depositiddesc = value;
    }

    /**
     * Gets the value of the depositidnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPOSITIDNUM() {
        return depositidnum;
    }

    /**
     * Sets the value of the depositidnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPOSITIDNUM(String value) {
        this.depositidnum = value;
    }

    /**
     * Gets the value of the typepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEPAYMENT() {
        return typepayment;
    }

    /**
     * Sets the value of the typepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEPAYMENT(String value) {
        this.typepayment = value;
    }

    /**
     * Gets the value of the smsrefid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSREFID() {
        return smsrefid;
    }

    /**
     * Sets the value of the smsrefid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSREFID(String value) {
        this.smsrefid = value;
    }

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTTYPE() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTTYPE(String value) {
        this.paymenttype = value;
    }

    /**
     * Gets the value of the mpesareference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPESAREFERENCE() {
        return mpesareference;
    }

    /**
     * Sets the value of the mpesareference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPESAREFERENCE(String value) {
        this.mpesareference = value;
    }

    /**
     * Gets the value of the aadepositid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAADEPOSITID() {
        return aadepositid;
    }

    /**
     * Sets the value of the aadepositid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAADEPOSITID(String value) {
        this.aadepositid = value;
    }

    /**
     * Gets the value of the fklcustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKLCUSTOMER() {
        return fklcustomer;
    }

    /**
     * Sets the value of the fklcustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKLCUSTOMER(String value) {
        this.fklcustomer = value;
    }

    /**
     * Gets the value of the balafttxn1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBALAFTTXN1() {
        return balafttxn1;
    }

    /**
     * Sets the value of the balafttxn1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBALAFTTXN1(String value) {
        this.balafttxn1 = value;
    }

    /**
     * Gets the value of the losid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOSID() {
        return losid;
    }

    /**
     * Sets the value of the losid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOSID(String value) {
        this.losid = value;
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
     * Gets the value of the aaloanid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAALOANID() {
        return aaloanid;
    }

    /**
     * Sets the value of the aaloanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAALOANID(String value) {
        this.aaloanid = value;
    }

    /**
     * Gets the value of the losaaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOSAAID() {
        return losaaid;
    }

    /**
     * Sets the value of the losaaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOSAAID(String value) {
        this.losaaid = value;
    }

    /**
     * Gets the value of the fklinputter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKLINPUTTER() {
        return fklinputter;
    }

    /**
     * Sets the value of the fklinputter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKLINPUTTER(String value) {
        this.fklinputter = value;
    }

    /**
     * Gets the value of the fklauthoriser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKLAUTHORISER() {
        return fklauthoriser;
    }

    /**
     * Sets the value of the fklauthoriser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKLAUTHORISER(String value) {
        this.fklauthoriser = value;
    }

    /**
     * Gets the value of the fkluploadfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKLUPLOADFILE() {
        return fkluploadfile;
    }

    /**
     * Sets the value of the fkluploadfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKLUPLOADFILE(String value) {
        this.fkluploadfile = value;
    }

    /**
     * Gets the value of the fklrepayamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKLREPAYAMT() {
        return fklrepayamt;
    }

    /**
     * Sets the value of the fklrepayamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKLREPAYAMT(String value) {
        this.fklrepayamt = value;
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
     *         &lt;element name="ACCTWITHBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "acctwithbank"
    })
    public static class GACCTWITHBANK {

        @XmlElement(name = "ACCTWITHBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> acctwithbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the acctwithbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctwithbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACCTWITHBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getACCTWITHBANK() {
            if (acctwithbank == null) {
                acctwithbank = new ArrayList<String>();
            }
            return this.acctwithbank;
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
     *         &lt;element name="ACCTWITHBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "acctwithbk"
    })
    public static class GACCTWITHBK {

        @XmlElement(name = "ACCTWITHBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> acctwithbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the acctwithbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctwithbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACCTWITHBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getACCTWITHBK() {
            if (acctwithbk == null) {
                acctwithbk = new ArrayList<String>();
            }
            return this.acctwithbk;
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
     *         &lt;element name="BENADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "benaddress"
    })
    public static class GBENADDRESS {

        @XmlElement(name = "BENADDRESS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> benaddress;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the benaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the benaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBENADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBENADDRESS() {
            if (benaddress == null) {
                benaddress = new ArrayList<String>();
            }
            return this.benaddress;
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
     *         &lt;element name="BENBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "benbank"
    })
    public static class GBENBANK {

        @XmlElement(name = "BENBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> benbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the benbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the benbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBENBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBENBANK() {
            if (benbank == null) {
                benbank = new ArrayList<String>();
            }
            return this.benbank;
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
     *         &lt;element name="BENCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "bencustomer"
    })
    public static class GBENCUSTOMER {

        @XmlElement(name = "BENCUSTOMER", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> bencustomer;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the bencustomer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bencustomer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBENCUSTOMER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBENCUSTOMER() {
            if (bencustomer == null) {
                bencustomer = new ArrayList<String>();
            }
            return this.bencustomer;
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
     *         &lt;element name="BENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "benname"
    })
    public static class GBENNAME {

        @XmlElement(name = "BENNAME", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> benname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the benname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the benname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBENNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBENNAME() {
            if (benname == null) {
                benname = new ArrayList<String>();
            }
            return this.benname;
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
     *         &lt;element name="BENTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "bentown"
    })
    public static class GBENTOWN {

        @XmlElement(name = "BENTOWN", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> bentown;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the bentown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bentown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBENTOWN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBENTOWN() {
            if (bentown == null) {
                bentown = new ArrayList<String>();
            }
            return this.bentown;
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
     *         &lt;element name="BICIBANBENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "bicibanbenname"
    })
    public static class GBICIBANBENNAME {

        @XmlElement(name = "BICIBANBENNAME", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> bicibanbenname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the bicibanbenname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bicibanbenname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBICIBANBENNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBICIBANBENNAME() {
            if (bicibanbenname == null) {
                bicibanbenname = new ArrayList<String>();
            }
            return this.bicibanbenname;
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
     *         &lt;element name="BKTOBKINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "bktobkinfo"
    })
    public static class GBKTOBKINFO {

        @XmlElement(name = "BKTOBKINFO", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> bktobkinfo;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the bktobkinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bktobkinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBKTOBKINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBKTOBKINFO() {
            if (bktobkinfo == null) {
                bktobkinfo = new ArrayList<String>();
            }
            return this.bktobkinfo;
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
     *         &lt;element name="CARDTXNDETAIL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "cardtxndetail"
    })
    public static class GCARDTXNDETAIL {

        @XmlElement(name = "CARDTXNDETAIL", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> cardtxndetail;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the cardtxndetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cardtxndetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCARDTXNDETAIL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCARDTXNDETAIL() {
            if (cardtxndetail == null) {
                cardtxndetail = new ArrayList<String>();
            }
            return this.cardtxndetail;
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
     *         &lt;element name="mCHARGETYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CHARGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CHARGEFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mchargetype"
    })
    public static class GCHARGETYPE {

        @XmlElement(name = "mCHARGETYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MCHARGETYPE> mchargetype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mchargetype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mchargetype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCHARGETYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCHARGETYPE }
         * 
         * 
         */
        public List<MCHARGETYPE> getMCHARGETYPE() {
            if (mchargetype == null) {
                mchargetype = new ArrayList<MCHARGETYPE>();
            }
            return this.mchargetype;
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
         *         &lt;element name="CHARGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHARGEAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CHARGEFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "chargetype",
            "chargeamt",
            "chargefor"
        })
        public static class MCHARGETYPE {

            @XmlElement(name = "CHARGETYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String chargetype;
            @XmlElement(name = "CHARGEAMT", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String chargeamt;
            @XmlElement(name = "CHARGEFOR", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String chargefor;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the chargetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHARGETYPE() {
                return chargetype;
            }

            /**
             * Sets the value of the chargetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHARGETYPE(String value) {
                this.chargetype = value;
            }

            /**
             * Gets the value of the chargeamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHARGEAMT() {
                return chargeamt;
            }

            /**
             * Sets the value of the chargeamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHARGEAMT(String value) {
                this.chargeamt = value;
            }

            /**
             * Gets the value of the chargefor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHARGEFOR() {
                return chargefor;
            }

            /**
             * Sets the value of the chargefor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHARGEFOR(String value) {
                this.chargefor = value;
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
     *         &lt;element name="mCOMMISSIONTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="COMMISSIONFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mcommissiontype"
    })
    public static class GCOMMISSIONTYPE {

        @XmlElement(name = "mCOMMISSIONTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MCOMMISSIONTYPE> mcommissiontype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mcommissiontype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mcommissiontype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMCOMMISSIONTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MCOMMISSIONTYPE }
         * 
         * 
         */
        public List<MCOMMISSIONTYPE> getMCOMMISSIONTYPE() {
            if (mcommissiontype == null) {
                mcommissiontype = new ArrayList<MCOMMISSIONTYPE>();
            }
            return this.mcommissiontype;
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
         *         &lt;element name="COMMISSIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COMMISSIONAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="COMMISSIONFOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "commissiontype",
            "commissionamt",
            "commissionfor"
        })
        public static class MCOMMISSIONTYPE {

            @XmlElement(name = "COMMISSIONTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String commissiontype;
            @XmlElement(name = "COMMISSIONAMT", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String commissionamt;
            @XmlElement(name = "COMMISSIONFOR", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String commissionfor;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the commissiontype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONTYPE() {
                return commissiontype;
            }

            /**
             * Sets the value of the commissiontype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONTYPE(String value) {
                this.commissiontype = value;
            }

            /**
             * Gets the value of the commissionamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONAMT() {
                return commissionamt;
            }

            /**
             * Sets the value of the commissionamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONAMT(String value) {
                this.commissionamt = value;
            }

            /**
             * Gets the value of the commissionfor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMMISSIONFOR() {
                return commissionfor;
            }

            /**
             * Sets the value of the commissionfor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMMISSIONFOR(String value) {
                this.commissionfor = value;
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

        @XmlElement(name = "DATETIME", namespace = "http://temenos.com/FUNDSTRANSFER")
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
     *         &lt;element name="DELIVERYOUTREF" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "deliveryoutref"
    })
    public static class GDELIVERYOUTREF {

        @XmlElement(name = "DELIVERYOUTREF", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> deliveryoutref;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the deliveryoutref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryoutref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDELIVERYOUTREF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDELIVERYOUTREF() {
            if (deliveryoutref == null) {
                deliveryoutref = new ArrayList<String>();
            }
            return this.deliveryoutref;
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
     *         &lt;element name="EXTENDINFO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "extendinfo"
    })
    public static class GEXTENDINFO {

        @XmlElement(name = "EXTENDINFO", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> extendinfo;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the extendinfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extendinfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXTENDINFO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEXTENDINFO() {
            if (extendinfo == null) {
                extendinfo = new ArrayList<String>();
            }
            return this.extendinfo;
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
     *         &lt;element name="FOREQUIVCHGS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "forequivchgs"
    })
    public static class GFOREQUIVCHGS {

        @XmlElement(name = "FOREQUIVCHGS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> forequivchgs;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the forequivchgs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forequivchgs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFOREQUIVCHGS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFOREQUIVCHGS() {
            if (forequivchgs == null) {
                forequivchgs = new ArrayList<String>();
            }
            return this.forequivchgs;
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
     *         &lt;element name="FREETEXTMSGTO" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "freetextmsgto"
    })
    public static class GFREETEXTMSGTO {

        @XmlElement(name = "FREETEXTMSGTO", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> freetextmsgto;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the freetextmsgto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freetextmsgto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFREETEXTMSGTO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFREETEXTMSGTO() {
            if (freetextmsgto == null) {
                freetextmsgto = new ArrayList<String>();
            }
            return this.freetextmsgto;
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
     *         &lt;element name="IN3RDREIMBBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "in3RDREIMBBK"
    })
    public static class GIN3RDREIMBBK {

        @XmlElement(name = "IN3RDREIMBBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> in3RDREIMBBK;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the in3RDREIMBBK property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the in3RDREIMBBK property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIN3RDREIMBBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIN3RDREIMBBK() {
            if (in3RDREIMBBK == null) {
                in3RDREIMBBK = new ArrayList<String>();
            }
            return this.in3RDREIMBBK;
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
     *         &lt;element name="INBENADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbenaddress"
    })
    public static class GINBENADDRESS {

        @XmlElement(name = "INBENADDRESS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbenaddress;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbenaddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbenaddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBENADDRESS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBENADDRESS() {
            if (inbenaddress == null) {
                inbenaddress = new ArrayList<String>();
            }
            return this.inbenaddress;
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
     *         &lt;element name="INBENBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbenbank"
    })
    public static class GINBENBANK {

        @XmlElement(name = "INBENBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbenbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbenbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbenbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBENBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBENBANK() {
            if (inbenbank == null) {
                inbenbank = new ArrayList<String>();
            }
            return this.inbenbank;
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
     *         &lt;element name="INBENCUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbencustomer"
    })
    public static class GINBENCUSTOMER {

        @XmlElement(name = "INBENCUSTOMER", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbencustomer;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbencustomer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbencustomer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBENCUSTOMER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBENCUSTOMER() {
            if (inbencustomer == null) {
                inbencustomer = new ArrayList<String>();
            }
            return this.inbencustomer;
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
     *         &lt;element name="INBENNAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbenname"
    })
    public static class GINBENNAME {

        @XmlElement(name = "INBENNAME", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbenname;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbenname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbenname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBENNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBENNAME() {
            if (inbenname == null) {
                inbenname = new ArrayList<String>();
            }
            return this.inbenname;
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
     *         &lt;element name="INBENTOWN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbentown"
    })
    public static class GINBENTOWN {

        @XmlElement(name = "INBENTOWN", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbentown;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbentown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbentown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBENTOWN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBENTOWN() {
            if (inbentown == null) {
                inbentown = new ArrayList<String>();
            }
            return this.inbentown;
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
     *         &lt;element name="INBKTOBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inbktobk"
    })
    public static class GINBKTOBK {

        @XmlElement(name = "INBKTOBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inbktobk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inbktobk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inbktobk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINBKTOBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINBKTOBK() {
            if (inbktobk == null) {
                inbktobk = new ArrayList<String>();
            }
            return this.inbktobk;
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
     *         &lt;element name="INCACCWITBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "incaccwitbk"
    })
    public static class GINCACCWITBK {

        @XmlElement(name = "INCACCWITBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> incaccwitbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the incaccwitbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incaccwitbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCACCWITBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINCACCWITBK() {
            if (incaccwitbk == null) {
                incaccwitbk = new ArrayList<String>();
            }
            return this.incaccwitbk;
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
     *         &lt;element name="INCBKTBKIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "incbktbkin"
    })
    public static class GINCBKTBKIN {

        @XmlElement(name = "INCBKTBKIN", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> incbktbkin;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the incbktbkin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incbktbkin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCBKTBKIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINCBKTBKIN() {
            if (incbktbkin == null) {
                incbktbkin = new ArrayList<String>();
            }
            return this.incbktbkin;
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
     *         &lt;element name="INCINTMEDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "incintmedbk"
    })
    public static class GINCINTMEDBK {

        @XmlElement(name = "INCINTMEDBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> incintmedbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the incintmedbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incintmedbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCINTMEDBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINCINTMEDBK() {
            if (incintmedbk == null) {
                incintmedbk = new ArrayList<String>();
            }
            return this.incintmedbk;
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
     *         &lt;element name="INCORDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "incordbk"
    })
    public static class GINCORDBK {

        @XmlElement(name = "INCORDBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> incordbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the incordbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incordbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINCORDBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINCORDBK() {
            if (incordbk == null) {
                incordbk = new ArrayList<String>();
            }
            return this.incordbk;
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
     *         &lt;element name="ININSTRCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "ininstrcode"
    })
    public static class GININSTRCODE {

        @XmlElement(name = "ININSTRCODE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> ininstrcode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the ininstrcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ininstrcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getININSTRCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getININSTRCODE() {
            if (ininstrcode == null) {
                ininstrcode = new ArrayList<String>();
            }
            return this.ininstrcode;
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
     *         &lt;element name="ININTERMEDBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inintermedbk"
    })
    public static class GININTERMEDBK {

        @XmlElement(name = "ININTERMEDBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inintermedbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inintermedbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inintermedbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getININTERMEDBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getININTERMEDBK() {
            if (inintermedbk == null) {
                inintermedbk = new ArrayList<String>();
            }
            return this.inintermedbk;
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
     *         &lt;element name="ININTMEDBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inintmedbank"
    })
    public static class GININTMEDBANK {

        @XmlElement(name = "ININTMEDBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inintmedbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inintmedbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inintmedbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getININTMEDBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getININTMEDBANK() {
            if (inintmedbank == null) {
                inintmedbank = new ArrayList<String>();
            }
            return this.inintmedbank;
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
     *         &lt;element name="INORDERINGBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inorderingbk"
    })
    public static class GINORDERINGBK {

        @XmlElement(name = "INORDERINGBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inorderingbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inorderingbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inorderingbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINORDERINGBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINORDERINGBK() {
            if (inorderingbk == null) {
                inorderingbk = new ArrayList<String>();
            }
            return this.inorderingbk;
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
     *         &lt;element name="INORDERINGCUS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inorderingcus"
    })
    public static class GINORDERINGCUS {

        @XmlElement(name = "INORDERINGCUS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inorderingcus;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inorderingcus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inorderingcus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINORDERINGCUS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINORDERINGCUS() {
            if (inorderingcus == null) {
                inorderingcus = new ArrayList<String>();
            }
            return this.inorderingcus;
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
     *         &lt;element name="INPAYDETAILS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inpaydetails"
    })
    public static class GINPAYDETAILS {

        @XmlElement(name = "INPAYDETAILS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inpaydetails;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inpaydetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inpaydetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPAYDETAILS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPAYDETAILS() {
            if (inpaydetails == null) {
                inpaydetails = new ArrayList<String>();
            }
            return this.inpaydetails;
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
     *         &lt;element name="INPROCESSERR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inprocesserr"
    })
    public static class GINPROCESSERR {

        @XmlElement(name = "INPROCESSERR", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inprocesserr;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inprocesserr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inprocesserr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINPROCESSERR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINPROCESSERR() {
            if (inprocesserr == null) {
                inprocesserr = new ArrayList<String>();
            }
            return this.inprocesserr;
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

        @XmlElement(name = "INPUTTER", namespace = "http://temenos.com/FUNDSTRANSFER")
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
     *         &lt;element name="INREASONOVE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inreasonove"
    })
    public static class GINREASONOVE {

        @XmlElement(name = "INREASONOVE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inreasonove;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inreasonove property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inreasonove property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINREASONOVE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINREASONOVE() {
            if (inreasonove == null) {
                inreasonove = new ArrayList<String>();
            }
            return this.inreasonove;
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
     *         &lt;element name="INRECCORRBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inreccorrbk"
    })
    public static class GINRECCORRBK {

        @XmlElement(name = "INRECCORRBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inreccorrbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inreccorrbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inreccorrbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINRECCORRBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINRECCORRBK() {
            if (inreccorrbk == null) {
                inreccorrbk = new ArrayList<String>();
            }
            return this.inreccorrbk;
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
     *         &lt;element name="INSENDCHG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "insendchg"
    })
    public static class GINSENDCHG {

        @XmlElement(name = "INSENDCHG", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> insendchg;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the insendchg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insendchg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSENDCHG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINSENDCHG() {
            if (insendchg == null) {
                insendchg = new ArrayList<String>();
            }
            return this.insendchg;
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
     *         &lt;element name="INSENDCORRBK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "insendcorrbk"
    })
    public static class GINSENDCORRBK {

        @XmlElement(name = "INSENDCORRBK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> insendcorrbk;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the insendcorrbk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insendcorrbk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSENDCORRBK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINSENDCORRBK() {
            if (insendcorrbk == null) {
                insendcorrbk = new ArrayList<String>();
            }
            return this.insendcorrbk;
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
     *                   &lt;element name="MEMBERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRVDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRDINSREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATEDEPART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DATERETURN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WINTERSPORTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="POLNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

        @XmlElement(name = "mINS.MEM.NO", namespace = "http://temenos.com/FUNDSTRANSFER")
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
         *         &lt;element name="MEMBERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TITLE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSSUBURB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSCITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INSSTATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEOFBIRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRVDEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRDINSREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATEDEPART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DATERETURN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WINTERSPORTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="POLNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "membername",
            "title1",
            "insaddress",
            "inssuburb",
            "inscity",
            "insstate",
            "dateofbirth",
            "age",
            "trvdest",
            "prdinsreq",
            "datedepart",
            "datereturn",
            "wintersports",
            "polnumber"
        })
        public static class MINSMEMNO {

            @XmlElement(name = "INSMEMNO", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String insmemno;
            @XmlElement(name = "INSSURNAME", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String inssurname;
            @XmlElement(name = "MEMBERNAME", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String membername;
            @XmlElement(name = "TITLE1", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String title1;
            @XmlElement(name = "INSADDRESS", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String insaddress;
            @XmlElement(name = "INSSUBURB", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String inssuburb;
            @XmlElement(name = "INSCITY", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String inscity;
            @XmlElement(name = "INSSTATE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String insstate;
            @XmlElement(name = "DATEOFBIRTH", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String dateofbirth;
            @XmlElement(name = "AGE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String age;
            @XmlElement(name = "TRVDEST", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String trvdest;
            @XmlElement(name = "PRDINSREQ", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String prdinsreq;
            @XmlElement(name = "DATEDEPART", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String datedepart;
            @XmlElement(name = "DATERETURN", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String datereturn;
            @XmlElement(name = "WINTERSPORTS", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String wintersports;
            @XmlElement(name = "POLNUMBER", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String polnumber;
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
             * Gets the value of the membername property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMEMBERNAME() {
                return membername;
            }

            /**
             * Sets the value of the membername property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMEMBERNAME(String value) {
                this.membername = value;
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
             * Gets the value of the trvdest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRVDEST() {
                return trvdest;
            }

            /**
             * Sets the value of the trvdest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRVDEST(String value) {
                this.trvdest = value;
            }

            /**
             * Gets the value of the prdinsreq property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRDINSREQ() {
                return prdinsreq;
            }

            /**
             * Sets the value of the prdinsreq property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRDINSREQ(String value) {
                this.prdinsreq = value;
            }

            /**
             * Gets the value of the datedepart property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATEDEPART() {
                return datedepart;
            }

            /**
             * Sets the value of the datedepart property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATEDEPART(String value) {
                this.datedepart = value;
            }

            /**
             * Gets the value of the datereturn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDATERETURN() {
                return datereturn;
            }

            /**
             * Sets the value of the datereturn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDATERETURN(String value) {
                this.datereturn = value;
            }

            /**
             * Gets the value of the wintersports property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWINTERSPORTS() {
                return wintersports;
            }

            /**
             * Sets the value of the wintersports property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWINTERSPORTS(String value) {
                this.wintersports = value;
            }

            /**
             * Gets the value of the polnumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOLNUMBER() {
                return polnumber;
            }

            /**
             * Sets the value of the polnumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOLNUMBER(String value) {
                this.polnumber = value;
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
     *         &lt;element name="INSTRCTNCODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "instrctncode"
    })
    public static class GINSTRCTNCODE {

        @XmlElement(name = "INSTRCTNCODE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> instrctncode;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the instrctncode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instrctncode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSTRCTNCODE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINSTRCTNCODE() {
            if (instrctncode == null) {
                instrctncode = new ArrayList<String>();
            }
            return this.instrctncode;
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
     *         &lt;element name="INSWIFTMSG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "inswiftmsg"
    })
    public static class GINSWIFTMSG {

        @XmlElement(name = "INSWIFTMSG", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> inswiftmsg;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the inswiftmsg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inswiftmsg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINSWIFTMSG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINSWIFTMSG() {
            if (inswiftmsg == null) {
                inswiftmsg = new ArrayList<String>();
            }
            return this.inswiftmsg;
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
     *         &lt;element name="INTERMEDBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "intermedbank"
    })
    public static class GINTERMEDBANK {

        @XmlElement(name = "INTERMEDBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> intermedbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the intermedbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intermedbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTERMEDBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINTERMEDBANK() {
            if (intermedbank == null) {
                intermedbank = new ArrayList<String>();
            }
            return this.intermedbank;
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
     *         &lt;element name="INTIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "intimeind"
    })
    public static class GINTIMEIND {

        @XmlElement(name = "INTIMEIND", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> intimeind;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the intimeind property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intimeind property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINTIMEIND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINTIMEIND() {
            if (intimeind == null) {
                intimeind = new ArrayList<String>();
            }
            return this.intimeind;
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
     *         &lt;element name="LOCEQUIVCHGS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "locequivchgs"
    })
    public static class GLOCEQUIVCHGS {

        @XmlElement(name = "LOCEQUIVCHGS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> locequivchgs;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the locequivchgs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locequivchgs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCEQUIVCHGS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLOCEQUIVCHGS() {
            if (locequivchgs == null) {
                locequivchgs = new ArrayList<String>();
            }
            return this.locequivchgs;
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
     *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "message"
    })
    public static class GMESSAGE {

        @XmlElement(name = "MESSAGE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> message;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMESSAGE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMESSAGE() {
            if (message == null) {
                message = new ArrayList<String>();
            }
            return this.message;
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
     *         &lt;element name="mMSGTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MSGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mmsgtype"
    })
    public static class GMSGTYPE {

        @XmlElement(name = "mMSGTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MMSGTYPE> mmsgtype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mmsgtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mmsgtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMMSGTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MMSGTYPE }
         * 
         * 
         */
        public List<MMSGTYPE> getMMSGTYPE() {
            if (mmsgtype == null) {
                mmsgtype = new ArrayList<MMSGTYPE>();
            }
            return this.mmsgtype;
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
         *         &lt;element name="MSGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MSGDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "msgtype",
            "msgdate"
        })
        public static class MMSGTYPE {

            @XmlElement(name = "MSGTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String msgtype;
            @XmlElement(name = "MSGDATE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String msgdate;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the msgtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMSGTYPE() {
                return msgtype;
            }

            /**
             * Sets the value of the msgtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMSGTYPE(String value) {
                this.msgtype = value;
            }

            /**
             * Gets the value of the msgdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMSGDATE() {
                return msgdate;
            }

            /**
             * Sets the value of the msgdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMSGDATE(String value) {
                this.msgdate = value;
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
     *         &lt;element name="ORDERINGBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "orderingbank"
    })
    public static class GORDERINGBANK {

        @XmlElement(name = "ORDERINGBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> orderingbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the orderingbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderingbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORDERINGBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getORDERINGBANK() {
            if (orderingbank == null) {
                orderingbank = new ArrayList<String>();
            }
            return this.orderingbank;
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
     *         &lt;element name="ORDERINGCUST" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "orderingcust"
    })
    public static class GORDERINGCUST {

        @XmlElement(name = "ORDERINGCUST", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> orderingcust;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the orderingcust property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderingcust property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORDERINGCUST().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getORDERINGCUST() {
            if (orderingcust == null) {
                orderingcust = new ArrayList<String>();
            }
            return this.orderingcust;
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

        @XmlElement(name = "OVERRIDE", namespace = "http://temenos.com/FUNDSTRANSFER")
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

        @XmlElement(name = "PAYMENTDETAILS", namespace = "http://temenos.com/FUNDSTRANSFER")
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
     *         &lt;element name="RECCORRBANK" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "reccorrbank"
    })
    public static class GRECCORRBANK {

        @XmlElement(name = "RECCORRBANK", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> reccorrbank;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the reccorrbank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reccorrbank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECCORRBANK().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRECCORRBANK() {
            if (reccorrbank == null) {
                reccorrbank = new ArrayList<String>();
            }
            return this.reccorrbank;
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

        @XmlElement(name = "mREFDATAITEM", namespace = "http://temenos.com/FUNDSTRANSFER")
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

            @XmlElement(name = "REFDATAITEM", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String refdataitem;
            @XmlElement(name = "REFDATAVALUE", namespace = "http://temenos.com/FUNDSTRANSFER")
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
     *         &lt;element name="mRELATEDMSG" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RELATEDMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgTIMEIND" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TIMEIND" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mrelatedmsg"
    })
    public static class GRELATEDMSG {

        @XmlElement(name = "mRELATEDMSG", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MRELATEDMSG> mrelatedmsg;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mrelatedmsg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mrelatedmsg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMRELATEDMSG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MRELATEDMSG }
         * 
         * 
         */
        public List<MRELATEDMSG> getMRELATEDMSG() {
            if (mrelatedmsg == null) {
                mrelatedmsg = new ArrayList<MRELATEDMSG>();
            }
            return this.mrelatedmsg;
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
         *         &lt;element name="RELATEDMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgTIMEIND" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TIMEIND" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "relatedmsg",
            "sgTIMEIND"
        })
        public static class MRELATEDMSG {

            @XmlElement(name = "RELATEDMSG", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String relatedmsg;
            @XmlElement(namespace = "http://temenos.com/FUNDSTRANSFER")
            protected SgTIMEIND sgTIMEIND;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the relatedmsg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRELATEDMSG() {
                return relatedmsg;
            }

            /**
             * Sets the value of the relatedmsg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRELATEDMSG(String value) {
                this.relatedmsg = value;
            }

            /**
             * Gets the value of the sgTIMEIND property.
             * 
             * @return
             *     possible object is
             *     {@link SgTIMEIND }
             *     
             */
            public SgTIMEIND getSgTIMEIND() {
                return sgTIMEIND;
            }

            /**
             * Sets the value of the sgTIMEIND property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgTIMEIND }
             *     
             */
            public void setSgTIMEIND(SgTIMEIND value) {
                this.sgTIMEIND = value;
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
             *         &lt;element name="TIMEIND" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "timeind"
            })
            public static class SgTIMEIND {

                @XmlElement(name = "TIMEIND", namespace = "http://temenos.com/FUNDSTRANSFER")
                protected List<TIMEIND> timeind;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the timeind property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the timeind property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTIMEIND().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TIMEIND }
                 * 
                 * 
                 */
                public List<TIMEIND> getTIMEIND() {
                    if (timeind == null) {
                        timeind = new ArrayList<TIMEIND>();
                    }
                    return this.timeind;
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
                 *         &lt;element name="TIMEIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "timeind"
                })
                public static class TIMEIND {

                    @XmlElement(name = "TIMEIND", namespace = "http://temenos.com/FUNDSTRANSFER")
                    protected String timeind;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the timeind property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTIMEIND() {
                        return timeind;
                    }

                    /**
                     * Sets the value of the timeind property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTIMEIND(String value) {
                        this.timeind = value;
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
     *         &lt;element name="mSENDTOPARTY" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SENDTOPARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sgBKTOBKOUT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BKTOBKOUT" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BKTOBKOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="MESSAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "msendtoparty"
    })
    public static class GSENDTOPARTY {

        @XmlElement(name = "mSENDTOPARTY", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MSENDTOPARTY> msendtoparty;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the msendtoparty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the msendtoparty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSENDTOPARTY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MSENDTOPARTY }
         * 
         * 
         */
        public List<MSENDTOPARTY> getMSENDTOPARTY() {
            if (msendtoparty == null) {
                msendtoparty = new ArrayList<MSENDTOPARTY>();
            }
            return this.msendtoparty;
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
         *         &lt;element name="SENDTOPARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sgBKTOBKOUT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BKTOBKOUT" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BKTOBKOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="MESSAGETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "sendtoparty",
            "sgBKTOBKOUT",
            "messagetype"
        })
        public static class MSENDTOPARTY {

            @XmlElement(name = "SENDTOPARTY", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String sendtoparty;
            @XmlElement(namespace = "http://temenos.com/FUNDSTRANSFER")
            protected SgBKTOBKOUT sgBKTOBKOUT;
            @XmlElement(name = "MESSAGETYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String messagetype;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the sendtoparty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSENDTOPARTY() {
                return sendtoparty;
            }

            /**
             * Sets the value of the sendtoparty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSENDTOPARTY(String value) {
                this.sendtoparty = value;
            }

            /**
             * Gets the value of the sgBKTOBKOUT property.
             * 
             * @return
             *     possible object is
             *     {@link SgBKTOBKOUT }
             *     
             */
            public SgBKTOBKOUT getSgBKTOBKOUT() {
                return sgBKTOBKOUT;
            }

            /**
             * Sets the value of the sgBKTOBKOUT property.
             * 
             * @param value
             *     allowed object is
             *     {@link SgBKTOBKOUT }
             *     
             */
            public void setSgBKTOBKOUT(SgBKTOBKOUT value) {
                this.sgBKTOBKOUT = value;
            }

            /**
             * Gets the value of the messagetype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMESSAGETYPE() {
                return messagetype;
            }

            /**
             * Sets the value of the messagetype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMESSAGETYPE(String value) {
                this.messagetype = value;
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
             *         &lt;element name="BKTOBKOUT" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BKTOBKOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "bktobkout"
            })
            public static class SgBKTOBKOUT {

                @XmlElement(name = "BKTOBKOUT", namespace = "http://temenos.com/FUNDSTRANSFER")
                protected List<BKTOBKOUT> bktobkout;
                @XmlAttribute(name = "sg")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger sg;

                /**
                 * Gets the value of the bktobkout property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bktobkout property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBKTOBKOUT().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BKTOBKOUT }
                 * 
                 * 
                 */
                public List<BKTOBKOUT> getBKTOBKOUT() {
                    if (bktobkout == null) {
                        bktobkout = new ArrayList<BKTOBKOUT>();
                    }
                    return this.bktobkout;
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
                 *         &lt;element name="BKTOBKOUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "bktobkout"
                })
                public static class BKTOBKOUT {

                    @XmlElement(name = "BKTOBKOUT", namespace = "http://temenos.com/FUNDSTRANSFER")
                    protected String bktobkout;
                    @XmlAttribute(name = "s")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger s;

                    /**
                     * Gets the value of the bktobkout property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBKTOBKOUT() {
                        return bktobkout;
                    }

                    /**
                     * Sets the value of the bktobkout property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBKTOBKOUT(String value) {
                        this.bktobkout = value;
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
     *         &lt;element name="SIGNATORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "signatory"
    })
    public static class GSIGNATORY {

        @XmlElement(name = "SIGNATORY", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> signatory;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the signatory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signatory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSIGNATORY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSIGNATORY() {
            if (signatory == null) {
                signatory = new ArrayList<String>();
            }
            return this.signatory;
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
     *         &lt;element name="STMTNOS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "stmtnos"
    })
    public static class GSTMTNOS {

        @XmlElement(name = "STMTNOS", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<String> stmtnos;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the stmtnos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stmtnos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTMTNOS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSTMTNOS() {
            if (stmtnos == null) {
                stmtnos = new ArrayList<String>();
            }
            return this.stmtnos;
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
     *         &lt;element name="mTAXTYPE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TAXTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TAXAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mtaxtype"
    })
    public static class GTAXTYPE {

        @XmlElement(name = "mTAXTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
        protected List<MTAXTYPE> mtaxtype;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mtaxtype property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtaxtype property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTAXTYPE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MTAXTYPE }
         * 
         * 
         */
        public List<MTAXTYPE> getMTAXTYPE() {
            if (mtaxtype == null) {
                mtaxtype = new ArrayList<MTAXTYPE>();
            }
            return this.mtaxtype;
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
         *         &lt;element name="TAXTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TAXAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "taxtype",
            "taxamt"
        })
        public static class MTAXTYPE {

            @XmlElement(name = "TAXTYPE", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String taxtype;
            @XmlElement(name = "TAXAMT", namespace = "http://temenos.com/FUNDSTRANSFER")
            protected String taxamt;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the taxtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXTYPE() {
                return taxtype;
            }

            /**
             * Sets the value of the taxtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXTYPE(String value) {
                this.taxtype = value;
            }

            /**
             * Gets the value of the taxamt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXAMT() {
                return taxamt;
            }

            /**
             * Sets the value of the taxamt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXAMT(String value) {
                this.taxamt = value;
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
