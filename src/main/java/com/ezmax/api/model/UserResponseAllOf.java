/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ezmax.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.ezmax.api.model.CommonAudit;
import com.ezmax.api.model.FieldEUserType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-03T17:59:24.614472Z[Etc/UTC]")
public class UserResponseAllOf {
  public static final String SERIALIZED_NAME_PKI_USER_I_D = "pkiUserID";
  @SerializedName(SERIALIZED_NAME_PKI_USER_I_D)
  private Integer pkiUserID;

  public static final String SERIALIZED_NAME_FKI_LANGUAGE_I_D = "fkiLanguageID";
  @SerializedName(SERIALIZED_NAME_FKI_LANGUAGE_I_D)
  private Integer fkiLanguageID;

  public static final String SERIALIZED_NAME_E_USER_TYPE = "eUserType";
  @SerializedName(SERIALIZED_NAME_E_USER_TYPE)
  private FieldEUserType eUserType;

  public static final String SERIALIZED_NAME_S_USER_FIRSTNAME = "sUserFirstname";
  @SerializedName(SERIALIZED_NAME_S_USER_FIRSTNAME)
  private String sUserFirstname;

  public static final String SERIALIZED_NAME_S_USER_LASTNAME = "sUserLastname";
  @SerializedName(SERIALIZED_NAME_S_USER_LASTNAME)
  private String sUserLastname;

  public static final String SERIALIZED_NAME_S_USER_LOGINNAME = "sUserLoginname";
  @SerializedName(SERIALIZED_NAME_S_USER_LOGINNAME)
  private String sUserLoginname;

  public static final String SERIALIZED_NAME_OBJ_AUDIT = "objAudit";
  @SerializedName(SERIALIZED_NAME_OBJ_AUDIT)
  private CommonAudit objAudit;


  public UserResponseAllOf pkiUserID(Integer pkiUserID) {
    
    this.pkiUserID = pkiUserID;
    return this;
  }

   /**
   * The unique ID of the User
   * @return pkiUserID
  **/
  @ApiModelProperty(example = "70", required = true, value = "The unique ID of the User")

  public Integer getPkiUserID() {
    return pkiUserID;
  }


  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }


  public UserResponseAllOf fkiLanguageID(Integer fkiLanguageID) {
    
    this.fkiLanguageID = fkiLanguageID;
    return this;
  }

   /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   * @return fkiLanguageID
  **/
  @ApiModelProperty(example = "2", required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")

  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }


  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }


  public UserResponseAllOf eUserType(FieldEUserType eUserType) {
    
    this.eUserType = eUserType;
    return this;
  }

   /**
   * Get eUserType
   * @return eUserType
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldEUserType geteUserType() {
    return eUserType;
  }


  public void seteUserType(FieldEUserType eUserType) {
    this.eUserType = eUserType;
  }


  public UserResponseAllOf sUserFirstname(String sUserFirstname) {
    
    this.sUserFirstname = sUserFirstname;
    return this;
  }

   /**
   * The First name of the user
   * @return sUserFirstname
  **/
  @ApiModelProperty(example = "John", required = true, value = "The First name of the user")

  public String getsUserFirstname() {
    return sUserFirstname;
  }


  public void setsUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }


  public UserResponseAllOf sUserLastname(String sUserLastname) {
    
    this.sUserLastname = sUserLastname;
    return this;
  }

   /**
   * The Last name of the user
   * @return sUserLastname
  **/
  @ApiModelProperty(example = "Doe", required = true, value = "The Last name of the user")

  public String getsUserLastname() {
    return sUserLastname;
  }


  public void setsUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }


  public UserResponseAllOf sUserLoginname(String sUserLoginname) {
    
    this.sUserLoginname = sUserLoginname;
    return this;
  }

   /**
   * The Login name of the User.
   * @return sUserLoginname
  **/
  @ApiModelProperty(example = "JohnDoe", required = true, value = "The Login name of the User.")

  public String getsUserLoginname() {
    return sUserLoginname;
  }


  public void setsUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }


  public UserResponseAllOf objAudit(CommonAudit objAudit) {
    
    this.objAudit = objAudit;
    return this;
  }

   /**
   * Get objAudit
   * @return objAudit
  **/
  @ApiModelProperty(required = true, value = "")

  public CommonAudit getObjAudit() {
    return objAudit;
  }


  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResponseAllOf userResponseAllOf = (UserResponseAllOf) o;
    return Objects.equals(this.pkiUserID, userResponseAllOf.pkiUserID) &&
        Objects.equals(this.fkiLanguageID, userResponseAllOf.fkiLanguageID) &&
        Objects.equals(this.eUserType, userResponseAllOf.eUserType) &&
        Objects.equals(this.sUserFirstname, userResponseAllOf.sUserFirstname) &&
        Objects.equals(this.sUserLastname, userResponseAllOf.sUserLastname) &&
        Objects.equals(this.sUserLoginname, userResponseAllOf.sUserLoginname) &&
        Objects.equals(this.objAudit, userResponseAllOf.objAudit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiUserID, fkiLanguageID, eUserType, sUserFirstname, sUserLastname, sUserLoginname, objAudit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseAllOf {\n");
    sb.append("    pkiUserID: ").append(toIndentedString(pkiUserID)).append("\n");
    sb.append("    fkiLanguageID: ").append(toIndentedString(fkiLanguageID)).append("\n");
    sb.append("    eUserType: ").append(toIndentedString(eUserType)).append("\n");
    sb.append("    sUserFirstname: ").append(toIndentedString(sUserFirstname)).append("\n");
    sb.append("    sUserLastname: ").append(toIndentedString(sUserLastname)).append("\n");
    sb.append("    sUserLoginname: ").append(toIndentedString(sUserLoginname)).append("\n");
    sb.append("    objAudit: ").append(toIndentedString(objAudit)).append("\n");
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

