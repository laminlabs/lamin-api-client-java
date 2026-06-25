# InstanceArtifactsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createArtifactInstancesInstanceIdArtifactsCreatePost**](InstanceArtifactsApi.md#createArtifactInstancesInstanceIdArtifactsCreatePost) | **POST** /instances/{instance_id}/artifacts/create | Create Artifact |
| [**createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost**](InstanceArtifactsApi.md#createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost) | **POST** /instances/{instance_id}/artifacts/create-sql | Create Artifact Sql |
| [**getArtifactByPathInstancesInstanceIdArtifactsByPathGet**](InstanceArtifactsApi.md#getArtifactByPathInstancesInstanceIdArtifactsByPathGet) | **GET** /instances/{instance_id}/artifacts/by-path | Get Artifact By Path |
| [**uploadArtifactInstancesInstanceIdArtifactsUploadPost**](InstanceArtifactsApi.md#uploadArtifactInstancesInstanceIdArtifactsUploadPost) | **POST** /instances/{instance_id}/artifacts/upload | Upload Artifact |


<a id="createArtifactInstancesInstanceIdArtifactsCreatePost"></a>
# **createArtifactInstancesInstanceIdArtifactsCreatePost**
> Object createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, spaceId, authorization)

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateArtifactRequestBody createArtifactRequestBody = new CreateArtifactRequestBody(); // CreateArtifactRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, spaceId, authorization);
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

<a id="createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost"></a>
# **createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost**
> Object createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost(instanceId, createArtifactRequestBody, spaceId, authorization)

Create Artifact Sql

Register an Artifact for an existing storage path via direct SQL.  Unlike &#x60;&#x60;/create&#x60;&#x60; (which invokes a lambda running lamindb), this resolves the path&#39;s S3 metadata and inserts the artifact row straight into the instance DB.

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateArtifactRequestBody createArtifactRequestBody = new CreateArtifactRequestBody(); // CreateArtifactRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost(instanceId, createArtifactRequestBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceArtifactsApi#createArtifactSqlInstancesInstanceIdArtifactsCreateSqlPost");
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

<a id="getArtifactByPathInstancesInstanceIdArtifactsByPathGet"></a>
# **getArtifactByPathInstancesInstanceIdArtifactsByPathGet**
> Object getArtifactByPathInstancesInstanceIdArtifactsByPathGet(instanceId, path, spaceId, authorization)

Get Artifact By Path

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String path = "path_example"; // String | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getArtifactByPathInstancesInstanceIdArtifactsByPathGet(instanceId, path, spaceId, authorization);
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
| **instanceId** | **UUID**|  | |
| **path** | **String**|  | |
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

<a id="uploadArtifactInstancesInstanceIdArtifactsUploadPost"></a>
# **uploadArtifactInstancesInstanceIdArtifactsUploadPost**
> Object uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, spaceId, authorization, kwargs)

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstanceArtifactsApi apiInstance = new InstanceArtifactsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    String kwargs = "kwargs_example"; // String | 
    try {
      Object result = apiInstance.uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, spaceId, authorization, kwargs);
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
| **spaceId** | **UUID**|  | [optional] |
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

