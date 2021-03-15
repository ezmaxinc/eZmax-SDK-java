/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.35
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignfoldersignerassociationRequest;
import com.ezmax.api.model.EzsignsignerRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignfoldersignerassociation Object and children to create a complete structure
 */
@ApiModel(description = "An Ezsignfoldersignerassociation Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T18:07:05.174Z[GMT]")
public class EzsignfoldersignerassociationRequestCompound {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNSIGNER = "objEzsignsigner";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNSIGNER)
  private EzsignsignerRequestCompound objEzsignsigner;

  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D = "fkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D)
  private Integer fkiEzsignfolderID;


  public EzsignfoldersignerassociationRequestCompound objEzsignsigner(EzsignsignerRequestCompound objEzsignsigner) {
    
    this.objEzsignsigner = objEzsignsigner;
    return this;
  }

   /**
   * Get objEzsignsigner
   * @return objEzsignsigner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignsignerRequestCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }


  public void setObjEzsignsigner(EzsignsignerRequestCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }


  public EzsignfoldersignerassociationRequestCompound fkiUserID(Integer fkiUserID) {
    
    this.fkiUserID = fkiUserID;
    return this;
  }

   /**
   * A reference to a valid User.  This is only used if the signatory will be a user from the system.
   * minimum: 1
   * @return fkiUserID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to a valid User.  This is only used if the signatory will be a user from the system.")

  public Integer getFkiUserID() {
    return fkiUserID;
  }


  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  public EzsignfoldersignerassociationRequestCompound fkiEzsignfolderID(Integer fkiEzsignfolderID) {
    
    this.fkiEzsignfolderID = fkiEzsignfolderID;
    return this;
  }

   /**
   * A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.
   * minimum: 1
   * @return fkiEzsignfolderID
  **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.")

  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }


  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationRequestCompound ezsignfoldersignerassociationRequestCompound = (EzsignfoldersignerassociationRequestCompound) o;
    return Objects.equals(this.objEzsignsigner, ezsignfoldersignerassociationRequestCompound.objEzsignsigner) &&
        Objects.equals(this.fkiUserID, ezsignfoldersignerassociationRequestCompound.fkiUserID) &&
        Objects.equals(this.fkiEzsignfolderID, ezsignfoldersignerassociationRequestCompound.fkiEzsignfolderID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignsigner, fkiUserID, fkiEzsignfolderID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationRequestCompound {\n");
    sb.append("    objEzsignsigner: ").append(toIndentedString(objEzsignsigner)).append("\n");
    sb.append("    fkiUserID: ").append(toIndentedString(fkiUserID)).append("\n");
    sb.append("    fkiEzsignfolderID: ").append(toIndentedString(fkiEzsignfolderID)).append("\n");
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

