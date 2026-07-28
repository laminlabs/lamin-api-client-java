# InstanceSchemaApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**](InstanceSchemaApi.md#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet) | **GET** /instances/{instance_id}/schema/{module_name}/{model_name} | Get Relations |
| [**getSchemaInstancesInstanceIdSchemaGet**](InstanceSchemaApi.md#getSchemaInstancesInstanceIdSchemaGet) | **GET** /instances/{instance_id}/schema | Get Schema |


<a id="getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet"></a>
# **getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**
> Object getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, spaceId)

Get Relations

Return related models for a schema model.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceSchemaApi apiInstance = new InstanceSchemaApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "modelName_example"; // String | Model name within the schema module.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model name within the schema module. | |
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

**Object**

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

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
> Object getSchemaInstancesInstanceIdSchemaGet(instanceId, spaceId)

Get Schema

Return the instance schema JSON.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceSchemaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceSchemaApi apiInstance = new InstanceSchemaApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getSchemaInstancesInstanceIdSchemaGet(instanceId, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

### Return type

**Object**

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

