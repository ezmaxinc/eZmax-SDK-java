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
import java.util.ArrayList;
import java.util.List;

/**
 * This is a debug object containing debugging information on the actual function
 */
@ApiModel(description = "This is a debug object containing debugging information on the actual function")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T12:18:06.150Z[GMT]")
public class CommonResponseObjDebugPayload {
  public static final String SERIALIZED_NAME_I_VERSION_MIN = "iVersionMin";
  @SerializedName(SERIALIZED_NAME_I_VERSION_MIN)
  private Integer iVersionMin;

  public static final String SERIALIZED_NAME_I_VERSION_MAX = "iVersionMax";
  @SerializedName(SERIALIZED_NAME_I_VERSION_MAX)
  private Integer iVersionMax;

  public static final String SERIALIZED_NAME_A_REQUIRED_PERMISSIONS = "a_RequiredPermissions";
  @SerializedName(SERIALIZED_NAME_A_REQUIRED_PERMISSIONS)
  private List<Integer> aRequiredPermissions = new ArrayList<Integer>();


  public CommonResponseObjDebugPayload iVersionMin(Integer iVersionMin) {
    
    this.iVersionMin = iVersionMin;
    return this;
  }

   /**
   * The minimum version of the function that can be called
   * @return iVersionMin
  **/
  @ApiModelProperty(required = true, value = "The minimum version of the function that can be called")

  public Integer getiVersionMin() {
    return iVersionMin;
  }


  public void setiVersionMin(Integer iVersionMin) {
    this.iVersionMin = iVersionMin;
  }


  public CommonResponseObjDebugPayload iVersionMax(Integer iVersionMax) {
    
    this.iVersionMax = iVersionMax;
    return this;
  }

   /**
   * The maximum version of the function that can be called
   * @return iVersionMax
  **/
  @ApiModelProperty(required = true, value = "The maximum version of the function that can be called")

  public Integer getiVersionMax() {
    return iVersionMax;
  }


  public void setiVersionMax(Integer iVersionMax) {
    this.iVersionMax = iVersionMax;
  }


  public CommonResponseObjDebugPayload aRequiredPermissions(List<Integer> aRequiredPermissions) {
    
    this.aRequiredPermissions = aRequiredPermissions;
    return this;
  }

  public CommonResponseObjDebugPayload addARequiredPermissionsItem(Integer aRequiredPermissionsItem) {
    this.aRequiredPermissions.add(aRequiredPermissionsItem);
    return this;
  }

   /**
   * An array of permissions required to access this function.  If the value \&quot;0\&quot; is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don&#39;t need to have all of them.
   * @return aRequiredPermissions
  **/
  @ApiModelProperty(required = true, value = "An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them.")

  public List<Integer> getaRequiredPermissions() {
    return aRequiredPermissions;
  }


  public void setaRequiredPermissions(List<Integer> aRequiredPermissions) {
    this.aRequiredPermissions = aRequiredPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjDebugPayload commonResponseObjDebugPayload = (CommonResponseObjDebugPayload) o;
    return Objects.equals(this.iVersionMin, commonResponseObjDebugPayload.iVersionMin) &&
        Objects.equals(this.iVersionMax, commonResponseObjDebugPayload.iVersionMax) &&
        Objects.equals(this.aRequiredPermissions, commonResponseObjDebugPayload.aRequiredPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iVersionMin, iVersionMax, aRequiredPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjDebugPayload {\n");
    sb.append("    iVersionMin: ").append(toIndentedString(iVersionMin)).append("\n");
    sb.append("    iVersionMax: ").append(toIndentedString(iVersionMax)).append("\n");
    sb.append("    aRequiredPermissions: ").append(toIndentedString(aRequiredPermissions)).append("\n");
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

