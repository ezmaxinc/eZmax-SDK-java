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
import com.ezmax.api.model.EzsignfoldersignerassociationRequest;
import com.ezmax.api.model.EzsignfoldersignerassociationRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/ezsignfoldersignerassociation/createObject API Request
 */
@ApiModel(description = "Request for the /1/object/ezsignfoldersignerassociation/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T16:46:52.954Z[GMT]")
public class EzsignfoldersignerassociationCreateObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION = "objEzsignfoldersignerassociation";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION)
  private EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION_COMPOUND = "objEzsignfoldersignerassociationCompound";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDERSIGNERASSOCIATION_COMPOUND)
  private EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociationCompound;


  public EzsignfoldersignerassociationCreateObjectV1Request objEzsignfoldersignerassociation(EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation) {
    
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


  public EzsignfoldersignerassociationCreateObjectV1Request objEzsignfoldersignerassociationCompound(EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociationCompound) {
    
    this.objEzsignfoldersignerassociationCompound = objEzsignfoldersignerassociationCompound;
    return this;
  }

   /**
   * Get objEzsignfoldersignerassociationCompound
   * @return objEzsignfoldersignerassociationCompound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignfoldersignerassociationRequestCompound getObjEzsignfoldersignerassociationCompound() {
    return objEzsignfoldersignerassociationCompound;
  }


  public void setObjEzsignfoldersignerassociationCompound(EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociationCompound) {
    this.objEzsignfoldersignerassociationCompound = objEzsignfoldersignerassociationCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationCreateObjectV1Request ezsignfoldersignerassociationCreateObjectV1Request = (EzsignfoldersignerassociationCreateObjectV1Request) o;
    return Objects.equals(this.objEzsignfoldersignerassociation, ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociation) &&
        Objects.equals(this.objEzsignfoldersignerassociationCompound, ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociationCompound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignfoldersignerassociation, objEzsignfoldersignerassociationCompound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationCreateObjectV1Request {\n");
    sb.append("    objEzsignfoldersignerassociation: ").append(toIndentedString(objEzsignfoldersignerassociation)).append("\n");
    sb.append("    objEzsignfoldersignerassociationCompound: ").append(toIndentedString(objEzsignfoldersignerassociationCompound)).append("\n");
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

