# StoragesApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCloudAccessStoragesCredentialsPost**](StoragesApi.md#getCloudAccessStoragesCredentialsPost) | **POST** /storages/credentials | Get Cloud Access |
| [**getS3FileStoragesS3FullPathGet**](StoragesApi.md#getS3FileStoragesS3FullPathGet) | **GET** /storages/s3/{full_path} | Get S3 File |
| [**grantS3PermissionsStoragesS3BucketNamePermissionsPut**](StoragesApi.md#grantS3PermissionsStoragesS3BucketNamePermissionsPut) | **PUT** /storages/s3/{bucket_name}/permissions | Grant S3 Permissions |


<a id="getCloudAccessStoragesCredentialsPost"></a>
# **getCloudAccessStoragesCredentialsPost**
> Object getCloudAccessStoragesCredentialsPost(cloudAccessRequest, authorization)

Get Cloud Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.StoragesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    StoragesApi apiInstance = new StoragesApi(defaultClient);
    CloudAccessRequest cloudAccessRequest = new CloudAccessRequest(); // CloudAccessRequest | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getCloudAccessStoragesCredentialsPost(cloudAccessRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesApi#getCloudAccessStoragesCredentialsPost");
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
| **cloudAccessRequest** | [**CloudAccessRequest**](CloudAccessRequest.md)|  | |
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

<a id="getS3FileStoragesS3FullPathGet"></a>
# **getS3FileStoragesS3FullPathGet**
> Object getS3FileStoragesS3FullPathGet(fullPath, authorization)

Get S3 File

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.StoragesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    StoragesApi apiInstance = new StoragesApi(defaultClient);
    String fullPath = "fullPath_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getS3FileStoragesS3FullPathGet(fullPath, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesApi#getS3FileStoragesS3FullPathGet");
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
| **fullPath** | **String**|  | |
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

<a id="grantS3PermissionsStoragesS3BucketNamePermissionsPut"></a>
# **grantS3PermissionsStoragesS3BucketNamePermissionsPut**
> Object grantS3PermissionsStoragesS3BucketNamePermissionsPut(bucketName, s3PermissionsRequest, awsAccountId, awsUserName, authorization)

Grant S3 Permissions

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.StoragesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    StoragesApi apiInstance = new StoragesApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    S3PermissionsRequest s3PermissionsRequest = new S3PermissionsRequest(); // S3PermissionsRequest | 
    String awsAccountId = "767398070972"; // String | 
    String awsUserName = "lamin-manager"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.grantS3PermissionsStoragesS3BucketNamePermissionsPut(bucketName, s3PermissionsRequest, awsAccountId, awsUserName, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StoragesApi#grantS3PermissionsStoragesS3BucketNamePermissionsPut");
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
| **bucketName** | **String**|  | |
| **s3PermissionsRequest** | [**S3PermissionsRequest**](S3PermissionsRequest.md)|  | |
| **awsAccountId** | **String**|  | [optional] [default to 767398070972] |
| **awsUserName** | **String**|  | [optional] [default to lamin-manager] |
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

