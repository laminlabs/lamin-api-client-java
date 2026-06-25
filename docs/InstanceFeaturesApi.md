# InstanceFeaturesApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost**](InstanceFeaturesApi.md#queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/query_features | Query Linked Features |


<a id="queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost"></a>
# **queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost**
> Object queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost(moduleName, modelName, instanceId, limit, offset, spaceId, authorization, getRecordsRequestBody)

Query Linked Features

Queries and returns a flat list of all unique Feature records associated with a set of filtered primary model records.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFeaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceFeaturesApi apiInstance = new InstanceFeaturesApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetRecordsRequestBody getRecordsRequestBody = new GetRecordsRequestBody(); // GetRecordsRequestBody | 
    try {
      Object result = apiInstance.queryLinkedFeaturesInstancesInstanceIdModulesModuleNameModelNameQueryFeaturesPost(moduleName, modelName, instanceId, limit, offset, spaceId, authorization, getRecordsRequestBody);
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **spaceId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getRecordsRequestBody** | [**GetRecordsRequestBody**](GetRecordsRequestBody.md)|  | [optional] |

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

