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
 * Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request
 */
@ApiModel(description = "Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-31T17:14:26.574336Z[Etc/UTC]")
public class EzsigndocumentApplyEzsigntemplateV1Request {
  public static final String SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D = "fkiEzsigntemplateID";
  @SerializedName(SERIALIZED_NAME_FKI_EZSIGNTEMPLATE_I_D)
  private Integer fkiEzsigntemplateID;

  public static final String SERIALIZED_NAME_A_S_EZSIGNTEMPLATESIGNER = "a_sEzsigntemplatesigner";
  @SerializedName(SERIALIZED_NAME_A_S_EZSIGNTEMPLATESIGNER)
  private List<String> aSEzsigntemplatesigner = new ArrayList<String>();

  public static final String SERIALIZED_NAME_A_PKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D = "a_pkiEzsignfoldersignerassociationID";
  @SerializedName(SERIALIZED_NAME_A_PKI_EZSIGNFOLDERSIGNERASSOCIATION_I_D)
  private List<Integer> aPkiEzsignfoldersignerassociationID = new ArrayList<Integer>();


  public EzsigndocumentApplyEzsigntemplateV1Request fkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
    return this;
  }

   /**
   * The unique ID of the Ezsigndocument
   * @return fkiEzsigntemplateID
  **/
  @ApiModelProperty(example = "36", required = true, value = "The unique ID of the Ezsigndocument")

  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }


  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }


  public EzsigndocumentApplyEzsigntemplateV1Request aSEzsigntemplatesigner(List<String> aSEzsigntemplatesigner) {
    
    this.aSEzsigntemplatesigner = aSEzsigntemplatesigner;
    return this;
  }

  public EzsigndocumentApplyEzsigntemplateV1Request addASEzsigntemplatesignerItem(String aSEzsigntemplatesignerItem) {
    this.aSEzsigntemplatesigner.add(aSEzsigntemplatesignerItem);
    return this;
  }

   /**
   * Get aSEzsigntemplatesigner
   * @return aSEzsigntemplatesigner
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getaSEzsigntemplatesigner() {
    return aSEzsigntemplatesigner;
  }


  public void setaSEzsigntemplatesigner(List<String> aSEzsigntemplatesigner) {
    this.aSEzsigntemplatesigner = aSEzsigntemplatesigner;
  }


  public EzsigndocumentApplyEzsigntemplateV1Request aPkiEzsignfoldersignerassociationID(List<Integer> aPkiEzsignfoldersignerassociationID) {
    
    this.aPkiEzsignfoldersignerassociationID = aPkiEzsignfoldersignerassociationID;
    return this;
  }

  public EzsigndocumentApplyEzsigntemplateV1Request addAPkiEzsignfoldersignerassociationIDItem(Integer aPkiEzsignfoldersignerassociationIDItem) {
    this.aPkiEzsignfoldersignerassociationID.add(aPkiEzsignfoldersignerassociationIDItem);
    return this;
  }

   /**
   * Get aPkiEzsignfoldersignerassociationID
   * @return aPkiEzsignfoldersignerassociationID
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getaPkiEzsignfoldersignerassociationID() {
    return aPkiEzsignfoldersignerassociationID;
  }


  public void setaPkiEzsignfoldersignerassociationID(List<Integer> aPkiEzsignfoldersignerassociationID) {
    this.aPkiEzsignfoldersignerassociationID = aPkiEzsignfoldersignerassociationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request = (EzsigndocumentApplyEzsigntemplateV1Request) o;
    return Objects.equals(this.fkiEzsigntemplateID, ezsigndocumentApplyEzsigntemplateV1Request.fkiEzsigntemplateID) &&
        Objects.equals(this.aSEzsigntemplatesigner, ezsigndocumentApplyEzsigntemplateV1Request.aSEzsigntemplatesigner) &&
        Objects.equals(this.aPkiEzsignfoldersignerassociationID, ezsigndocumentApplyEzsigntemplateV1Request.aPkiEzsignfoldersignerassociationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiEzsigntemplateID, aSEzsigntemplatesigner, aPkiEzsignfoldersignerassociationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentApplyEzsigntemplateV1Request {\n");
    sb.append("    fkiEzsigntemplateID: ").append(toIndentedString(fkiEzsigntemplateID)).append("\n");
    sb.append("    aSEzsigntemplatesigner: ").append(toIndentedString(aSEzsigntemplatesigner)).append("\n");
    sb.append("    aPkiEzsignfoldersignerassociationID: ").append(toIndentedString(aPkiEzsignfoldersignerassociationID)).append("\n");
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

