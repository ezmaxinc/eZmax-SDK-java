/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
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
 * Payload for the /1/object/franchisereferalincome/createObject API Request
 */
@ApiModel(description = "Payload for the /1/object/franchisereferalincome/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-31T17:14:26.574336Z[Etc/UTC]")
public class FranchisereferalincomeCreateObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_PKI_FRANCHISEREFERALINCOME_I_D = "a_pkiFranchisereferalincomeID";
  @SerializedName(SERIALIZED_NAME_A_PKI_FRANCHISEREFERALINCOME_I_D)
  private List<Integer> aPkiFranchisereferalincomeID = new ArrayList<Integer>();


  public FranchisereferalincomeCreateObjectV1ResponseMPayload aPkiFranchisereferalincomeID(List<Integer> aPkiFranchisereferalincomeID) {
    
    this.aPkiFranchisereferalincomeID = aPkiFranchisereferalincomeID;
    return this;
  }

  public FranchisereferalincomeCreateObjectV1ResponseMPayload addAPkiFranchisereferalincomeIDItem(Integer aPkiFranchisereferalincomeIDItem) {
    this.aPkiFranchisereferalincomeID.add(aPkiFranchisereferalincomeIDItem);
    return this;
  }

   /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   * @return aPkiFranchisereferalincomeID
  **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")

  public List<Integer> getaPkiFranchisereferalincomeID() {
    return aPkiFranchisereferalincomeID;
  }


  public void setaPkiFranchisereferalincomeID(List<Integer> aPkiFranchisereferalincomeID) {
    this.aPkiFranchisereferalincomeID = aPkiFranchisereferalincomeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeCreateObjectV1ResponseMPayload franchisereferalincomeCreateObjectV1ResponseMPayload = (FranchisereferalincomeCreateObjectV1ResponseMPayload) o;
    return Objects.equals(this.aPkiFranchisereferalincomeID, franchisereferalincomeCreateObjectV1ResponseMPayload.aPkiFranchisereferalincomeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aPkiFranchisereferalincomeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeCreateObjectV1ResponseMPayload {\n");
    sb.append("    aPkiFranchisereferalincomeID: ").append(toIndentedString(aPkiFranchisereferalincomeID)).append("\n");
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

