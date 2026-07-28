# InstanceFeaturesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost**](InstanceFeaturesApi.md#queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/query_features | Query Linked Features |


<a id="queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost"></a>
# **queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost**
> Object queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost(moduleName, modelName, instanceId, limit, offset, spaceId, getRecordsRequestBody)

Query Linked Features

Return features linked to matching primary records.  **Permissions:** Requires read access to the instance.  **Quota:** Returns at most 200 features per request.  **Notes:** Returns unique Feature records.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFeaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceFeaturesApi apiInstance = new InstanceFeaturesApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    Integer limit = 50; // Integer | Maximum number of features to return.
    Integer offset = 0; // Integer | Number of features to skip.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    GetRecordsRequestBody getRecordsRequestBody = new GetRecordsRequestBody(); // GetRecordsRequestBody | 
    try {
      Object result = apiInstance.queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost(moduleName, modelName, instanceId, limit, offset, spaceId, getRecordsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceFeaturesApi#queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost");
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **limit** | **Integer**| Maximum number of features to return. | [optional] [default to 50] |
| **offset** | **Integer**| Number of features to skip. | [optional] [default to 0] |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **getRecordsRequestBody** | [**GetRecordsRequestBody**](GetRecordsRequestBody.md)|  | [optional] |

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

