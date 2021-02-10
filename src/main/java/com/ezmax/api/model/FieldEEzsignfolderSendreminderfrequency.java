/*
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
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

