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
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.NotificationEndpointBaseLinks;
import com.influxdb.client.domain.NotificationEndpointType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * NotificationEndpointBase
 */

public class NotificationEndpointBase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private String userID;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The status of the endpoint.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.ACTIVE;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private NotificationEndpointBaseLinks links = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NotificationEndpointType type = null;

  public NotificationEndpointBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificationEndpointBase orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * Get orgID
   * @return orgID
  **/
  @ApiModelProperty(value = "")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public NotificationEndpointBase userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(value = "")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public NotificationEndpointBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the notification endpoint.
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the notification endpoint.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationEndpointBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationEndpointBase status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the endpoint.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the endpoint.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public NotificationEndpointBase labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public NotificationEndpointBase addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public NotificationEndpointBase links(NotificationEndpointBaseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public NotificationEndpointBaseLinks getLinks() {
    return links;
  }

  public void setLinks(NotificationEndpointBaseLinks links) {
    this.links = links;
  }

  public NotificationEndpointBase type(NotificationEndpointType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public NotificationEndpointType getType() {
    return type;
  }

  public void setType(NotificationEndpointType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEndpointBase notificationEndpointBase = (NotificationEndpointBase) o;
    return Objects.equals(this.id, notificationEndpointBase.id) &&
        Objects.equals(this.orgID, notificationEndpointBase.orgID) &&
        Objects.equals(this.userID, notificationEndpointBase.userID) &&
        Objects.equals(this.createdAt, notificationEndpointBase.createdAt) &&
        Objects.equals(this.updatedAt, notificationEndpointBase.updatedAt) &&
        Objects.equals(this.description, notificationEndpointBase.description) &&
        Objects.equals(this.name, notificationEndpointBase.name) &&
        Objects.equals(this.status, notificationEndpointBase.status) &&
        Objects.equals(this.labels, notificationEndpointBase.labels) &&
        Objects.equals(this.links, notificationEndpointBase.links) &&
        Objects.equals(this.type, notificationEndpointBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgID, userID, createdAt, updatedAt, description, name, status, labels, links, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEndpointBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

