/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.35
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
 * Frequency at which reminders will be sent to signers that haven&#39;t signed the documents
 */
@JsonAdapter(FieldEEzsignfolderSendreminderfrequency.Adapter.class)
public enum FieldEEzsignfolderSendreminderfrequency {
  
  NONE("None"),
  
  DAILY("Daily"),
  
  WEEKLY("Weekly");

  private String value;

  FieldEEzsignfolderSendreminderfrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldEEzsignfolderSendreminderfrequency fromValue(String value) {
    for (FieldEEzsignfolderSendreminderfrequency b : FieldEEzsignfolderSendreminderfrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FieldEEzsignfolderSendreminderfrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldEEzsignfolderSendreminderfrequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldEEzsignfolderSendreminderfrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldEEzsignfolderSendreminderfrequency.fromValue(value);
    }
  }
}

