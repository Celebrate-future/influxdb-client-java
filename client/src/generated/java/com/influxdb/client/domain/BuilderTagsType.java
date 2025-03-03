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
import com.influxdb.client.domain.BuilderAggregateFunctionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BuilderTagsType
 */

public class BuilderTagsType {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_AGGREGATE_FUNCTION_TYPE = "aggregateFunctionType";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_FUNCTION_TYPE)
  private BuilderAggregateFunctionType aggregateFunctionType = null;

  public BuilderTagsType key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BuilderTagsType values(List<String> values) {
    this.values = values;
    return this;
  }

  public BuilderTagsType addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public BuilderTagsType aggregateFunctionType(BuilderAggregateFunctionType aggregateFunctionType) {
    this.aggregateFunctionType = aggregateFunctionType;
    return this;
  }

   /**
   * Get aggregateFunctionType
   * @return aggregateFunctionType
  **/
  @ApiModelProperty(value = "")
  public BuilderAggregateFunctionType getAggregateFunctionType() {
    return aggregateFunctionType;
  }

  public void setAggregateFunctionType(BuilderAggregateFunctionType aggregateFunctionType) {
    this.aggregateFunctionType = aggregateFunctionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuilderTagsType builderTagsType = (BuilderTagsType) o;
    return Objects.equals(this.key, builderTagsType.key) &&
        Objects.equals(this.values, builderTagsType.values) &&
        Objects.equals(this.aggregateFunctionType, builderTagsType.aggregateFunctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, aggregateFunctionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuilderTagsType {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    aggregateFunctionType: ").append(toIndentedString(aggregateFunctionType)).append("\n");
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

