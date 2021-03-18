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
import com.ezmax.api.model.AttemptResponse;
import com.ezmax.api.model.CommonWebhook;
import com.ezmax.api.model.EzsigndocumentResponse;
import com.ezmax.api.model.WebhookEzsignDocumentCompletedAllOf;
import com.ezmax.api.model.WebhookResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the base Webhook object
 */
@ApiModel(description = "This is the base Webhook object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T16:50:08.207Z[GMT]")
public class WebhookEzsignDocumentCompleted {
  public static final String SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT = "objEzsigndocument";
  @SerializedName(SERIALIZED_NAME_OBJ_EZSIGNDOCUMENT)
  private EzsigndocumentResponse objEzsigndocument;

  public static final String SERIALIZED_NAME_OBJ_WEBHOOK = "objWebhook";
  @SerializedName(SERIALIZED_NAME_OBJ_WEBHOOK)
  private WebhookResponse objWebhook;

  public static final String SERIALIZED_NAME_A_OBJ_ATTEMPT = "a_objAttempt";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ATTEMPT)
  private List<AttemptResponse> aObjAttempt = new ArrayList<AttemptResponse>();


  public WebhookEzsignDocumentCompleted objEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    
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


  public WebhookEzsignDocumentCompleted objWebhook(WebhookResponse objWebhook) {
    
    this.objWebhook = objWebhook;
    return this;
  }

   /**
   * Get objWebhook
   * @return objWebhook
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookResponse getObjWebhook() {
    return objWebhook;
  }


  public void setObjWebhook(WebhookResponse objWebhook) {
    this.objWebhook = objWebhook;
  }


  public WebhookEzsignDocumentCompleted aObjAttempt(List<AttemptResponse> aObjAttempt) {
    
    this.aObjAttempt = aObjAttempt;
    return this;
  }

  public WebhookEzsignDocumentCompleted addAObjAttemptItem(AttemptResponse aObjAttemptItem) {
    this.aObjAttempt.add(aObjAttemptItem);
    return this;
  }

   /**
   * An array containing details of previous attempts that were made to deliver the message. The array is empty if it&#39;s the first attempt.
   * @return aObjAttempt
  **/
  @ApiModelProperty(required = true, value = "An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.")

  public List<AttemptResponse> getaObjAttempt() {
    return aObjAttempt;
  }


  public void setaObjAttempt(List<AttemptResponse> aObjAttempt) {
    this.aObjAttempt = aObjAttempt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignDocumentCompleted webhookEzsignDocumentCompleted = (WebhookEzsignDocumentCompleted) o;
    return Objects.equals(this.objEzsigndocument, webhookEzsignDocumentCompleted.objEzsigndocument) &&
        Objects.equals(this.objWebhook, webhookEzsignDocumentCompleted.objWebhook) &&
        Objects.equals(this.aObjAttempt, webhookEzsignDocumentCompleted.aObjAttempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objEzsigndocument, objWebhook, aObjAttempt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignDocumentCompleted {\n");
    sb.append("    objEzsigndocument: ").append(toIndentedString(objEzsigndocument)).append("\n");
    sb.append("    objWebhook: ").append(toIndentedString(objWebhook)).append("\n");
    sb.append("    aObjAttempt: ").append(toIndentedString(aObjAttempt)).append("\n");
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

