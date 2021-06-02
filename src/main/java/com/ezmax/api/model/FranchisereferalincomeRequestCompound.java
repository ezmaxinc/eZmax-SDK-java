/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.45
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.AddressRequest;
import com.ezmax.api.model.ContactRequestCompound;
import com.ezmax.api.model.FranchisereferalincomeRequest;
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
 * A Franchisereferalincome Object and children to create a complete structure
 */
@ApiModel(description = "A Franchisereferalincome Object and children to create a complete structure")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-02T20:48:09.039253Z[Etc/UTC]")
public class FranchisereferalincomeRequestCompound {
  public static final String SERIALIZED_NAME_OBJ_ADDRESS = "objAddress";
  @SerializedName(SERIALIZED_NAME_OBJ_ADDRESS)
  private AddressRequest objAddress;

  public static final String SERIALIZED_NAME_A_OBJ_CONTACT = "a_objContact";
  @SerializedName(SERIALIZED_NAME_A_OBJ_CONTACT)
  private List<ContactRequestCompound> aObjContact = new ArrayList<ContactRequestCompound>();

  public static final String SERIALIZED_NAME_FKI_FRANCHISEBROKER_I_D = "fkiFranchisebrokerID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEBROKER_I_D)
  private Integer fkiFranchisebrokerID;

  public static final String SERIALIZED_NAME_FKI_FRANCHISEREFERALINCOMEPROGRAM_I_D = "fkiFranchisereferalincomeprogramID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEREFERALINCOMEPROGRAM_I_D)
  private Integer fkiFranchisereferalincomeprogramID;

