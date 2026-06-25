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
> Object addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody, authorization)

Add Space Collaborator

Add a collaborator (account or team) to a space.  Parameters: - **space_id**: ID of the space to add the collaborator to - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to add (mutually exclusive with team_id)   - **team_id**: UUID of the team to add (mutually exclusive with account_id)   - **role**: Role of the collaborator   - **add_guest_if_missing**: If true for an account collaborator,     add the account to the space organization as a guest first when it is     not already an organization member  Returns: - **201**: Collaborator added to space successfully - **400**: Invalid input (e.g., both account_id and team_id provided)

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    AddSpaceCollaboratorRequestBody addSpaceCollaboratorRequestBody = new AddSpaceCollaboratorRequestBody(); // AddSpaceCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addSpaceCollaboratorSpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody, authorization);
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
| **spaceId** | **UUID**|  | |
| **addSpaceCollaboratorRequestBody** | [**AddSpaceCollaboratorRequestBody**](AddSpaceCollaboratorRequestBody.md)|  | |
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

<a id="attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut"></a>
# **attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut**
> Object attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId, authorization)

Attach Space To Instance

Attach a space to a specific instance.  Parameters: - **space_id**: ID of the space to attach - **instance_id**: UUID of the instance to attach the space to (from URL path)  Returns: - **200**: Space attached to instance successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.attachSpaceToInstanceSpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId, authorization);
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
| **spaceId** | **UUID**|  | |
| **instanceId** | **UUID**|  | |
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

<a id="createSpaceSpacesPut"></a>
# **createSpaceSpacesPut**
> Object createSpaceSpacesPut(createSpaceRequestBody, authorization)

Create Space

Create a new space.  Parameters: - **body**: Request body containing space details   - **name**: Name of the space   - **organization_id**: UUID of the organization   - **description**: Optional description of the space  Returns: - **201**: Space created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    CreateSpaceRequestBody createSpaceRequestBody = new CreateSpaceRequestBody(); // CreateSpaceRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createSpaceSpacesPut(createSpaceRequestBody, authorization);
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

<a id="deleteSpaceSpacesSpaceIdDelete"></a>
# **deleteSpaceSpacesSpaceIdDelete**
> Object deleteSpaceSpacesSpaceIdDelete(spaceId, authorization)

Delete Space

Delete a space and detach it from the instance.  Parameters: - **space_id**: ID of the space to delete  Returns: - **200**: Space deleted successfully - **404**: Space not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteSpaceSpacesSpaceIdDelete(spaceId, authorization);
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
| **spaceId** | **UUID**|  | |
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

<a id="detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete"></a>
# **detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete**
> Object detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId, authorization)

Detach Space From Instance

Detach a space from a specific instance.  Parameters: - **space_id**: ID of the space to detach - **instance_id**: UUID of the instance to detach the space from (from URL path)  Returns: - **200**: Space detached from instance successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.detachSpaceFromInstanceSpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId, authorization);
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
| **spaceId** | **UUID**|  | |
| **instanceId** | **UUID**|  | |
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

<a id="getSpaceSpacesSpaceIdGet"></a>
# **getSpaceSpacesSpaceIdGet**
> Object getSpaceSpacesSpaceIdGet(spaceId, authorization)

Get Space

Get details of a specific space.  Parameters: - **space_id**: ID of the space to retrieve  Returns: - **200**: Space details retrieved successfully - **404**: Space not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getSpaceSpacesSpaceIdGet(spaceId, authorization);
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
| **spaceId** | **UUID**|  | |
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

<a id="listInstanceSpacesSpacesInstancesInstanceIdGet"></a>
# **listInstanceSpacesSpacesInstancesInstanceIdGet**
> Object listInstanceSpacesSpacesInstancesInstanceIdGet(instanceId, spaceId, authorization)

List Instance Spaces

List all spaces attached to an instance.  Parameters: - **instance_id**: UUID of the instance to list spaces for (from URL path)  Returns: - **200**: List of spaces attached to the instance retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listInstanceSpacesSpacesInstancesInstanceIdGet(instanceId, spaceId, authorization);
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
| **instanceId** | **UUID**|  | |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="listInstancesUsingSpaceSpacesSpaceIdInstancesGet"></a>
# **listInstancesUsingSpaceSpacesSpaceIdInstancesGet**
> Object listInstancesUsingSpaceSpacesSpaceIdInstancesGet(spaceId, authorization)

List Instances Using Space

List all instances that have this space attached.  Parameters: - **space_id**: ID of the space to check  Returns: - **200**: List of instances using the space retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listInstancesUsingSpaceSpacesSpaceIdInstancesGet(spaceId, authorization);
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
| **spaceId** | **UUID**|  | |
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

