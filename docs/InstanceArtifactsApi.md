# InstanceArtifactsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createArtifactInstancesInstanceIdArtifactsCreatePost**](InstanceArtifactsApi.md#createArtifactInstancesInstanceIdArtifactsCreatePost) | **POST** /instances/{instance_id}/artifacts/create | Create Artifact |
| [**getArtifactByPathInstancesInstanceIdArtifactsByPathGet**](InstanceArtifactsApi.md#getArtifactByPathInstancesInstanceIdArtifactsByPathGet) | **GET** /instances/{instance_id}/artifacts/by-path | Get Artifact By Path |
| [**uploadArtifactInstancesInstanceIdArtifactsUploadPost**](InstanceArtifactsApi.md#uploadArtifactInstancesInstanceIdArtifactsUploadPost) | **POST** /instances/{instance_id}/artifacts/upload | Upload Artifact |


<a id="createArtifactInstancesInstanceIdArtifactsCreatePost"></a>
# **createArtifactInstancesInstanceIdArtifactsCreatePost**
> Object createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, spaceId)

Create Artifact

Create an artifact from an existing storage path.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    CreateArtifactRequestBody createArtifactRequestBody = new CreateArtifactRequestBody(); // CreateArtifactRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **createArtifactRequestBody** | [**CreateArtifactRequestBody**](CreateArtifactRequestBody.md)|  | |
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

<a id="getArtifactByPathInstancesInstanceIdArtifactsByPathGet"></a>
# **getArtifactByPathInstancesInstanceIdArtifactsByPathGet**
> Object getArtifactByPathInstancesInstanceIdArtifactsByPathGet(instanceId, path, spaceId)

Get Artifact By Path

Return artifact metadata for a storage path.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    String path = "path_example"; // String | Artifact storage path.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.getArtifactByPathInstancesInstanceIdArtifactsByPathGet(instanceId, path, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceArtifactsApi#getArtifactByPathInstancesInstanceIdArtifactsByPathGet");
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
| **path** | **String**| Artifact storage path. | |
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

<a id="uploadArtifactInstancesInstanceIdArtifactsUploadPost"></a>
# **uploadArtifactInstancesInstanceIdArtifactsUploadPost**
> Object uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, spaceId, kwargs)

Upload Artifact

Upload a file and register it as an artifact.  **Permissions:** Requires write access to the target instance or space.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceArtifactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    File _file = new File("/path/to/file"); // File | Artifact file to upload.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    String kwargs = "kwargs_example"; // String | JSON object string with additional upload arguments.
    try {
      Object result = apiInstance.uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, spaceId, kwargs);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **_file** | **File**| Artifact file to upload. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |
| **kwargs** | **String**| JSON object string with additional upload arguments. | [optional] |

### Return type

**Object**

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

