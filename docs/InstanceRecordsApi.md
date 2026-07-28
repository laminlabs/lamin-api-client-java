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
> BatchDeleteResponse batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost(moduleName, modelName, instanceId, batchDeleteBody, spaceId)

Batch Delete Records

Delete multiple records in one request.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Every delete selector must use the same key set.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    BatchDeleteBody batchDeleteBody = new BatchDeleteBody(); // BatchDeleteBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      BatchDeleteResponse result = apiInstance.batchDeleteRecordsInstancesInstanceIdModulesModuleNameModelNameBatchDeletePost(moduleName, modelName, instanceId, batchDeleteBody, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **batchDeleteBody** | [**BatchDeleteBody**](BatchDeleteBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**BatchDeleteResponse**](BatchDeleteResponse.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Number of records deleted. |  -  |
| **422** | Validation Error |  -  |

<a id="batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut"></a>
# **batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut**
> BatchSyncResponse batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut(moduleName, modelName, instanceId, batchSyncLinksBody, spaceId)

Synchronize sets of links for multiple scopes in a single call

Synchronize link sets for multiple scopes.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Each scope is changed to exactly the desired set of linked IDs.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    BatchSyncLinksBody batchSyncLinksBody = new BatchSyncLinksBody(); // BatchSyncLinksBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      BatchSyncResponse result = apiInstance.batchSyncLinksInstancesInstanceIdModulesModuleNameModelNameBatchSyncLinksPut(moduleName, modelName, instanceId, batchSyncLinksBody, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **batchSyncLinksBody** | [**BatchSyncLinksBody**](BatchSyncLinksBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**BatchSyncResponse**](BatchSyncResponse.md)

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

<a id="batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch"></a>
# **batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch**
> List&lt;Map&lt;String, Object&gt;&gt; batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch(moduleName, modelName, instanceId, batchUpdateBody, spaceId)

Update one or more records in a batch

Update multiple records in one request.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Heterogeneous partial updates are grouped by record shape.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    BatchUpdateBody batchUpdateBody = new BatchUpdateBody(); // BatchUpdateBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      List<Map<String, Object>> result = apiInstance.batchUpdateRecordsInstancesInstanceIdModulesModuleNameModelNameBatchUpdatePatch(moduleName, modelName, instanceId, batchUpdateBody, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **batchUpdateBody** | [**BatchUpdateBody**](BatchUpdateBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

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
> Object createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, responseMode, spaceId)

Create Records

Insert one or more records.  **Permissions:** Requires write access to the target instance or space.  **Quota:** Inserts at most 20,000 records per request.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Object body = null; // Object | 
    String responseMode = "records"; // String | Use 'records' to return every inserted row. Use 'summary' to cap full records while still returning ordered identifiers for every inserted row.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, responseMode, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **body** | **Object**|  | |
| **responseMode** | **String**| Use &#39;records&#39; to return every inserted row. Use &#39;summary&#39; to cap full records while still returning ordered identifiers for every inserted row. | [optional] [default to records] [enum: records, summary] |
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
| **200** | Inserted records, or a capped record summary when response_mode&#x3D;summary. |  -  |
| **422** | Validation Error |  -  |

<a id="deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete"></a>
# **deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**
> Object deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, spaceId)

Delete Record

Delete one record by UID.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    String uid = "uid_example"; // String | Record UID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **uid** | **String**| Record UID. | |
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
| **409** | Record is still referenced by other records. |  -  |
| **422** | Validation Error |  -  |

<a id="exportRecordsInstancesInstanceIdRecordsUidExportPost"></a>
# **exportRecordsInstancesInstanceIdRecordsUidExportPost**
> Object exportRecordsInstancesInstanceIdRecordsUidExportPost(uid, instanceId, spaceId, exportRecordsRequestBody)

Export Records

Export a record and its related records.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String uid = "uid_example"; // String | Record UID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    ExportRecordsRequestBody exportRecordsRequestBody = new ExportRecordsRequestBody(); // ExportRecordsRequestBody | 
    try {
      Object result = apiInstance.exportRecordsInstancesInstanceIdRecordsUidExportPost(uid, instanceId, spaceId, exportRecordsRequestBody);
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
| **uid** | **String**| Record UID. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **exportRecordsRequestBody** | [**ExportRecordsRequestBody**](ExportRecordsRequestBody.md)|  | [optional] |

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
| **200** | Exported record payload. |  -  |
| **422** | Validation Error |  -  |

<a id="getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost"></a>
# **getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**
> Object getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, spaceId, getRecordRequestBody)

Get Record

