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
 * CreateDashboardRequest
 */

public class CreateDashboardRequest {
  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public CreateDashboardRequest orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * The ID of the organization that owns the dashboard.
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "The ID of the organization that owns the dashboard.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public CreateDashboardRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user-facing name of the dashboard.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The user-facing name of the dashboard.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateDashboardRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The user-facing description of the dashboard.
   * @return description
  **/
  @ApiModelProperty(value = "The user-facing description of the dashboard.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDashboardRequest createDashboardRequest = (CreateDashboardRequest) o;
    return Objects.equals(this.orgID, createDashboardRequest.orgID) &&
        Objects.equals(this.name, createDashboardRequest.name) &&
        Objects.equals(this.description, createDashboardRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgID, name, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDashboardRequest {\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

