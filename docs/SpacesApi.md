# SpacesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut**](SpacesApi.md#addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut) | **PUT** /spaces/{space_id}/collaborators | Add Space Collaborator |
| [**attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut**](SpacesApi.md#attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut) | **PUT** /spaces/{space_id}/instances/{instance_id} | Attach Space To Instance |
| [**createSpaceSpacesPut**](SpacesApi.md#createSpaceSpacesPut) | **PUT** /spaces | Create Space |
| [**deleteSpaceSpacesSpaceIdDelete**](SpacesApi.md#deleteSpaceSpacesSpaceIdDelete) | **DELETE** /spaces/{space_id} | Delete Space |
| [**detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete**](SpacesApi.md#detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete) | **DELETE** /spaces/{space_id}/instances/{instance_id} | Detach Space From Instance |
| [**getSpaceSpacesSpaceIdGet**](SpacesApi.md#getSpaceSpacesSpaceIdGet) | **GET** /spaces/{space_id} | Get Space |
| [**listInstanceSpacesSpacesInstancesInstanceIdGet**](SpacesApi.md#listInstanceSpacesSpacesInstancesInstanceIdGet) | **GET** /spaces/instances/{instance_id} | List Instance Spaces |
| [**listInstancesUsingSpaceSpacesSpaceIdInstancesGet**](SpacesApi.md#listInstancesUsingSpaceSpacesSpaceIdInstancesGet) | **GET** /spaces/{space_id}/instances | List Instances Using Space |
| [**listOrganizationSpacesSpacesOrganizationsOrganizationIdGet**](SpacesApi.md#listOrganizationSpacesSpacesOrganizationsOrganizationIdGet) | **GET** /spaces/organizations/{organization_id} | List Organization Spaces |
| [**listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet**](SpacesApi.md#listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet) | **GET** /spaces/{space_id}/collaborators | List Space Collaborators |
| [**moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut**](SpacesApi.md#moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut) | **PUT** /spaces/{space_id}/record-attachments | Move Record To Space |
| [**removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete**](SpacesApi.md#removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete) | **DELETE** /spaces/{space_id}/collaborators | Remove Space Collaborator |
| [**updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch**](SpacesApi.md#updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch) | **PATCH** /spaces/{space_id}/collaborators | Update Space Collaborator |
| [**updateSpaceSpacesSpaceIdPatch**](SpacesApi.md#updateSpaceSpacesSpaceIdPatch) | **PATCH** /spaces/{space_id} | Update Space |


<a id="addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut"></a>
# **addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut**
> Object addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody)

Add Space Collaborator

Add an account or team collaborator to a space.  **Permissions:** Adding a missing account as an organization guest requires organization manager or admin access.  **Notes:** Can add missing account collaborators as organization guests when requested.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    AddSpaceCollaboratorRequestBody addSpaceCollaboratorRequestBody = new AddSpaceCollaboratorRequestBody(); // AddSpaceCollaboratorRequestBody | 
    try {
      Object result = apiInstance.addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut");
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
| **spaceId** | **UUID**| Space UUID. | |
| **addSpaceCollaboratorRequestBody** | [**AddSpaceCollaboratorRequestBody**](AddSpaceCollaboratorRequestBody.md)|  | |

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
| **201** | Space collaborator added. |  -  |
| **422** | Validation Error |  -  |

<a id="attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut"></a>
# **attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut**
> Object attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId)

Attach Space To Instance

Attach a space to an instance.  **Permissions:** Requires instance admin access or organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    try {
      Object result = apiInstance.attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut");
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
| **spaceId** | **UUID**| Space UUID. | |
| **instanceId** | **UUID**| Instance UUID. | |

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

<a id="createSpaceSpacesPut"></a>
# **createSpaceSpacesPut**
> Object createSpaceSpacesPut(createSpaceRequestBody)

Create Space

Create a space in an organization.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    CreateSpaceRequestBody createSpaceRequestBody = new CreateSpaceRequestBody(); // CreateSpaceRequestBody | 
    try {
      Object result = apiInstance.createSpaceSpacesPut(createSpaceRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#createSpaceSpacesPut");
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
| **createSpaceRequestBody** | [**CreateSpaceRequestBody**](CreateSpaceRequestBody.md)|  | |

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
| **201** | Space created. |  -  |
| **422** | Validation Error |  -  |

<a id="deleteSpaceSpacesSpaceIdDelete"></a>
# **deleteSpaceSpacesSpaceIdDelete**
> Object deleteSpaceSpacesSpaceIdDelete(spaceId)

Delete Space

Delete a space.  **Permissions:** Requires organization manager or admin access.  **Notes:** The space must not be attached to any instances.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    try {
      Object result = apiInstance.deleteSpaceSpacesSpaceIdDelete(spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#deleteSpaceSpacesSpaceIdDelete");
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
| **spaceId** | **UUID**| Space UUID. | |

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

<a id="detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete"></a>
# **detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete**
> Object detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId)

Detach Space From Instance

Detach a space from an instance.  **Permissions:** Requires instance admin access or organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    try {
      Object result = apiInstance.detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete");
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
| **spaceId** | **UUID**| Space UUID. | |
| **instanceId** | **UUID**| Instance UUID. | |

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

<a id="getSpaceSpacesSpaceIdGet"></a>
# **getSpaceSpacesSpaceIdGet**
> Object getSpaceSpacesSpaceIdGet(spaceId)

Get Space

Return space details.  **Permissions:** Requires non-guest membership in the organization or space collaborator access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    try {
      Object result = apiInstance.getSpaceSpacesSpaceIdGet(spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#getSpaceSpacesSpaceIdGet");
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
| **spaceId** | **UUID**| Space UUID. | |

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

<a id="listInstanceSpacesSpacesInstancesInstanceIdGet"></a>
# **listInstanceSpacesSpacesInstancesInstanceIdGet**
> Object listInstanceSpacesSpacesInstancesInstanceIdGet(instanceId, spaceId)

List Instance Spaces

List spaces attached to an instance.  **Permissions:** Requires collaborator access to both the instance and returned spaces.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.listInstanceSpacesSpacesInstancesInstanceIdGet(instanceId, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#listInstanceSpacesSpacesInstancesInstanceIdGet");
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
| **instanceId** | **UUID**| Instance UUID. | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

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

<a id="listInstancesUsingSpaceSpacesSpaceIdInstancesGet"></a>
# **listInstancesUsingSpaceSpacesSpaceIdInstancesGet**
> Object listInstancesUsingSpaceSpacesSpaceIdInstancesGet(spaceId)

List Instances Using Space

List instances that use a space.  **Permissions:** Requires collaborator access to both the space and returned instances.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    try {
      Object result = apiInstance.listInstancesUsingSpaceSpacesSpaceIdInstancesGet(spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#listInstancesUsingSpaceSpacesSpaceIdInstancesGet");
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
| **spaceId** | **UUID**| Space UUID. | |

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

<a id="listOrganizationSpacesSpacesOrganizationsOrganizationIdGet"></a>
# **listOrganizationSpacesSpacesOrganizationsOrganizationIdGet**
> Object listOrganizationSpacesSpacesOrganizationsOrganizationIdGet(organizationId)

List Organization Spaces

List spaces in an organization.  **Permissions:** Requires non-guest organization membership.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | Organization UUID.
    try {
      Object result = apiInstance.listOrganizationSpacesSpacesOrganizationsOrganizationIdGet(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#listOrganizationSpacesSpacesOrganizationsOrganizationIdGet");
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

<a id="listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet"></a>
# **listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet**
> Object listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet(spaceId)

List Space Collaborators

List space collaborators.  **Permissions:** Requires space collaborator access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    try {
      Object result = apiInstance.listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet(spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet");
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
| **spaceId** | **UUID**| Space UUID. | |

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

<a id="moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut"></a>
# **moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut**
> Object moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut(spaceId, instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId)

Move Record To Space

Move a record into a target space.  **Permissions:** Requires instance admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    Integer instanceDbSpaceId = 56; // Integer | Target space ID to assign to the record.
    AttachSpaceToRecordRequestBody attachSpaceToRecordRequestBody = new AttachSpaceToRecordRequestBody(); // AttachSpaceToRecordRequestBody | 
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    try {
      Object result = apiInstance.moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut(spaceId, instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut");
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
| **spaceId** | **UUID**| Space UUID. | |
| **instanceDbSpaceId** | **Integer**| Target space ID to assign to the record. | |
| **attachSpaceToRecordRequestBody** | [**AttachSpaceToRecordRequestBody**](AttachSpaceToRecordRequestBody.md)|  | |
| **instanceId** | **UUID**| Instance UUID. | [optional] |

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

<a id="removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete"></a>
# **removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete**
> Object removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId)

Remove Space Collaborator

Remove an account or team collaborator from a space.  **Permissions:** Requires organization manager or admin access, or space admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID. Mutually exclusive with team_id.
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID. Mutually exclusive with account_id.
    try {
      Object result = apiInstance.removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete");
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
| **spaceId** | **UUID**| Space UUID. | |
| **accountId** | **UUID**| Account UUID. Mutually exclusive with team_id. | [optional] |
| **teamId** | **UUID**| Team UUID. Mutually exclusive with account_id. | [optional] |

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

<a id="updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch"></a>
# **updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch**
> Object updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody)

Update Space Collaborator

Update a space collaborator&#39;s role.  **Permissions:** Requires organization manager or admin access, or space admin access. The account or team must already belong to the space organization.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    UpdateSpaceCollaboratorRequestBody updateSpaceCollaboratorRequestBody = new UpdateSpaceCollaboratorRequestBody(); // UpdateSpaceCollaboratorRequestBody | 
    try {
      Object result = apiInstance.updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch");
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
| **spaceId** | **UUID**| Space UUID. | |
| **updateSpaceCollaboratorRequestBody** | [**UpdateSpaceCollaboratorRequestBody**](UpdateSpaceCollaboratorRequestBody.md)|  | |

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

<a id="updateSpaceSpacesSpaceIdPatch"></a>
# **updateSpaceSpacesSpaceIdPatch**
> Object updateSpaceSpacesSpaceIdPatch(spaceId, updateSpaceRequestBody)

Update Space

Update a space&#39;s name or description.  **Permissions:** Requires organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID.
    UpdateSpaceRequestBody updateSpaceRequestBody = new UpdateSpaceRequestBody(); // UpdateSpaceRequestBody | 
    try {
      Object result = apiInstance.updateSpaceSpacesSpaceIdPatch(spaceId, updateSpaceRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#updateSpaceSpacesSpaceIdPatch");
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
| **spaceId** | **UUID**| Space UUID. | |
| **updateSpaceRequestBody** | [**UpdateSpaceRequestBody**](UpdateSpaceRequestBody.md)|  | |

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

