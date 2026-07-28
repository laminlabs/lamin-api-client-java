# ServiceAccountsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost**](ServiceAccountsApi.md#createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost) | **POST** /service-accounts/{organization_id}/{handle}/api-keys | Create Service Account Api Key |
| [**createServiceAccountServiceAccountsPut**](ServiceAccountsApi.md#createServiceAccountServiceAccountsPut) | **PUT** /service-accounts | Create Service Account |
| [**deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete**](ServiceAccountsApi.md#deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete) | **DELETE** /service-accounts/{organization_id}/{handle}/api-keys/{api_key_id} | Delete Service Account Api Key |
| [**deleteServiceAccountServiceAccountsOrganizationIdHandleDelete**](ServiceAccountsApi.md#deleteServiceAccountServiceAccountsOrganizationIdHandleDelete) | **DELETE** /service-accounts/{organization_id}/{handle} | Delete Service Account |
| [**getServiceAccountServiceAccountsOrganizationIdHandleGet**](ServiceAccountsApi.md#getServiceAccountServiceAccountsOrganizationIdHandleGet) | **GET** /service-accounts/{organization_id}/{handle} | Get Service Account |
| [**listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet**](ServiceAccountsApi.md#listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet) | **GET** /service-accounts/{organization_id}/{handle}/api-keys | List Service Account Api Keys |
| [**listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet**](ServiceAccountsApi.md#listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet) | **GET** /service-accounts/organizations/{organization_id} | List Service Accounts By Organization |
| [**updateServiceAccountServiceAccountsOrganizationIdHandlePatch**](ServiceAccountsApi.md#updateServiceAccountServiceAccountsOrganizationIdHandlePatch) | **PATCH** /service-accounts/{organization_id}/{handle} | Update Service Account |


<a id="createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost"></a>
# **createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost**
> Object createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost(organizationId, handle, createServiceAccountApiKeyRequestBody)

Create Service Account Api Key

Create an API key for a service account.  **Permissions:** Requires organization manager or admin access.  **Notes:** The plaintext key is returned once.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    CreateServiceAccountApiKeyRequestBody createServiceAccountApiKeyRequestBody = new CreateServiceAccountApiKeyRequestBody(); // CreateServiceAccountApiKeyRequestBody | 
    try {
      Object result = apiInstance.createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost(organizationId, handle, createServiceAccountApiKeyRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |
| **createServiceAccountApiKeyRequestBody** | [**CreateServiceAccountApiKeyRequestBody**](CreateServiceAccountApiKeyRequestBody.md)|  | |

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
| **201** | API key created. |  -  |
| **422** | Validation Error |  -  |

<a id="createServiceAccountServiceAccountsPut"></a>
# **createServiceAccountServiceAccountsPut**
> Object createServiceAccountServiceAccountsPut(createServiceAccountRequestBody)

Create Service Account

Create a service account in an organization.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    CreateServiceAccountRequestBody createServiceAccountRequestBody = new CreateServiceAccountRequestBody(); // CreateServiceAccountRequestBody | 
    try {
      Object result = apiInstance.createServiceAccountServiceAccountsPut(createServiceAccountRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#createServiceAccountServiceAccountsPut");
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
| **createServiceAccountRequestBody** | [**CreateServiceAccountRequestBody**](CreateServiceAccountRequestBody.md)|  | |

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
| **201** | Service account created. |  -  |
| **422** | Validation Error |  -  |

<a id="deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete"></a>
# **deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete**
> Object deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete(organizationId, handle, apiKeyId)

Delete Service Account Api Key

Delete an API key for a service account.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    Integer apiKeyId = 56; // Integer | API key ID.
    try {
      Object result = apiInstance.deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete(organizationId, handle, apiKeyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |
| **apiKeyId** | **Integer**| API key ID. | |

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

<a id="deleteServiceAccountServiceAccountsOrganizationIdHandleDelete"></a>
# **deleteServiceAccountServiceAccountsOrganizationIdHandleDelete**
> Object deleteServiceAccountServiceAccountsOrganizationIdHandleDelete(organizationId, handle)

Delete Service Account

Delete a service account.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    try {
      Object result = apiInstance.deleteServiceAccountServiceAccountsOrganizationIdHandleDelete(organizationId, handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#deleteServiceAccountServiceAccountsOrganizationIdHandleDelete");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |

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

<a id="getServiceAccountServiceAccountsOrganizationIdHandleGet"></a>
# **getServiceAccountServiceAccountsOrganizationIdHandleGet**
> Object getServiceAccountServiceAccountsOrganizationIdHandleGet(organizationId, handle)

Get Service Account

Return a service account by handle.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    try {
      Object result = apiInstance.getServiceAccountServiceAccountsOrganizationIdHandleGet(organizationId, handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#getServiceAccountServiceAccountsOrganizationIdHandleGet");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |

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

<a id="listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet"></a>
# **listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet**
> Object listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet(organizationId, handle)

List Service Account Api Keys

List API keys for a service account.  **Permissions:** Requires organization manager or admin access.  **Notes:** Plaintext keys are not returned.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    try {
      Object result = apiInstance.listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet(organizationId, handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |

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

<a id="listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet"></a>
# **listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet**
> Object listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet(organizationId)

List Service Accounts By Organization

List service accounts in an organization.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    try {
      Object result = apiInstance.listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet");
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
| **organizationId** | **UUID**| Organization UUID. | |

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

<a id="updateServiceAccountServiceAccountsOrganizationIdHandlePatch"></a>
# **updateServiceAccountServiceAccountsOrganizationIdHandlePatch**
> Object updateServiceAccountServiceAccountsOrganizationIdHandlePatch(organizationId, handle, updateServiceAccountRequestBody)

Update Service Account

Update a service account.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String handle = "handle_example"; // String | Account or service-account handle.
    UpdateServiceAccountRequestBody updateServiceAccountRequestBody = new UpdateServiceAccountRequestBody(); // UpdateServiceAccountRequestBody | 
    try {
      Object result = apiInstance.updateServiceAccountServiceAccountsOrganizationIdHandlePatch(organizationId, handle, updateServiceAccountRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceAccountsApi#updateServiceAccountServiceAccountsOrganizationIdHandlePatch");
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
| **organizationId** | **UUID**| Organization UUID. | |
| **handle** | **String**| Account or service-account handle. | |
| **updateServiceAccountRequestBody** | [**UpdateServiceAccountRequestBody**](UpdateServiceAccountRequestBody.md)|  | |

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

