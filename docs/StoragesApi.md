# StoragesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCloudAccessStoragesCredentialsPost**](StoragesApi.md#getCloudAccessStoragesCredentialsPost) | **POST** /storages/credentials | Get Cloud Access |
| [**getS3FileStoragesS3FullPathGet**](StoragesApi.md#getS3FileStoragesS3FullPathGet) | **GET** /storages/s3/{full_path} | Get S3 File |


<a id="getCloudAccessStoragesCredentialsPost"></a>
# **getCloudAccessStoragesCredentialsPost**
> StorageCredentialsResponse getCloudAccessStoragesCredentialsPost(cloudAccessRequest)

Get Cloud Access

Return scoped AWS credentials for storage the caller can access.  **Permissions:** Requires access to the requested storage path.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.StoragesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    StoragesApi apiInstance = new StoragesApi(defaultClient);
    CloudAccessRequest cloudAccessRequest = new CloudAccessRequest(); // CloudAccessRequest | 
    try {
      StorageCredentialsResponse result = apiInstance.getCloudAccessStoragesCredentialsPost(cloudAccessRequest);
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

### Return type

[**StorageCredentialsResponse**](StorageCredentialsResponse.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scoped AWS credentials for the requested path. |  -  |
| **422** | Validation Error |  -  |

<a id="getS3FileStoragesS3FullPathGet"></a>
# **getS3FileStoragesS3FullPathGet**
> Object getS3FileStoragesS3FullPathGet(fullPath)

Get S3 File

Stream managed S3 objects.  **Permissions:** Requires access to the managed storage object.  **Notes:** Supports Range requests.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.StoragesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    StoragesApi apiInstance = new StoragesApi(defaultClient);
    String fullPath = "fullPath_example"; // String | S3 object path in '<bucket>/<key>' format.
    try {
      Object result = apiInstance.getS3FileStoragesS3FullPathGet(fullPath);
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
| **fullPath** | **String**| S3 object path in &#39;&lt;bucket&gt;/&lt;key&gt;&#39; format. | |

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
| **200** | S3 object stream. |  -  |
| **206** | Partial S3 object stream for a Range request. |  -  |
| **404** | Object or managed storage not found. |  -  |
| **416** | Requested Range Not Satisfiable. |  -  |
| **422** | Validation Error |  -  |

