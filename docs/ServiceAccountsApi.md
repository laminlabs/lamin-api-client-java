# ServiceAccountsApi

All URIs are relative to */api*

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
> Object createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost(organizationId, handle, createServiceAccountApiKeyRequestBody, authorization)

Create Service Account Api Key

Create an API key for a service account.  The plaintext key is returned once only — store it immediately.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account - **body**: Request body   - **expires_at**: Expiry datetime for the API key   - **description**: Optional description  Returns: - **201**: API key created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    CreateServiceAccountApiKeyRequestBody createServiceAccountApiKeyRequestBody = new CreateServiceAccountApiKeyRequestBody(); // CreateServiceAccountApiKeyRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysPost(organizationId, handle, createServiceAccountApiKeyRequestBody, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
| **createServiceAccountApiKeyRequestBody** | [**CreateServiceAccountApiKeyRequestBody**](CreateServiceAccountApiKeyRequestBody.md)|  | |
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

<a id="createServiceAccountServiceAccountsPut"></a>
# **createServiceAccountServiceAccountsPut**
> Object createServiceAccountServiceAccountsPut(createServiceAccountRequestBody, authorization)

Create Service Account

Create a service account under an organization.  Parameters: - **body**: Request body containing service account details   - **handle**: Unique handle for the service account   - **organization_id**: UUID of the owning organization (caller must be admin/manager)   - **name**: Optional display name  Returns: - **201**: Service account created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    CreateServiceAccountRequestBody createServiceAccountRequestBody = new CreateServiceAccountRequestBody(); // CreateServiceAccountRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createServiceAccountServiceAccountsPut(createServiceAccountRequestBody, authorization);
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

<a id="deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete"></a>
# **deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete**
> Object deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete(organizationId, handle, apiKeyId, authorization)

Delete Service Account Api Key

Revoke an API key for a service account.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account - **api_key_id**: ID of the API key to revoke  Returns: - **200**: API key revoked successfully - **404**: API key not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    Integer apiKeyId = 56; // Integer | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteServiceAccountApiKeyServiceAccountsOrganizationIdHandleApiKeysApiKeyIdDelete(organizationId, handle, apiKeyId, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
| **apiKeyId** | **Integer**|  | |
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

<a id="deleteServiceAccountServiceAccountsOrganizationIdHandleDelete"></a>
# **deleteServiceAccountServiceAccountsOrganizationIdHandleDelete**
> Object deleteServiceAccountServiceAccountsOrganizationIdHandleDelete(organizationId, handle, authorization)

Delete Service Account

Delete a service account.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account  Returns: - **200**: Service account deleted successfully - **404**: Service account not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteServiceAccountServiceAccountsOrganizationIdHandleDelete(organizationId, handle, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
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

<a id="getServiceAccountServiceAccountsOrganizationIdHandleGet"></a>
# **getServiceAccountServiceAccountsOrganizationIdHandleGet**
> Object getServiceAccountServiceAccountsOrganizationIdHandleGet(organizationId, handle, authorization)

Get Service Account

Get details of a specific service account by organization and handle.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account  Returns: - **200**: Service account details retrieved successfully - **404**: Service account not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getServiceAccountServiceAccountsOrganizationIdHandleGet(organizationId, handle, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
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

<a id="listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet"></a>
# **listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet**
> Object listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet(organizationId, handle, authorization)

List Service Account Api Keys

List API key metadata for a service account.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account  Returns: - **200**: API key list retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listServiceAccountApiKeysServiceAccountsOrganizationIdHandleApiKeysGet(organizationId, handle, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
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

<a id="listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet"></a>
# **listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet**
> Object listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet(organizationId, authorization)

List Service Accounts By Organization

List all service accounts for an organization.  Parameters: - **organization_id**: UUID of the organization  Returns: - **200**: List of service accounts retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listServiceAccountsByOrganizationServiceAccountsOrganizationsOrganizationIdGet(organizationId, authorization);
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
| **organizationId** | **UUID**|  | |
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

<a id="updateServiceAccountServiceAccountsOrganizationIdHandlePatch"></a>
# **updateServiceAccountServiceAccountsOrganizationIdHandlePatch**
> Object updateServiceAccountServiceAccountsOrganizationIdHandlePatch(organizationId, handle, updateServiceAccountRequestBody, authorization)

Update Service Account

Update a service account&#39;s details.  Parameters: - **organization_id**: UUID of the owning organization - **handle**: Handle of the service account - **body**: Request body containing updated details   - **name**: Optional new display name  Returns: - **200**: Service account updated successfully - **404**: Service account not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.ServiceAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String handle = "handle_example"; // String | 
    UpdateServiceAccountRequestBody updateServiceAccountRequestBody = new UpdateServiceAccountRequestBody(); // UpdateServiceAccountRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateServiceAccountServiceAccountsOrganizationIdHandlePatch(organizationId, handle, updateServiceAccountRequestBody, authorization);
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
| **organizationId** | **UUID**|  | |
| **handle** | **String**|  | |
| **updateServiceAccountRequestBody** | [**UpdateServiceAccountRequestBody**](UpdateServiceAccountRequestBody.md)|  | |
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

