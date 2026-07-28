# SecretsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSecretSecretsOrganizationIdNameDelete**](SecretsApi.md#deleteSecretSecretsOrganizationIdNameDelete) | **DELETE** /secrets/{organization_id}/{name} | Delete Secret |
| [**getSecretSecretsOrganizationIdNameGet**](SecretsApi.md#getSecretSecretsOrganizationIdNameGet) | **GET** /secrets/{organization_id}/{name} | Get Secret |
| [**setSecretSecretsOrganizationIdNamePut**](SecretsApi.md#setSecretSecretsOrganizationIdNamePut) | **PUT** /secrets/{organization_id}/{name} | Set Secret |


<a id="deleteSecretSecretsOrganizationIdNameDelete"></a>
# **deleteSecretSecretsOrganizationIdNameDelete**
> Object deleteSecretSecretsOrganizationIdNameDelete(organizationId, name)

Delete Secret

Delete a secret by name.  **Permissions:** Requires organization admin access.  **Notes:** Deletes the stored secret and its metadata.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String name = "name_example"; // String | Secret name.
    try {
      Object result = apiInstance.deleteSecretSecretsOrganizationIdNameDelete(organizationId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#deleteSecretSecretsOrganizationIdNameDelete");
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
| **name** | **String**| Secret name. | |

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

<a id="getSecretSecretsOrganizationIdNameGet"></a>
# **getSecretSecretsOrganizationIdNameGet**
> Object getSecretSecretsOrganizationIdNameGet(organizationId, name)

Get Secret

Return a secret value by name.  **Permissions:** Requires organization admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String name = "name_example"; // String | Secret name.
    try {
      Object result = apiInstance.getSecretSecretsOrganizationIdNameGet(organizationId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#getSecretSecretsOrganizationIdNameGet");
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
| **name** | **String**| Secret name. | |

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

<a id="setSecretSecretsOrganizationIdNamePut"></a>
# **setSecretSecretsOrganizationIdNamePut**
> Object setSecretSecretsOrganizationIdNamePut(organizationId, name, setSecretRequestBody)

Set Secret

Set a secret value by name.  **Permissions:** Requires organization admin access.  **Notes:** Creates the secret when it does not exist.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SecretsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SecretsApi apiInstance = new SecretsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    String name = "name_example"; // String | Secret name.
    SetSecretRequestBody setSecretRequestBody = new SetSecretRequestBody(); // SetSecretRequestBody | 
    try {
      Object result = apiInstance.setSecretSecretsOrganizationIdNamePut(organizationId, name, setSecretRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecretsApi#setSecretSecretsOrganizationIdNamePut");
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
| **name** | **String**| Secret name. | |
| **setSecretRequestBody** | [**SetSecretRequestBody**](SetSecretRequestBody.md)|  | |

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

