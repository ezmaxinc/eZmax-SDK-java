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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The user type of the User for SSPR
 */
@JsonAdapter(FieldEUserTypeSSPR.Adapter.class)
public enum FieldEUserTypeSSPR {
  
  EZSIGNUSER("EzsignUser"),
  
  NATIVE("Native");

  private String value;

  FieldEUserTypeSSPR(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEUserTypeSSPR fromValue(String value) {
    for (FieldEUserTypeSSPR b : FieldEUserTypeSSPR.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEUserTypeSSPR> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEUserTypeSSPR enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEUserTypeSSPR read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEUserTypeSSPR.fromValue(value);
    }
  }
}

