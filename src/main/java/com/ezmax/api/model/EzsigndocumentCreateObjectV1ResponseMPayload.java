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
 * Payload for the /1/object/ezsigndocument/createObject API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsigndocument/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-22T12:18:06.150Z[GMT]")
public class EzsigndocumentCreateObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_PKI_EZSIGNDOCUMENT_I_D = "a_pkiEzsigndocumentID";
  @SerializedName(SERIALIZED_NAME_A_PKI_EZSIGNDOCUMENT_I_D)
  private List<Integer> aPkiEzsigndocumentID = new ArrayList<Integer>();


  public EzsigndocumentCreateObjectV1ResponseMPayload aPkiEzsigndocumentID(List<Integer> aPkiEzsigndocumentID) {
    
    this.aPkiEzsigndocumentID = aPkiEzsigndocumentID;
    return this;
  }

  public EzsigndocumentCreateObjectV1ResponseMPayload addAPkiEzsigndocumentIDItem(Integer aPkiEzsigndocumentIDItem) {
    this.aPkiEzsigndocumentID.add(aPkiEzsigndocumentIDItem);
    return this;
  }

   /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   * @return aPkiEzsigndocumentID
  **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")

  public List<Integer> getaPkiEzsigndocumentID() {
    return aPkiEzsigndocumentID;
  }


  public void setaPkiEzsigndocumentID(List<Integer> aPkiEzsigndocumentID) {
    this.aPkiEzsigndocumentID = aPkiEzsigndocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateObjectV1ResponseMPayload ezsigndocumentCreateObjectV1ResponseMPayload = (EzsigndocumentCreateObjectV1ResponseMPayload) o;
    return Objects.equals(this.aPkiEzsigndocumentID, ezsigndocumentCreateObjectV1ResponseMPayload.aPkiEzsigndocumentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aPkiEzsigndocumentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateObjectV1ResponseMPayload {\n");
    sb.append("    aPkiEzsigndocumentID: ").append(toIndentedString(aPkiEzsigndocumentID)).append("\n");
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

