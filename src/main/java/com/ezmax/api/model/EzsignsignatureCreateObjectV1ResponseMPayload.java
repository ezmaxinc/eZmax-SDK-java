/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
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
 * Payload for the /1/object/ezsignsignature/createObject API Request
 */
@ApiModel(description = "Payload for the /1/object/ezsignsignature/createObject API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T18:29:42.866336Z[Etc/UTC]")
public class EzsignsignatureCreateObjectV1ResponseMPayload {
  public static final String SERIALIZED_NAME_A_PKI_EZSIGNSIGNATURE_I_D = "a_pkiEzsignsignatureID";
  @SerializedName(SERIALIZED_NAME_A_PKI_EZSIGNSIGNATURE_I_D)
  private List<Integer> aPkiEzsignsignatureID = new ArrayList<Integer>();


  public EzsignsignatureCreateObjectV1ResponseMPayload aPkiEzsignsignatureID(List<Integer> aPkiEzsignsignatureID) {
    
    this.aPkiEzsignsignatureID = aPkiEzsignsignatureID;
    return this;
  }

  public EzsignsignatureCreateObjectV1ResponseMPayload addAPkiEzsignsignatureIDItem(Integer aPkiEzsignsignatureIDItem) {
    this.aPkiEzsignsignatureID.add(aPkiEzsignsignatureIDItem);
    return this;
  }

   /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   * @return aPkiEzsignsignatureID
  **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")

  public List<Integer> getaPkiEzsignsignatureID() {
    return aPkiEzsignsignatureID;
  }


  public void setaPkiEzsignsignatureID(List<Integer> aPkiEzsignsignatureID) {
    this.aPkiEzsignsignatureID = aPkiEzsignsignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureCreateObjectV1ResponseMPayload ezsignsignatureCreateObjectV1ResponseMPayload = (EzsignsignatureCreateObjectV1ResponseMPayload) o;
    return Objects.equals(this.aPkiEzsignsignatureID, ezsignsignatureCreateObjectV1ResponseMPayload.aPkiEzsignsignatureID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aPkiEzsignsignatureID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureCreateObjectV1ResponseMPayload {\n");
    sb.append("    aPkiEzsignsignatureID: ").append(toIndentedString(aPkiEzsignsignatureID)).append("\n");
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

