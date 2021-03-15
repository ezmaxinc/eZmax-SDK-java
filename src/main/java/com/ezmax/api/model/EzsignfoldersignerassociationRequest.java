/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.33
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An Ezsignfoldersignerassociation Object
 */
@ApiModel(description = "An Ezsignfoldersignerassociation Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T16:46:52.954Z[GMT]")
public class EzsignfoldersignerassociationRequest {
  public static final String SERIALIZED_NAME_FKI_USER_I_D = "fkiUserID";
  @SerializedName(SERIALIZED_NAME_FKI_USER_I_D)
  private Integer fkiUserID;

  public static final String SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D = "fkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNFOLDER_I_D)
  private Integer fkiEzsignfolderID;


  public EzsignfoldersignerassociationRequest fkiUserID(Integer fkiUserID) {
    
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


  public EzsignfoldersignerassociationRequest fkiEzsignfolderID(Integer fkiEzsignfolderID) {
    
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
    EzsignfoldersignerassociationRequest ezsignfoldersignerassociationRequest = (EzsignfoldersignerassociationRequest) o;
    return Objects.equals(this.fkiUserID, ezsignfoldersignerassociationRequest.fkiUserID) &&
        Objects.equals(this.fkiEzsignfolderID, ezsignfoldersignerassociationRequest.fkiEzsignfolderID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiUserID, fkiEzsignfolderID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationRequest {\n");
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