<a id="listOrganizationSpacesSpacesOrganizationsOrganizationIdGet"></a>
# **listOrganizationSpacesSpacesOrganizationsOrganizationIdGet**
> Object listOrganizationSpacesSpacesOrganizationsOrganizationIdGet(organizationId, authorization)

List Organization Spaces

List all spaces in an organization.  Parameters: - **organization_id**: UUID of the organization to list spaces for  Returns: - **200**: List of spaces retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationSpacesSpacesOrganizationsOrganizationIdGet(organizationId, authorization);
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

<a id="listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet"></a>
# **listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet**
> Object listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet(spaceId, authorization)

List Space Collaborators

List all collaborators of a space.  Parameters: - **space_id**: ID of the space to list collaborators for  Returns: - **200**: List of space collaborators retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listSpaceCollaboratorsSpacesSpaceIdCollaboratorsGet(spaceId, authorization);
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
| **spaceId** | **UUID**|  | |
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

<a id="moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut"></a>
# **moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut**
> Object moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut(spaceId, instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId, authorization)

Move Record To Space

Move a record to a specific space.  Parameters: - **space_id**: ID of the space to move the record to - **body**: Request body containing record details   - **module_name**: Module name of the record   - **model_name**: Model name of the record   - **record_id**: ID of the record to move in the space - **instance_id**: UUID of the instance (from URL path) - **schema_id**: UUID of the schema (from URL path)  Returns: - **200**: Record moved to the space successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    Integer instanceDbSpaceId = 56; // Integer | 
    AttachSpaceToRecordRequestBody attachSpaceToRecordRequestBody = new AttachSpaceToRecordRequestBody(); // AttachSpaceToRecordRequestBody | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.moveRecordToSpaceSpacesSpaceIdRecordAttachmentsPut(spaceId, instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId, authorization);
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
| **spaceId** | **UUID**|  | |
| **instanceDbSpaceId** | **Integer**|  | |
| **attachSpaceToRecordRequestBody** | [**AttachSpaceToRecordRequestBody**](AttachSpaceToRecordRequestBody.md)|  | |
| **instanceId** | **UUID**|  | [optional] |
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

<a id="removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete"></a>
# **removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete**
> Object removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId, authorization)

Remove Space Collaborator

Remove a collaborator (account or team) from a space.  Parameters: - **space_id**: ID of the space to remove the collaborator from - **account_id**: UUID of the account to remove (mutually exclusive with team_id) - **team_id**: UUID of the team to remove (mutually exclusive with account_id)  Returns: - **200**: Collaborator removed from space successfully - **400**: Invalid input (e.g., both account_id and team_id provided or neither provided)

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeSpaceCollaboratorSpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId, authorization);
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
| **spaceId** | **UUID**|  | |
| **accountId** | **UUID**|  | [optional] |
| **teamId** | **UUID**|  | [optional] |
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

<a id="updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch"></a>
# **updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch**
> Object updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody, authorization)

Update Space Collaborator

Update a collaborator&#39;s permissions in a space.  Parameters: - **space_id**: ID of the space to update the collaborator in - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to update (mutually exclusive with team_id)   - **team_id**: UUID of the team to update (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **200**: Collaborator updated successfully - **400**: Invalid input (e.g., both account_id and team_id provided) - **404**: Collaborator not found in space

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UpdateSpaceCollaboratorRequestBody updateSpaceCollaboratorRequestBody = new UpdateSpaceCollaboratorRequestBody(); // UpdateSpaceCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateSpaceCollaboratorSpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody, authorization);
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
| **spaceId** | **UUID**|  | |
| **updateSpaceCollaboratorRequestBody** | [**UpdateSpaceCollaboratorRequestBody**](UpdateSpaceCollaboratorRequestBody.md)|  | |
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

<a id="updateSpaceSpacesSpaceIdPatch"></a>
# **updateSpaceSpacesSpaceIdPatch**
> Object updateSpaceSpacesSpaceIdPatch(spaceId, updateSpaceRequestBody, authorization)

Update Space

Update a space&#39;s details.  Parameters: - **space_id**: ID of the space to update - **body**: Request body containing updated space details   - **name**: Optional new name for the space   - **description**: Optional new description for the space  Returns: - **200**: Space updated successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UpdateSpaceRequestBody updateSpaceRequestBody = new UpdateSpaceRequestBody(); // UpdateSpaceRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateSpaceSpacesSpaceIdPatch(spaceId, updateSpaceRequestBody, authorization);
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
| **spaceId** | **UUID**|  | |
| **updateSpaceRequestBody** | [**UpdateSpaceRequestBody**](UpdateSpaceRequestBody.md)|  | |
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

