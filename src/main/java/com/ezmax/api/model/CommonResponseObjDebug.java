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
import com.ezmax.api.model.CommonResponseObjSQLQuery;
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
 * This is a generic debug object that is returned by all API requests
 */
@ApiModel(description = "This is a generic debug object that is returned by all API requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T16:50:08.207Z[GMT]")
public class CommonResponseObjDebug {
  public static final String SERIALIZED_NAME_S_MEMORY_USAGE = "sMemoryUsage";
  @SerializedName(SERIALIZED_NAME_S_MEMORY_USAGE)
  private String sMemoryUsage;

  public static final String SERIALIZED_NAME_S_RUN_TIME = "sRunTime";
  @SerializedName(SERIALIZED_NAME_S_RUN_TIME)
  private String sRunTime;

  public static final String SERIALIZED_NAME_I_S_Q_L_SELECTS = "iSQLSelects";
  @SerializedName(SERIALIZED_NAME_I_S_Q_L_SELECTS)
  private Integer iSQLSelects;

  public static final String SERIALIZED_NAME_I_S_Q_L_QUERIES = "iSQLQueries";
  @SerializedName(SERIALIZED_NAME_I_S_Q_L_QUERIES)
  private Integer iSQLQueries;

  public static final String SERIALIZED_NAME_A_OBJ_S_Q_L_QUERY = "a_objSQLQuery";
  @SerializedName(SERIALIZED_NAME_A_OBJ_S_Q_L_QUERY)
  private List<CommonResponseObjSQLQuery> aObjSQLQuery = new ArrayList<CommonResponseObjSQLQuery>();


  public CommonResponseObjDebug sMemoryUsage(String sMemoryUsage) {
    
    this.sMemoryUsage = sMemoryUsage;
    return this;
  }

   /**
   * The peak memory allocated during the API request execution. Formatted as a human readable string
   * @return sMemoryUsage
  **/
  @ApiModelProperty(required = true, value = "The peak memory allocated during the API request execution. Formatted as a human readable string")

  public String getsMemoryUsage() {
    return sMemoryUsage;
  }


  public void setsMemoryUsage(String sMemoryUsage) {
    this.sMemoryUsage = sMemoryUsage;
  }


  public CommonResponseObjDebug sRunTime(String sRunTime) {
    
    this.sRunTime = sRunTime;
    return this;
  }

   /**
   * The total server execution time of the API request execution. Formatted as a human readable string
   * @return sRunTime
  **/
  @ApiModelProperty(required = true, value = "The total server execution time of the API request execution. Formatted as a human readable string")

  public String getsRunTime() {
    return sRunTime;
  }


  public void setsRunTime(String sRunTime) {
    this.sRunTime = sRunTime;
  }


  public CommonResponseObjDebug iSQLSelects(Integer iSQLSelects) {
    
    this.iSQLSelects = iSQLSelects;
    return this;
  }

   /**
   * The number of SQL SELECT queries that were sent to the database server during the API request execution
   * @return iSQLSelects
  **/
  @ApiModelProperty(required = true, value = "The number of SQL SELECT queries that were sent to the database server during the API request execution")

  public Integer getiSQLSelects() {
    return iSQLSelects;
  }


  public void setiSQLSelects(Integer iSQLSelects) {
    this.iSQLSelects = iSQLSelects;
  }


  public CommonResponseObjDebug iSQLQueries(Integer iSQLQueries) {
    
    this.iSQLQueries = iSQLQueries;
    return this;
  }

   /**
   * The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution
   * @return iSQLQueries
  **/
  @ApiModelProperty(required = true, value = "The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution")

  public Integer getiSQLQueries() {
    return iSQLQueries;
  }


  public void setiSQLQueries(Integer iSQLQueries) {
    this.iSQLQueries = iSQLQueries;
  }


  public CommonResponseObjDebug aObjSQLQuery(List<CommonResponseObjSQLQuery> aObjSQLQuery) {
    
    this.aObjSQLQuery = aObjSQLQuery;
    return this;
  }

  public CommonResponseObjDebug addAObjSQLQueryItem(CommonResponseObjSQLQuery aObjSQLQueryItem) {
    this.aObjSQLQuery.add(aObjSQLQueryItem);
    return this;
  }

   /**
   * An array of the SQL Queries that were executed during the API request execution
   * @return aObjSQLQuery
  **/
  @ApiModelProperty(required = true, value = "An array of the SQL Queries that were executed during the API request execution")

  public List<CommonResponseObjSQLQuery> getaObjSQLQuery() {
    return aObjSQLQuery;
  }


  public void setaObjSQLQuery(List<CommonResponseObjSQLQuery> aObjSQLQuery) {
    this.aObjSQLQuery = aObjSQLQuery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebug commonResponseObjDebug = (CommonResponseObjDebug) o;
    return Objects.equals(this.sMemoryUsage, commonResponseObjDebug.sMemoryUsage) &&
        Objects.equals(this.sRunTime, commonResponseObjDebug.sRunTime) &&
        Objects.equals(this.iSQLSelects, commonResponseObjDebug.iSQLSelects) &&
        Objects.equals(this.iSQLQueries, commonResponseObjDebug.iSQLQueries) &&
        Objects.equals(this.aObjSQLQuery, commonResponseObjDebug.aObjSQLQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sMemoryUsage, sRunTime, iSQLSelects, iSQLQueries, aObjSQLQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebug {\n");
    sb.append("    sMemoryUsage: ").append(toIndentedString(sMemoryUsage)).append("\n");
    sb.append("    sRunTime: ").append(toIndentedString(sRunTime)).append("\n");
    sb.append("    iSQLSelects: ").append(toIndentedString(iSQLSelects)).append("\n");
    sb.append("    iSQLQueries: ").append(toIndentedString(iSQLQueries)).append("\n");
    sb.append("    aObjSQLQuery: ").append(toIndentedString(aObjSQLQuery)).append("\n");
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

