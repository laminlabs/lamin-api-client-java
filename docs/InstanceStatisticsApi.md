# InstanceStatisticsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstanceStatisticsInstancesInstanceIdStatisticsGet**](InstanceStatisticsApi.md#getInstanceStatisticsInstancesInstanceIdStatisticsGet) | **GET** /instances/{instance_id}/statistics | Get Approximate Table Row Counts and Artifact Size |
| [**getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**](InstanceStatisticsApi.md#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet) | **GET** /instances/{instance_id}/non_empty_tables | List Non-Empty Data Tables by Module |
| [**getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**](InstanceStatisticsApi.md#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet) | **GET** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/counts | Get Relation Counts |
| [**groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**](InstanceStatisticsApi.md#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/group-by | Group By |


<a id="getInstanceStatisticsInstancesInstanceIdStatisticsGet"></a>
# **getInstanceStatisticsInstancesInstanceIdStatisticsGet**
> StatisticsResponse getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, spaceId)

Get Approximate Table Row Counts and Artifact Size

Return table row counts and artifact size for an instance.  **Permissions:** Requires read access to the instance.  **Notes:** Row counts are exact for small tables and approximate for larger tables.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    List<String> q = Arrays.asList(); // List<String> | A list of models in 'module.Model' format (case-sensitive). If omitted, statistics for all primary tables are returned.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      StatisticsResponse result = apiInstance.getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceStatisticsApi#getInstanceStatisticsInstancesInstanceIdStatisticsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**| Instance UUID. | |
| **q** | [**List&lt;String&gt;**](String.md)| A list of models in &#39;module.Model&#39; format (case-sensitive). If omitted, statistics for all primary tables are returned. | [optional] |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**StatisticsResponse**](StatisticsResponse.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Invalid model name format provided. |  -  |
| **403** | Read access denied to the instance. |  -  |
| **404** | Instance or requested model not found. |  -  |
| **422** | Validation Error |  -  |

<a id="getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet"></a>
# **getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**
> NonEmptyTablesResponse getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, spaceId)

List Non-Empty Data Tables by Module

List non-empty data tables grouped by module.  **Permissions:** Requires read access to the instance.  **Notes:** Large-table checks can have false positives.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      NonEmptyTablesResponse result = apiInstance.getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceStatisticsApi#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**NonEmptyTablesResponse**](NonEmptyTablesResponse.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Read access denied to the instance. |  -  |
| **404** | Instance not accessible. |  -  |
| **500** | Unexpected error while checking data tables. |  -  |
| **422** | Validation Error |  -  |

<a id="getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet"></a>
# **getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**
> Object getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, spaceId)

Get Relation Counts

Return relation counts for a record.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    Integer id = 56; // Integer | Record ID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceStatisticsApi#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **id** | **Integer**| Record ID. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

**Object**

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost"></a>
# **groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**
> Object groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, spaceId)

Group By

Aggregate model records by dimensions and measures.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    GroupByRequestBody groupByRequestBody = new GroupByRequestBody(); // GroupByRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceStatisticsApi#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **groupByRequestBody** | [**GroupByRequestBody**](GroupByRequestBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

**Object**

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

