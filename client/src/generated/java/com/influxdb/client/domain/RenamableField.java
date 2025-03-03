/*
 * Influx OSS API Service
 * The InfluxDB v2 API provides a programmatic interface for all interactions with InfluxDB. Access the InfluxDB API using the `/api/v2/` endpoint. 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

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
 * Describes a field that can be renamed and made visible or invisible.
 */
@ApiModel(description = "Describes a field that can be renamed and made visible or invisible.")

public class RenamableField {
  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internalName";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

   /**
   * The calculated name of a field.
   * @return internalName
  **/
  @ApiModelProperty(value = "The calculated name of a field.")
  public String getInternalName() {
    return internalName;
  }

  public RenamableField displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The name that a field is renamed to by the user.
   * @return displayName
  **/
  @ApiModelProperty(value = "The name that a field is renamed to by the user.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public RenamableField visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Indicates whether this field should be visible on the table.
   * @return visible
  **/
  @ApiModelProperty(value = "Indicates whether this field should be visible on the table.")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenamableField renamableField = (RenamableField) o;
    return Objects.equals(this.internalName, renamableField.internalName) &&
        Objects.equals(this.displayName, renamableField.displayName) &&
        Objects.equals(this.visible, renamableField.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, displayName, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenamableField {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

