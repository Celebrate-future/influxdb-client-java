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
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.influxdb.client.domain.Expression;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Selects one of two expressions, &#x60;Alternate&#x60; or &#x60;Consequent&#x60;, depending on a third boolean expression, &#x60;Test&#x60;
 */
@ApiModel(description = "Selects one of two expressions, `Alternate` or `Consequent`, depending on a third boolean expression, `Test`")

public class ConditionalExpression extends Expression {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  @JsonAdapter(ConditionalExpressionTestAdapter.class)
  private Expression test = null;

  public static final String SERIALIZED_NAME_ALTERNATE = "alternate";
  @SerializedName(SERIALIZED_NAME_ALTERNATE)
  @JsonAdapter(ConditionalExpressionAlternateAdapter.class)
  private Expression alternate = null;

  public static final String SERIALIZED_NAME_CONSEQUENT = "consequent";
  @SerializedName(SERIALIZED_NAME_CONSEQUENT)
  @JsonAdapter(ConditionalExpressionConsequentAdapter.class)
  private Expression consequent = null;

  public ConditionalExpression type(String type) {
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

  public ConditionalExpression test(Expression test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public Expression getTest() {
    return test;
  }

  public void setTest(Expression test) {
    this.test = test;
  }

  public ConditionalExpression alternate(Expression alternate) {
    this.alternate = alternate;
    return this;
  }

   /**
   * Get alternate
   * @return alternate
  **/
  @ApiModelProperty(value = "")
  public Expression getAlternate() {
    return alternate;
  }

  public void setAlternate(Expression alternate) {
    this.alternate = alternate;
  }

  public ConditionalExpression consequent(Expression consequent) {
    this.consequent = consequent;
    return this;
  }

   /**
   * Get consequent
   * @return consequent
  **/
  @ApiModelProperty(value = "")
  public Expression getConsequent() {
    return consequent;
  }

  public void setConsequent(Expression consequent) {
    this.consequent = consequent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalExpression conditionalExpression = (ConditionalExpression) o;
    return Objects.equals(this.type, conditionalExpression.type) &&
        Objects.equals(this.test, conditionalExpression.test) &&
        Objects.equals(this.alternate, conditionalExpression.alternate) &&
        Objects.equals(this.consequent, conditionalExpression.consequent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, test, alternate, consequent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalExpression {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    alternate: ").append(toIndentedString(alternate)).append("\n");
    sb.append("    consequent: ").append(toIndentedString(consequent)).append("\n");
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

  public static class ConditionalExpressionAlternateAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public ConditionalExpressionAlternateAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "ArrayExpression" }, types)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if (Arrays.equals(new String[]{ "DictExpression" }, types)) {
        return context.deserialize(json, DictExpression.class);
      }
      if (Arrays.equals(new String[]{ "FunctionExpression" }, types)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if (Arrays.equals(new String[]{ "BinaryExpression" }, types)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "CallExpression" }, types)) {
        return context.deserialize(json, CallExpression.class);
      }
      if (Arrays.equals(new String[]{ "ConditionalExpression" }, types)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if (Arrays.equals(new String[]{ "LogicalExpression" }, types)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if (Arrays.equals(new String[]{ "MemberExpression" }, types)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if (Arrays.equals(new String[]{ "IndexExpression" }, types)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if (Arrays.equals(new String[]{ "ObjectExpression" }, types)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if (Arrays.equals(new String[]{ "ParenExpression" }, types)) {
        return context.deserialize(json, ParenExpression.class);
      }
      if (Arrays.equals(new String[]{ "PipeExpression" }, types)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if (Arrays.equals(new String[]{ "UnaryExpression" }, types)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "BooleanLiteral" }, types)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DateTimeLiteral" }, types)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DurationLiteral" }, types)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if (Arrays.equals(new String[]{ "FloatLiteral" }, types)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if (Arrays.equals(new String[]{ "IntegerLiteral" }, types)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "PipeLiteral" }, types)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "RegexpLiteral" }, types)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if (Arrays.equals(new String[]{ "StringLiteral" }, types)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if (Arrays.equals(new String[]{ "UnsignedIntegerLiteral" }, types)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "Identifier" }, types)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
  public static class ConditionalExpressionTestAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public ConditionalExpressionTestAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "ArrayExpression" }, types)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if (Arrays.equals(new String[]{ "DictExpression" }, types)) {
        return context.deserialize(json, DictExpression.class);
      }
      if (Arrays.equals(new String[]{ "FunctionExpression" }, types)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if (Arrays.equals(new String[]{ "BinaryExpression" }, types)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "CallExpression" }, types)) {
        return context.deserialize(json, CallExpression.class);
      }
      if (Arrays.equals(new String[]{ "ConditionalExpression" }, types)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if (Arrays.equals(new String[]{ "LogicalExpression" }, types)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if (Arrays.equals(new String[]{ "MemberExpression" }, types)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if (Arrays.equals(new String[]{ "IndexExpression" }, types)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if (Arrays.equals(new String[]{ "ObjectExpression" }, types)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if (Arrays.equals(new String[]{ "ParenExpression" }, types)) {
        return context.deserialize(json, ParenExpression.class);
      }
      if (Arrays.equals(new String[]{ "PipeExpression" }, types)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if (Arrays.equals(new String[]{ "UnaryExpression" }, types)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "BooleanLiteral" }, types)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DateTimeLiteral" }, types)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DurationLiteral" }, types)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if (Arrays.equals(new String[]{ "FloatLiteral" }, types)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if (Arrays.equals(new String[]{ "IntegerLiteral" }, types)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "PipeLiteral" }, types)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "RegexpLiteral" }, types)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if (Arrays.equals(new String[]{ "StringLiteral" }, types)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if (Arrays.equals(new String[]{ "UnsignedIntegerLiteral" }, types)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "Identifier" }, types)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
  public static class ConditionalExpressionConsequentAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {

    public ConditionalExpressionConsequentAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      List<String> discriminator = Arrays.asList("type");

      JsonObject jsonObject = json.getAsJsonObject();

      String[] types = discriminator.stream().map(jsonObject::get).filter(Objects::nonNull).map(JsonElement::getAsString).toArray(String[]::new);

      return deserialize(types, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String[] types, final JsonElement json, final JsonDeserializationContext context) {

      if (Arrays.equals(new String[]{ "ArrayExpression" }, types)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if (Arrays.equals(new String[]{ "DictExpression" }, types)) {
        return context.deserialize(json, DictExpression.class);
      }
      if (Arrays.equals(new String[]{ "FunctionExpression" }, types)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if (Arrays.equals(new String[]{ "BinaryExpression" }, types)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "CallExpression" }, types)) {
        return context.deserialize(json, CallExpression.class);
      }
      if (Arrays.equals(new String[]{ "ConditionalExpression" }, types)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if (Arrays.equals(new String[]{ "LogicalExpression" }, types)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if (Arrays.equals(new String[]{ "MemberExpression" }, types)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if (Arrays.equals(new String[]{ "IndexExpression" }, types)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if (Arrays.equals(new String[]{ "ObjectExpression" }, types)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if (Arrays.equals(new String[]{ "ParenExpression" }, types)) {
        return context.deserialize(json, ParenExpression.class);
      }
      if (Arrays.equals(new String[]{ "PipeExpression" }, types)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if (Arrays.equals(new String[]{ "UnaryExpression" }, types)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if (Arrays.equals(new String[]{ "BooleanLiteral" }, types)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DateTimeLiteral" }, types)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "DurationLiteral" }, types)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if (Arrays.equals(new String[]{ "FloatLiteral" }, types)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if (Arrays.equals(new String[]{ "IntegerLiteral" }, types)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "PipeLiteral" }, types)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if (Arrays.equals(new String[]{ "RegexpLiteral" }, types)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if (Arrays.equals(new String[]{ "StringLiteral" }, types)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if (Arrays.equals(new String[]{ "UnsignedIntegerLiteral" }, types)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if (Arrays.equals(new String[]{ "Identifier" }, types)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}

