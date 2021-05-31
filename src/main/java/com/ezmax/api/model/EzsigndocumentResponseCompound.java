/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonAudit;
import com.ezmax.api.model.EzsigndocumentResponse;
import com.ezmax.api.model.FieldEEzsigndocumentStep;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsigndocument Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsigndocument Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-31T17:14:26.574336Z[Etc/UTC]")
public class EzsigndocumentResponseCompound {
  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D = "fkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D)
  private Integer fkiEzsignfolderID;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE = "dtEzsigndocumentDuedate";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENT_DUEDATE)
  private String dtEzsigndocumentDuedate;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME = "sEzsigndocumentName";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_NAME)
  private String sEzsigndocumentName;

  public static final String SERIALIZED_NAME_PKI_EZSIGNDOCUMENT_I_D = "pkiEzsigndocumentID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNDOCUMENT_I_D)
  private Integer pkiEzsigndocumentID;

  public static final String SERIALIZED_NAME_E_EZSIGNDOCUMENT_STEP = "eEzsigndocumentStep";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNDOCUMENT_STEP)
  private FieldEEzsigndocumentStep eEzsigndocumentStep;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENT_FIRSTSEND = "dtEzsigndocumentFirstsend";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENT_FIRSTSEND)
  private String dtEzsigndocumentFirstsend;

  public static final String SERIALIZED_NAME_DT_EZSIGNDOCUMENT_LASTSEND = "dtEzsigndocumentLastsend";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNDOCUMENT_LASTSEND)
  private String dtEzsigndocumentLastsend;

  public static final String SERIALIZED_NAME_I_EZSIGNDOCUMENT_ORDER = "iEzsigndocumentOrder";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDOCUMENT_ORDER)
  private Integer iEzsigndocumentOrder;

  public static final String SERIALIZED_NAME_I_EZSIGNDOCUMENT_PAGETOTAL = "iEzsigndocumentPagetotal";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDOCUMENT_PAGETOTAL)
  private Integer iEzsigndocumentPagetotal;

  public static final String SERIALIZED_NAME_I_EZSIGNDOCUMENT_SIGNATURESIGNED = "iEzsigndocumentSignaturesigned";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDOCUMENT_SIGNATURESIGNED)
  private Integer iEzsigndocumentSignaturesigned;

  public static final String SERIALIZED_NAME_I_EZSIGNDOCUMENT_SIGNATURETOTAL = "iEzsigndocumentSignaturetotal";
  @SerializedName(SERIALIZED_NAME_I_EZSIGNDOCUMENT_SIGNATURETOTAL)
  private Integer iEzsigndocumentSignaturetotal;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_M_D5INITIAL = "sEzsigndocumentMD5initial";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_M_D5INITIAL)
  private String sEzsigndocumentMD5initial;

  public static final String SERIALIZED_NAME_S_EZSIGNDOCUMENT_M_D5SIGNED = "sEzsigndocumentMD5signed";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNDOCUMENT_M_D5SIGNED)
  private String sEzsigndocumentMD5signed;

  public static final String SERIALIZED_NAME_OBJ_AUDIT = "objAudit";
  @SerializedName(SERIALIZED_NAME_OBJ_AUDIT)
  private CommonAudit objAudit;


  public EzsigndocumentResponseCompound fkiEzsignfolderID(Integer fkiEzsignfolderID) {
    
    this.fkiEzsignfolderID = fkiEzsignfolderID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfolder
   * @return fkiEzsignfolderID
  **/
  @ApiModelProperty(example = "33", required = true, value = "The unique ID of the Ezsignfolder")

  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }


  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }


  public EzsigndocumentResponseCompound dtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
    return this;
  }

   /**
   * The maximum date and time at which the document can be signed.
   * @return dtEzsigndocumentDuedate
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The maximum date and time at which the document can be signed.")

  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }


  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }


  public EzsigndocumentResponseCompound fkiLanguageID(Integer fkiLanguageID) {
    
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

   /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
  **/
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")

  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public EzsigndocumentResponseCompound sEzsigndocumentName(String sEzsigndocumentName) {
    
    this.sEzsigndocumentName = sEzsigndocumentName;
    return this;
  }

   /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   * @return sEzsigndocumentName
  **/
  @ApiModelProperty(example = "Contract #123", required = true, value = "The name of the document that will be presented to Ezsignfoldersignerassociations")

  public String getsEzsigndocumentName() {
    return sEzsigndocumentName;
  }


  public void setsEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }


  public EzsigndocumentResponseCompound pkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntemplate
   * @return pkiEzsigndocumentID
  **/
  @ApiModelProperty(example = "97", required = true, value = "The unique ID of the Ezsigntemplate")

  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }


  public void setPkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
  }


  public EzsigndocumentResponseCompound eEzsigndocumentStep(FieldEEzsigndocumentStep eEzsigndocumentStep) {
    
    this.eEzsigndocumentStep = eEzsigndocumentStep;
    return this;
  }

   /**
   * Get eEzsigndocumentStep
   * @return eEzsigndocumentStep
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEEzsigndocumentStep geteEzsigndocumentStep() {
    return eEzsigndocumentStep;
  }


  public void seteEzsigndocumentStep(FieldEEzsigndocumentStep eEzsigndocumentStep) {
    this.eEzsigndocumentStep = eEzsigndocumentStep;
  }


  public EzsigndocumentResponseCompound dtEzsigndocumentFirstsend(String dtEzsigndocumentFirstsend) {
    
    this.dtEzsigndocumentFirstsend = dtEzsigndocumentFirstsend;
    return this;
  }

   /**
   * The date and time when the Ezsigndocument was first sent.
   * @return dtEzsigndocumentFirstsend
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The date and time when the Ezsigndocument was first sent.")

  public String getDtEzsigndocumentFirstsend() {
    return dtEzsigndocumentFirstsend;
  }


  public void setDtEzsigndocumentFirstsend(String dtEzsigndocumentFirstsend) {
    this.dtEzsigndocumentFirstsend = dtEzsigndocumentFirstsend;
  }


  public EzsigndocumentResponseCompound dtEzsigndocumentLastsend(String dtEzsigndocumentLastsend) {
    
    this.dtEzsigndocumentLastsend = dtEzsigndocumentLastsend;
    return this;
  }

   /**
   * The date and time when the Ezsigndocument was sent the last time.
   * @return dtEzsigndocumentLastsend
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The date and time when the Ezsigndocument was sent the last time.")

  public String getDtEzsigndocumentLastsend() {
    return dtEzsigndocumentLastsend;
  }


  public void setDtEzsigndocumentLastsend(String dtEzsigndocumentLastsend) {
    this.dtEzsigndocumentLastsend = dtEzsigndocumentLastsend;
  }


  public EzsigndocumentResponseCompound iEzsigndocumentOrder(Integer iEzsigndocumentOrder) {
    
    this.iEzsigndocumentOrder = iEzsigndocumentOrder;
    return this;
  }

   /**
   * The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.
   * @return iEzsigndocumentOrder
  **/
  @ApiModelProperty(example = "1", required = true, value = "The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.")

  public Integer getiEzsigndocumentOrder() {
    return iEzsigndocumentOrder;
  }


  public void setiEzsigndocumentOrder(Integer iEzsigndocumentOrder) {
    this.iEzsigndocumentOrder = iEzsigndocumentOrder;
  }


  public EzsigndocumentResponseCompound iEzsigndocumentPagetotal(Integer iEzsigndocumentPagetotal) {
    
    this.iEzsigndocumentPagetotal = iEzsigndocumentPagetotal;
    return this;
  }

   /**
   * The number of pages in the Ezsigndocument.
   * @return iEzsigndocumentPagetotal
  **/
  @ApiModelProperty(example = "4", required = true, value = "The number of pages in the Ezsigndocument.")

  public Integer getiEzsigndocumentPagetotal() {
    return iEzsigndocumentPagetotal;
  }


  public void setiEzsigndocumentPagetotal(Integer iEzsigndocumentPagetotal) {
    this.iEzsigndocumentPagetotal = iEzsigndocumentPagetotal;
  }


  public EzsigndocumentResponseCompound iEzsigndocumentSignaturesigned(Integer iEzsigndocumentSignaturesigned) {
    
    this.iEzsigndocumentSignaturesigned = iEzsigndocumentSignaturesigned;
    return this;
  }

   /**
   * The number of signatures that were signed in the document.
   * @return iEzsigndocumentSignaturesigned
  **/
  @ApiModelProperty(example = "3", required = true, value = "The number of signatures that were signed in the document.")

  public Integer getiEzsigndocumentSignaturesigned() {
    return iEzsigndocumentSignaturesigned;
  }


  public void setiEzsigndocumentSignaturesigned(Integer iEzsigndocumentSignaturesigned) {
    this.iEzsigndocumentSignaturesigned = iEzsigndocumentSignaturesigned;
  }


  public EzsigndocumentResponseCompound iEzsigndocumentSignaturetotal(Integer iEzsigndocumentSignaturetotal) {
    
    this.iEzsigndocumentSignaturetotal = iEzsigndocumentSignaturetotal;
    return this;
  }

   /**
   * The number of total signatures that were requested in the Ezsigndocument.
   * @return iEzsigndocumentSignaturetotal
  **/
  @ApiModelProperty(example = "4", required = true, value = "The number of total signatures that were requested in the Ezsigndocument.")

  public Integer getiEzsigndocumentSignaturetotal() {
    return iEzsigndocumentSignaturetotal;
  }


  public void setiEzsigndocumentSignaturetotal(Integer iEzsigndocumentSignaturetotal) {
    this.iEzsigndocumentSignaturetotal = iEzsigndocumentSignaturetotal;
  }


  public EzsigndocumentResponseCompound sEzsigndocumentMD5initial(String sEzsigndocumentMD5initial) {
    
    this.sEzsigndocumentMD5initial = sEzsigndocumentMD5initial;
    return this;
  }

   /**
   * MD5 Hash of the initial PDF Document before signatures were applied to it.
   * @return sEzsigndocumentMD5initial
  **/
  @ApiModelProperty(example = "012345678901234567890123456789AB", required = true, value = "MD5 Hash of the initial PDF Document before signatures were applied to it.")

  public String getsEzsigndocumentMD5initial() {
    return sEzsigndocumentMD5initial;
  }


  public void setsEzsigndocumentMD5initial(String sEzsigndocumentMD5initial) {
    this.sEzsigndocumentMD5initial = sEzsigndocumentMD5initial;
  }


  public EzsigndocumentResponseCompound sEzsigndocumentMD5signed(String sEzsigndocumentMD5signed) {
    
    this.sEzsigndocumentMD5signed = sEzsigndocumentMD5signed;
    return this;
  }

   /**
   * MD5 Hash of the final PDF Document after all signatures were applied to it.
   * @return sEzsigndocumentMD5signed
  **/
  @ApiModelProperty(example = "012345678901234567890123456789AB", required = true, value = "MD5 Hash of the final PDF Document after all signatures were applied to it.")

  public String getsEzsigndocumentMD5signed() {
    return sEzsigndocumentMD5signed;
  }


  public void setsEzsigndocumentMD5signed(String sEzsigndocumentMD5signed) {
    this.sEzsigndocumentMD5signed = sEzsigndocumentMD5signed;
  }


  public EzsigndocumentResponseCompound objAudit(CommonAudit objAudit) {
    
    this.objAudit = objAudit;
    return this;
  }

   /**
   * Get objAudit
   * @return objAudit
  **/
  @ApiModelProperty(required = true, value = "")

  public CommonAudit getObjAudit() {
    return objAudit;
  }


  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentResponseCompound ezsigndocumentResponseCompound = (EzsigndocumentResponseCompound) o;
    return Objects.equals(this.fkiEzsignfolderID, ezsigndocumentResponseCompound.fkiEzsignfolderID) &&
        Objects.equals(this.dtEzsigndocumentDuedate, ezsigndocumentResponseCompound.dtEzsigndocumentDuedate) &&
        Objects.equals(this.fkiLanguageID, ezsigndocumentResponseCompound.fkiLanguageID) &&
        Objects.equals(this.sEzsigndocumentName, ezsigndocumentResponseCompound.sEzsigndocumentName) &&
        Objects.equals(this.pkiEzsigndocumentID, ezsigndocumentResponseCompound.pkiEzsigndocumentID) &&
        Objects.equals(this.eEzsigndocumentStep, ezsigndocumentResponseCompound.eEzsigndocumentStep) &&
        Objects.equals(this.dtEzsigndocumentFirstsend, ezsigndocumentResponseCompound.dtEzsigndocumentFirstsend) &&
        Objects.equals(this.dtEzsigndocumentLastsend, ezsigndocumentResponseCompound.dtEzsigndocumentLastsend) &&
        Objects.equals(this.iEzsigndocumentOrder, ezsigndocumentResponseCompound.iEzsigndocumentOrder) &&
        Objects.equals(this.iEzsigndocumentPagetotal, ezsigndocumentResponseCompound.iEzsigndocumentPagetotal) &&
        Objects.equals(this.iEzsigndocumentSignaturesigned, ezsigndocumentResponseCompound.iEzsigndocumentSignaturesigned) &&
        Objects.equals(this.iEzsigndocumentSignaturetotal, ezsigndocumentResponseCompound.iEzsigndocumentSignaturetotal) &&
        Objects.equals(this.sEzsigndocumentMD5initial, ezsigndocumentResponseCompound.sEzsigndocumentMD5initial) &&
        Objects.equals(this.sEzsigndocumentMD5signed, ezsigndocumentResponseCompound.sEzsigndocumentMD5signed) &&
        Objects.equals(this.objAudit, ezsigndocumentResponseCompound.objAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsignfolderID, dtEzsigndocumentDuedate, fkiLanguageID, sEzsigndocumentName, pkiEzsigndocumentID, eEzsigndocumentStep, dtEzsigndocumentFirstsend, dtEzsigndocumentLastsend, iEzsigndocumentOrder, iEzsigndocumentPagetotal, iEzsigndocumentSignaturesigned, iEzsigndocumentSignaturetotal, sEzsigndocumentMD5initial, sEzsigndocumentMD5signed, objAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentResponseCompound {\n");
    sb.append("    fkiEzsignfolderID: ").append(toIndentedString(fkiEzsignfolderID)).append("\n");
    sb.append("    dtEzsigndocumentDuedate: ").append(toIndentedString(dtEzsigndocumentDuedate)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    sEzsigndocumentName: ").append(toIndentedString(sEzsigndocumentName)).append("\n");
    sb.append("    pkiEzsigndocumentID: ").append(toIndentedString(pkiEzsigndocumentID)).append("\n");
    sb.append("    eEzsigndocumentStep: ").append(toIndentedString(eEzsigndocumentStep)).append("\n");
    sb.append("    dtEzsigndocumentFirstsend: ").append(toIndentedString(dtEzsigndocumentFirstsend)).append("\n");
    sb.append("    dtEzsigndocumentLastsend: ").append(toIndentedString(dtEzsigndocumentLastsend)).append("\n");
    sb.append("    iEzsigndocumentOrder: ").append(toIndentedString(iEzsigndocumentOrder)).append("\n");
    sb.append("    iEzsigndocumentPagetotal: ").append(toIndentedString(iEzsigndocumentPagetotal)).append("\n");
    sb.append("    iEzsigndocumentSignaturesigned: ").append(toIndentedString(iEzsigndocumentSignaturesigned)).append("\n");
    sb.append("    iEzsigndocumentSignaturetotal: ").append(toIndentedString(iEzsigndocumentSignaturetotal)).append("\n");
    sb.append("    sEzsigndocumentMD5initial: ").append(toIndentedString(sEzsigndocumentMD5initial)).append("\n");
    sb.append("    sEzsigndocumentMD5signed: ").append(toIndentedString(sEzsigndocumentMD5signed)).append("\n");
    sb.append("    objAudit: ").append(toIndentedString(objAudit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

