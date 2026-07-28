# InstanceFunctionsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeFunctionInstancesInstanceIdFunctionExecutePost**](InstanceFunctionsApi.md#executeFunctionInstancesInstanceIdFunctionExecutePost) | **POST** /instances/{instance_id}/function/execute | Execute Function |


<a id="executeFunctionInstancesInstanceIdFunctionExecutePost"></a>
# **executeFunctionInstancesInstanceIdFunctionExecutePost**
> Object executeFunctionInstancesInstanceIdFunctionExecutePost(instanceId, executeFunctionRequestBody, spaceId)

Execute Function

Execute a registered function for a transform.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFunctionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceFunctionsApi apiInstance = new InstanceFunctionsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    ExecuteFunctionRequestBody executeFunctionRequestBody = new ExecuteFunctionRequestBody(); // ExecuteFunctionRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.executeFunctionInstancesInstanceIdFunctionExecutePost(instanceId, executeFunctionRequestBody, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceFunctionsApi#executeFunctionInstancesInstanceIdFunctionExecutePost");
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
| **executeFunctionRequestBody** | [**ExecuteFunctionRequestBody**](ExecuteFunctionRequestBody.md)|  | |
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

