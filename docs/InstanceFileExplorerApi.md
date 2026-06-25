# InstanceFileExplorerApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTreeInstancesInstanceIdFilesTreeGet**](InstanceFileExplorerApi.md#getTreeInstancesInstanceIdFilesTreeGet) | **GET** /instances/{instance_id}/files/tree | Get Tree |
| [**listDirectoryInstancesInstanceIdFilesEntityTypeGet**](InstanceFileExplorerApi.md#listDirectoryInstancesInstanceIdFilesEntityTypeGet) | **GET** /instances/{instance_id}/files/{entity_type} | List Directory |


<a id="getTreeInstancesInstanceIdFilesTreeGet"></a>
# **getTreeInstancesInstanceIdFilesTreeGet**
> Object getTreeInstancesInstanceIdFilesTreeGet(instanceId, entityType, spaceId, authorization)

Get Tree

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFileExplorerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceFileExplorerApi apiInstance = new InstanceFileExplorerApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String entityType = "artifacts"; // String | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getTreeInstancesInstanceIdFilesTreeGet(instanceId, entityType, spaceId, authorization);
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
| **instanceId** | **UUID**|  | |
| **entityType** | **String**|  | [enum: artifacts, transforms] |
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

<a id="listDirectoryInstancesInstanceIdFilesEntityTypeGet"></a>
# **listDirectoryInstancesInstanceIdFilesEntityTypeGet**
> Object listDirectoryInstancesInstanceIdFilesEntityTypeGet(entityType, instanceId, path, spaceId, authorization)

List Directory

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFileExplorerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceFileExplorerApi apiInstance = new InstanceFileExplorerApi(defaultClient);
    String entityType = "artifacts"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String path = ""; // String | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listDirectoryInstancesInstanceIdFilesEntityTypeGet(entityType, instanceId, path, spaceId, authorization);
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
| **entityType** | **String**|  | [enum: artifacts, transforms] |
| **instanceId** | **UUID**|  | |
| **path** | **String**|  | [optional] [default to ] |
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

