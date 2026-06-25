# InstanceSchemaApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**](InstanceSchemaApi.md#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet) | **GET** /instances/{instance_id}/schema/{module_name}/{model_name} | Get Relations |
| [**getSchemaInstancesInstanceIdSchemaGet**](InstanceSchemaApi.md#getSchemaInstancesInstanceIdSchemaGet) | **GET** /instances/{instance_id}/schema | Get Schema |


<a id="getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet"></a>
# **getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**
> Object getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, spaceId, authorization)

Get Relations

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceSchemaApi apiInstance = new InstanceSchemaApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceSchemaApi#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet");
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

<a id="getSchemaInstancesInstanceIdSchemaGet"></a>
# **getSchemaInstancesInstanceIdSchemaGet**
> Object getSchemaInstancesInstanceIdSchemaGet(instanceId, spaceId, authorization)

Get Schema

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceSchemaApi apiInstance = new InstanceSchemaApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getSchemaInstancesInstanceIdSchemaGet(instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceSchemaApi#getSchemaInstancesInstanceIdSchemaGet");
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

