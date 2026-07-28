# BranchesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mergeBranchInstancesInstanceIdBranchesMergePost**](BranchesApi.md#mergeBranchInstancesInstanceIdBranchesMergePost) | **POST** /instances/{instance_id}/branches/merge | Merge Branch |


<a id="mergeBranchInstancesInstanceIdBranchesMergePost"></a>
# **mergeBranchInstancesInstanceIdBranchesMergePost**
> Object mergeBranchInstancesInstanceIdBranchesMergePost(instanceId, mergeBranchRequestBody, spaceId)

Merge Branch

Merge one branch into another.  **Permissions:** Requires write access to every non-default branch space involved.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.BranchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    BranchesApi apiInstance = new BranchesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    MergeBranchRequestBody mergeBranchRequestBody = new MergeBranchRequestBody(); // MergeBranchRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.mergeBranchInstancesInstanceIdBranchesMergePost(instanceId, mergeBranchRequestBody, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **mergeBranchRequestBody** | [**MergeBranchRequestBody**](MergeBranchRequestBody.md)|  | |
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

