/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.
 *
 * The version of the OpenAPI document: 1.0.30
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonResponse;
import com.ezmax.api.model.CommonResponseObjDebug;
import com.ezmax.api.model.CommonResponseObjDebugPayload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response for the /1/object/ezsignfolder/editObject API Request
 */
@ApiModel(description = "Response for the /1/object/ezsignfolder/editObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T04:40:25.285Z[GMT]")
public class EzsignfolderEditObjectV1Response {
  public static final String SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD = "objDebugPayload";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD)
  private CommonResponseObjDebugPayload objDebugPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG = "objDebug";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG)
  private CommonResponseObjDebug objDebug;


  public EzsignfolderEditObjectV1Response objDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    
    this.objDebugPayload = objDebugPayload;
    return this;
  }

   /**
   * Get objDebugPayload
   * @return objDebugPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonResponseObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }


  public void setObjDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }


  public EzsignfolderEditObjectV1Response objDebug(CommonResponseObjDebug objDebug) {
    
    this.objDebug = objDebug;
    return this;
  }

   /**
   * Get objDebug
   * @return objDebug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonResponseObjDebug getObjDebug() {
    return objDebug;
  }


  public void setObjDebug(CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderEditObjectV1Response ezsignfolderEditObjectV1Response = (EzsignfolderEditObjectV1Response) o;
    return Objects.equals(this.objDebugPayload, ezsignfolderEditObjectV1Response.objDebugPayload) &&
        Objects.equals(this.objDebug, ezsignfolderEditObjectV1Response.objDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objDebugPayload, objDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderEditObjectV1Response {\n");
    sb.append("    objDebugPayload: ").append(toIndentedString(objDebugPayload)).append("\n");
    sb.append("    objDebug: ").append(toIndentedString(objDebug)).append("\n");
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

