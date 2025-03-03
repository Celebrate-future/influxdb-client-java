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
 * BuilderConfigAggregateWindow
 */

public class BuilderConfigAggregateWindow {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_FILL_VALUES = "fillValues";
  @SerializedName(SERIALIZED_NAME_FILL_VALUES)
  private Boolean fillValues;

  public BuilderConfigAggregateWindow period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public BuilderConfigAggregateWindow fillValues(Boolean fillValues) {
    this.fillValues = fillValues;
    return this;
  }

   /**
   * Get fillValues
   * @return fillValues
  **/
  @ApiModelProperty(value = "")
  public Boolean getFillValues() {
    return fillValues;
  }

  public void setFillValues(Boolean fillValues) {
    this.fillValues = fillValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuilderConfigAggregateWindow builderConfigAggregateWindow = (BuilderConfigAggregateWindow) o;
    return Objects.equals(this.period, builderConfigAggregateWindow.period) &&
        Objects.equals(this.fillValues, builderConfigAggregateWindow.fillValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, fillValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuilderConfigAggregateWindow {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    fillValues: ").append(toIndentedString(fillValues)).append("\n");
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

