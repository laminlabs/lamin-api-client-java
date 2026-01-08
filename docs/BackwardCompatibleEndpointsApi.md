# BackwardCompatibleEndpointsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet**](BackwardCompatibleEndpointsApi.md#getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet) | **GET** /access_v2/instances/{instance_id}/db_token | Get Db Token Backward Compatible |


<a id="getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet"></a>
# **getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet**
> Object getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet(instanceId, authorization)

Get Db Token Backward Compatible

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.BackwardCompatibleEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    BackwardCompatibleEndpointsApi apiInstance = new BackwardCompatibleEndpointsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackwardCompatibleEndpointsApi#getDbTokenBackwardCompatibleAccessV2InstancesInstanceIdDbTokenGet");
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

