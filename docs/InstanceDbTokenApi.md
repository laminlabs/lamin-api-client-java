# InstanceDbTokenApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDbTokenInstancesInstanceIdDbTokenGet**](InstanceDbTokenApi.md#getDbTokenInstancesInstanceIdDbTokenGet) | **GET** /instances/{instance_id}/db_token | Get Db Token |


<a id="getDbTokenInstancesInstanceIdDbTokenGet"></a>
# **getDbTokenInstancesInstanceIdDbTokenGet**
> DbTokenResponse getDbTokenInstancesInstanceIdDbTokenGet(instanceId, spaceId)

Get Db Token

Return an access token for direct instance data access.  **Permissions:** Requires read access to the instance.  **Notes:** The token grants direct access to instance data.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceDbTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceDbTokenApi apiInstance = new InstanceDbTokenApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      DbTokenResponse result = apiInstance.getDbTokenInstancesInstanceIdDbTokenGet(instanceId, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

[**DbTokenResponse**](DbTokenResponse.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Instance access token. |  -  |
| **422** | Validation Error |  -  |

