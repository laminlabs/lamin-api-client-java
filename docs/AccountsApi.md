# AccountsApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCallerAccountAccountGet**](AccountsApi.md#getCallerAccountAccountGet) | **GET** /account | Get Caller Account |
| [**getCentralJwtAccountJwtPost**](AccountsApi.md#getCentralJwtAccountJwtPost) | **POST** /account/jwt | Get Central Jwt |


<a id="getCallerAccountAccountGet"></a>
# **getCallerAccountAccountGet**
> Object getCallerAccountAccountGet(authorization)

Get Caller Account

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getCallerAccountAccountGet(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCallerAccountAccountGet");
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

<a id="getCentralJwtAccountJwtPost"></a>
# **getCentralJwtAccountJwtPost**
> Object getCentralJwtAccountJwtPost(apiKeyExchangeRequest)

Get Central Jwt

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    ApiKeyExchangeRequest apiKeyExchangeRequest = new ApiKeyExchangeRequest(); // ApiKeyExchangeRequest | 
    try {
      Object result = apiInstance.getCentralJwtAccountJwtPost(apiKeyExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCentralJwtAccountJwtPost");
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
| **apiKeyExchangeRequest** | [**ApiKeyExchangeRequest**](ApiKeyExchangeRequest.md)|  | |

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

