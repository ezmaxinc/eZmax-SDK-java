/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.28
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.UserResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookUserUserCreatedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-04T12:10:31.414Z[GMT]")
public class WebhookUserUserCreatedAllOf {
  public static final String SERIALIZED_NAME_OBJ_USER = "objUser";
  @SerializedName(SERIALIZED_NAME_OBJ_USER)
  private UserResponse objUser;


  public WebhookUserUserCreatedAllOf objUser(UserResponse objUser) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUserUserCreatedAllOf webhookUserUserCreatedAllOf = (WebhookUserUserCreatedAllOf) o;
    return Objects.equals(this.objUser, webhookUserUserCreatedAllOf.objUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserUserCreatedAllOf {\n");
    sb.append("    objUser: ").append(toIndentedString(objUser)).append("\n");
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

