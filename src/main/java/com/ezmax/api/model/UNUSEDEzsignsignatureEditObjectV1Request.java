/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsignsignatureRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/ezsignsignature/editObject API Request
 */
@ApiModel(description = "Request for the /1/object/ezsignsignature/editObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T22:48:03.557Z[GMT]")
public class UNUSEDEzsignsignatureEditObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNSIGNATURE = "objEzsignsignature";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNSIGNATURE)
  private EzsignsignatureRequest objEzsignsignature;


  public UNUSEDEzsignsignatureEditObjectV1Request objEzsignsignature(EzsignsignatureRequest objEzsignsignature) {
    
    this.objEzsignsignature = objEzsignsignature;
    return this;
  }

   /**
   * Get objEzsignsignature
   * @return objEzsignsignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsignsignatureRequest getObjEzsignsignature() {
    return objEzsignsignature;
  }


  public void setObjEzsignsignature(EzsignsignatureRequest objEzsignsignature) {
    this.objEzsignsignature = objEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNUSEDEzsignsignatureEditObjectV1Request unUSEDEzsignsignatureEditObjectV1Request = (UNUSEDEzsignsignatureEditObjectV1Request) o;
    return Objects.equals(this.objEzsignsignature, unUSEDEzsignsignatureEditObjectV1Request.objEzsignsignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsignsignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignsignatureEditObjectV1Request {\n");
    sb.append("    objEzsignsignature: ").append(toIndentedString(objEzsignsignature)).append("\n");
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

