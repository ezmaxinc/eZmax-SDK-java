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
import com.ezmax.api.model.EzsigndocumentResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookEzsignDocumentCompletedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class WebhookEzsignDocumentCompletedAllOf {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT = "objEzsigndocument";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT)
  private EzsigndocumentResponse objEzsigndocument;


  public WebhookEzsignDocumentCompletedAllOf objEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    
    this.objEzsigndocument = objEzsigndocument;
    return this;
  }

   /**
   * Get objEzsigndocument
   * @return objEzsigndocument
  **/
  @ApiModelProperty(required = true, value = "")

  public EzsigndocumentResponse getObjEzsigndocument() {
    return objEzsigndocument;
  }


  public void setObjEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignDocumentCompletedAllOf webhookEzsignDocumentCompletedAllOf = (WebhookEzsignDocumentCompletedAllOf) o;
    return Objects.equals(this.objEzsigndocument, webhookEzsignDocumentCompletedAllOf.objEzsigndocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsigndocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignDocumentCompletedAllOf {\n");
    sb.append("    objEzsigndocument: ").append(toIndentedString(objEzsigndocument)).append("\n");
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

