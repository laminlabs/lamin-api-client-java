# InstancesApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollaboratorInstancesInstanceIdCollaboratorsPut**](InstancesApi.md#addCollaboratorInstancesInstanceIdCollaboratorsPut) | **PUT** /instances/{instance_id}/collaborators | Add Collaborator |
| [**createInstanceInstancesPut**](InstancesApi.md#createInstanceInstancesPut) | **PUT** /instances | Create Instance |
| [**deleteInstanceInstancesInstanceIdDelete**](InstancesApi.md#deleteInstanceInstancesInstanceIdDelete) | **DELETE** /instances/{instance_id} | Delete Instance |
| [**getInstanceSettingsInstancesOwnerNameSettingsGet**](InstancesApi.md#getInstanceSettingsInstancesOwnerNameSettingsGet) | **GET** /instances/{owner}/{name}/settings | Get Instance Settings |
| [**listCollaboratorsInstancesInstanceIdCollaboratorsGet**](InstancesApi.md#listCollaboratorsInstancesInstanceIdCollaboratorsGet) | **GET** /instances/{instance_id}/collaborators | List Collaborators |
| [**removeCollaboratorInstancesInstanceIdCollaboratorsDelete**](InstancesApi.md#removeCollaboratorInstancesInstanceIdCollaboratorsDelete) | **DELETE** /instances/{instance_id}/collaborators | Remove Collaborator |
| [**setInstancePrivateInstancesInstanceIdSetPrivatePost**](InstancesApi.md#setInstancePrivateInstancesInstanceIdSetPrivatePost) | **POST** /instances/{instance_id}/set-private | Set Instance Private |
| [**setInstancePublicInstancesInstanceIdSetPublicPost**](InstancesApi.md#setInstancePublicInstancesInstanceIdSetPublicPost) | **POST** /instances/{instance_id}/set-public | Set Instance Public |
| [**updateCollaboratorInstancesInstanceIdCollaboratorsPatch**](InstancesApi.md#updateCollaboratorInstancesInstanceIdCollaboratorsPatch) | **PATCH** /instances/{instance_id}/collaborators | Update Collaborator |


<a id="addCollaboratorInstancesInstanceIdCollaboratorsPut"></a>
# **addCollaboratorInstancesInstanceIdCollaboratorsPut**
> Object addCollaboratorInstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, spaceId)

Add Collaborator

Add an account or team collaborator to an instance.  **Permissions:** Requires instance admin access or organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    AddCollaboratorRequestBody addCollaboratorRequestBody = new AddCollaboratorRequestBody(); // AddCollaboratorRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.addCollaboratorInstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **addCollaboratorRequestBody** | [**AddCollaboratorRequestBody**](AddCollaboratorRequestBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

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
| **201** | Instance collaborator added. |  -  |
| **422** | Validation Error |  -  |

<a id="createInstanceInstancesPut"></a>
# **createInstanceInstancesPut**
> Object createInstanceInstancesPut(name, storage, schemaStr, dbServerName, storageUid, accountId, _public, requestBody)

Create Instance

Create an instance.  **Permissions:** Requires authentication. Organization-owned instances require organization manager or admin access.  **Quota:** Consumes instance quota for the owner account.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String name = "name_example"; // String | Instance name.
    String storage = "create-s3"; // String | Storage root, or 'create-s3' to create managed S3 storage.
    String schemaStr = "schemaStr_example"; // String | Serialized schema metadata for the instance.
    String dbServerName = "dbServerName_example"; // String | Database server name to create the instance on.
    String storageUid = "storageUid_example"; // String | Existing storage UID to attach to the instance.
    UUID accountId = UUID.randomUUID(); // UUID | Owner account UUID. Defaults to the caller account.
    Boolean _public = false; // Boolean | Create the instance as public.
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      Object result = apiInstance.createInstanceInstancesPut(name, storage, schemaStr, dbServerName, storageUid, accountId, _public, requestBody);
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
| **name** | **String**| Instance name. | |
| **storage** | **String**| Storage root, or &#39;create-s3&#39; to create managed S3 storage. | [optional] [default to create-s3] |
| **schemaStr** | **String**| Serialized schema metadata for the instance. | [optional] |
| **dbServerName** | **String**| Database server name to create the instance on. | [optional] |
| **storageUid** | **String**| Existing storage UID to attach to the instance. | [optional] |
| **accountId** | **UUID**| Owner account UUID. Defaults to the caller account. | [optional] |
| **_public** | **Boolean**| Create the instance as public. | [optional] [default to false] |
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | [optional] |

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
| **200** | Instance created. |  -  |
| **403** | Instance quota reached. |  -  |
| **422** | Validation Error |  -  |

<a id="deleteInstanceInstancesInstanceIdDelete"></a>
# **deleteInstanceInstancesInstanceIdDelete**
> Object deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, spaceId)

Delete Instance

Delete an instance after confirming its name.  **Permissions:** Requires instance admin access.  **Notes:** The instance name confirmation must exactly match the instance name.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    String instanceName = "instanceName_example"; // String | Instance name confirmation.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **instanceName** | **String**| Instance name confirmation. | |
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

<a id="getInstanceSettingsInstancesOwnerNameSettingsGet"></a>
# **getInstanceSettingsInstancesOwnerNameSettingsGet**
> Object getInstanceSettingsInstancesOwnerNameSettingsGet(owner, name)

Get Instance Settings

Return settings for an instance by owner and name.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    String owner = "owner_example"; // String | Owner account handle.
    String name = "name_example"; // String | Instance name.
    try {
      Object result = apiInstance.getInstanceSettingsInstancesOwnerNameSettingsGet(owner, name);
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
| **owner** | **String**| Owner account handle. | |
| **name** | **String**| Instance name. | |

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

<a id="listCollaboratorsInstancesInstanceIdCollaboratorsGet"></a>
# **listCollaboratorsInstancesInstanceIdCollaboratorsGet**
> Object listCollaboratorsInstancesInstanceIdCollaboratorsGet(instanceId, spaceId)

List Collaborators

List instance collaborators.  **Permissions:** Requires read access to the instance.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.listCollaboratorsInstancesInstanceIdCollaboratorsGet(instanceId, spaceId);
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

<a id="removeCollaboratorInstancesInstanceIdCollaboratorsDelete"></a>
# **removeCollaboratorInstancesInstanceIdCollaboratorsDelete**
> Object removeCollaboratorInstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, spaceId)

Remove Collaborator

Remove an account or team collaborator from an instance.  **Permissions:** Requires instance admin access or organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID accountId = UUID.randomUUID(); // UUID | Account UUID. Mutually exclusive with team_id.
    UUID teamId = UUID.randomUUID(); // UUID | Team UUID. Mutually exclusive with account_id.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.removeCollaboratorInstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **accountId** | **UUID**| Account UUID. Mutually exclusive with team_id. | [optional] |
| **teamId** | **UUID**| Team UUID. Mutually exclusive with account_id. | [optional] |
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

<a id="setInstancePrivateInstancesInstanceIdSetPrivatePost"></a>
# **setInstancePrivateInstancesInstanceIdSetPrivatePost**
> Object setInstancePrivateInstancesInstanceIdSetPrivatePost(instanceId, spaceId)

Set Instance Private

Make an instance private.  **Permissions:** Requires instance admin access.  **Notes:** Removes public read access and refreshes access state.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.setInstancePrivateInstancesInstanceIdSetPrivatePost(instanceId, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#setInstancePrivateInstancesInstanceIdSetPrivatePost");
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

<a id="setInstancePublicInstancesInstanceIdSetPublicPost"></a>
# **setInstancePublicInstancesInstanceIdSetPublicPost**
> Object setInstancePublicInstancesInstanceIdSetPublicPost(instanceId, spaceId)

Set Instance Public

Make an instance public.  **Permissions:** Requires instance admin access.  **Notes:** Makes the instance publicly readable and refreshes access state.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.setInstancePublicInstancesInstanceIdSetPublicPost(instanceId, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstancesApi#setInstancePublicInstancesInstanceIdSetPublicPost");
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

<a id="updateCollaboratorInstancesInstanceIdCollaboratorsPatch"></a>
# **updateCollaboratorInstancesInstanceIdCollaboratorsPatch**
> Object updateCollaboratorInstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, spaceId)

Update Collaborator

Update an instance collaborator&#39;s role.  **Permissions:** Requires instance admin access or organization manager or admin access.

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.auth.*;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");
    
    // Configure HTTP bearer authorization: LaminAccessToken
    HttpBearerAuth LaminAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("LaminAccessToken");
    LaminAccessToken.setBearerToken("BEARER TOKEN");

    InstancesApi apiInstance = new InstancesApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | Instance UUID.
    UpdateCollaboratorRequestBody updateCollaboratorRequestBody = new UpdateCollaboratorRequestBody(); // UpdateCollaboratorRequestBody | 
    UUID spaceId = UUID.randomUUID(); // UUID | Space UUID for space-scoped access checks.
    try {
      Object result = apiInstance.updateCollaboratorInstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, spaceId);
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
| **instanceId** | **UUID**| Instance UUID. | |
| **updateCollaboratorRequestBody** | [**UpdateCollaboratorRequestBody**](UpdateCollaboratorRequestBody.md)|  | |
| **spaceId** | **UUID**| Space UUID for space-scoped access checks. | [optional] |

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

