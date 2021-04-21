/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignfolderRequest;
import com.ezmax.api.model.EzsignfoldersignerassociationRequest;
import com.ezmax.api.model.FieldEEzsignfolderSendreminderfrequency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An Ezsignfolder Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignfolder Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class EzsignfolderRequestCompound {
  public static final String SERIALIZED_NAME_A_EZSIGNFOLDERSIGNERASSOCIATION = "a_Ezsignfoldersignerassociation";
  @SerializedName(SERIALIZED_NAME_A_EZSIGNFOLDERSIGNERASSOCIATION)
  private List<EzsignfoldersignerassociationRequest> aEzsignfoldersignerassociation = new ArrayList<EzsignfoldersignerassociationRequest>();

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


  public EzsignfolderRequestCompound aEzsignfoldersignerassociation(List<EzsignfoldersignerassociationRequest> aEzsignfoldersignerassociation) {
    
    this.aEzsignfoldersignerassociation = aEzsignfoldersignerassociation;
    return this;
  }

  public EzsignfolderRequestCompound addAEzsignfoldersignerassociationItem(EzsignfoldersignerassociationRequest aEzsignfoldersignerassociationItem) {
    this.aEzsignfoldersignerassociation.add(aEzsignfoldersignerassociationItem);
    return this;
  }

   /**
   * An array of signers that will be invited to sign the Ezsigndocuments
   * @return aEzsignfoldersignerassociation
  **/
  @ApiModelProperty(required = true, value = "An array of signers that will be invited to sign the Ezsigndocuments")

  public List<EzsignfoldersignerassociationRequest> getaEzsignfoldersignerassociation() {
    return aEzsignfoldersignerassociation;
  }


  public void setaEzsignfoldersignerassociation(List<EzsignfoldersignerassociationRequest> aEzsignfoldersignerassociation) {
    this.aEzsignfoldersignerassociation = aEzsignfoldersignerassociation;
  }


  public EzsignfolderRequestCompound fkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    
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


  public EzsignfolderRequestCompound fkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    
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


  public EzsignfolderRequestCompound sEzsignfolderDescription(String sEzsignfolderDescription) {
    
    this.sEzsignfolderDescription = sEzsignfolderDescription;
    return this;
  }

   /**
   * The description of the Ezsign Folder
   * @return sEzsignfolderDescription
  **/
  @ApiModelProperty(required = true, value = "The description of the Ezsign Folder")

  public String getsEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }


  public void setsEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }


  public EzsignfolderRequestCompound tEzsignfolderNote(String tEzsignfolderNote) {
    
    this.tEzsignfolderNote = tEzsignfolderNote;
    return this;
  }

   /**
   * Somes extra notes about the eZsign Folder
   * @return tEzsignfolderNote
  **/
  @ApiModelProperty(required = true, value = "Somes extra notes about the eZsign Folder")

  public String gettEzsignfolderNote() {
    return tEzsignfolderNote;
  }


  public void settEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }


  public EzsignfolderRequestCompound eEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderRequestCompound ezsignfolderRequestCompound = (EzsignfolderRequestCompound) o;
    return Objects.equals(this.aEzsignfoldersignerassociation, ezsignfolderRequestCompound.aEzsignfoldersignerassociation) &&
        Objects.equals(this.fkiEzsignfoldertypeID, ezsignfolderRequestCompound.fkiEzsignfoldertypeID) &&
        Objects.equals(this.fkiEzsigntsarequirementID, ezsignfolderRequestCompound.fkiEzsigntsarequirementID) &&
        Objects.equals(this.sEzsignfolderDescription, ezsignfolderRequestCompound.sEzsignfolderDescription) &&
        Objects.equals(this.tEzsignfolderNote, ezsignfolderRequestCompound.tEzsignfolderNote) &&
        Objects.equals(this.eEzsignfolderSendreminderfrequency, ezsignfolderRequestCompound.eEzsignfolderSendreminderfrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aEzsignfoldersignerassociation, fkiEzsignfoldertypeID, fkiEzsigntsarequirementID, sEzsignfolderDescription, tEzsignfolderNote, eEzsignfolderSendreminderfrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderRequestCompound {\n");
    sb.append("    aEzsignfoldersignerassociation: ").append(toIndentedString(aEzsignfoldersignerassociation)).append("\n");
    sb.append("    fkiEzsignfoldertypeID: ").append(toIndentedString(fkiEzsignfoldertypeID)).append("\n");
    sb.append("    fkiEzsigntsarequirementID: ").append(toIndentedString(fkiEzsigntsarequirementID)).append("\n");
    sb.append("    sEzsignfolderDescription: ").append(toIndentedString(sEzsignfolderDescription)).append("\n");
    sb.append("    tEzsignfolderNote: ").append(toIndentedString(tEzsignfolderNote)).append("\n");
    sb.append("    eEzsignfolderSendreminderfrequency: ").append(toIndentedString(eEzsignfolderSendreminderfrequency)).append("\n");
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

