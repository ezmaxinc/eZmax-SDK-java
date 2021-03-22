/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
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
 * Description of the API Key  
 */
@ApiModel(description = "Description of the API Key  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T12:18:06.150Z[GMT]")
public class MultilingualApikeyDescription {
  public static final String SERIALIZED_NAME_S_APIKEY_DESCRIPTION1 = "sApikeyDescription1";
  @SerializedName(SERIALIZED_NAME_S_APIKEY_DESCRIPTION1)
  private String sApikeyDescription1;

  public static final String SERIALIZED_NAME_S_APIKEY_DESCRIPTION2 = "sApikeyDescription2";
  @SerializedName(SERIALIZED_NAME_S_APIKEY_DESCRIPTION2)
  private String sApikeyDescription2;


  public MultilingualApikeyDescription sApikeyDescription1(String sApikeyDescription1) {
    
    this.sApikeyDescription1 = sApikeyDescription1;
    return this;
  }

   /**
   * Value in French
   * @return sApikeyDescription1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value in French")

  public String getsApikeyDescription1() {
    return sApikeyDescription1;
  }


  public void setsApikeyDescription1(String sApikeyDescription1) {
    this.sApikeyDescription1 = sApikeyDescription1;
  }


  public MultilingualApikeyDescription sApikeyDescription2(String sApikeyDescription2) {
    
    this.sApikeyDescription2 = sApikeyDescription2;
    return this;
  }

   /**
   * Value in English
   * @return sApikeyDescription2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value in English")

  public String getsApikeyDescription2() {
    return sApikeyDescription2;
  }


  public void setsApikeyDescription2(String sApikeyDescription2) {
    this.sApikeyDescription2 = sApikeyDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualApikeyDescription multilingualApikeyDescription = (MultilingualApikeyDescription) o;
    return Objects.equals(this.sApikeyDescription1, multilingualApikeyDescription.sApikeyDescription1) &&
        Objects.equals(this.sApikeyDescription2, multilingualApikeyDescription.sApikeyDescription2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sApikeyDescription1, sApikeyDescription2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualApikeyDescription {\n");
    sb.append("    sApikeyDescription1: ").append(toIndentedString(sApikeyDescription1)).append("\n");
    sb.append("    sApikeyDescription2: ").append(toIndentedString(sApikeyDescription2)).append("\n");
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

