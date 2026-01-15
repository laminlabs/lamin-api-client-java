# OrganizationsApi

All URIs are relative to *https://staging.laminhub.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut**](OrganizationsApi.md#addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut) | **PUT** /organizations/{organization_id}/members/{account_id} | Add Organization Member |
| [**getOrganizationOrganizationsOrganizationIdGet**](OrganizationsApi.md#getOrganizationOrganizationsOrganizationIdGet) | **GET** /organizations/{organization_id} | Get Organization |
| [**listOrganizationMembersOrganizationsOrganizationIdMembersGet**](OrganizationsApi.md#listOrganizationMembersOrganizationsOrganizationIdMembersGet) | **GET** /organizations/{organization_id}/members | List Organization Members |
| [**removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete**](OrganizationsApi.md#removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete) | **DELETE** /organizations/{organization_id}/members/{account_id} | Remove Organization Member |
| [**updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch**](OrganizationsApi.md#updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch) | **PATCH** /organizations/{organization_id}/members/{account_id} | Update Organization Member |


<a id="addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut"></a>
# **addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut**
> Object addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody, authorization)

Add Organization Member

Add a member to an organization.  Parameters: - **organization_id**: UUID of the organization to add the member to - **account_id**: UUID of the account to add as a member - **body**: Request body containing member details   - **role**: Role of the member in the organization  Returns: - **201**: Organization member added successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    AddOrganizationMemberRequestBody addOrganizationMemberRequestBody = new AddOrganizationMemberRequestBody(); // AddOrganizationMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut");
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
| **accountId** | **UUID**|  | |
| **addOrganizationMemberRequestBody** | [**AddOrganizationMemberRequestBody**](AddOrganizationMemberRequestBody.md)|  | |
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

<a id="getOrganizationOrganizationsOrganizationIdGet"></a>
# **getOrganizationOrganizationsOrganizationIdGet**
> Object getOrganizationOrganizationsOrganizationIdGet(organizationId, authorization)

Get Organization

Get details of a specific organization.  Parameters: - **organization_id**: UUID of the organization to retrieve  Returns: - **200**: Organization details retrieved successfully - **404**: Organization not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getOrganizationOrganizationsOrganizationIdGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getOrganizationOrganizationsOrganizationIdGet");
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

<a id="listOrganizationMembersOrganizationsOrganizationIdMembersGet"></a>
# **listOrganizationMembersOrganizationsOrganizationIdMembersGet**
> Object listOrganizationMembersOrganizationsOrganizationIdMembersGet(organizationId, authorization)

List Organization Members

List all members of an organization.  Parameters: - **organization_id**: UUID of the organization to list members for  Returns: - **200**: List of organization members retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationMembersOrganizationsOrganizationIdMembersGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#listOrganizationMembersOrganizationsOrganizationIdMembersGet");
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

<a id="removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete"></a>
# **removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete**
> Object removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId, authorization)

Remove Organization Member

Remove a member from an organization.  Parameters: - **organization_id**: UUID of the organization to remove the member from - **account_id**: UUID of the account to remove from the organization  Returns: - **200**: Organization member removed successfully - **404**: Member not found in organization

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete");
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
| **accountId** | **UUID**|  | |
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

<a id="updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch"></a>
# **updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch**
> Object updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody, authorization)

Update Organization Member

Update an organization member&#39;s details.  Parameters: - **organization_id**: UUID of the organization the member belongs to - **account_id**: UUID of the account to update - **body**: Request body containing updated member details   - **role**: Role of the member in the organization  Returns: - **200**: Organization member updated successfully - **404**: Member not found in organization

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UpdateOrganizationMemberRequestBody updateOrganizationMemberRequestBody = new UpdateOrganizationMemberRequestBody(); // UpdateOrganizationMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch");
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
| **accountId** | **UUID**|  | |
| **updateOrganizationMemberRequestBody** | [**UpdateOrganizationMemberRequestBody**](UpdateOrganizationMemberRequestBody.md)|  | |
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

