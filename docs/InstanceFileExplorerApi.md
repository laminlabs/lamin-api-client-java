# InstanceFileExplorerApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTreeInstancesInstanceIdFilesTreeGet**](InstanceFileExplorerApi.md#getTreeInstancesInstanceIdFilesTreeGet) | **GET** /instances/{instance_id}/files/tree | Get Tree |
| [**listDirectoryInstancesInstanceIdFilesEntityTypeGet**](InstanceFileExplorerApi.md#listDirectoryInstancesInstanceIdFilesEntityTypeGet) | **GET** /instances/{instance_id}/files/{entity_type} | List Directory |


<a id="getTreeInstancesInstanceIdFilesTreeGet"></a>
# **getTreeInstancesInstanceIdFilesTreeGet**
> Object getTreeInstancesInstanceIdFilesTreeGet(instanceId, entityType, spaceId)

Get Tree

Return the artifact or transform file tree.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFileExplorerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceFileExplorerApi apiInstance = new InstanceFileExplorerApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    String entityType = "artifacts"; // String | File entity type to browse.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getTreeInstancesInstanceIdFilesTreeGet(instanceId, entityType, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceFileExplorerApi#getTreeInstancesInstanceIdFilesTreeGet");
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
| **entityType** | **String**| File entity type to browse. | [enum: artifacts, transforms] |
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

<a id="listDirectoryInstancesInstanceIdFilesEntityTypeGet"></a>
# **listDirectoryInstancesInstanceIdFilesEntityTypeGet**
> Object listDirectoryInstancesInstanceIdFilesEntityTypeGet(entityType, instanceId, path, spaceId)

List Directory

List files in an artifact or transform directory.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFileExplorerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceFileExplorerApi apiInstance = new InstanceFileExplorerApi(defaultClient);
    String entityType = "artifacts"; // String | File entity type to browse.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    String path = ""; // String | Directory path to list.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.listDirectoryInstancesInstanceIdFilesEntityTypeGet(entityType, instanceId, path, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceFileExplorerApi#listDirectoryInstancesInstanceIdFilesEntityTypeGet");
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
| **entityType** | **String**| File entity type to browse. | [enum: artifacts, transforms] |
| **instanceId** | **UUID**| Instance UUID. | |
| **path** | **String**| Directory path to list. | [optional] [default to ] |
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

