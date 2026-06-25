# DbServerApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkDbServerAccessDbServerCheckAccessPost**](DbServerApi.md#checkDbServerAccessDbServerCheckAccessPost) | **POST** /db/server/check-access | Check Db Server Access |
| [**registerDbServerDbServerRegisterPost**](DbServerApi.md#registerDbServerDbServerRegisterPost) | **POST** /db/server/register | Register Db Server |


<a id="checkDbServerAccessDbServerCheckAccessPost"></a>
# **checkDbServerAccessDbServerCheckAccessPost**
> Object checkDbServerAccessDbServerCheckAccessPost(name, authorization)

Check Db Server Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DbServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DbServerApi apiInstance = new DbServerApi(defaultClient);
    String name = "name_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.checkDbServerAccessDbServerCheckAccessPost(name, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbServerApi#checkDbServerAccessDbServerCheckAccessPost");
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
| **name** | **String**|  | |
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

<a id="registerDbServerDbServerRegisterPost"></a>
# **registerDbServerDbServerRegisterPost**
> Object registerDbServerDbServerRegisterPost(registerDbServerBody, authorization)

Register Db Server

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DbServerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DbServerApi apiInstance = new DbServerApi(defaultClient);
    RegisterDbServerBody registerDbServerBody = new RegisterDbServerBody(); // RegisterDbServerBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.registerDbServerDbServerRegisterPost(registerDbServerBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DbServerApi#registerDbServerDbServerRegisterPost");
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
| **registerDbServerBody** | [**RegisterDbServerBody**](RegisterDbServerBody.md)|  | |
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

