# TeamsApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTeamMemberTeamsTeamIdMembersAccountIdPut**](TeamsApi.md#addTeamMemberTeamsTeamIdMembersAccountIdPut) | **PUT** /teams/{team_id}/members/{account_id} | Add Team Member |
| [**createTeamTeamsPut**](TeamsApi.md#createTeamTeamsPut) | **PUT** /teams | Create Team |
| [**deleteTeamTeamsTeamIdDelete**](TeamsApi.md#deleteTeamTeamsTeamIdDelete) | **DELETE** /teams/{team_id} | Delete Team |
| [**getTeamTeamsTeamIdGet**](TeamsApi.md#getTeamTeamsTeamIdGet) | **GET** /teams/{team_id} | Get Team |
| [**listOrganizationTeamsTeamsOrganizationsOrganizationIdGet**](TeamsApi.md#listOrganizationTeamsTeamsOrganizationsOrganizationIdGet) | **GET** /teams/organizations/{organization_id} | List Organization Teams |
| [**listTeamMembersTeamsTeamIdMembersGet**](TeamsApi.md#listTeamMembersTeamsTeamIdMembersGet) | **GET** /teams/{team_id}/members | List Team Members |
| [**removeTeamMemberTeamsTeamIdMembersAccountIdDelete**](TeamsApi.md#removeTeamMemberTeamsTeamIdMembersAccountIdDelete) | **DELETE** /teams/{team_id}/members/{account_id} | Remove Team Member |
| [**updateTeamMemberTeamsTeamIdMembersAccountIdPatch**](TeamsApi.md#updateTeamMemberTeamsTeamIdMembersAccountIdPatch) | **PATCH** /teams/{team_id}/members/{account_id} | Update Team Member |
| [**updateTeamTeamsTeamIdPatch**](TeamsApi.md#updateTeamTeamsTeamIdPatch) | **PATCH** /teams/{team_id} | Update Team |


<a id="addTeamMemberTeamsTeamIdMembersAccountIdPut"></a>
# **addTeamMemberTeamsTeamIdMembersAccountIdPut**
> Object addTeamMemberTeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody)

Add Team Member

Add an account to a team.  **Permissions:** Requires organization manager or admin access, or team admin access. The account must already belong to the organization.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    AddTeamMemberRequestBody addTeamMemberRequestBody = new AddTeamMemberRequestBody(); // AddTeamMemberRequestBody | 
    try {
      Object result = apiInstance.addTeamMemberTeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#addTeamMemberTeamsTeamIdMembersAccountIdPut");
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
| **teamId** | **UUID**| Team UUID. | |
| **accountId** | **UUID**| Account UUID. | |
| **addTeamMemberRequestBody** | [**AddTeamMemberRequestBody**](AddTeamMemberRequestBody.md)|  | |

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
| **201** | Team member added. |  -  |
| **422** | Validation Error |  -  |

<a id="createTeamTeamsPut"></a>
# **createTeamTeamsPut**
> Object createTeamTeamsPut(createTeamRequestBody)

Create Team

Create a team in an organization.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    CreateTeamRequestBody createTeamRequestBody = new CreateTeamRequestBody(); // CreateTeamRequestBody | 
    try {
      Object result = apiInstance.createTeamTeamsPut(createTeamRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createTeamTeamsPut");
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
| **createTeamRequestBody** | [**CreateTeamRequestBody**](CreateTeamRequestBody.md)|  | |

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
| **201** | Team created. |  -  |
| **422** | Validation Error |  -  |

<a id="deleteTeamTeamsTeamIdDelete"></a>
# **deleteTeamTeamsTeamIdDelete**
> Object deleteTeamTeamsTeamIdDelete(teamId)

Delete Team

Delete a team.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    try {
      Object result = apiInstance.deleteTeamTeamsTeamIdDelete(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#deleteTeamTeamsTeamIdDelete");
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
| **teamId** | **UUID**| Team UUID. | |

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

<a id="getTeamTeamsTeamIdGet"></a>
# **getTeamTeamsTeamIdGet**
> Object getTeamTeamsTeamIdGet(teamId)

Get Team

Return team details.  **Permissions:** Requires non-guest membership in the organization or team membership.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    try {
      Object result = apiInstance.getTeamTeamsTeamIdGet(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getTeamTeamsTeamIdGet");
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
| **teamId** | **UUID**| Team UUID. | |

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

<a id="listOrganizationTeamsTeamsOrganizationsOrganizationIdGet"></a>
# **listOrganizationTeamsTeamsOrganizationsOrganizationIdGet**
> Object listOrganizationTeamsTeamsOrganizationsOrganizationIdGet(organizationId)

List Organization Teams

List teams in an organization.  **Permissions:** Requires non-guest organization membership.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    try {
      Object result = apiInstance.listOrganizationTeamsTeamsOrganizationsOrganizationIdGet(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listOrganizationTeamsTeamsOrganizationsOrganizationIdGet");
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

<a id="listTeamMembersTeamsTeamIdMembersGet"></a>
# **listTeamMembersTeamsTeamIdMembersGet**
> Object listTeamMembersTeamsTeamIdMembersGet(teamId)

List Team Members

List team members.  **Permissions:** Requires team membership.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    try {
      Object result = apiInstance.listTeamMembersTeamsTeamIdMembersGet(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listTeamMembersTeamsTeamIdMembersGet");
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
| **teamId** | **UUID**| Team UUID. | |

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

<a id="removeTeamMemberTeamsTeamIdMembersAccountIdDelete"></a>
# **removeTeamMemberTeamsTeamIdMembersAccountIdDelete**
> Object removeTeamMemberTeamsTeamIdMembersAccountIdDelete(teamId, accountId)

Remove Team Member

Remove an account from a team.  **Permissions:** Requires organization manager or admin access, or team admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    try {
      Object result = apiInstance.removeTeamMemberTeamsTeamIdMembersAccountIdDelete(teamId, accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeTeamMemberTeamsTeamIdMembersAccountIdDelete");
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
| **teamId** | **UUID**| Team UUID. | |
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

<a id="updateTeamMemberTeamsTeamIdMembersAccountIdPatch"></a>
# **updateTeamMemberTeamsTeamIdMembersAccountIdPatch**
> Object updateTeamMemberTeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody)

Update Team Member

Update a team member&#39;s role.  **Permissions:** Requires organization manager or admin access, or team admin access. The account must already belong to the organization.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID.
    UpdateTeamMemberRequestBody updateTeamMemberRequestBody = new UpdateTeamMemberRequestBody(); // UpdateTeamMemberRequestBody | 
    try {
      Object result = apiInstance.updateTeamMemberTeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamMemberTeamsTeamIdMembersAccountIdPatch");
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
| **teamId** | **UUID**| Team UUID. | |
| **accountId** | **UUID**| Account UUID. | |
| **updateTeamMemberRequestBody** | [**UpdateTeamMemberRequestBody**](UpdateTeamMemberRequestBody.md)|  | |

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

<a id="updateTeamTeamsTeamIdPatch"></a>
# **updateTeamTeamsTeamIdPatch**
> Object updateTeamTeamsTeamIdPatch(teamId, updateTeamRequestBody)

Update Team

Update a team&#39;s name or description.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID.
    UpdateTeamRequestBody updateTeamRequestBody = new UpdateTeamRequestBody(); // UpdateTeamRequestBody | 
    try {
      Object result = apiInstance.updateTeamTeamsTeamIdPatch(teamId, updateTeamRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeamTeamsTeamIdPatch");
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
| **teamId** | **UUID**| Team UUID. | |
| **updateTeamRequestBody** | [**UpdateTeamRequestBody**](UpdateTeamRequestBody.md)|  | |

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

