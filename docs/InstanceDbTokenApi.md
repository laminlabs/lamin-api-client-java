# InstanceDbTokenApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDbTokenInstancesInstanceIdDbTokenGet**](InstanceDbTokenApi.md#getDbTokenInstancesInstanceIdDbTokenGet) | **GET** /instances/{instance_id}/db_token | Get Db Token |


<a id="getDbTokenInstancesInstanceIdDbTokenGet"></a>
# **getDbTokenInstancesInstanceIdDbTokenGet**
> Object getDbTokenInstancesInstanceIdDbTokenGet(instanceId, spaceId, authorization)

Get Db Token

Get a database token for the specified instance.  This token can be used to authenticate with the instance&#39;s database.  Parameters: - **instance_id**: UUID of the instance to get the token for (from URL path)  Returns: - **200**: Database token retrieved successfully   - **token**: The database token - **401**: Unauthorized

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceDbTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceDbTokenApi apiInstance = new InstanceDbTokenApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getDbTokenInstancesInstanceIdDbTokenGet(instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceDbTokenApi#getDbTokenInstancesInstanceIdDbTokenGet");
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

