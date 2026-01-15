# TeamsApi

All URIs are relative to *https://staging.laminhub.com/api*

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
> Object addTeamMemberTeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody, authorization)

Add Team Member

Add a member to a team.  Parameters: - **team_id**: UUID of the team to add the member to - **account_id**: UUID of the account to add as a member - **body**: Request body containing member details   - **role**: Role of the member in the team  Returns: - **201**: Team member added successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    AddTeamMemberRequestBody addTeamMemberRequestBody = new AddTeamMemberRequestBody(); // AddTeamMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addTeamMemberTeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody, authorization);
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
| **teamId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **addTeamMemberRequestBody** | [**AddTeamMemberRequestBody**](AddTeamMemberRequestBody.md)|  | |
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

<a id="createTeamTeamsPut"></a>
# **createTeamTeamsPut**
> Object createTeamTeamsPut(createTeamRequestBody, authorization)

Create Team

Create a new team.  Parameters: - **body**: Request body containing team details   - **name**: Name of the team   - **organization_id**: UUID of the organization   - **description**: Optional description of the team  Returns: - **201**: Team created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    CreateTeamRequestBody createTeamRequestBody = new CreateTeamRequestBody(); // CreateTeamRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createTeamTeamsPut(createTeamRequestBody, authorization);
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

<a id="deleteTeamTeamsTeamIdDelete"></a>
# **deleteTeamTeamsTeamIdDelete**
> Object deleteTeamTeamsTeamIdDelete(teamId, authorization)

Delete Team

Delete a team.  Parameters: - **team_id**: UUID of the team to delete  Returns: - **200**: Team deleted successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteTeamTeamsTeamIdDelete(teamId, authorization);
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
| **teamId** | **UUID**|  | |
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

<a id="getTeamTeamsTeamIdGet"></a>
# **getTeamTeamsTeamIdGet**
> Object getTeamTeamsTeamIdGet(teamId, authorization)

Get Team

Get details of a specific team.  Parameters: - **team_id**: UUID of the team to retrieve  Returns: - **200**: Team details retrieved successfully - **404**: Team not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getTeamTeamsTeamIdGet(teamId, authorization);
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
| **teamId** | **UUID**|  | |
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

<a id="listOrganizationTeamsTeamsOrganizationsOrganizationIdGet"></a>
# **listOrganizationTeamsTeamsOrganizationsOrganizationIdGet**
> Object listOrganizationTeamsTeamsOrganizationsOrganizationIdGet(organizationId, authorization)

List Organization Teams

List all teams in an organization.  Parameters: - **organization_id**: UUID of the organization to list teams for  Returns: - **200**: List of teams retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationTeamsTeamsOrganizationsOrganizationIdGet(organizationId, authorization);
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

<a id="listTeamMembersTeamsTeamIdMembersGet"></a>
# **listTeamMembersTeamsTeamIdMembersGet**
> Object listTeamMembersTeamsTeamIdMembersGet(teamId, authorization)

List Team Members

List all members of a team.  Parameters: - **team_id**: UUID of the team to list members for  Returns: - **200**: List of team members retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listTeamMembersTeamsTeamIdMembersGet(teamId, authorization);
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
| **teamId** | **UUID**|  | |
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

<a id="removeTeamMemberTeamsTeamIdMembersAccountIdDelete"></a>
# **removeTeamMemberTeamsTeamIdMembersAccountIdDelete**
> Object removeTeamMemberTeamsTeamIdMembersAccountIdDelete(teamId, accountId, authorization)

Remove Team Member

Remove a member from a team.  Parameters: - **team_id**: UUID of the team to remove the member from - **account_id**: UUID of the account to remove from the team  Returns: - **200**: Team member removed successfully - **404**: Member not found in team

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeTeamMemberTeamsTeamIdMembersAccountIdDelete(teamId, accountId, authorization);
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
| **teamId** | **UUID**|  | |
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

<a id="updateTeamMemberTeamsTeamIdMembersAccountIdPatch"></a>
# **updateTeamMemberTeamsTeamIdMembersAccountIdPatch**
> Object updateTeamMemberTeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody, authorization)

Update Team Member

Update a team member&#39;s details.  Parameters: - **team_id**: UUID of the team the member belongs to - **account_id**: UUID of the account to update - **body**: Request body containing updated member details   - **role**: Role of the member in the team  Returns: - **200**: Team member updated successfully - **404**: Member not found in team

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UpdateTeamMemberRequestBody updateTeamMemberRequestBody = new UpdateTeamMemberRequestBody(); // UpdateTeamMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateTeamMemberTeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody, authorization);
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
| **teamId** | **UUID**|  | |
| **accountId** | **UUID**|  | |
| **updateTeamMemberRequestBody** | [**UpdateTeamMemberRequestBody**](UpdateTeamMemberRequestBody.md)|  | |
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

<a id="updateTeamTeamsTeamIdPatch"></a>
# **updateTeamTeamsTeamIdPatch**
> Object updateTeamTeamsTeamIdPatch(teamId, updateTeamRequestBody, authorization)

Update Team

Update a team&#39;s details.  Parameters: - **team_id**: UUID of the team to update - **body**: Request body containing updated team details   - **name**: Optional new name for the team   - **description**: Optional new description for the team  Returns: - **200**: Team updated successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.laminhub.com/api");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UpdateTeamRequestBody updateTeamRequestBody = new UpdateTeamRequestBody(); // UpdateTeamRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateTeamTeamsTeamIdPatch(teamId, updateTeamRequestBody, authorization);
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
| **teamId** | **UUID**|  | |
| **updateTeamRequestBody** | [**UpdateTeamRequestBody**](UpdateTeamRequestBody.md)|  | |
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

