# CacheApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstanceCacheCacheInstancesInstanceIdGet**](CacheApi.md#getInstanceCacheCacheInstancesInstanceIdGet) | **GET** /cache/instances/{instance_id} | Get Instance Cache |
| [**invalidateInstanceCacheCacheInstancesInstanceIdDelete**](CacheApi.md#invalidateInstanceCacheCacheInstancesInstanceIdDelete) | **DELETE** /cache/instances/{instance_id} | Invalidate Instance Cache |


<a id="getInstanceCacheCacheInstancesInstanceIdGet"></a>
# **getInstanceCacheCacheInstancesInstanceIdGet**
> Object getInstanceCacheCacheInstancesInstanceIdGet(instanceId, authorization)

Get Instance Cache

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    CacheApi apiInstance = new CacheApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getInstanceCacheCacheInstancesInstanceIdGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#getInstanceCacheCacheInstancesInstanceIdGet");
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

<a id="invalidateInstanceCacheCacheInstancesInstanceIdDelete"></a>
# **invalidateInstanceCacheCacheInstancesInstanceIdDelete**
> Object invalidateInstanceCacheCacheInstancesInstanceIdDelete(instanceId, authorization)

Invalidate Instance Cache

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.CacheApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    CacheApi apiInstance = new CacheApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.invalidateInstanceCacheCacheInstancesInstanceIdDelete(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CacheApi#invalidateInstanceCacheCacheInstancesInstanceIdDelete");
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

