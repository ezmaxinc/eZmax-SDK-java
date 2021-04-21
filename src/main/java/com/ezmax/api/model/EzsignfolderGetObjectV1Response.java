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
import com.ezmax.api.model.CommonResponse;
import com.ezmax.api.model.CommonResponseObjDebug;
import com.ezmax.api.model.CommonResponseObjDebugPayload;
import com.ezmax.api.model.EzsignfolderGetObjectV1ResponseMPayload;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response for the /1/object/ezsignfolder/getObject API Request
 */
@ApiModel(description = "Response for the /1/object/ezsignfolder/getObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class EzsignfolderGetObjectV1Response {
  public static final String SERIALIZED_NAME_M_PAYLOAD = "mPayload";
  @SerializedName(SERIALIZED_NAME_M_PAYLOAD)
  private EzsignfolderGetObjectV1ResponseMPayload mPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD = "objDebugPayload";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG_PAYLOAD)
  private CommonResponseObjDebugPayload objDebugPayload;

  public static final String SERIALIZED_NAME_OBJ_DEBUG = "objDebug";
  @SerializedName(SERIALIZED_NAME_OBJ_DEBUG)
  private CommonResponseObjDebug objDebug;


  public EzsignfolderGetObjectV1Response mPayload(EzsignfolderGetObjectV1ResponseMPayload mPayload) {
    
    this.mPayload = mPayload;
    return this;
  }

   /**
   * Get mPayload
   * @return mPayload
  **/
  @ApiModelProperty(required = true, value = "")

  public EzsignfolderGetObjectV1ResponseMPayload getmPayload() {
    return mPayload;
  }


  public void setmPayload(EzsignfolderGetObjectV1ResponseMPayload mPayload) {
    this.mPayload = mPayload;
  }


  public EzsignfolderGetObjectV1Response objDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    
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


  public EzsignfolderGetObjectV1Response objDebug(CommonResponseObjDebug objDebug) {
    
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
    EzsignfolderGetObjectV1Response ezsignfolderGetObjectV1Response = (EzsignfolderGetObjectV1Response) o;
    return Objects.equals(this.mPayload, ezsignfolderGetObjectV1Response.mPayload) &&
        Objects.equals(this.objDebugPayload, ezsignfolderGetObjectV1Response.objDebugPayload) &&
        Objects.equals(this.objDebug, ezsignfolderGetObjectV1Response.objDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mPayload, objDebugPayload, objDebug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetObjectV1Response {\n");
    sb.append("    mPayload: ").append(toIndentedString(mPayload)).append("\n");
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

