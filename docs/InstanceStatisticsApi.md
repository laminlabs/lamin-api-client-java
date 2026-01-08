# InstanceStatisticsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstanceStatisticsInstancesInstanceIdStatisticsGet**](InstanceStatisticsApi.md#getInstanceStatisticsInstancesInstanceIdStatisticsGet) | **GET** /instances/{instance_id}/statistics | Get Approximate Table Row Counts and Artifact Size |
| [**getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**](InstanceStatisticsApi.md#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet) | **GET** /instances/{instance_id}/non_empty_tables | List Non-Empty Data Tables by Module |
| [**getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**](InstanceStatisticsApi.md#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet) | **GET** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/counts | Get Relation Counts |
| [**groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**](InstanceStatisticsApi.md#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/group-by | Group By |


<a id="getInstanceStatisticsInstancesInstanceIdStatisticsGet"></a>
# **getInstanceStatisticsInstancesInstanceIdStatisticsGet**
> StatisticsResponse getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, authorization)

Get Approximate Table Row Counts and Artifact Size

Retrieves instance statistics, including artifact size and table row counts.  This endpoint uses a hybrid approach optimized for both accuracy and performance: - **Row Counts (&#x60;counts&#x60;)**: Uses a hybrid counting strategy:   - For small tables (≤ 2000 estimated rows): **Exact counts** using     &#x60;COUNT(*)&#x60; to ensure accuracy for small datasets.   - For larger tables: **Fast approximations** based on PostgreSQL statistics catalog     (&#x60;pg_class.reltuples&#x60;) for near-instant retrieval. These stats are updated     periodically by database operations like &#x60;ANALYZE&#x60; and &#x60;AUTOVACUUM&#x60;. - **Artifact Size (&#x60;instance_size&#x60;)**: This is an **exact** real-time calculation,   derived by performing a &#x60;SUM(size)&#x60; on the artifact table.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    List<String> q = Arrays.asList(); // List<String> | A list of models in \"${module}.${model}\" format (case-sensitive). If omitted, statistics for all primary tables are returned.
    String authorization = "authorization_example"; // String | 
    try {
      StatisticsResponse result = apiInstance.getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, authorization);
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
| **instanceId** | **UUID**|  | |
| **q** | [**List&lt;String&gt;**](String.md)| A list of models in \&quot;${module}.${model}\&quot; format (case-sensitive). If omitted, statistics for all primary tables are returned. | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

[**StatisticsResponse**](StatisticsResponse.md)

### Authorization

No authorization required

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
> NonEmptyTablesResponse getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, authorization)

List Non-Empty Data Tables by Module

Analyzes the instance&#39;s database schema to identify all tables that contain data.  This endpoint uses a hybrid approach optimized for both accuracy and performance: - **For small tables (≤ 2000 estimated rows)**: **Exact non-empty check** using   &#x60;COUNT(*) &gt; 0&#x60; to ensure accuracy for small datasets. - **For larger tables (&gt; 2000 estimated rows)**: **Fast approximation** based on   PostgreSQL statistics catalog (&#x60;pg_class.reltuples &gt; 0&#x60;) for near-instant   retrieval. These stats are updated periodically by database operations like   &#x60;ANALYZE&#x60; and &#x60;AUTOVACUUM&#x60;.  **Accuracy Note**: - Small tables: Guaranteed accurate non-empty detection - Large tables: May have acceptable false positives if all rows are deleted   but space hasn&#39;t been reclaimed until &#x60;VACUUM FULL&#x60; or &#x60;TRUNCATE&#x60; is run.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      NonEmptyTablesResponse result = apiInstance.getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, authorization);
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
| **instanceId** | **UUID**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**NonEmptyTablesResponse**](NonEmptyTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Read access denied to the instance. |  -  |
| **404** | Instance not accessible. |  -  |
| **500** | Internal server error, such as a missing schema or database connection failure. |  -  |
| **422** | Validation Error |  -  |

<a id="getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet"></a>
# **getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**
> Object getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, authorization)

Get Relation Counts

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    Integer id = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, authorization);
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **id** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

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
> Object groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, authorization)

Group By

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceStatisticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceStatisticsApi apiInstance = new InstanceStatisticsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    GroupByRequestBody groupByRequestBody = new GroupByRequestBody(); // GroupByRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, authorization);
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **groupByRequestBody** | [**GroupByRequestBody**](GroupByRequestBody.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

