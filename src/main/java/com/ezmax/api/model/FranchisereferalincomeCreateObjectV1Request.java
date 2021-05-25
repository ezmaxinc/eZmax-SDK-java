/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.43
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.FranchisereferalincomeRequest;
import com.ezmax.api.model.FranchisereferalincomeRequestCompound;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request for the /1/object/franchisereferalincome/createObject API Request
 */
@ApiModel(description = "Request for the /1/object/franchisereferalincome/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-25T22:38:36.330572Z[Etc/UTC]")
public class FranchisereferalincomeCreateObjectV1Request {
  public static final String SERIALIZED_NAME_OBJ_FRANCHISEREFERALINCOME = "objFranchisereferalincome";
  @SerializedName(SERIALIZED_NAME_OBJ_FRANCHISEREFERALINCOME)
  private FranchisereferalincomeRequest objFranchisereferalincome;

  public static final String SERIALIZED_NAME_OBJ_FRANCHISEREFERALINCOME_COMPOUND = "objFranchisereferalincomeCompound";
  @SerializedName(SERIALIZED_NAME_OBJ_FRANCHISEREFERALINCOME_COMPOUND)
  private FranchisereferalincomeRequestCompound objFranchisereferalincomeCompound;


  public FranchisereferalincomeCreateObjectV1Request objFranchisereferalincome(FranchisereferalincomeRequest objFranchisereferalincome) {
    
    this.objFranchisereferalincome = objFranchisereferalincome;
    return this;
  }

   /**
   * Get objFranchisereferalincome
   * @return objFranchisereferalincome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FranchisereferalincomeRequest getObjFranchisereferalincome() {
    return objFranchisereferalincome;
  }


  public void setObjFranchisereferalincome(FranchisereferalincomeRequest objFranchisereferalincome) {
    this.objFranchisereferalincome = objFranchisereferalincome;
  }


  public FranchisereferalincomeCreateObjectV1Request objFranchisereferalincomeCompound(FranchisereferalincomeRequestCompound objFranchisereferalincomeCompound) {
    
    this.objFranchisereferalincomeCompound = objFranchisereferalincomeCompound;
    return this;
  }

   /**
   * Get objFranchisereferalincomeCompound
   * @return objFranchisereferalincomeCompound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FranchisereferalincomeRequestCompound getObjFranchisereferalincomeCompound() {
    return objFranchisereferalincomeCompound;
  }


  public void setObjFranchisereferalincomeCompound(FranchisereferalincomeRequestCompound objFranchisereferalincomeCompound) {
    this.objFranchisereferalincomeCompound = objFranchisereferalincomeCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeCreateObjectV1Request franchisereferalincomeCreateObjectV1Request = (FranchisereferalincomeCreateObjectV1Request) o;
    return Objects.equals(this.objFranchisereferalincome, franchisereferalincomeCreateObjectV1Request.objFranchisereferalincome) &&
        Objects.equals(this.objFranchisereferalincomeCompound, franchisereferalincomeCreateObjectV1Request.objFranchisereferalincomeCompound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objFranchisereferalincome, objFranchisereferalincomeCompound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeCreateObjectV1Request {\n");
    sb.append("    objFranchisereferalincome: ").append(toIndentedString(objFranchisereferalincome)).append("\n");
    sb.append("    objFranchisereferalincomeCompound: ").append(toIndentedString(objFranchisereferalincomeCompound)).append("\n");
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

