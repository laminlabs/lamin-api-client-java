# InstancesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollaboratorInstancesInstanceIdCollaboratorsPut**](InstancesApi.md#addCollaboratorInstancesInstanceIdCollaboratorsPut) | **PUT** /instances/{instance_id}/collaborators | Add Collaborator |
| [**createInstanceInstancesPut**](InstancesApi.md#createInstanceInstancesPut) | **PUT** /instances | Create Instance |
| [**deleteInstanceInstancesInstanceIdDelete**](InstancesApi.md#deleteInstanceInstancesInstanceIdDelete) | **DELETE** /instances/{instance_id} | Delete Instance |
| [**getInstanceSettingsInstancesOwnerNameSettingsGet**](InstancesApi.md#getInstanceSettingsInstancesOwnerNameSettingsGet) | **GET** /instances/{owner}/{name}/settings | Get Instance Settings |
| [**listCollaboratorsInstancesInstanceIdCollaboratorsGet**](InstancesApi.md#listCollaboratorsInstancesInstanceIdCollaboratorsGet) | **GET** /instances/{instance_id}/collaborators | List Collaborators |
| [**migrateInstanceInstancesInstanceIdMigratePost**](InstancesApi.md#migrateInstanceInstancesInstanceIdMigratePost) | **POST** /instances/{instance_id}/migrate | Migrate Instance |
| [**removeCollaboratorInstancesInstanceIdCollaboratorsDelete**](InstancesApi.md#removeCollaboratorInstancesInstanceIdCollaboratorsDelete) | **DELETE** /instances/{instance_id}/collaborators | Remove Collaborator |
| [**transferOwnershipInstancesInstanceIdOwnerHandlePatch**](InstancesApi.md#transferOwnershipInstancesInstanceIdOwnerHandlePatch) | **PATCH** /instances/{instance_id}/owner/{handle} | Transfer Ownership |
| [**updateCollaboratorInstancesInstanceIdCollaboratorsPatch**](InstancesApi.md#updateCollaboratorInstancesInstanceIdCollaboratorsPatch) | **PATCH** /instances/{instance_id}/collaborators | Update Collaborator |


<a id="addCollaboratorInstancesInstanceIdCollaboratorsPut"></a>
# **addCollaboratorInstancesInstanceIdCollaboratorsPut**
> Object addCollaboratorInstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, spaceId, authorization)

Add Collaborator

Add a collaborator (account or team) to an instance.  Parameters: - **instance_id**: UUID of the instance to add the collaborator to (from URL path) - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to add (mutually exclusive with team_id)   - **team_id**: UUID of the team to add (mutually exclusive with account_id)   - **role**: Role of the collaborator   - **add_guest_if_missing**: If true for an account collaborator,     add the account to the instance organization as a guest first when it is     not already an organization member  Returns: - **201**: Collaborator added successfully - **400**: Invalid input (e.g., both account_id and team_id provided) - **409**: Collaborator was already added  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    AddCollaboratorRequestBody addCollaboratorRequestBody = new AddCollaboratorRequestBody(); // AddCollaboratorRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addCollaboratorInstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#addCollaboratorInstancesInstanceIdCollaboratorsPut");
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
| **addCollaboratorRequestBody** | [**AddCollaboratorRequestBody**](AddCollaboratorRequestBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
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

<a id="createInstanceInstancesPut"></a>
# **createInstanceInstancesPut**
> Object createInstanceInstancesPut(name, storage, schemaStr, dbServerName, storageUid, accountId, _public, authorization, requestBody)

Create Instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | 
    String storage = "create-s3"; // String | 
    String schemaStr = "schemaStr_example"; // String | 
    String dbServerName = "dbServerName_example"; // String | 
    String storageUid = "storageUid_example"; // String | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    Boolean _public = false; // Boolean | 
    String authorization = "authorization_example"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      Object result = apiInstance.createInstanceInstancesPut(name, storage, schemaStr, dbServerName, storageUid, accountId, _public, authorization, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#createInstanceInstancesPut");
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
| **name** | **String**|  | |
| **storage** | **String**|  | [optional] [default to create-s3] |
| **schemaStr** | **String**|  | [optional] |
| **dbServerName** | **String**|  | [optional] |
| **storageUid** | **String**|  | [optional] |
| **accountId** | **UUID**|  | [optional] |
| **_public** | **Boolean**|  | [optional] [default to false] |
| **authorization** | **String**|  | [optional] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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

<a id="deleteInstanceInstancesInstanceIdDelete"></a>
# **deleteInstanceInstancesInstanceIdDelete**
> Object deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, spaceId, authorization)

Delete Instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String instanceName = "instanceName_example"; // String | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#deleteInstanceInstancesInstanceIdDelete");
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
| **instanceName** | **String**|  | |
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

<a id="getInstanceSettingsInstancesOwnerNameSettingsGet"></a>
# **getInstanceSettingsInstancesOwnerNameSettingsGet**
> Object getInstanceSettingsInstancesOwnerNameSettingsGet(owner, name, authorization)

Get Instance Settings

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String owner = "owner_example"; // String | 
    String name = "name_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getInstanceSettingsInstancesOwnerNameSettingsGet(owner, name, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#getInstanceSettingsInstancesOwnerNameSettingsGet");
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
| **owner** | **String**|  | |
| **name** | **String**|  | |
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

<a id="listCollaboratorsInstancesInstanceIdCollaboratorsGet"></a>
# **listCollaboratorsInstancesInstanceIdCollaboratorsGet**
> Object listCollaboratorsInstancesInstanceIdCollaboratorsGet(instanceId, spaceId, authorization)

List Collaborators

List all collaborators of an instance.  Parameters: - **instance_id**: UUID of the instance to list collaborators for (from URL path)  Returns: - **200**: List of instance collaborators retrieved successfully  Requires read access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listCollaboratorsInstancesInstanceIdCollaboratorsGet(instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#listCollaboratorsInstancesInstanceIdCollaboratorsGet");
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

<a id="migrateInstanceInstancesInstanceIdMigratePost"></a>
# **migrateInstanceInstancesInstanceIdMigratePost**
> Object migrateInstanceInstancesInstanceIdMigratePost(instanceId, spaceId, authorization)

Migrate Instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.migrateInstanceInstancesInstanceIdMigratePost(instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#migrateInstanceInstancesInstanceIdMigratePost");
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

<a id="removeCollaboratorInstancesInstanceIdCollaboratorsDelete"></a>
# **removeCollaboratorInstancesInstanceIdCollaboratorsDelete**
> Object removeCollaboratorInstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, spaceId, authorization)

Remove Collaborator

Remove a collaborator from an instance.  Parameters: - **instance_id**: UUID of the instance (from URL path) - **account_id**: UUID of the account to remove (mutually exclusive with team_id) - **team_id**: UUID of the team to remove (mutually exclusive with account_id)  Returns: - **200**: Collaborator removed successfully - **400**: Invalid input (e.g., both account_id and team_id provided)  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeCollaboratorInstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#removeCollaboratorInstancesInstanceIdCollaboratorsDelete");
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
| **accountId** | **UUID**|  | [optional] |
| **teamId** | **UUID**|  | [optional] |
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

<a id="transferOwnershipInstancesInstanceIdOwnerHandlePatch"></a>
# **transferOwnershipInstancesInstanceIdOwnerHandlePatch**
> Object transferOwnershipInstancesInstanceIdOwnerHandlePatch(handle, instanceId, spaceId, authorization)

Transfer Ownership

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String handle = "handle_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.transferOwnershipInstancesInstanceIdOwnerHandlePatch(handle, instanceId, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#transferOwnershipInstancesInstanceIdOwnerHandlePatch");
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
| **handle** | **String**|  | |
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

<a id="updateCollaboratorInstancesInstanceIdCollaboratorsPatch"></a>
# **updateCollaboratorInstancesInstanceIdCollaboratorsPatch**
> Object updateCollaboratorInstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, spaceId, authorization)

Update Collaborator

Update a collaborator&#39;s permissions on an instance.  Parameters: - **instance_id**: UUID of the instance (from URL path) - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to update (mutually exclusive with team_id)   - **team_id**: UUID of the team to update (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **200**: Collaborator updated successfully - **400**: Invalid input (e.g., both account_id and team_id provided)  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UpdateCollaboratorRequestBody updateCollaboratorRequestBody = new UpdateCollaboratorRequestBody(); // UpdateCollaboratorRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateCollaboratorInstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#updateCollaboratorInstancesInstanceIdCollaboratorsPatch");
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
| **updateCollaboratorRequestBody** | [**UpdateCollaboratorRequestBody**](UpdateCollaboratorRequestBody.md)|  | |
| **spaceId** | **UUID**|  | [optional] |
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

