/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.ContactinformationsRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContactRequestCompoundAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-10T19:51:01.665Z[GMT]")
public class ContactRequestCompoundAllOf {
  public static final String SERIALIZED_NAME_OBJ_CONTACTINFORMATIONS = "objContactinformations";
  @SerializedName(SERIALIZED_NAME_OBJ_CONTACTINFORMATIONS)
  private ContactinformationsRequestCompound objContactinformations;


  public ContactRequestCompoundAllOf objContactinformations(ContactinformationsRequestCompound objContactinformations) {
    
    this.objContactinformations = objContactinformations;
    return this;
  }

   /**
   * Get objContactinformations
   * @return objContactinformations
  **/
  @ApiModelProperty(required = true, value = "")

  public ContactinformationsRequestCompound getObjContactinformations() {
    return objContactinformations;
  }


  public void setObjContactinformations(ContactinformationsRequestCompound objContactinformations) {
    this.objContactinformations = objContactinformations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequestCompoundAllOf contactRequestCompoundAllOf = (ContactRequestCompoundAllOf) o;
    return Objects.equals(this.objContactinformations, contactRequestCompoundAllOf.objContactinformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objContactinformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequestCompoundAllOf {\n");
    sb.append("    objContactinformations: ").append(toIndentedString(objContactinformations)).append("\n");
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

