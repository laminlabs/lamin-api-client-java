# InstanceSearchApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**globalSearchInstancesInstanceIdSearchGet**](InstanceSearchApi.md#globalSearchInstancesInstanceIdSearchGet) | **GET** /instances/{instance_id}/search | Global Search |


<a id="globalSearchInstancesInstanceIdSearchGet"></a>
# **globalSearchInstancesInstanceIdSearchGet**
> Object globalSearchInstancesInstanceIdSearchGet(instanceId, searchTerm, spaceId, authorization)

Global Search

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceSearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceSearchApi apiInstance = new InstanceSearchApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String searchTerm = "searchTerm_example"; // String | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.globalSearchInstancesInstanceIdSearchGet(instanceId, searchTerm, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceSearchApi#globalSearchInstancesInstanceIdSearchGet");
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
| **searchTerm** | **String**|  | |
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

