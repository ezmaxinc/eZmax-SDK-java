/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
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
import com.ezmax.api.model.UserResponse;
import com.ezmax.api.model.WebhookResponse;
import com.ezmax.api.model.WebhookUserUserCreatedAllOf;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T20:48:09.039253Z[Etc/UTC]")
public class WebhookUserUserCreated {
  public static final String SERIALIZED_NAME_OBJ_USER = "objUser";
  @SerializedName(SERIALIZED_NAME_OBJ_USER)
  private UserResponse objUser;

  public static final String SERIALIZED_NAME_OBJ_WEBHOOK = "objWebhook";
  @SerializedName(SERIALIZED_NAME_OBJ_WEBHOOK)
  private WebhookResponse objWebhook;

  public static final String SERIALIZED_NAME_A_OBJ_ATTEMPT = "a_objAttempt";
  @SerializedName(SERIALIZED_NAME_A_OBJ_ATTEMPT)
  private List<AttemptResponse> aObjAttempt = new ArrayList<AttemptResponse>();


  public WebhookUserUserCreated objUser(UserResponse objUser) {
    
    this.objUser = objUser;
    return this;
  }

   /**
   * Get objUser
   * @return objUser
  **/
  @ApiModelProperty(required = true, value = "")

  public UserResponse getObjUser() {
    return objUser;
  }


  public void setObjUser(UserResponse objUser) {
    this.objUser = objUser;
  }


  public WebhookUserUserCreated objWebhook(WebhookResponse objWebhook) {
    
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


  public WebhookUserUserCreated aObjAttempt(List<AttemptResponse> aObjAttempt) {
    
    this.aObjAttempt = aObjAttempt;
    return this;
  }

  public WebhookUserUserCreated addAObjAttemptItem(AttemptResponse aObjAttemptItem) {
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
    WebhookUserUserCreated webhookUserUserCreated = (WebhookUserUserCreated) o;
    return Objects.equals(this.objUser, webhookUserUserCreated.objUser) &&
        Objects.equals(this.objWebhook, webhookUserUserCreated.objWebhook) &&
        Objects.equals(this.aObjAttempt, webhookUserUserCreated.aObjAttempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objUser, objWebhook, aObjAttempt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserUserCreated {\n");
    sb.append("    objUser: ").append(toIndentedString(objUser)).append("\n");
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

