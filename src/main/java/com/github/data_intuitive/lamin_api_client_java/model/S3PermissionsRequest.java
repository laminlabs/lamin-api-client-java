/*
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.data_intuitive.lamin_api_client_java.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.data_intuitive.lamin_api_client_java.JSON;

/**
 * S3PermissionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T10:25:37.689436234+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class S3PermissionsRequest {
  public static final String SERIALIZED_NAME_AWS_ACCESS_KEY_ID = "aws_access_key_id";
  @SerializedName(SERIALIZED_NAME_AWS_ACCESS_KEY_ID)
  @javax.annotation.Nonnull
  private String awsAccessKeyId;

  public static final String SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY = "aws_secret_access_key";
  @SerializedName(SERIALIZED_NAME_AWS_SECRET_ACCESS_KEY)
  @javax.annotation.Nonnull
  private String awsSecretAccessKey;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  @javax.annotation.Nonnull
  private String region;

  public S3PermissionsRequest() {
  }

  public S3PermissionsRequest awsAccessKeyId(@javax.annotation.Nonnull String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
    return this;
  }

  /**
   * Get awsAccessKeyId
   * @return awsAccessKeyId
   */
  @javax.annotation.Nonnull
  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public void setAwsAccessKeyId(@javax.annotation.Nonnull String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }


  public S3PermissionsRequest awsSecretAccessKey(@javax.annotation.Nonnull String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
    return this;
  }

  /**
   * Get awsSecretAccessKey
   * @return awsSecretAccessKey
   */
  @javax.annotation.Nonnull
  public String getAwsSecretAccessKey() {
    return awsSecretAccessKey;
  }

  public void setAwsSecretAccessKey(@javax.annotation.Nonnull String awsSecretAccessKey) {
    this.awsSecretAccessKey = awsSecretAccessKey;
  }


  public S3PermissionsRequest region(@javax.annotation.Nonnull String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @javax.annotation.Nonnull
  public String getRegion() {
    return region;
  }

  public void setRegion(@javax.annotation.Nonnull String region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3PermissionsRequest s3PermissionsRequest = (S3PermissionsRequest) o;
    return Objects.equals(this.awsAccessKeyId, s3PermissionsRequest.awsAccessKeyId) &&
        Objects.equals(this.awsSecretAccessKey, s3PermissionsRequest.awsSecretAccessKey) &&
        Objects.equals(this.region, s3PermissionsRequest.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccessKeyId, awsSecretAccessKey, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3PermissionsRequest {\n");
    sb.append("    awsAccessKeyId: ").append(toIndentedString(awsAccessKeyId)).append("\n");
    sb.append("    awsSecretAccessKey: ").append(toIndentedString(awsSecretAccessKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("aws_access_key_id");
    openapiFields.add("aws_secret_access_key");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aws_access_key_id");
    openapiRequiredFields.add("aws_secret_access_key");
    openapiRequiredFields.add("region");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to S3PermissionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!S3PermissionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in S3PermissionsRequest is not found in the empty JSON string", S3PermissionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!S3PermissionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `S3PermissionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : S3PermissionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("aws_access_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_access_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_access_key_id").toString()));
      }
      if (!jsonObj.get("aws_secret_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aws_secret_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aws_secret_access_key").toString()));
      }
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!S3PermissionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'S3PermissionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<S3PermissionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(S3PermissionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<S3PermissionsRequest>() {
           @Override
           public void write(JsonWriter out, S3PermissionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public S3PermissionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of S3PermissionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of S3PermissionsRequest
   * @throws IOException if the JSON string is invalid with respect to S3PermissionsRequest
   */
  public static S3PermissionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, S3PermissionsRequest.class);
  }

  /**
   * Convert an instance of S3PermissionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

