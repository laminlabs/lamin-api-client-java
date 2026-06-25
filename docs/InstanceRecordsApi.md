# InstanceRecordsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost**](InstanceRecordsApi.md#batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/batch-delete | Batch Delete Records |
| [**batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut**](InstanceRecordsApi.md#batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/batch-sync-links | Synchronize sets of links for multiple scopes in a single call |
| [**batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch**](InstanceRecordsApi.md#batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch) | **PATCH** /instances/{instance_id}/modules/{module_name}/{model_name}/batch-update | Update one or more records in a batch |
| [**createRecordsInstancesInstanceIdModulesModuleNameModelNamePut**](InstanceRecordsApi.md#createRecordsInstancesInstanceIdModulesModuleNameModelNamePut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name} | Create Records |
| [**deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**](InstanceRecordsApi.md#deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Delete Record |
| [**exportRecordsInstancesInstanceIdRecordsUidExportPost**](InstanceRecordsApi.md#exportRecordsInstancesInstanceIdRecordsUidExportPost) | **POST** /instances/{instance_id}/records/{uid}/export | Export Records |
| [**getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**](InstanceRecordsApi.md#getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/{id_or_uid} | Get Record |
| [**getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**](InstanceRecordsApi.md#getRecordsInstancesInstanceIdModulesModuleNameModelNamePost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name} | Get Records |
| [**getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost**](InstanceRecordsApi.md#getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/relatives | Get and query hierarchical relatives of records |
| [**getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**](InstanceRecordsApi.md#getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/fields/{field_path} | Get Values |
| [**updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**](InstanceRecordsApi.md#updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch) | **PATCH** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Update Record |
| [**upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut**](InstanceRecordsApi.md#upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/upsert | Upsert one or more records |


<a id="batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost"></a>
# **batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost**
> BatchDeleteResponse batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost(moduleName, modelName, instanceId, batchDeleteBody, spaceId, authorization)

Batch Delete Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    BatchDeleteBody batchDeleteBody = new BatchDeleteBody(); // BatchDeleteBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      BatchDeleteResponse result = apiInstance.batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost(moduleName, modelName, instanceId, batchDeleteBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost");
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
| **batchDeleteBody** | [**BatchDeleteBody**](BatchDeleteBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

[**BatchDeleteResponse**](BatchDeleteResponse.md)

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

<a id="batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut"></a>
# **batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut**
> BatchSyncResponse batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut(moduleName, modelName, instanceId, batchSyncLinksBody, spaceId, authorization)

Synchronize sets of links for multiple scopes in a single call

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    BatchSyncLinksBody batchSyncLinksBody = new BatchSyncLinksBody(); // BatchSyncLinksBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      BatchSyncResponse result = apiInstance.batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut(moduleName, modelName, instanceId, batchSyncLinksBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut");
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
| **batchSyncLinksBody** | [**BatchSyncLinksBody**](BatchSyncLinksBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

[**BatchSyncResponse**](BatchSyncResponse.md)

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

<a id="batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch"></a>
# **batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch**
> List&lt;Map&lt;String, Object&gt;&gt; batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch(moduleName, modelName, instanceId, batchUpdateBody, spaceId, authorization)

Update one or more records in a batch

Partially updates multiple records in a single request.  This endpoint processes a list of records, updating each one in the database. It is designed to handle heterogeneous partial updates, meaning each record in the batch can update a different set of fields.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    BatchUpdateBody batchUpdateBody = new BatchUpdateBody(); // BatchUpdateBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      List<Map<String, Object>> result = apiInstance.batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch(moduleName, modelName, instanceId, batchUpdateBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch");
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
| **batchUpdateBody** | [**BatchUpdateBody**](BatchUpdateBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful update. Returns a list of the full, updated records. |  -  |
| **422** | A record in the payload is missing a required index key. |  -  |

<a id="createRecordsInstancesInstanceIdModulesModuleNameModelNamePut"></a>
# **createRecordsInstancesInstanceIdModulesModuleNameModelNamePut**
> Object createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, spaceId, authorization)

Create Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#createRecordsInstancesInstanceIdModulesModuleNameModelNamePut");
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
| **body** | **Object**|  | |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete"></a>
# **deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**
> Object deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, spaceId, authorization)

Delete Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String uid = "uid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete");
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
| **uid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="exportRecordsInstancesInstanceIdRecordsUidExportPost"></a>
# **exportRecordsInstancesInstanceIdRecordsUidExportPost**
> Object exportRecordsInstancesInstanceIdRecordsUidExportPost(uid, instanceId, spaceId, authorization, exportRecordsRequestBody)

Export Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String uid = "uid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    ExportRecordsRequestBody exportRecordsRequestBody = new ExportRecordsRequestBody(); // ExportRecordsRequestBody | 
    try {
      Object result = apiInstance.exportRecordsInstancesInstanceIdRecordsUidExportPost(uid, instanceId, spaceId, authorization, exportRecordsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#exportRecordsInstancesInstanceIdRecordsUidExportPost");
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
| **uid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **exportRecordsRequestBody** | [**ExportRecordsRequestBody**](ExportRecordsRequestBody.md)|  | [optional] |

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

<a id="getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost"></a>
# **getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**
> Object getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, spaceId, authorization, getRecordRequestBody)

Get Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String idOrUid = "idOrUid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limitToMany = 10; // Integer | 
    Boolean includeForeignKeys = false; // Boolean | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetRecordRequestBody getRecordRequestBody = new GetRecordRequestBody(); // GetRecordRequestBody | 
    try {
      Object result = apiInstance.getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, spaceId, authorization, getRecordRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost");
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
| **idOrUid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limitToMany** | **Integer**|  | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**|  | [optional] [default to false] |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getRecordRequestBody** | [**GetRecordRequestBody**](GetRecordRequestBody.md)|  | [optional] |

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

<a id="getRecordsInstancesInstanceIdModulesModuleNameModelNamePost"></a>
# **getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**
> Object getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, spaceId, authorization, getRecordsRequestBody)

Get Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    Integer limitToMany = 10; // Integer | 
    Boolean includeForeignKeys = false; // Boolean | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetRecordsRequestBody getRecordsRequestBody = new GetRecordsRequestBody(); // GetRecordsRequestBody | 
    try {
      Object result = apiInstance.getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, spaceId, authorization, getRecordsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#getRecordsInstancesInstanceIdModulesModuleNameModelNamePost");
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
| **limit** | **Integer**|  | [optional] [default to 50] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limitToMany** | **Integer**|  | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**|  | [optional] [default to false] |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getRecordsRequestBody** | [**GetRecordsRequestBody**](GetRecordsRequestBody.md)|  | [optional] |

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

<a id="getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost"></a>
# **getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost**
> Object getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost(moduleName, modelName, instanceId, request, limit, offset, spaceId, authorization)

Get and query hierarchical relatives of records

Finds and queries all relatives (ancestors or descendants) for a given set of records.  This endpoint first performs a recursive traversal to identify a complete set of related records. It then applies standard query parameters (filter, sort, search, select, etc.) to that set.  **Traversal Strategies:** The endpoint intelligently discovers the relationship structure from the schema:  1.  **ManyToMany Graph:** It first looks for an explicit &#x60;parents&#x60; or &#x60;children&#x60; relationship field, which is assumed to be a Directed Acyclic Graph (DAG). 2.  **ForeignKey Tree:** If a ManyToMany field is not found, it falls back to traversing a self-referential &#x60;type&#x60; field, which is assumed to represent a parent-pointer tree.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Request request = new Request(); // Request | 
    Integer limit = 100; // Integer | The maximum number of relative records to return.
    Integer offset = 0; // Integer | The offset for paginating through the results.
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost(moduleName, modelName, instanceId, request, limit, offset, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost");
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
| **request** | [**Request**](Request.md)|  | |
| **limit** | **Integer**| The maximum number of relative records to return. | [optional] [default to 100] |
| **offset** | **Integer**| The offset for paginating through the results. | [optional] [default to 0] |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost"></a>
# **getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**
> Object getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, spaceId, authorization, getValuesRequestBody)

Get Values

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String fieldPath = "fieldPath_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetValuesRequestBody getValuesRequestBody = new GetValuesRequestBody(); // GetValuesRequestBody | 
    try {
      Object result = apiInstance.getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, spaceId, authorization, getValuesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost");
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
| **fieldPath** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getValuesRequestBody** | [**GetValuesRequestBody**](GetValuesRequestBody.md)|  | [optional] |

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

<a id="updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch"></a>
# **updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**
> Object updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, spaceId, authorization)

Update Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String uid = "uid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch");
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
| **uid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **body** | **Object**|  | |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut"></a>
# **upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut**
> Object upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, conflictColumns, body, spaceId, authorization)

Upsert one or more records

Insert new records or update existing ones based on a conflict key.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    List<String> conflictColumns = Arrays.asList(); // List<String> | A list of column names that define the unique key for conflict resolution. This must correspond to a unique constraint or index in the database.
    Body body = new Body(); // Body | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, conflictColumns, body, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceRecordsApi#upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut");
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
| **conflictColumns** | [**List&lt;String&gt;**](String.md)| A list of column names that define the unique key for conflict resolution. This must correspond to a unique constraint or index in the database. | |
| **body** | [**Body**](Body.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
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
| **200** | Successful Response. Returns a list of the full, upserted records as they exist in the database. |  -  |
| **400** | The &#39;conflict_columns&#39; query parameter was not provided. |  -  |
| **404** | The specified module or model name was not found. |  -  |
| **422** | The request payload is invalid (e.g., a record is missing a required conflict key, or the conflict key is not a valid unique constraint in the database). |  -  |

