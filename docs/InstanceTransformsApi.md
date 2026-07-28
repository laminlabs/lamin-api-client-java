# InstanceTransformsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransformInstancesInstanceIdTransformsPost**](InstanceTransformsApi.md#createTransformInstancesInstanceIdTransformsPost) | **POST** /instances/{instance_id}/transforms | Create Transform |


<a id="createTransformInstancesInstanceIdTransformsPost"></a>
# **createTransformInstancesInstanceIdTransformsPost**
> Object createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, spaceId)

Create Transform

Create a transform in the instance.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceTransformsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceTransformsApi apiInstance = new InstanceTransformsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    CreateTransformRequestBody createTransformRequestBody = new CreateTransformRequestBody(); // CreateTransformRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceTransformsApi#createTransformInstancesInstanceIdTransformsPost");
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
| **createTransformRequestBody** | [**CreateTransformRequestBody**](CreateTransformRequestBody.md)|  | |
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

