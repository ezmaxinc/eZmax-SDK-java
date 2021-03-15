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
import com.ezmax.api.model.EzsignfolderRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/ezsignfolder/editObject API Request
 */
@ApiModel(description = "Request for the /1/object/ezsignfolder/editObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T18:07:05.174Z[GMT]")
public class UNUSEDEzsignfolderEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNFOLDER = "objEzsignfolder";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNFOLDER)
  private EzsignfolderRequest objEzsignfolder;


  public UNUSEDEzsignfolderEditObjectV1Request objEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    
    this.objEzsignfolder = objEzsignfolder;
    return this;
  }

   /**
   * Get objEzsignfolder
   * @return objEzsignfolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignfolderRequest getObjEzsignfolder() {
    return objEzsignfolder;
  }


  public void setObjEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNUSEDEzsignfolderEditObjectV1Request unUSEDEzsignfolderEditObjectV1Request = (UNUSEDEzsignfolderEditObjectV1Request) o;
    return Objects.equals(this.objEzsignfolder, unUSEDEzsignfolderEditObjectV1Request.objEzsignfolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignfolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignfolderEditObjectV1Request {\n");
    sb.append("    objEzsignfolder: ").append(toIndentedString(objEzsignfolder)).append("\n");
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

