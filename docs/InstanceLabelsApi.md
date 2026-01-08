# InstanceLabelsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**](InstanceLabelsApi.md#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Attach Label |
| [**detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**](InstanceLabelsApi.md#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Detach Label |


<a id="attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut"></a>
# **attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**
> Object attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, authorization)

Attach Label

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceLabelsApi apiInstance = new InstanceLabelsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "artifact"; // String | 
    Integer id = 56; // Integer | 
    String labelField = "labelField_example"; // String | 
    Integer labelId = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceLabelsApi#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut");
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
| **modelName** | **String**|  | [enum: artifact, transform, collection] |
| **id** | **Integer**|  | |
| **labelField** | **String**|  | |
| **labelId** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
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

<a id="detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete"></a>
# **detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**
> Object detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, authorization)

Detach Label

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceLabelsApi apiInstance = new InstanceLabelsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "artifact"; // String | 
    Integer id = 56; // Integer | 
    String labelField = "labelField_example"; // String | 
    Integer labelId = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceLabelsApi#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete");
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
| **modelName** | **String**|  | [enum: artifact, transform, collection] |
| **id** | **Integer**|  | |
| **labelField** | **String**|  | |
| **labelId** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
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

