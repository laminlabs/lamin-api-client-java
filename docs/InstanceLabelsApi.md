# InstanceLabelsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**](InstanceLabelsApi.md#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Attach Label |
| [**detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**](InstanceLabelsApi.md#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Detach Label |


<a id="attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut"></a>
# **attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**
> Object attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, spaceId)

Attach Label

Attach a label to a record.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Attaching an already-linked label succeeds.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceLabelsApi apiInstance = new InstanceLabelsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "artifact"; // String | Model that owns the label link.
    Integer id = 56; // Integer | Record ID.
    String labelField = "labelField_example"; // String | Label relationship field.
    Integer labelId = 56; // Integer | Label record ID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model that owns the label link. | [enum: artifact, transform, collection] |
| **id** | **Integer**| Record ID. | |
| **labelField** | **String**| Label relationship field. | |
| **labelId** | **Integer**| Label record ID. | |
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

<a id="detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete"></a>
# **detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**
> Object detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, spaceId)

Detach Label

Detach a label from a record.  **Permissions:** Requires write access to the target instance or space.  **Notes:** Removing a missing label link does not fail.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceLabelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceLabelsApi apiInstance = new InstanceLabelsApi(defaultClient);
    String moduleName = "moduleName_example"; // String | Schema module name.
    String modelName = "artifact"; // String | Model that owns the label link.
    Integer id = 56; // Integer | Record ID.
    String labelField = "labelField_example"; // String | Label relationship field.
    Integer labelId = 56; // Integer | Label record ID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, spaceId);
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
| **moduleName** | **String**| Schema module name. | |
| **modelName** | **String**| Model that owns the label link. | [enum: artifact, transform, collection] |
| **id** | **Integer**| Record ID. | |
| **labelField** | **String**| Label relationship field. | |
| **labelId** | **Integer**| Label record ID. | |
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