Return one record by numeric ID or UID.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    String idOrUid = "idOrUid_example"; // String | Record ID or UID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Integer limitToMany = 10; // Integer | Maximum number of related records to include.
    Boolean includeForeignKeys = false; // Boolean | Include foreign-key columns in the result.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    GetRecordRequestBody getRecordRequestBody = new GetRecordRequestBody(); // GetRecordRequestBody | 
    try {
      Object result = apiInstance.getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, spaceId, getRecordRequestBody);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **idOrUid** | **String**| Record ID or UID. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **limitToMany** | **Integer**| Maximum number of related records to include. | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**| Include foreign-key columns in the result. | [optional] [default to false] |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **getRecordRequestBody** | [**GetRecordRequestBody**](GetRecordRequestBody.md)|  | [optional] |

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

<a id="getRecordsInstancesInstanceIdModulesModuleNameModelNamePost"></a>
# **getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**
> Object getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, spaceId, getRecordsRequestBody)

Get Records

Query records from a model.  **Permissions:** Requires read access to the instance.  **Quota:** Returns at most 200 records per request range.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Integer limit = 50; // Integer | Maximum number of records to return.
    Integer offset = 0; // Integer | Number of records to skip.
    Integer limitToMany = 10; // Integer | Maximum number of related records to include.
    Boolean includeForeignKeys = false; // Boolean | Include foreign-key columns in the result.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    GetRecordsRequestBody getRecordsRequestBody = new GetRecordsRequestBody(); // GetRecordsRequestBody | 
    try {
      Object result = apiInstance.getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, spaceId, getRecordsRequestBody);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **limit** | **Integer**| Maximum number of records to return. | [optional] [default to 50] |
| **offset** | **Integer**| Number of records to skip. | [optional] [default to 0] |
| **limitToMany** | **Integer**| Maximum number of related records to include. | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**| Include foreign-key columns in the result. | [optional] [default to false] |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **getRecordsRequestBody** | [**GetRecordsRequestBody**](GetRecordsRequestBody.md)|  | [optional] |

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

<a id="getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost"></a>
# **getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost**
> Object getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost(moduleName, modelName, instanceId, request, limit, offset, spaceId)

Get and query hierarchical relatives of records

Return hierarchical relatives for matching records.  **Permissions:** Requires read access to the instance.  **Notes:** Traverses explicit parent links first, then a self-referential type tree.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Request request = new Request(); // Request | 
    Integer limit = 100; // Integer | The maximum number of relative records to return.
    Integer offset = 0; // Integer | The offset for paginating through the results.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getRelativesInstancesInstanceIdModulesModuleNameModelNameRelativesPost(moduleName, modelName, instanceId, request, limit, offset, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **request** | [**Request**](Request.md)|  | |
| **limit** | **Integer**| The maximum number of relative records to return. | [optional] [default to 100] |
| **offset** | **Integer**| The offset for paginating through the results. | [optional] [default to 0] |
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

<a id="getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost"></a>
# **getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**
> Object getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, spaceId, getValuesRequestBody)

Get Values

Return values for a model field path.  **Permissions:** Requires read access to the instance.  **Quota:** Returns at most 200 values per request range.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    String fieldPath = "fieldPath_example"; // String | Field path to read values from.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Integer limit = 50; // Integer | Maximum number of values to return.
    Integer offset = 0; // Integer | Number of values to skip.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    GetValuesRequestBody getValuesRequestBody = new GetValuesRequestBody(); // GetValuesRequestBody | 
    try {
      Object result = apiInstance.getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, spaceId, getValuesRequestBody);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **fieldPath** | **String**| Field path to read values from. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **limit** | **Integer**| Maximum number of values to return. | [optional] [default to 50] |
| **offset** | **Integer**| Number of values to skip. | [optional] [default to 0] |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **getValuesRequestBody** | [**GetValuesRequestBody**](GetValuesRequestBody.md)|  | [optional] |

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

<a id="updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch"></a>
# **updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**
> Object updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, spaceId)

Update Record

Update fields on one record by UID.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Updates &#x60;updated_at&#x60; when the model has that field.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    String uid = "uid_example"; // String | Record UID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Object body = null; // Object | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **uid** | **String**| Record UID. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **body** | **Object**|  | |
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

<a id="upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut"></a>
# **upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut**
> Object upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, conflictColumns, body, spaceId)

Upsert one or more records

Insert new records or update existing ones based on a conflict key.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Omitted fields are unchanged on existing records.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceRecordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceRecordsApi apiInstance = new InstanceRecordsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    List<String> conflictColumns = Arrays.asList(); // List<String> | Column names that define the unique key for conflict resolution. Must match a unique constraint or index.
    Body body = new Body(); // Body | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, conflictColumns, body, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **conflictColumns** | [**List&lt;String&gt;**](String.md)| Column names that define the unique key for conflict resolution. Must match a unique constraint or index. | |
| **body** | [**Body**](Body.md)|  | |
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
| **200** | Full upserted records as they exist in the database. |  -  |
| **400** | The conflict_columns query parameter was not provided. |  -  |
| **404** | The specified module or model name was not found. |  -  |
| **422** | Invalid payload or conflict key. |  -  |