  public static final String SERIALIZED_NAME_FKI_PERIOD_I_D = "fkiPeriodID";
  @SerializedName(SERIALIZED_NAME_FKI_PERIOD_I_D)
  private Integer fkiPeriodID;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_LOAN = "dFranchisereferalincomeLoan";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_LOAN)
  private String dFranchisereferalincomeLoan;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISEAMOUNT = "dFranchisereferalincomeFranchiseamount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISEAMOUNT)
  private String dFranchisereferalincomeFranchiseamount;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISORAMOUNT = "dFranchisereferalincomeFranchisoramount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_FRANCHISORAMOUNT)
  private String dFranchisereferalincomeFranchisoramount;

  public static final String SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_AGENTAMOUNT = "dFranchisereferalincomeAgentamount";
  @SerializedName(SERIALIZED_NAME_D_FRANCHISEREFERALINCOME_AGENTAMOUNT)
  private String dFranchisereferalincomeAgentamount;

  public static final String SERIALIZED_NAME_DT_FRANCHISEREFERALINCOME_DISBURSED = "dtFranchisereferalincomeDisbursed";
  @SerializedName(SERIALIZED_NAME_DT_FRANCHISEREFERALINCOME_DISBURSED)
  private String dtFranchisereferalincomeDisbursed;

  public static final String SERIALIZED_NAME_T_FRANCHISEREFERALINCOME_COMMENT = "tFranchisereferalincomeComment";
  @SerializedName(SERIALIZED_NAME_T_FRANCHISEREFERALINCOME_COMMENT)
  private String tFranchisereferalincomeComment;

  public static final String SERIALIZED_NAME_FKI_FRANCHISEOFFICE_I_D = "fkiFranchiseofficeID";
  @SerializedName(SERIALIZED_NAME_FKI_FRANCHISEOFFICE_I_D)
  private Integer fkiFranchiseofficeID;

  public static final String SERIALIZED_NAME_S_FRANCHISEREFERALINCOME_REMOTEID = "sFranchisereferalincomeRemoteid";
  @SerializedName(SERIALIZED_NAME_S_FRANCHISEREFERALINCOME_REMOTEID)
  private String sFranchisereferalincomeRemoteid;


  public FranchisereferalincomeRequestCompound objAddress(AddressRequest objAddress) {
    
    this.objAddress = objAddress;
    return this;
  }

   /**
   * Get objAddress
   * @return objAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressRequest getObjAddress() {
    return objAddress;
  }


  public void setObjAddress(AddressRequest objAddress) {
    this.objAddress = objAddress;
  }


  public FranchisereferalincomeRequestCompound aObjContact(List<ContactRequestCompound> aObjContact) {
    
    this.aObjContact = aObjContact;
    return this;
  }

  public FranchisereferalincomeRequestCompound addAObjContactItem(ContactRequestCompound aObjContactItem) {
    this.aObjContact.add(aObjContactItem);
    return this;
  }

   /**
   * Get aObjContact
   * @return aObjContact
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ContactRequestCompound> getaObjContact() {
    return aObjContact;
  }


  public void setaObjContact(List<ContactRequestCompound> aObjContact) {
    this.aObjContact = aObjContact;
  }


  public FranchisereferalincomeRequestCompound fkiFranchisebrokerID(Integer fkiFranchisebrokerID) {
    
    this.fkiFranchisebrokerID = fkiFranchisebrokerID;
    return this;
  }

   /**
   * The unique ID of the Franchisebroker
   * @return fkiFranchisebrokerID
  **/
  @ApiModelProperty(example = "61", required = true, value = "The unique ID of the Franchisebroker")

  public Integer getFkiFranchisebrokerID() {
    return fkiFranchisebrokerID;
  }


  public void setFkiFranchisebrokerID(Integer fkiFranchisebrokerID) {
    this.fkiFranchisebrokerID = fkiFranchisebrokerID;
  }


  public FranchisereferalincomeRequestCompound fkiFranchisereferalincomeprogramID(Integer fkiFranchisereferalincomeprogramID) {
    
    this.fkiFranchisereferalincomeprogramID = fkiFranchisereferalincomeprogramID;
    return this;
  }

   /**
   * The unique ID of the Franchisereferalincomeprogram
   * @return fkiFranchisereferalincomeprogramID
  **/
  @ApiModelProperty(example = "51", required = true, value = "The unique ID of the Franchisereferalincomeprogram")

  public Integer getFkiFranchisereferalincomeprogramID() {
    return fkiFranchisereferalincomeprogramID;
  }


  public void setFkiFranchisereferalincomeprogramID(Integer fkiFranchisereferalincomeprogramID) {
    this.fkiFranchisereferalincomeprogramID = fkiFranchisereferalincomeprogramID;
  }


  public FranchisereferalincomeRequestCompound fkiPeriodID(Integer fkiPeriodID) {
    
    this.fkiPeriodID = fkiPeriodID;
    return this;
  }

   /**
   * The unique ID of the Period
   * @return fkiPeriodID
  **/
  @ApiModelProperty(example = "21", required = true, value = "The unique ID of the Period")

  public Integer getFkiPeriodID() {
    return fkiPeriodID;
  }


  public void setFkiPeriodID(Integer fkiPeriodID) {
    this.fkiPeriodID = fkiPeriodID;
  }


  public FranchisereferalincomeRequestCompound dFranchisereferalincomeLoan(String dFranchisereferalincomeLoan) {
    
    this.dFranchisereferalincomeLoan = dFranchisereferalincomeLoan;
    return this;
  }

   /**
   * The loan amount
   * @return dFranchisereferalincomeLoan
  **/
  @ApiModelProperty(example = "500275.62", required = true, value = "The loan amount")

  public String getdFranchisereferalincomeLoan() {
    return dFranchisereferalincomeLoan;
  }


  public void setdFranchisereferalincomeLoan(String dFranchisereferalincomeLoan) {
    this.dFranchisereferalincomeLoan = dFranchisereferalincomeLoan;
  }


  public FranchisereferalincomeRequestCompound dFranchisereferalincomeFranchiseamount(String dFranchisereferalincomeFranchiseamount) {
    
    this.dFranchisereferalincomeFranchiseamount = dFranchisereferalincomeFranchiseamount;
    return this;
  }

   /**
   * The amount that will be given to the franchise
   * @return dFranchisereferalincomeFranchiseamount
  **/
  @ApiModelProperty(example = "275.00", required = true, value = "The amount that will be given to the franchise")

  public String getdFranchisereferalincomeFranchiseamount() {
    return dFranchisereferalincomeFranchiseamount;
  }


  public void setdFranchisereferalincomeFranchiseamount(String dFranchisereferalincomeFranchiseamount) {
    this.dFranchisereferalincomeFranchiseamount = dFranchisereferalincomeFranchiseamount;
  }


  public FranchisereferalincomeRequestCompound dFranchisereferalincomeFranchisoramount(String dFranchisereferalincomeFranchisoramount) {
    
    this.dFranchisereferalincomeFranchisoramount = dFranchisereferalincomeFranchisoramount;
    return this;
  }

   /**
   * The amount that will be kept by the franchisor
   * @return dFranchisereferalincomeFranchisoramount
  **/
  @ApiModelProperty(example = "385.00", required = true, value = "The amount that will be kept by the franchisor")

  public String getdFranchisereferalincomeFranchisoramount() {
    return dFranchisereferalincomeFranchisoramount;
  }


  public void setdFranchisereferalincomeFranchisoramount(String dFranchisereferalincomeFranchisoramount) {
    this.dFranchisereferalincomeFranchisoramount = dFranchisereferalincomeFranchisoramount;
  }


  public FranchisereferalincomeRequestCompound dFranchisereferalincomeAgentamount(String dFranchisereferalincomeAgentamount) {
    
    this.dFranchisereferalincomeAgentamount = dFranchisereferalincomeAgentamount;
    return this;
  }

   /**
   * The amount that will be given to the agent
   * @return dFranchisereferalincomeAgentamount
  **/
  @ApiModelProperty(example = "800.00", required = true, value = "The amount that will be given to the agent")

  public String getdFranchisereferalincomeAgentamount() {
    return dFranchisereferalincomeAgentamount;
  }


  public void setdFranchisereferalincomeAgentamount(String dFranchisereferalincomeAgentamount) {
    this.dFranchisereferalincomeAgentamount = dFranchisereferalincomeAgentamount;
  }


  public FranchisereferalincomeRequestCompound dtFranchisereferalincomeDisbursed(String dtFranchisereferalincomeDisbursed) {
    
    this.dtFranchisereferalincomeDisbursed = dtFranchisereferalincomeDisbursed;
    return this;
  }

   /**
   * The date the amounts were disbursed
   * @return dtFranchisereferalincomeDisbursed
  **/
  @ApiModelProperty(example = "2020-12-31", required = true, value = "The date the amounts were disbursed")

  public String getDtFranchisereferalincomeDisbursed() {
    return dtFranchisereferalincomeDisbursed;
  }


  public void setDtFranchisereferalincomeDisbursed(String dtFranchisereferalincomeDisbursed) {
    this.dtFranchisereferalincomeDisbursed = dtFranchisereferalincomeDisbursed;
  }


  public FranchisereferalincomeRequestCompound tFranchisereferalincomeComment(String tFranchisereferalincomeComment) {
    
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
    return this;
  }

   /**
   * A comment about the transaction
   * @return tFranchisereferalincomeComment
  **/
  @ApiModelProperty(example = "This is a comment", required = true, value = "A comment about the transaction")

  public String gettFranchisereferalincomeComment() {
    return tFranchisereferalincomeComment;
  }


  public void settFranchisereferalincomeComment(String tFranchisereferalincomeComment) {
    this.tFranchisereferalincomeComment = tFranchisereferalincomeComment;
  }


  public FranchisereferalincomeRequestCompound fkiFranchiseofficeID(Integer fkiFranchiseofficeID) {
    
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
    return this;
  }

   /**
   * The unique ID of the Franchisereoffice
   * @return fkiFranchiseofficeID
  **/
  @ApiModelProperty(example = "50", required = true, value = "The unique ID of the Franchisereoffice")

  public Integer getFkiFranchiseofficeID() {
    return fkiFranchiseofficeID;
  }


  public void setFkiFranchiseofficeID(Integer fkiFranchiseofficeID) {
    this.fkiFranchiseofficeID = fkiFranchiseofficeID;
  }


  public FranchisereferalincomeRequestCompound sFranchisereferalincomeRemoteid(String sFranchisereferalincomeRemoteid) {
    
    this.sFranchisereferalincomeRemoteid = sFranchisereferalincomeRemoteid;
    return this;
  }

   /**
   * Get sFranchisereferalincomeRemoteid
   * @return sFranchisereferalincomeRemoteid
  **/
  @ApiModelProperty(required = true, value = "")

  public String getsFranchisereferalincomeRemoteid() {
    return sFranchisereferalincomeRemoteid;
  }


  public void setsFranchisereferalincomeRemoteid(String sFranchisereferalincomeRemoteid) {
    this.sFranchisereferalincomeRemoteid = sFranchisereferalincomeRemoteid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeRequestCompound franchisereferalincomeRequestCompound = (FranchisereferalincomeRequestCompound) o;
    return Objects.equals(this.objAddress, franchisereferalincomeRequestCompound.objAddress) &&
        Objects.equals(this.aObjContact, franchisereferalincomeRequestCompound.aObjContact) &&
        Objects.equals(this.fkiFranchisebrokerID, franchisereferalincomeRequestCompound.fkiFranchisebrokerID) &&
        Objects.equals(this.fkiFranchisereferalincomeprogramID, franchisereferalincomeRequestCompound.fkiFranchisereferalincomeprogramID) &&
        Objects.equals(this.fkiPeriodID, franchisereferalincomeRequestCompound.fkiPeriodID) &&
        Objects.equals(this.dFranchisereferalincomeLoan, franchisereferalincomeRequestCompound.dFranchisereferalincomeLoan) &&
        Objects.equals(this.dFranchisereferalincomeFranchiseamount, franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchiseamount) &&
        Objects.equals(this.dFranchisereferalincomeFranchisoramount, franchisereferalincomeRequestCompound.dFranchisereferalincomeFranchisoramount) &&
        Objects.equals(this.dFranchisereferalincomeAgentamount, franchisereferalincomeRequestCompound.dFranchisereferalincomeAgentamount) &&
        Objects.equals(this.dtFranchisereferalincomeDisbursed, franchisereferalincomeRequestCompound.dtFranchisereferalincomeDisbursed) &&
        Objects.equals(this.tFranchisereferalincomeComment, franchisereferalincomeRequestCompound.tFranchisereferalincomeComment) &&
        Objects.equals(this.fkiFranchiseofficeID, franchisereferalincomeRequestCompound.fkiFranchiseofficeID) &&
        Objects.equals(this.sFranchisereferalincomeRemoteid, franchisereferalincomeRequestCompound.sFranchisereferalincomeRemoteid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objAddress, aObjContact, fkiFranchisebrokerID, fkiFranchisereferalincomeprogramID, fkiPeriodID, dFranchisereferalincomeLoan, dFranchisereferalincomeFranchiseamount, dFranchisereferalincomeFranchisoramount, dFranchisereferalincomeAgentamount, dtFranchisereferalincomeDisbursed, tFranchisereferalincomeComment, fkiFranchiseofficeID, sFranchisereferalincomeRemoteid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeRequestCompound {\n");
    sb.append("    objAddress: ").append(toIndentedString(objAddress)).append("\n");
    sb.append("    aObjContact: ").append(toIndentedString(aObjContact)).append("\n");
    sb.append("    fkiFranchisebrokerID: ").append(toIndentedString(fkiFranchisebrokerID)).append("\n");
    sb.append("    fkiFranchisereferalincomeprogramID: ").append(toIndentedString(fkiFranchisereferalincomeprogramID)).append("\n");
    sb.append("    fkiPeriodID: ").append(toIndentedString(fkiPeriodID)).append("\n");
    sb.append("    dFranchisereferalincomeLoan: ").append(toIndentedString(dFranchisereferalincomeLoan)).append("\n");
    sb.append("    dFranchisereferalincomeFranchiseamount: ").append(toIndentedString(dFranchisereferalincomeFranchiseamount)).append("\n");
    sb.append("    dFranchisereferalincomeFranchisoramount: ").append(toIndentedString(dFranchisereferalincomeFranchisoramount)).append("\n");
    sb.append("    dFranchisereferalincomeAgentamount: ").append(toIndentedString(dFranchisereferalincomeAgentamount)).append("\n");
    sb.append("    dtFranchisereferalincomeDisbursed: ").append(toIndentedString(dtFranchisereferalincomeDisbursed)).append("\n");
    sb.append("    tFranchisereferalincomeComment: ").append(toIndentedString(tFranchisereferalincomeComment)).append("\n");
    sb.append("    fkiFranchiseofficeID: ").append(toIndentedString(fkiFranchiseofficeID)).append("\n");
    sb.append("    sFranchisereferalincomeRemoteid: ").append(toIndentedString(sFranchisereferalincomeRemoteid)).append("\n");
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

