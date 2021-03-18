/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.37
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/ezsignfoldersignerassociation/editObject API Request
 */
@ApiModel(description = "Request for the /1/object/ezsignfoldersignerassociation/editObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T16:50:08.207Z[GMT]")
public class UNUSEDEzsignfoldersignerassociationEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION = "objEzsignfoldersignerassociation";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION)
  private EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation;


  public UNUSEDEzsignfoldersignerassociationEditObjectV1Request objEzsignfoldersignerassociation(EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation) {
    
    this.objEzsignfoldersignerassociation = objEzsignfoldersignerassociation;
    return this;
  }

   /**
   * Get objEzsignfoldersignerassociation
   * @return objEzsignfoldersignerassociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignfoldersignerassociationRequest getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }


  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation) {
    this.objEzsignfoldersignerassociation = objEzsignfoldersignerassociation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNUSEDEzsignfoldersignerassociationEditObjectV1Request unUSEDEzsignfoldersignerassociationEditObjectV1Request = (UNUSEDEzsignfoldersignerassociationEditObjectV1Request) o;
    return Objects.equals(this.objEzsignfoldersignerassociation, unUSEDEzsignfoldersignerassociationEditObjectV1Request.objEzsignfoldersignerassociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignfoldersignerassociation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignfoldersignerassociationEditObjectV1Request {\n");
    sb.append("    objEzsignfoldersignerassociation: ").append(toIndentedString(objEzsignfoldersignerassociation)).append("\n");
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

