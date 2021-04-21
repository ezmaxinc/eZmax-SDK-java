/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.42
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
 * Definition of objSQLQuery Object
 */
@ApiModel(description = "Definition of objSQLQuery Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T19:39:31.793073Z[Etc/UTC]")
public class CommonResponseObjSQLQuery {
  public static final String SERIALIZED_NAME_S_QUERY = "sQuery";
  @SerializedName(SERIALIZED_NAME_S_QUERY)
  private String sQuery;

  public static final String SERIALIZED_NAME_F_DURATION = "fDuration";
  @SerializedName(SERIALIZED_NAME_F_DURATION)
  private Float fDuration;


  public CommonResponseObjSQLQuery sQuery(String sQuery) {
    
    this.sQuery = sQuery;
    return this;
  }

   /**
   * The SQL Query
   * @return sQuery
  **/
  @ApiModelProperty(required = true, value = "The SQL Query")

  public String getsQuery() {
    return sQuery;
  }


  public void setsQuery(String sQuery) {
    this.sQuery = sQuery;
  }


  public CommonResponseObjSQLQuery fDuration(Float fDuration) {
    
    this.fDuration = fDuration;
    return this;
  }

   /**
   * Execution time of the SQL Query in seconds
   * @return fDuration
  **/
  @ApiModelProperty(required = true, value = "Execution time of the SQL Query in seconds")

  public Float getfDuration() {
    return fDuration;
  }


  public void setfDuration(Float fDuration) {
    this.fDuration = fDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjSQLQuery commonResponseObjSQLQuery = (CommonResponseObjSQLQuery) o;
    return Objects.equals(this.sQuery, commonResponseObjSQLQuery.sQuery) &&
        Objects.equals(this.fDuration, commonResponseObjSQLQuery.fDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sQuery, fDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjSQLQuery {\n");
    sb.append("    sQuery: ").append(toIndentedString(sQuery)).append("\n");
    sb.append("    fDuration: ").append(toIndentedString(fDuration)).append("\n");
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

