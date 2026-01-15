# StoragesApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**grantS3PermissionsStoragesS3BucketNamePermissionsPut**](StoragesApi.md#grantS3PermissionsStoragesS3BucketNamePermissionsPut) | **PUT** /storages/s3/{bucket_name}/permissions | Grant S3 Permissions |


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
    defaultClient.setBasePath("https://staging.laminhub.com/api");

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

