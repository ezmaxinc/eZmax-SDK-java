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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generic Autocomplete Response
 */
@ApiModel(description = "Generic Autocomplete Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T23:04:18.053Z[GMT]")
public class CommonGetAutocompleteV1ResponseMPayload {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OPTION = "option";
  @SerializedName(SERIALIZED_NAME_OPTION)
  private String option;


  public CommonGetAutocompleteV1ResponseMPayload group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * The Category (ie group) for the dropdown or an empty string if not categorized
   * @return group
  **/
  @ApiModelProperty(required = true, value = "The Category (ie group) for the dropdown or an empty string if not categorized")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public CommonGetAutocompleteV1ResponseMPayload id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Unique ID of the element
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The Unique ID of the element")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CommonGetAutocompleteV1ResponseMPayload option(String option) {
    
    this.option = option;
    return this;
  }

   /**
   * The Description of the element
   * @return option
  **/
  @ApiModelProperty(required = true, value = "The Description of the element")

  public String getOption() {
    return option;
  }


  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGetAutocompleteV1ResponseMPayload commonGetAutocompleteV1ResponseMPayload = (CommonGetAutocompleteV1ResponseMPayload) o;
    return Objects.equals(this.group, commonGetAutocompleteV1ResponseMPayload.group) &&
        Objects.equals(this.id, commonGetAutocompleteV1ResponseMPayload.id) &&
        Objects.equals(this.option, commonGetAutocompleteV1ResponseMPayload.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, id, option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGetAutocompleteV1ResponseMPayload {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

