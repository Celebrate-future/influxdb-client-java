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
 * A pair consisting of length of time and the unit of time measured. It is the atomic unit from which all duration literals are composed.
 */
@ApiModel(description = "A pair consisting of length of time and the unit of time measured. It is the atomic unit from which all duration literals are composed.")

public class Duration {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MAGNITUDE = "magnitude";
  @SerializedName(SERIALIZED_NAME_MAGNITUDE)
  private Integer magnitude;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public Duration type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of AST node
   * @return type
  **/
  @ApiModelProperty(value = "Type of AST node")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Duration magnitude(Integer magnitude) {
    this.magnitude = magnitude;
    return this;
  }

   /**
   * Get magnitude
   * @return magnitude
  **/
  @ApiModelProperty(value = "")
  public Integer getMagnitude() {
    return magnitude;
  }

  public void setMagnitude(Integer magnitude) {
    this.magnitude = magnitude;
  }

  public Duration unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;
    return Objects.equals(this.type, duration.type) &&
        Objects.equals(this.magnitude, duration.magnitude) &&
        Objects.equals(this.unit, duration.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, magnitude, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    magnitude: ").append(toIndentedString(magnitude)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

