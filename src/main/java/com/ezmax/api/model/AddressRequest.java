/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.31
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

/**
 * An Address Object
 */
@ApiModel(description = "An Address Object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-28T22:48:03.557Z[GMT]")
public class AddressRequest {
  public static final String SERIALIZED_NAME_FKI_ADDRESSTYPE_I_D = "fkiAddresstypeID";
  @SerializedName(SERIALIZED_NAME_FKI_ADDRESSTYPE_I_D)
  private Integer fkiAddresstypeID;

  public static final String SERIALIZED_NAME_S_ADDRESS_CIVIC = "sAddressCivic";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_CIVIC)
  private String sAddressCivic;

  public static final String SERIALIZED_NAME_S_ADDRESS_STREET = "sAddressStreet";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_STREET)
  private String sAddressStreet;

  public static final String SERIALIZED_NAME_S_ADDRESS_SUITE = "sAddressSuite";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_SUITE)
  private String sAddressSuite;

  public static final String SERIALIZED_NAME_S_ADDRESS_CITY = "sAddressCity";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_CITY)
  private String sAddressCity;

  public static final String SERIALIZED_NAME_FKI_PROVINCE_I_D = "fkiProvinceID";
  @SerializedName(SERIALIZED_NAME_FKI_PROVINCE_I_D)
  private Integer fkiProvinceID;

  public static final String SERIALIZED_NAME_FKI_COUNTRY_I_D = "fkiCountryID";
  @SerializedName(SERIALIZED_NAME_FKI_COUNTRY_I_D)
  private Integer fkiCountryID;

  public static final String SERIALIZED_NAME_S_ADDRESS_ZIP = "sAddressZip";
  @SerializedName(SERIALIZED_NAME_S_ADDRESS_ZIP)
  private String sAddressZip;


  public AddressRequest fkiAddresstypeID(Integer fkiAddresstypeID) {
    
    this.fkiAddresstypeID = fkiAddresstypeID;
    return this;
  }

   /**
   * The unique ID of the Addresstype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Real Estate Invoice| |4|Invoicing| |5|Shipping|
   * @return fkiAddresstypeID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Addresstype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| |3|Real Estate Invoice| |4|Invoicing| |5|Shipping|")

  public Integer getFkiAddresstypeID() {
    return fkiAddresstypeID;
  }


  public void setFkiAddresstypeID(Integer fkiAddresstypeID) {
    this.fkiAddresstypeID = fkiAddresstypeID;
  }


  public AddressRequest sAddressCivic(String sAddressCivic) {
    
    this.sAddressCivic = sAddressCivic;
    return this;
  }

   /**
   * The Civic number.
   * @return sAddressCivic
  **/
  @ApiModelProperty(example = "2540", required = true, value = "The Civic number.")

  public String getsAddressCivic() {
    return sAddressCivic;
  }


  public void setsAddressCivic(String sAddressCivic) {
    this.sAddressCivic = sAddressCivic;
  }


  public AddressRequest sAddressStreet(String sAddressStreet) {
    
    this.sAddressStreet = sAddressStreet;
    return this;
  }

   /**
   * The Street Name
   * @return sAddressStreet
  **/
  @ApiModelProperty(example = "Daniel-Johnson Blvd.", required = true, value = "The Street Name")

  public String getsAddressStreet() {
    return sAddressStreet;
  }


  public void setsAddressStreet(String sAddressStreet) {
    this.sAddressStreet = sAddressStreet;
  }


  public AddressRequest sAddressSuite(String sAddressSuite) {
    
    this.sAddressSuite = sAddressSuite;
    return this;
  }

   /**
   * The Suite or appartment number
   * @return sAddressSuite
  **/
  @ApiModelProperty(example = "610", required = true, value = "The Suite or appartment number")

  public String getsAddressSuite() {
    return sAddressSuite;
  }


  public void setsAddressSuite(String sAddressSuite) {
    this.sAddressSuite = sAddressSuite;
  }


  public AddressRequest sAddressCity(String sAddressCity) {
    
    this.sAddressCity = sAddressCity;
    return this;
  }

   /**
   * The City name
   * @return sAddressCity
  **/
  @ApiModelProperty(example = "Laval", required = true, value = "The City name")

  public String getsAddressCity() {
    return sAddressCity;
  }


  public void setsAddressCity(String sAddressCity) {
    this.sAddressCity = sAddressCity;
  }


  public AddressRequest fkiProvinceID(Integer fkiProvinceID) {
    
    this.fkiProvinceID = fkiProvinceID;
    return this;
  }

   /**
   * The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|
   * @return fkiProvinceID
  **/
  @ApiModelProperty(example = "11", required = true, value = "The unique ID of the Province.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|(Canada) Alberta |2|(Canada) British Columbia| |3|(Canada) Manitoba| |3|(Canada) Manitoba| |4|(Canada) New Brunswick| |5|(Canada) Newfoundland| |6|(Canada) Northwest Territories| |7|(Canada) Nova Scotia| |8|(Canada) Nunavut| |9|(Canada) Ontario| |10|(Canada) Prince Edward Island| |11|(Canada) Quebec| |12|(Canada) Saskatchewan| |13|(Canada) Yukon| |14|(United-States) Alabama| |15|(United-States) Alaska| |16|(United-States) Arizona| |17|(United-States) Arkansas| |18|(United-States) California| |19|(United-States) Colorado| |20|(United-States) Connecticut| |21|(United-States) Delaware| |22|(United-States) District of Columbia| |23|(United-States) Florida| |24|(United-States) Georgia| |25|(United-States) Hawaii| |26|(United-States) Idaho| |27|(United-States) Illinois| |28|(United-States) Indiana| |29|(United-States) Iowa| |30|(United-States) Kansas| |31|(United-States) Kentucky| |32|(United-States) Louisiane| |33|(United-States) Maine| |34|(United-States) Maryland| |35|(United-States) Massachusetts| |36|(United-States) Michigan| |37|(United-States) Minnesota| |38|(United-States) Mississippi| |39|(United-States) Missouri| |40|(United-States) Montana| |41|(United-States) Nebraska| |42|(United-States) Nevada| |43|(United-States) New Hampshire| |44|(United-States) New Jersey| |45|(United-States) New Mexico| |46|(United-States) New York| |47|(United-States) North Carolina| |48|(United-States) North Dakota| |49|(United-States) Ohio| |50|(United-States) Oklahoma| |51|(United-States) Oregon| |52|(United-States) Pennsylvania| |53|(United-States) Rhode Island| |54|(United-States) South Carolina| |55|(United-States) South Dakota| |56|(United-States) Tennessee| |57|(United-States) Texas| |58|(United-States) Utah| |60|(United-States) Vermont| |59|(United-States) Virginia| |61|(United-States) Washington| |62|(United-States) West Virginia| |63|(United-States) Wisconsin| |64|(United-States) Wyoming|")

  public Integer getFkiProvinceID() {
    return fkiProvinceID;
  }


  public void setFkiProvinceID(Integer fkiProvinceID) {
    this.fkiProvinceID = fkiProvinceID;
  }


  public AddressRequest fkiCountryID(Integer fkiCountryID) {
    
    this.fkiCountryID = fkiCountryID;
    return this;
  }

   /**
   * The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
   * @return fkiCountryID
  **/
  @ApiModelProperty(example = "1", required = true, value = "The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|")

  public Integer getFkiCountryID() {
    return fkiCountryID;
  }


  public void setFkiCountryID(Integer fkiCountryID) {
    this.fkiCountryID = fkiCountryID;
  }


  public AddressRequest sAddressZip(String sAddressZip) {
    
    this.sAddressZip = sAddressZip;
    return this;
  }

   /**
   * The Postal/Zip Code  The value must be entered without spaces
   * @return sAddressZip
  **/
  @ApiModelProperty(example = "H7T2S3", required = true, value = "The Postal/Zip Code  The value must be entered without spaces")

  public String getsAddressZip() {
    return sAddressZip;
  }


  public void setsAddressZip(String sAddressZip) {
    this.sAddressZip = sAddressZip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRequest addressRequest = (AddressRequest) o;
    return Objects.equals(this.fkiAddresstypeID, addressRequest.fkiAddresstypeID) &&
        Objects.equals(this.sAddressCivic, addressRequest.sAddressCivic) &&
        Objects.equals(this.sAddressStreet, addressRequest.sAddressStreet) &&
        Objects.equals(this.sAddressSuite, addressRequest.sAddressSuite) &&
        Objects.equals(this.sAddressCity, addressRequest.sAddressCity) &&
        Objects.equals(this.fkiProvinceID, addressRequest.fkiProvinceID) &&
        Objects.equals(this.fkiCountryID, addressRequest.fkiCountryID) &&
        Objects.equals(this.sAddressZip, addressRequest.sAddressZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fkiAddresstypeID, sAddressCivic, sAddressStreet, sAddressSuite, sAddressCity, fkiProvinceID, fkiCountryID, sAddressZip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRequest {\n");
    sb.append("    fkiAddresstypeID: ").append(toIndentedString(fkiAddresstypeID)).append("\n");
    sb.append("    sAddressCivic: ").append(toIndentedString(sAddressCivic)).append("\n");
    sb.append("    sAddressStreet: ").append(toIndentedString(sAddressStreet)).append("\n");
    sb.append("    sAddressSuite: ").append(toIndentedString(sAddressSuite)).append("\n");
    sb.append("    sAddressCity: ").append(toIndentedString(sAddressCity)).append("\n");
    sb.append("    fkiProvinceID: ").append(toIndentedString(fkiProvinceID)).append("\n");
    sb.append("    fkiCountryID: ").append(toIndentedString(fkiCountryID)).append("\n");
    sb.append("    sAddressZip: ").append(toIndentedString(sAddressZip)).append("\n");
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

