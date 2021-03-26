/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.39
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
 * Payload for the /1/object/ezsignfolder/createObject API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsignfolder/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T19:33:12.356Z[GMT]")
public class EzsignfolderCreateObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_PKI_EZSIGNFOLDER_I_D = "a_pkiEzsignfolderID";
  @SerializedName(SERIALIZED_NAME_A_PKI_EZSIGNFOLDER_I_D)
  private List<Integer> aPkiEzsignfolderID = new ArrayList<Integer>();


  public EzsignfolderCreateObjectV1ResponseMPayload aPkiEzsignfolderID(List<Integer> aPkiEzsignfolderID) {
    
    this.aPkiEzsignfolderID = aPkiEzsignfolderID;
    return this;
  }

  public EzsignfolderCreateObjectV1ResponseMPayload addAPkiEzsignfolderIDItem(Integer aPkiEzsignfolderIDItem) {
    this.aPkiEzsignfolderID.add(aPkiEzsignfolderIDItem);
    return this;
  }

   /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   * @return aPkiEzsignfolderID
  **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")

  public List<Integer> getaPkiEzsignfolderID() {
    return aPkiEzsignfolderID;
  }


  public void setaPkiEzsignfolderID(List<Integer> aPkiEzsignfolderID) {
    this.aPkiEzsignfolderID = aPkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV1ResponseMPayload ezsignfolderCreateObjectV1ResponseMPayload = (EzsignfolderCreateObjectV1ResponseMPayload) o;
    return Objects.equals(this.aPkiEzsignfolderID, ezsignfolderCreateObjectV1ResponseMPayload.aPkiEzsignfolderID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aPkiEzsignfolderID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV1ResponseMPayload {\n");
    sb.append("    aPkiEzsignfolderID: ").append(toIndentedString(aPkiEzsignfolderID)).append("\n");
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

