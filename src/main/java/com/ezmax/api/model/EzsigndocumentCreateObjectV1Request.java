/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.27
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.EzsigndocumentRequest;
import com.ezmax.api.model.EzsigndocumentRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/ezsigndocument/createObject API Request
 */
@ApiModel(description = "Request for the /1/object/ezsigndocument/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T23:04:18.053Z[GMT]")
public class EzsigndocumentCreateObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT = "objEzsigndocument";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT)
  private EzsigndocumentRequest objEzsigndocument;

  public static final String SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT_COMPOUND = "objEzsigndocumentCompound";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT_COMPOUND)
  private EzsigndocumentRequestCompound objEzsigndocumentCompound;


  public EzsigndocumentCreateObjectV1Request objEzsigndocument(EzsigndocumentRequest objEzsigndocument) {
    
    this.objEzsigndocument = objEzsigndocument;
    return this;
  }

   /**
   * Get objEzsigndocument
   * @return objEzsigndocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsigndocumentRequest getObjEzsigndocument() {
    return objEzsigndocument;
  }


  public void setObjEzsigndocument(EzsigndocumentRequest objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }


  public EzsigndocumentCreateObjectV1Request objEzsigndocumentCompound(EzsigndocumentRequestCompound objEzsigndocumentCompound) {
    
    this.objEzsigndocumentCompound = objEzsigndocumentCompound;
    return this;
  }

   /**
   * Get objEzsigndocumentCompound
   * @return objEzsigndocumentCompound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EzsigndocumentRequestCompound getObjEzsigndocumentCompound() {
    return objEzsigndocumentCompound;
  }


  public void setObjEzsigndocumentCompound(EzsigndocumentRequestCompound objEzsigndocumentCompound) {
    this.objEzsigndocumentCompound = objEzsigndocumentCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateObjectV1Request ezsigndocumentCreateObjectV1Request = (EzsigndocumentCreateObjectV1Request) o;
    return Objects.equals(this.objEzsigndocument, ezsigndocumentCreateObjectV1Request.objEzsigndocument) &&
        Objects.equals(this.objEzsigndocumentCompound, ezsigndocumentCreateObjectV1Request.objEzsigndocumentCompound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsigndocument, objEzsigndocumentCompound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateObjectV1Request {\n");
    sb.append("    objEzsigndocument: ").append(toIndentedString(objEzsigndocument)).append("\n");
    sb.append("    objEzsigndocumentCompound: ").append(toIndentedString(objEzsigndocumentCompound)).append("\n");
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

