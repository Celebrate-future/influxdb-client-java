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
import com.influxdb.client.domain.ShardManifest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ShardGroupManifest
 */

public class ShardGroupManifest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private OffsetDateTime deletedAt;

  public static final String SERIALIZED_NAME_TRUNCATED_AT = "truncatedAt";
  @SerializedName(SERIALIZED_NAME_TRUNCATED_AT)
  private OffsetDateTime truncatedAt;

  public static final String SERIALIZED_NAME_SHARDS = "shards";
  @SerializedName(SERIALIZED_NAME_SHARDS)
  private List<ShardManifest> shards = new ArrayList<>();

  public ShardGroupManifest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShardGroupManifest startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ShardGroupManifest endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public ShardGroupManifest deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }

  public ShardGroupManifest truncatedAt(OffsetDateTime truncatedAt) {
    this.truncatedAt = truncatedAt;
    return this;
  }

   /**
   * Get truncatedAt
   * @return truncatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTruncatedAt() {
    return truncatedAt;
  }

  public void setTruncatedAt(OffsetDateTime truncatedAt) {
    this.truncatedAt = truncatedAt;
  }

  public ShardGroupManifest shards(List<ShardManifest> shards) {
    this.shards = shards;
    return this;
  }

  public ShardGroupManifest addShardsItem(ShardManifest shardsItem) {
    this.shards.add(shardsItem);
    return this;
  }

   /**
   * Get shards
   * @return shards
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ShardManifest> getShards() {
    return shards;
  }

  public void setShards(List<ShardManifest> shards) {
    this.shards = shards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardGroupManifest shardGroupManifest = (ShardGroupManifest) o;
    return Objects.equals(this.id, shardGroupManifest.id) &&
        Objects.equals(this.startTime, shardGroupManifest.startTime) &&
        Objects.equals(this.endTime, shardGroupManifest.endTime) &&
        Objects.equals(this.deletedAt, shardGroupManifest.deletedAt) &&
        Objects.equals(this.truncatedAt, shardGroupManifest.truncatedAt) &&
        Objects.equals(this.shards, shardGroupManifest.shards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, deletedAt, truncatedAt, shards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardGroupManifest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    truncatedAt: ").append(toIndentedString(truncatedAt)).append("\n");
    sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
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

