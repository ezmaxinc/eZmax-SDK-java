/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.42
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
import com.ezmax.api.model.EzsignfolderResponse;
import com.ezmax.api.model.FieldEEzsignfolderSendreminderfrequency;
import com.ezmax.api.model.FieldEEzsignfolderStep;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payload for the /1/object/ezsignfolder/getObject API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsignfolder/getObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T19:39:31.793073Z[Etc/UTC]")
public class EzsignfolderGetObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D = "fkiEzsignfoldertypeID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDERTYPE_I_D)
  private Integer fkiEzsignfoldertypeID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNTSAREQUIREMENT_I_D = "fkiEzsigntsarequirementID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTSAREQUIREMENT_I_D)
  private Integer fkiEzsigntsarequirementID;

  public static final String SERIALIZED_NAME_S_EZSIGNFOLDER_DESCRIPTION = "sEzsignfolderDescription";
  @SerializedName(SERIALIZED_NAME_S_EZSIGNFOLDER_DESCRIPTION)
  private String sEzsignfolderDescription;

  public static final String SERIALIZED_NAME_T_EZSIGNFOLDER_NOTE = "tEzsignfolderNote";
  @SerializedName(SERIALIZED_NAME_T_EZSIGNFOLDER_NOTE)
  private String tEzsignfolderNote;

  public static final String SERIALIZED_NAME_E_EZSIGNFOLDER_SENDREMINDERFREQUENCY = "eEzsignfolderSendreminderfrequency";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNFOLDER_SENDREMINDERFREQUENCY)
  private FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency;

  public static final String SERIALIZED_NAME_PKI_EZSIGNFOLDER_I_D = "pkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_PKI_EZSIGNFOLDER_I_D)
  private Integer pkiEzsignfolderID;

  public static final String SERIALIZED_NAME_DT_EZSIGNFOLDER_SENTDATE = "dtEzsignfolderSentdate";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNFOLDER_SENTDATE)
  private String dtEzsignfolderSentdate;

  public static final String SERIALIZED_NAME_E_EZSIGNFOLDER_STEP = "eEzsignfolderStep";
  @SerializedName(SERIALIZED_NAME_E_EZSIGNFOLDER_STEP)
  private FieldEEzsignfolderStep eEzsignfolderStep;

  public static final String SERIALIZED_NAME_DT_EZSIGNFOLDER_CLOSE = "dtEzsignfolderClose";
  @SerializedName(SERIALIZED_NAME_DT_EZSIGNFOLDER_CLOSE)
  private String dtEzsignfolderClose;

  public static final String SERIALIZED_NAME_OBJ_AUDIT = "objAudit";
  @SerializedName(SERIALIZED_NAME_OBJ_AUDIT)
  private CommonAudit objAudit;


  public EzsignfolderGetObjectV1ResponseMPayload fkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here.
   * @return fkiEzsignfoldertypeID
  **/
  @ApiModelProperty(example = "5", required = true, value = "The unique ID of the Ezsignfoldertype.    This value can be queried by the API and is also visible in the admin interface.    There are two types of Ezsignfoldertype. **User** and **Shared**. **User** can only be seen by the user who created the folder or its assistants. Access to **Shared** folders are configurable for access and email delivery. You should typically choose a **Shared** type here.")

  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }


  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }


  public EzsignfolderGetObjectV1ResponseMPayload fkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
    return this;
  }

   /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server&#39;s time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server&#39;s time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   * @return fkiEzsigntsarequirementID
  **/
  @ApiModelProperty(example = "92", required = true, value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")

  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }


  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }


  public EzsignfolderGetObjectV1ResponseMPayload sEzsignfolderDescription(String sEzsignfolderDescription) {
    
    this.sEzsignfolderDescription = sEzsignfolderDescription;
    return this;
  }

   /**
   * The description of the Ezsign Folder
   * @return sEzsignfolderDescription
  **/
  @ApiModelProperty(example = "Test eZsign Folder", required = true, value = "The description of the Ezsign Folder")

  public String getsEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }


  public void setsEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }


  public EzsignfolderGetObjectV1ResponseMPayload tEzsignfolderNote(String tEzsignfolderNote) {
    
    this.tEzsignfolderNote = tEzsignfolderNote;
    return this;
  }

   /**
   * Somes extra notes about the eZsign Folder
   * @return tEzsignfolderNote
  **/
  @ApiModelProperty(example = "An extra notes we can add to the ezsign folder", required = true, value = "Somes extra notes about the eZsign Folder")

  public String gettEzsignfolderNote() {
    return tEzsignfolderNote;
  }


  public void settEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }


  public EzsignfolderGetObjectV1ResponseMPayload eEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    
    this.eEzsignfolderSendreminderfrequency = eEzsignfolderSendreminderfrequency;
    return this;
  }

   /**
   * Get eEzsignfolderSendreminderfrequency
   * @return eEzsignfolderSendreminderfrequency
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEEzsignfolderSendreminderfrequency geteEzsignfolderSendreminderfrequency() {
    return eEzsignfolderSendreminderfrequency;
  }


  public void seteEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    this.eEzsignfolderSendreminderfrequency = eEzsignfolderSendreminderfrequency;
  }


  public EzsignfolderGetObjectV1ResponseMPayload pkiEzsignfolderID(Integer pkiEzsignfolderID) {
    
    this.pkiEzsignfolderID = pkiEzsignfolderID;
    return this;
  }

   /**
   * The unique ID of the Ezsignfolder
   * @return pkiEzsignfolderID
  **/
  @ApiModelProperty(example = "33", required = true, value = "The unique ID of the Ezsignfolder")

  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }


  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
  }


  public EzsignfolderGetObjectV1ResponseMPayload dtEzsignfolderSentdate(String dtEzsignfolderSentdate) {
    
    this.dtEzsignfolderSentdate = dtEzsignfolderSentdate;
    return this;
  }

   /**
   * The date and time at which the Ezsign folder was sent the last time.
   * @return dtEzsignfolderSentdate
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The date and time at which the Ezsign folder was sent the last time.")

  public String getDtEzsignfolderSentdate() {
    return dtEzsignfolderSentdate;
  }


  public void setDtEzsignfolderSentdate(String dtEzsignfolderSentdate) {
    this.dtEzsignfolderSentdate = dtEzsignfolderSentdate;
  }


  public EzsignfolderGetObjectV1ResponseMPayload eEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    
    this.eEzsignfolderStep = eEzsignfolderStep;
    return this;
  }

   /**
   * Get eEzsignfolderStep
   * @return eEzsignfolderStep
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEEzsignfolderStep geteEzsignfolderStep() {
    return eEzsignfolderStep;
  }


  public void seteEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    this.eEzsignfolderStep = eEzsignfolderStep;
  }


  public EzsignfolderGetObjectV1ResponseMPayload dtEzsignfolderClose(String dtEzsignfolderClose) {
    
    this.dtEzsignfolderClose = dtEzsignfolderClose;
    return this;
  }

   /**
   * The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.
   * @return dtEzsignfolderClose
  **/
  @ApiModelProperty(example = "2020-12-31 23:59:59", required = true, value = "The date and time at which the folder was closed. Either by applying the last signature or by completing it prematurely.")

  public String getDtEzsignfolderClose() {
    return dtEzsignfolderClose;
  }


  public void setDtEzsignfolderClose(String dtEzsignfolderClose) {
    this.dtEzsignfolderClose = dtEzsignfolderClose;
  }


  public EzsignfolderGetObjectV1ResponseMPayload objAudit(CommonAudit objAudit) {
    
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
    EzsignfolderGetObjectV1ResponseMPayload ezsignfolderGetObjectV1ResponseMPayload = (EzsignfolderGetObjectV1ResponseMPayload) o;
    return Objects.equals(this.fkiEzsignfoldertypeID, ezsignfolderGetObjectV1ResponseMPayload.fkiEzsignfoldertypeID) &&
        Objects.equals(this.fkiEzsigntsarequirementID, ezsignfolderGetObjectV1ResponseMPayload.fkiEzsigntsarequirementID) &&
        Objects.equals(this.sEzsignfolderDescription, ezsignfolderGetObjectV1ResponseMPayload.sEzsignfolderDescription) &&
        Objects.equals(this.tEzsignfolderNote, ezsignfolderGetObjectV1ResponseMPayload.tEzsignfolderNote) &&
        Objects.equals(this.eEzsignfolderSendreminderfrequency, ezsignfolderGetObjectV1ResponseMPayload.eEzsignfolderSendreminderfrequency) &&
        Objects.equals(this.pkiEzsignfolderID, ezsignfolderGetObjectV1ResponseMPayload.pkiEzsignfolderID) &&
        Objects.equals(this.dtEzsignfolderSentdate, ezsignfolderGetObjectV1ResponseMPayload.dtEzsignfolderSentdate) &&
        Objects.equals(this.eEzsignfolderStep, ezsignfolderGetObjectV1ResponseMPayload.eEzsignfolderStep) &&
        Objects.equals(this.dtEzsignfolderClose, ezsignfolderGetObjectV1ResponseMPayload.dtEzsignfolderClose) &&
        Objects.equals(this.objAudit, ezsignfolderGetObjectV1ResponseMPayload.objAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsignfoldertypeID, fkiEzsigntsarequirementID, sEzsignfolderDescription, tEzsignfolderNote, eEzsignfolderSendreminderfrequency, pkiEzsignfolderID, dtEzsignfolderSentdate, eEzsignfolderStep, dtEzsignfolderClose, objAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetObjectV1ResponseMPayload {\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    fkiEzsigntsarequirementID: ").append(toIndentedString(fkiEzsigntsarequirementID)).append("\n");
    sb.append("    sEzsignfolderDescription: ").append(toIndentedString(sEzsignfolderDescription)).append("\n");
    sb.append("    tEzsignfolderNote: ").append(toIndentedString(tEzsignfolderNote)).append("\n");
    sb.append("    eEzsignfolderSendreminderfrequency: ").append(toIndentedString(eEzsignfolderSendreminderfrequency)).append("\n");
    sb.append("    pkiEzsignfolderID: ").append(toIndentedString(pkiEzsignfolderID)).append("\n");
    sb.append("    dtEzsignfolderSentdate: ").append(toIndentedString(dtEzsignfolderSentdate)).append("\n");
    sb.append("    eEzsignfolderStep: ").append(toIndentedString(eEzsignfolderStep)).append("\n");
    sb.append("    dtEzsignfolderClose: ").append(toIndentedString(dtEzsignfolderClose)).append("\n");
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

