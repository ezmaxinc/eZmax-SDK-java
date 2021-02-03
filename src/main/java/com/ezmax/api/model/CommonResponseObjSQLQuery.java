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
 * Definition of objSQLQuery Object
 */
@ApiModel(description = "Definition of objSQLQuery Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-03T23:04:18.053Z[GMT]")
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

