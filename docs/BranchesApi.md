# BranchesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mergeBranchInstancesInstanceIdBranchesMergePost**](BranchesApi.md#mergeBranchInstancesInstanceIdBranchesMergePost) | **POST** /instances/{instance_id}/branches/merge | Merge Branch |


<a id="mergeBranchInstancesInstanceIdBranchesMergePost"></a>
# **mergeBranchInstancesInstanceIdBranchesMergePost**
> Object mergeBranchInstancesInstanceIdBranchesMergePost(instanceId, mergeBranchRequestBody, spaceId, authorization)

Merge Branch

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.BranchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    MergeBranchRequestBody mergeBranchRequestBody = new MergeBranchRequestBody(); // MergeBranchRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.mergeBranchInstancesInstanceIdBranchesMergePost(instanceId, mergeBranchRequestBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#mergeBranchInstancesInstanceIdBranchesMergePost");
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
| **mergeBranchRequestBody** | [**MergeBranchRequestBody**](MergeBranchRequestBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
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

