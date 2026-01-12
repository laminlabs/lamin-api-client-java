# InstanceArtifactsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createArtifactInstancesInstanceIdArtifactsCreatePost**](InstanceArtifactsApi.md#createArtifactInstancesInstanceIdArtifactsCreatePost) | **POST** /instances/{instance_id}/artifacts/create | Create Artifact |
| [**uploadArtifactInstancesInstanceIdArtifactsUploadPost**](InstanceArtifactsApi.md#uploadArtifactInstancesInstanceIdArtifactsUploadPost) | **POST** /instances/{instance_id}/artifacts/upload | Upload Artifact |


<a id="createArtifactInstancesInstanceIdArtifactsCreatePost"></a>
# **createArtifactInstancesInstanceIdArtifactsCreatePost**
> Object createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, authorization)

Create Artifact

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateArtifactRequestBody createArtifactRequestBody = new CreateArtifactRequestBody(); // CreateArtifactRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceArtifactsApi#createArtifactInstancesInstanceIdArtifactsCreatePost");
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
| **createArtifactRequestBody** | [**CreateArtifactRequestBody**](CreateArtifactRequestBody.md)|  | |
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

<a id="uploadArtifactInstancesInstanceIdArtifactsUploadPost"></a>
# **uploadArtifactInstancesInstanceIdArtifactsUploadPost**
> Object uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, authorization, kwargs)

Upload Artifact

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    String authorization = "authorization_example"; // String | 
    String kwargs = "kwargs_example"; // String | 
    try {
      Object result = apiInstance.uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, authorization, kwargs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceArtifactsApi#uploadArtifactInstancesInstanceIdArtifactsUploadPost");
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
| **_file** | **File**|  | |
| **authorization** | **String**|  | [optional] |
| **kwargs** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

