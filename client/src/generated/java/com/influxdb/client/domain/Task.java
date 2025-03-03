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
import com.influxdb.client.domain.TaskLinks;
import com.influxdb.client.domain.TaskStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Task
 */

public class Task {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ORG_I_D = "orgID";
  @SerializedName(SERIALIZED_NAME_ORG_I_D)
  private String orgID;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private String org;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_I_D = "ownerID";
  @SerializedName(SERIALIZED_NAME_OWNER_I_D)
  private String ownerID;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatusType status = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTHORIZATION_I_D = "authorizationID";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_I_D)
  private String authorizationID;

  public static final String SERIALIZED_NAME_FLUX = "flux";
  @SerializedName(SERIALIZED_NAME_FLUX)
  private String flux;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every;

  public static final String SERIALIZED_NAME_CRON = "cron";
  @SerializedName(SERIALIZED_NAME_CRON)
  private String cron;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_LATEST_COMPLETED = "latestCompleted";
  @SerializedName(SERIALIZED_NAME_LATEST_COMPLETED)
  private OffsetDateTime latestCompleted;

  /**
   * Gets or Sets lastRunStatus
   */
  @JsonAdapter(LastRunStatusEnum.Adapter.class)
  public enum LastRunStatusEnum {
    FAILED("failed"),
    
    SUCCESS("success"),
    
    CANCELED("canceled");

    private String value;

    LastRunStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LastRunStatusEnum fromValue(String text) {
      for (LastRunStatusEnum b : LastRunStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LastRunStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LastRunStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LastRunStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LastRunStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_LAST_RUN_STATUS = "lastRunStatus";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_STATUS)
  private LastRunStatusEnum lastRunStatus;

  public static final String SERIALIZED_NAME_LAST_RUN_ERROR = "lastRunError";
  @SerializedName(SERIALIZED_NAME_LAST_RUN_ERROR)
  private String lastRunError;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private TaskLinks links = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public Task type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of task, this can be used for filtering tasks on list actions.
   * @return type
  **/
  @ApiModelProperty(value = "The type of task, this can be used for filtering tasks on list actions.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Task orgID(String orgID) {
    this.orgID = orgID;
    return this;
  }

   /**
   * The ID of the organization that owns this Task.
   * @return orgID
  **/
  @ApiModelProperty(required = true, value = "The ID of the organization that owns this Task.")
  public String getOrgID() {
    return orgID;
  }

  public void setOrgID(String orgID) {
    this.orgID = orgID;
  }

  public Task org(String org) {
    this.org = org;
    return this;
  }

   /**
   * The name of the organization that owns this Task.
   * @return org
  **/
  @ApiModelProperty(value = "The name of the organization that owns this Task.")
  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public Task name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the task.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task ownerID(String ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * The ID of the user who owns this Task.
   * @return ownerID
  **/
  @ApiModelProperty(value = "The ID of the user who owns this Task.")
  public String getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(String ownerID) {
    this.ownerID = ownerID;
  }

  public Task description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the task.
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the task.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Task status(TaskStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public TaskStatusType getStatus() {
    return status;
  }

  public void setStatus(TaskStatusType status) {
    this.status = status;
  }

  public Task labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public Task addLabelsItem(Label labelsItem) {
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

  public Task authorizationID(String authorizationID) {
    this.authorizationID = authorizationID;
    return this;
  }

   /**
   * The ID of the authorization used when this task communicates with the query engine.
   * @return authorizationID
  **/
  @ApiModelProperty(value = "The ID of the authorization used when this task communicates with the query engine.")
  public String getAuthorizationID() {
    return authorizationID;
  }

  public void setAuthorizationID(String authorizationID) {
    this.authorizationID = authorizationID;
  }

  public Task flux(String flux) {
    this.flux = flux;
    return this;
  }

   /**
   * The Flux script to run for this task.
   * @return flux
  **/
  @ApiModelProperty(required = true, value = "The Flux script to run for this task.")
  public String getFlux() {
    return flux;
  }

  public void setFlux(String flux) {
    this.flux = flux;
  }

  public Task every(String every) {
    this.every = every;
    return this;
  }

   /**
   * A simple task repetition schedule; parsed from Flux.
   * @return every
  **/
  @ApiModelProperty(value = "A simple task repetition schedule; parsed from Flux.")
  public String getEvery() {
    return every;
  }

  public void setEvery(String every) {
    this.every = every;
  }

  public Task cron(String cron) {
    this.cron = cron;
    return this;
  }

   /**
   * A task repetition schedule in the form &#39;* * * * * *&#39;; parsed from Flux.
   * @return cron
  **/
  @ApiModelProperty(value = "A task repetition schedule in the form '* * * * * *'; parsed from Flux.")
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  public Task offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Duration to delay after the schedule, before executing the task; parsed from flux, if set to zero it will remove this option and use 0 as the default.
   * @return offset
  **/
  @ApiModelProperty(value = "Duration to delay after the schedule, before executing the task; parsed from flux, if set to zero it will remove this option and use 0 as the default.")
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

   /**
   * Timestamp of latest scheduled, completed run, RFC3339.
   * @return latestCompleted
  **/
  @ApiModelProperty(value = "Timestamp of latest scheduled, completed run, RFC3339.")
  public OffsetDateTime getLatestCompleted() {
    return latestCompleted;
  }

   /**
   * Get lastRunStatus
   * @return lastRunStatus
  **/
  @ApiModelProperty(value = "")
  public LastRunStatusEnum getLastRunStatus() {
    return lastRunStatus;
  }

   /**
   * Get lastRunError
   * @return lastRunError
  **/
  @ApiModelProperty(value = "")
  public String getLastRunError() {
    return lastRunError;
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

  public Task links(TaskLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public TaskLinks getLinks() {
    return links;
  }

  public void setLinks(TaskLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.orgID, task.orgID) &&
        Objects.equals(this.org, task.org) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.ownerID, task.ownerID) &&
        Objects.equals(this.description, task.description) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.labels, task.labels) &&
        Objects.equals(this.authorizationID, task.authorizationID) &&
        Objects.equals(this.flux, task.flux) &&
        Objects.equals(this.every, task.every) &&
        Objects.equals(this.cron, task.cron) &&
        Objects.equals(this.offset, task.offset) &&
        Objects.equals(this.latestCompleted, task.latestCompleted) &&
        Objects.equals(this.lastRunStatus, task.lastRunStatus) &&
        Objects.equals(this.lastRunError, task.lastRunError) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt) &&
        Objects.equals(this.links, task.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, orgID, org, name, ownerID, description, status, labels, authorizationID, flux, every, cron, offset, latestCompleted, lastRunStatus, lastRunError, createdAt, updatedAt, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    authorizationID: ").append(toIndentedString(authorizationID)).append("\n");
    sb.append("    flux: ").append(toIndentedString(flux)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    latestCompleted: ").append(toIndentedString(latestCompleted)).append("\n");
    sb.append("    lastRunStatus: ").append(toIndentedString(lastRunStatus)).append("\n");
    sb.append("    lastRunError: ").append(toIndentedString(lastRunError)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

