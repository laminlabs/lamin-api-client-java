# OrganizationsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut**](OrganizationsApi.md#addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut) | **PUT** /organizations/{organization_id}/members/{account_id} | Add Organization Member |
| [**createOrganizationOrganizationsPut**](OrganizationsApi.md#createOrganizationOrganizationsPut) | **PUT** /organizations | Create Organization |
| [**getOrganizationOrganizationsOrganizationIdGet**](OrganizationsApi.md#getOrganizationOrganizationsOrganizationIdGet) | **GET** /organizations/{organization_id} | Get Organization |
| [**listOrganizationMembersOrganizationsOrganizationIdMembersGet**](OrganizationsApi.md#listOrganizationMembersOrganizationsOrganizationIdMembersGet) | **GET** /organizations/{organization_id}/members | List Organization Members |
| [**removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete**](OrganizationsApi.md#removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete) | **DELETE** /organizations/{organization_id}/members/{account_id} | Remove Organization Member |
| [**updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch**](OrganizationsApi.md#updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch) | **PATCH** /organizations/{organization_id}/members/{account_id} | Update Organization Member |


<a id="addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut"></a>
# **addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut**
> Object addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody)

Add Organization Member

Add an account to an organization.  **Permissions:** Requires organization manager or admin access. Only organization admins can add admin members.  **Quota:** Non-guest members count against the organization&#39;s member quota.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    AddOrganizationMemberRequestBody addOrganizationMemberRequestBody = new AddOrganizationMemberRequestBody(); // AddOrganizationMemberRequestBody | 
    try {
      Object result = apiInstance.addOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody);
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
| **organizationId** | **UUID**| Organization UUID. | |
| **accountId** | **UUID**| Account UUID. | |
| **addOrganizationMemberRequestBody** | [**AddOrganizationMemberRequestBody**](AddOrganizationMemberRequestBody.md)|  | |

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
| **201** | Member added. |  -  |
| **403** | Member quota reached. |  -  |
| **422** | Validation Error |  -  |

<a id="createOrganizationOrganizationsPut"></a>
# **createOrganizationOrganizationsPut**
> Object createOrganizationOrganizationsPut(createOrganizationRequestBody)

Create Organization

Create an organization account and make the caller an admin.  **Permissions:** Requires authentication.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    CreateOrganizationRequestBody createOrganizationRequestBody = new CreateOrganizationRequestBody(); // CreateOrganizationRequestBody | 
    try {
      Object result = apiInstance.createOrganizationOrganizationsPut(createOrganizationRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createOrganizationOrganizationsPut");
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
| **createOrganizationRequestBody** | [**CreateOrganizationRequestBody**](CreateOrganizationRequestBody.md)|  | |

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
| **201** | Organization created. |  -  |
| **409** | The handle is already in use. |  -  |
| **422** | Validation Error |  -  |

<a id="getOrganizationOrganizationsOrganizationIdGet"></a>
# **getOrganizationOrganizationsOrganizationIdGet**
> Object getOrganizationOrganizationsOrganizationIdGet(organizationId)

Get Organization

Return organization details.  **Permissions:** Public organization profiles are visible.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    try {
      Object result = apiInstance.getOrganizationOrganizationsOrganizationIdGet(organizationId);
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

<a id="listOrganizationMembersOrganizationsOrganizationIdMembersGet"></a>
# **listOrganizationMembersOrganizationsOrganizationIdMembersGet**
> Object listOrganizationMembersOrganizationsOrganizationIdMembersGet(organizationId)

List Organization Members

List organization members.  **Permissions:** Non-guest organization members can list organization members. Guests can only see their own membership.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    try {
      Object result = apiInstance.listOrganizationMembersOrganizationsOrganizationIdMembersGet(organizationId);
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

<a id="removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete"></a>
# **removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete**
> Object removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId)

Remove Organization Member

Remove an organization member.  **Permissions:** Requires organization manager or admin access. Only organization admins can remove admin members.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    try {
      Object result = apiInstance.removeOrganizationMemberOrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId);
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
| **organizationId** | **UUID**| Organization UUID. | |
| **accountId** | **UUID**| Account UUID. | |

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

<a id="updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch"></a>
# **updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch**
> Object updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody)

Update Organization Member

Update an organization member&#39;s role.  **Permissions:** Requires organization manager or admin access. Only organization admins can set or update admin members.  **Quota:** Non-guest roles count against the organization&#39;s member quota.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.OrganizationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    UpdateOrganizationMemberRequestBody updateOrganizationMemberRequestBody = new UpdateOrganizationMemberRequestBody(); // UpdateOrganizationMemberRequestBody | 
    try {
      Object result = apiInstance.updateOrganizationMemberOrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody);
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
| **organizationId** | **UUID**| Organization UUID. | |
| **accountId** | **UUID**| Account UUID. | |
| **updateOrganizationMemberRequestBody** | [**UpdateOrganizationMemberRequestBody**](UpdateOrganizationMemberRequestBody.md)|  | |

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
| **403** | Member quota reached. |  -  |
| **422** | Validation Error |  -  |

