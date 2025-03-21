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
import com.github.data_intuitive.lamin_api_client_java.model.OrderByColumn;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * GetValuesRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T10:25:37.689436234+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class GetValuesRequestBody {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  @javax.annotation.Nullable
  private Object filter;

  public static final String SERIALIZED_NAME_ORDER_BY = "order_by";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  @javax.annotation.Nullable
  private List<OrderByColumn> orderBy;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  @javax.annotation.Nullable
  private String search = "";

  public GetValuesRequestBody() {
  }

  public GetValuesRequestBody filter(@javax.annotation.Nullable Object filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   */
  @javax.annotation.Nullable
  public Object getFilter() {
    return filter;
  }

  public void setFilter(@javax.annotation.Nullable Object filter) {
    this.filter = filter;
  }


  public GetValuesRequestBody orderBy(@javax.annotation.Nullable List<OrderByColumn> orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public GetValuesRequestBody addOrderByItem(OrderByColumn orderByItem) {
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
   */
  @javax.annotation.Nullable
  public List<OrderByColumn> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(@javax.annotation.Nullable List<OrderByColumn> orderBy) {
    this.orderBy = orderBy;
  }


  public GetValuesRequestBody search(@javax.annotation.Nullable String search) {
    this.search = search;
    return this;
  }

  /**
   * Get search
   * @return search
   */
  @javax.annotation.Nullable
  public String getSearch() {
    return search;
  }

  public void setSearch(@javax.annotation.Nullable String search) {
    this.search = search;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetValuesRequestBody getValuesRequestBody = (GetValuesRequestBody) o;
    return Objects.equals(this.filter, getValuesRequestBody.filter) &&
        Objects.equals(this.orderBy, getValuesRequestBody.orderBy) &&
        Objects.equals(this.search, getValuesRequestBody.search);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, orderBy, search);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetValuesRequestBody {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("order_by");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetValuesRequestBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetValuesRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetValuesRequestBody is not found in the empty JSON string", GetValuesRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetValuesRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetValuesRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("order_by") != null && !jsonObj.get("order_by").isJsonNull()) {
        JsonArray jsonArrayorderBy = jsonObj.getAsJsonArray("order_by");
        if (jsonArrayorderBy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("order_by").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `order_by` to be an array in the JSON string but got `%s`", jsonObj.get("order_by").toString()));
          }

          // validate the optional field `order_by` (array)
          for (int i = 0; i < jsonArrayorderBy.size(); i++) {
            OrderByColumn.validateJsonElement(jsonArrayorderBy.get(i));
          };
        }
      }
      if ((jsonObj.get("search") != null && !jsonObj.get("search").isJsonNull()) && !jsonObj.get("search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetValuesRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetValuesRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetValuesRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetValuesRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<GetValuesRequestBody>() {
           @Override
           public void write(JsonWriter out, GetValuesRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetValuesRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetValuesRequestBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetValuesRequestBody
   * @throws IOException if the JSON string is invalid with respect to GetValuesRequestBody
   */
  public static GetValuesRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetValuesRequestBody.class);
  }

  /**
   * Convert an instance of GetValuesRequestBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

