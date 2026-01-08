# InstanceTransformsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransformInstancesInstanceIdTransformsPost**](InstanceTransformsApi.md#createTransformInstancesInstanceIdTransformsPost) | **POST** /instances/{instance_id}/transforms | Create Transform |


<a id="createTransformInstancesInstanceIdTransformsPost"></a>
# **createTransformInstancesInstanceIdTransformsPost**
> Object createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, authorization)

Create Transform

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceTransformsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceTransformsApi apiInstance = new InstanceTransformsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateTransformRequestBody createTransformRequestBody = new CreateTransformRequestBody(); // CreateTransformRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, authorization);
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
| **instanceId** | **UUID**|  | |
| **createTransformRequestBody** | [**CreateTransformRequestBody**](CreateTransformRequestBody.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

