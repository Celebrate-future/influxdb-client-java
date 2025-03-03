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
import com.influxdb.client.domain.ShardOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ShardManifest
 */

public class ShardManifest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SHARD_OWNERS = "shardOwners";
  @SerializedName(SERIALIZED_NAME_SHARD_OWNERS)
  private List<ShardOwner> shardOwners = new ArrayList<>();

  public ShardManifest id(Long id) {
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

  public ShardManifest shardOwners(List<ShardOwner> shardOwners) {
    this.shardOwners = shardOwners;
    return this;
  }

  public ShardManifest addShardOwnersItem(ShardOwner shardOwnersItem) {
    this.shardOwners.add(shardOwnersItem);
    return this;
  }

   /**
   * Get shardOwners
   * @return shardOwners
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ShardOwner> getShardOwners() {
    return shardOwners;
  }

  public void setShardOwners(List<ShardOwner> shardOwners) {
    this.shardOwners = shardOwners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardManifest shardManifest = (ShardManifest) o;
    return Objects.equals(this.id, shardManifest.id) &&
        Objects.equals(this.shardOwners, shardManifest.shardOwners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, shardOwners);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardManifest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shardOwners: ").append(toIndentedString(shardOwners)).append("\n");
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

