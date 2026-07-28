# AccountsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeApiKeyForAccessToken**](AccountsApi.md#exchangeApiKeyForAccessToken) | **POST** /account/jwt | Exchange API Key for Access Token |
| [**exchangeExternalJwtForAccessToken**](AccountsApi.md#exchangeExternalJwtForAccessToken) | **POST** /account/jwt/exchange | Exchange External JWT for Access Token |
| [**getCallerAccountAccountGet**](AccountsApi.md#getCallerAccountAccountGet) | **GET** /account | Get Caller Account |


<a id="exchangeApiKeyForAccessToken"></a>
# **exchangeApiKeyForAccessToken**
> Map&lt;String, Object&gt; exchangeApiKeyForAccessToken(apiKeyExchangeRequest)

Exchange API Key for Access Token

Exchange a Lamin API key for an access token.  **Permissions:** Requires a valid Lamin API key.

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    ApiKeyExchangeRequest apiKeyExchangeRequest = new ApiKeyExchangeRequest(); // ApiKeyExchangeRequest | 
    try {
      Map<String, Object> result = apiInstance.exchangeApiKeyForAccessToken(apiKeyExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#exchangeApiKeyForAccessToken");
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

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access token exchange response. |  -  |
| **422** | Validation Error |  -  |

<a id="exchangeExternalJwtForAccessToken"></a>
# **exchangeExternalJwtForAccessToken**
> Map&lt;String, Object&gt; exchangeExternalJwtForAccessToken(externalJwtExchangeRequest)

Exchange External JWT for Access Token

Exchange an external IdP JWT for a Lamin access token.  The external token is verified against the app&#39;s JWKS and mapped to a Lamin account by email. The external token itself is the credential.  **Permissions:** Requires a valid JWT issued by the configured external app.

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
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    ExternalJwtExchangeRequest externalJwtExchangeRequest = new ExternalJwtExchangeRequest(); // ExternalJwtExchangeRequest | 
    try {
      Map<String, Object> result = apiInstance.exchangeExternalJwtForAccessToken(externalJwtExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#exchangeExternalJwtForAccessToken");
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
| **externalJwtExchangeRequest** | [**ExternalJwtExchangeRequest**](ExternalJwtExchangeRequest.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Access token exchange response. |  -  |
| **422** | Validation Error |  -  |

<a id="getCallerAccountAccountGet"></a>
# **getCallerAccountAccountGet**
> Account getCallerAccountAccountGet()

Get Caller Account

Return the authenticated caller account when a token is provided.  **Permissions:** No authentication required. Unauthenticated requests return null.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      Account result = apiInstance.getCallerAccountAccountGet();
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
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[LaminAccessToken](../README.md#LaminAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Caller account, or null if unauthenticated. |  -  |

