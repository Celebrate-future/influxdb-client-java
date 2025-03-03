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
 * Updates to a rule to expire or retain data.
 */
@ApiModel(description = "Updates to a rule to expire or retain data.")

public class PatchRetentionRule {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXPIRE("expire");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.EXPIRE;

  public static final String SERIALIZED_NAME_EVERY_SECONDS = "everySeconds";
  @SerializedName(SERIALIZED_NAME_EVERY_SECONDS)
  private Integer everySeconds;

  public static final String SERIALIZED_NAME_SHARD_GROUP_DURATION_SECONDS = "shardGroupDurationSeconds";
  @SerializedName(SERIALIZED_NAME_SHARD_GROUP_DURATION_SECONDS)
  private Long shardGroupDurationSeconds;

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public PatchRetentionRule everySeconds(Integer everySeconds) {
    this.everySeconds = everySeconds;
    return this;
  }

   /**
   * Duration in seconds for how long data will be kept in the database. 0 means infinite.
   * minimum: 0
   * @return everySeconds
  **/
  @ApiModelProperty(example = "86400", value = "Duration in seconds for how long data will be kept in the database. 0 means infinite.")
  public Integer getEverySeconds() {
    return everySeconds;
  }

  public void setEverySeconds(Integer everySeconds) {
    this.everySeconds = everySeconds;
  }

  public PatchRetentionRule shardGroupDurationSeconds(Long shardGroupDurationSeconds) {
    this.shardGroupDurationSeconds = shardGroupDurationSeconds;
    return this;
  }

   /**
   * Shard duration measured in seconds.
   * @return shardGroupDurationSeconds
  **/
  @ApiModelProperty(value = "Shard duration measured in seconds.")
  public Long getShardGroupDurationSeconds() {
    return shardGroupDurationSeconds;
  }

  public void setShardGroupDurationSeconds(Long shardGroupDurationSeconds) {
    this.shardGroupDurationSeconds = shardGroupDurationSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchRetentionRule patchRetentionRule = (PatchRetentionRule) o;
    return Objects.equals(this.type, patchRetentionRule.type) &&
        Objects.equals(this.everySeconds, patchRetentionRule.everySeconds) &&
        Objects.equals(this.shardGroupDurationSeconds, patchRetentionRule.shardGroupDurationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, everySeconds, shardGroupDurationSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchRetentionRule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    everySeconds: ").append(toIndentedString(everySeconds)).append("\n");
    sb.append("    shardGroupDurationSeconds: ").append(toIndentedString(shardGroupDurationSeconds)).append("\n");
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

