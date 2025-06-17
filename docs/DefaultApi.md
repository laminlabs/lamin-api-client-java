# DefaultApi

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut**](DefaultApi.md#addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut) | **PUT** /access_v2/instances/{instance_id}/collaborators | Add Collaborator |
| [**addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut**](DefaultApi.md#addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut) | **PUT** /instances/{instance_id}/collaborators/{account_id} | Add Collaborator |
| [**addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut**](DefaultApi.md#addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut) | **PUT** /access_v2/organizations/{organization_id}/members/{account_id} | Add Organization Member |
| [**addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut**](DefaultApi.md#addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut) | **PUT** /access_v2/spaces/{space_id}/collaborators | Add Space Collaborator |
| [**addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut**](DefaultApi.md#addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut) | **PUT** /access_v2/teams/{team_id}/members/{account_id} | Add Team Member |
| [**attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**](DefaultApi.md#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Attach Label |
| [**attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut**](DefaultApi.md#attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut) | **PUT** /access_v2/spaces/{space_id}/instances/{instance_id} | Attach Space To Instance |
| [**checkCacheAccessDebugCacheAccessGet**](DefaultApi.md#checkCacheAccessDebugCacheAccessGet) | **GET** /_debug/cache-access | Check Cache Access |
| [**checkDbAccessDebugDbAccessPost**](DefaultApi.md#checkDbAccessDebugDbAccessPost) | **POST** /_debug/db-access | Check Db Access |
| [**checkDbServerAccessDbServerCheckAccessPost**](DefaultApi.md#checkDbServerAccessDbServerCheckAccessPost) | **POST** /db/server/check-access | Check Db Server Access |
| [**checkLambdaAccessDebugLambdaAccessGet**](DefaultApi.md#checkLambdaAccessDebugLambdaAccessGet) | **GET** /_debug/lambda-access | Check Lambda Access |
| [**createArtifactInstancesInstanceIdArtifactsCreatePost**](DefaultApi.md#createArtifactInstancesInstanceIdArtifactsCreatePost) | **POST** /instances/{instance_id}/artifacts/create | Create Artifact |
| [**createInstanceInstancesPut**](DefaultApi.md#createInstanceInstancesPut) | **PUT** /instances | Create Instance |
| [**createRecordsInstancesInstanceIdModulesModuleNameModelNamePut**](DefaultApi.md#createRecordsInstancesInstanceIdModulesModuleNameModelNamePut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name} | Create Records |
| [**createSpaceAccessV2SpacesPut**](DefaultApi.md#createSpaceAccessV2SpacesPut) | **PUT** /access_v2/spaces | Create Space |
| [**createTeamAccessV2TeamsPut**](DefaultApi.md#createTeamAccessV2TeamsPut) | **PUT** /access_v2/teams | Create Team |
| [**createTransformInstancesInstanceIdTransformsPost**](DefaultApi.md#createTransformInstancesInstanceIdTransformsPost) | **POST** /instances/{instance_id}/transforms | Create Transform |
| [**deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete**](DefaultApi.md#deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete) | **DELETE** /instances/{instance_id}/collaborators/{account_id} | Delete Collaborator |
| [**deleteInstanceInstancesInstanceIdDelete**](DefaultApi.md#deleteInstanceInstancesInstanceIdDelete) | **DELETE** /instances/{instance_id} | Delete Instance |
| [**deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**](DefaultApi.md#deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Delete Record |
| [**deleteSpaceAccessV2SpacesSpaceIdDelete**](DefaultApi.md#deleteSpaceAccessV2SpacesSpaceIdDelete) | **DELETE** /access_v2/spaces/{space_id} | Delete Space |
| [**deleteTeamAccessV2TeamsTeamIdDelete**](DefaultApi.md#deleteTeamAccessV2TeamsTeamIdDelete) | **DELETE** /access_v2/teams/{team_id} | Delete Team |
| [**detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**](DefaultApi.md#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Detach Label |
| [**detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete**](DefaultApi.md#detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete) | **DELETE** /access_v2/spaces/{space_id}/instances/{instance_id} | Detach Space From Instance |
| [**getCallerAccountAccountGet**](DefaultApi.md#getCallerAccountAccountGet) | **GET** /account | Get Caller Account |
| [**getDbTokenAccessV2InstancesInstanceIdDbTokenGet**](DefaultApi.md#getDbTokenAccessV2InstancesInstanceIdDbTokenGet) | **GET** /access_v2/instances/{instance_id}/db_token | Get Db Token |
| [**getInstanceStatisticsInstancesInstanceIdStatisticsGet**](DefaultApi.md#getInstanceStatisticsInstancesInstanceIdStatisticsGet) | **GET** /instances/{instance_id}/statistics | Get Instance Statistics |
| [**getIpDebugIpGet**](DefaultApi.md#getIpDebugIpGet) | **GET** /_debug/ip | Get Ip |
| [**getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**](DefaultApi.md#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet) | **GET** /instances/{instance_id}/non_empty_tables | Get Non Empty Tables |
| [**getOrganizationAccessV2OrganizationsOrganizationIdGet**](DefaultApi.md#getOrganizationAccessV2OrganizationsOrganizationIdGet) | **GET** /access_v2/organizations/{organization_id} | Get Organization |
| [**getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**](DefaultApi.md#getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/{id_or_uid} | Get Record |
| [**getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**](DefaultApi.md#getRecordsInstancesInstanceIdModulesModuleNameModelNamePost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name} | Get Records |
| [**getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**](DefaultApi.md#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet) | **GET** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/counts | Get Relation Counts |
| [**getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**](DefaultApi.md#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet) | **GET** /instances/{instance_id}/schema/{module_name}/{model_name} | Get Relations |
| [**getSchemaInstancesInstanceIdSchemaGet**](DefaultApi.md#getSchemaInstancesInstanceIdSchemaGet) | **GET** /instances/{instance_id}/schema | Get Schema |
| [**getSpaceAccessV2SpacesSpaceIdGet**](DefaultApi.md#getSpaceAccessV2SpacesSpaceIdGet) | **GET** /access_v2/spaces/{space_id} | Get Space |
| [**getTeamAccessV2TeamsTeamIdGet**](DefaultApi.md#getTeamAccessV2TeamsTeamIdGet) | **GET** /access_v2/teams/{team_id} | Get Team |
| [**getTreeInstancesInstanceIdTreeGet**](DefaultApi.md#getTreeInstancesInstanceIdTreeGet) | **GET** /instances/{instance_id}/tree | Get Tree |
| [**getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**](DefaultApi.md#getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/fields/{field_path} | Get Values |
| [**grantS3PermissionsStoragesS3BucketNamePermissionsPut**](DefaultApi.md#grantS3PermissionsStoragesS3BucketNamePermissionsPut) | **PUT** /storages/s3/{bucket_name}/permissions | Grant S3 Permissions |
| [**groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**](DefaultApi.md#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/group-by | Group By |
| [**listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet**](DefaultApi.md#listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet) | **GET** /access_v2/instances/{instance_id}/collaborators | List Collaborators |
| [**listDirectoryInstancesInstanceIdEntityTypeGet**](DefaultApi.md#listDirectoryInstancesInstanceIdEntityTypeGet) | **GET** /instances/{instance_id}/{entity_type} | List Directory |
| [**listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet**](DefaultApi.md#listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet) | **GET** /access_v2/spaces/instances/{instance_id} | List Instance Spaces |
| [**listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet**](DefaultApi.md#listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet) | **GET** /access_v2/spaces/{space_id}/instances | List Instances Using Space |
| [**listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet**](DefaultApi.md#listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet) | **GET** /access_v2/organizations/{organization_id}/members | List Organization Members |
| [**listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet**](DefaultApi.md#listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet) | **GET** /access_v2/spaces/organizations/{organization_id} | List Organization Spaces |
| [**listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet**](DefaultApi.md#listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet) | **GET** /access_v2/teams/organizations/{organization_id} | List Organization Teams |
| [**listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet**](DefaultApi.md#listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet) | **GET** /access_v2/spaces/{space_id}/collaborators | List Space Collaborators |
| [**listTeamMembersAccessV2TeamsTeamIdMembersGet**](DefaultApi.md#listTeamMembersAccessV2TeamsTeamIdMembersGet) | **GET** /access_v2/teams/{team_id}/members | List Team Members |
| [**moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut**](DefaultApi.md#moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut) | **PUT** /access_v2/spaces/{space_id}/record-attachments | Move Record To Space |
| [**proxyS3S3PathGet**](DefaultApi.md#proxyS3S3PathGet) | **GET** /s3/{path} | Proxy S3 |
| [**proxyS3S3PathGet_0**](DefaultApi.md#proxyS3S3PathGet_0) | **HEAD** /s3/{path} | Proxy S3 |
| [**proxyS3S3PathGet_1**](DefaultApi.md#proxyS3S3PathGet_1) | **PUT** /s3/{path} | Proxy S3 |
| [**proxyS3S3PathGet_2**](DefaultApi.md#proxyS3S3PathGet_2) | **POST** /s3/{path} | Proxy S3 |
| [**proxyS3S3PathGet_3**](DefaultApi.md#proxyS3S3PathGet_3) | **DELETE** /s3/{path} | Proxy S3 |
| [**registerDbServerDbServerRegisterPost**](DefaultApi.md#registerDbServerDbServerRegisterPost) | **POST** /db/server/register | Register Db Server |
| [**registerFormInstancesInstanceIdFormsPost**](DefaultApi.md#registerFormInstancesInstanceIdFormsPost) | **POST** /instances/{instance_id}/forms | Register Form |
| [**removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete**](DefaultApi.md#removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete) | **DELETE** /access_v2/instances/{instance_id}/collaborators | Remove Collaborator |
| [**removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete**](DefaultApi.md#removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete) | **DELETE** /access_v2/organizations/{organization_id}/members/{account_id} | Remove Organization Member |
| [**removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete**](DefaultApi.md#removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete) | **DELETE** /access_v2/spaces/{space_id}/collaborators | Remove Space Collaborator |
| [**removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete**](DefaultApi.md#removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete) | **DELETE** /access_v2/teams/{team_id}/members/{account_id} | Remove Team Member |
| [**transferOwnershipInstancesInstanceIdOwnerHandlePatch**](DefaultApi.md#transferOwnershipInstancesInstanceIdOwnerHandlePatch) | **PATCH** /instances/{instance_id}/owner/{handle} | Transfer Ownership |
| [**updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch**](DefaultApi.md#updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch) | **PATCH** /access_v2/instances/{instance_id}/collaborators | Update Collaborator |
| [**updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch**](DefaultApi.md#updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch) | **PATCH** /instances/{instance_id}/collaborators/{account_id} | Update Collaborator |
| [**updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch**](DefaultApi.md#updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch) | **PATCH** /access_v2/organizations/{organization_id}/members/{account_id} | Update Organization Member |
| [**updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**](DefaultApi.md#updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch) | **PATCH** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Update Record |
| [**updateSpaceAccessV2SpacesSpaceIdPatch**](DefaultApi.md#updateSpaceAccessV2SpacesSpaceIdPatch) | **PATCH** /access_v2/spaces/{space_id} | Update Space |
| [**updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch**](DefaultApi.md#updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch) | **PATCH** /access_v2/spaces/{space_id}/collaborators | Update Space Collaborator |
| [**updateTeamAccessV2TeamsTeamIdPatch**](DefaultApi.md#updateTeamAccessV2TeamsTeamIdPatch) | **PATCH** /access_v2/teams/{team_id} | Update Team |
| [**updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch**](DefaultApi.md#updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch) | **PATCH** /access_v2/teams/{team_id}/members/{account_id} | Update Team Member |
| [**uploadArtifactInstancesInstanceIdArtifactsUploadPost**](DefaultApi.md#uploadArtifactInstancesInstanceIdArtifactsUploadPost) | **POST** /instances/{instance_id}/artifacts/upload | Upload Artifact |
| [**upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut**](DefaultApi.md#upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/upsert | Upsert Records |


<a id="addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut"></a>
# **addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut**
> Object addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, authorization)

Add Collaborator

Add a collaborator (account or team) to an instance.  Parameters: - **instance_id**: UUID of the instance to add the collaborator to (from URL path) - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to add (mutually exclusive with team_id)   - **team_id**: UUID of the team to add (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **201**: Collaborator added successfully - **400**: Invalid input (e.g., both account_id and team_id provided) - **409**: Collaborator was already added  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    AddCollaboratorRequestBody addCollaboratorRequestBody = new AddCollaboratorRequestBody(); // AddCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut(instanceId, addCollaboratorRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut");
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

<a id="addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut"></a>
# **addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut**
> Object addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut(instanceId, accountId, schemaId, role, authorization)

Add Collaborator

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String role = "admin"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut(instanceId, accountId, schemaId, role, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut");
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
| **accountId** | **UUID**|  | |
| **schemaId** | **UUID**|  | |
| **role** | **String**|  | [optional] [default to read] [enum: admin, write, read] |
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

<a id="addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut"></a>
# **addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut**
> Object addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody, authorization)

Add Organization Member

Add a member to an organization.  Parameters: - **organization_id**: UUID of the organization to add the member to - **account_id**: UUID of the account to add as a member - **body**: Request body containing member details   - **role**: Role of the member in the organization  Returns: - **201**: Organization member added successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    AddOrganizationMemberRequestBody addOrganizationMemberRequestBody = new AddOrganizationMemberRequestBody(); // AddOrganizationMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut(organizationId, accountId, addOrganizationMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPut");
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

<a id="addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut"></a>
# **addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut**
> Object addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody, authorization)

Add Space Collaborator

Add a collaborator (account or team) to a space.  Parameters: - **space_id**: ID of the space to add the collaborator to - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to add (mutually exclusive with team_id)   - **team_id**: UUID of the team to add (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **201**: Collaborator added to space successfully - **400**: Invalid input (e.g., both account_id and team_id provided)

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    AddSpaceCollaboratorRequestBody addSpaceCollaboratorRequestBody = new AddSpaceCollaboratorRequestBody(); // AddSpaceCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut(spaceId, addSpaceCollaboratorRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut");
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

<a id="addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut"></a>
# **addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut**
> Object addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody, authorization)

Add Team Member

Add a member to a team.  Parameters: - **team_id**: UUID of the team to add the member to - **account_id**: UUID of the account to add as a member - **body**: Request body containing member details   - **role**: Role of the member in the team  Returns: - **201**: Team member added successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    AddTeamMemberRequestBody addTeamMemberRequestBody = new AddTeamMemberRequestBody(); // AddTeamMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut(teamId, accountId, addTeamMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut");
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

<a id="attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut"></a>
# **attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**
> Object attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, schemaId, authorization)

Attach Label

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "artifact"; // String | 
    Integer id = 56; // Integer | 
    String labelField = "labelField_example"; // String | 
    Integer labelId = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut(moduleName, modelName, id, labelField, labelId, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | [enum: artifact, transform, collection] |
| **id** | **Integer**|  | |
| **labelField** | **String**|  | |
| **labelId** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut"></a>
# **attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut**
> Object attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId, authorization)

Attach Space To Instance

Attach a space to a specific instance.  Parameters: - **space_id**: ID of the space to attach - **instance_id**: UUID of the instance to attach the space to (from URL path)  Returns: - **200**: Space attached to instance successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut(spaceId, instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut");
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

<a id="checkCacheAccessDebugCacheAccessGet"></a>
# **checkCacheAccessDebugCacheAccessGet**
> Object checkCacheAccessDebugCacheAccessGet()

Check Cache Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Object result = apiInstance.checkCacheAccessDebugCacheAccessGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#checkCacheAccessDebugCacheAccessGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="checkDbAccessDebugDbAccessPost"></a>
# **checkDbAccessDebugDbAccessPost**
> Object checkDbAccessDebugDbAccessPost(dbUrlRequest)

Check Db Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    DbUrlRequest dbUrlRequest = new DbUrlRequest(); // DbUrlRequest | 
    try {
      Object result = apiInstance.checkDbAccessDebugDbAccessPost(dbUrlRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#checkDbAccessDebugDbAccessPost");
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
| **dbUrlRequest** | [**DbUrlRequest**](DbUrlRequest.md)|  | |

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

<a id="checkDbServerAccessDbServerCheckAccessPost"></a>
# **checkDbServerAccessDbServerCheckAccessPost**
> Object checkDbServerAccessDbServerCheckAccessPost(name, authorization)

Check Db Server Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String name = "name_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.checkDbServerAccessDbServerCheckAccessPost(name, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#checkDbServerAccessDbServerCheckAccessPost");
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

<a id="checkLambdaAccessDebugLambdaAccessGet"></a>
# **checkLambdaAccessDebugLambdaAccessGet**
> Object checkLambdaAccessDebugLambdaAccessGet()

Check Lambda Access

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Object result = apiInstance.checkLambdaAccessDebugLambdaAccessGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#checkLambdaAccessDebugLambdaAccessGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="createArtifactInstancesInstanceIdArtifactsCreatePost"></a>
# **createArtifactInstancesInstanceIdArtifactsCreatePost**
> Object createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, authorization)

Create Artifact

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateArtifactRequestBody createArtifactRequestBody = new CreateArtifactRequestBody(); // CreateArtifactRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createArtifactInstancesInstanceIdArtifactsCreatePost(instanceId, createArtifactRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createArtifactInstancesInstanceIdArtifactsCreatePost");
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
| **createArtifactRequestBody** | [**CreateArtifactRequestBody**](CreateArtifactRequestBody.md)|  | |
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
> Object createInstanceInstancesPut(name, storage, schemaStr, dbServerKey, storageUid, authorization)

Create Instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String name = "name_example"; // String | 
    String storage = "create-s3"; // String | 
    String schemaStr = "schemaStr_example"; // String | 
    String dbServerKey = "dbServerKey_example"; // String | 
    String storageUid = "storageUid_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createInstanceInstancesPut(name, storage, schemaStr, dbServerKey, storageUid, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createInstanceInstancesPut");
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
| **dbServerKey** | **String**|  | [optional] |
| **storageUid** | **String**|  | [optional] |
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

<a id="createRecordsInstancesInstanceIdModulesModuleNameModelNamePut"></a>
# **createRecordsInstancesInstanceIdModulesModuleNameModelNamePut**
> Object createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, schemaId, authorization)

Create Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createRecordsInstancesInstanceIdModulesModuleNameModelNamePut(moduleName, modelName, instanceId, body, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createRecordsInstancesInstanceIdModulesModuleNameModelNamePut");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **body** | **Object**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="createSpaceAccessV2SpacesPut"></a>
# **createSpaceAccessV2SpacesPut**
> Object createSpaceAccessV2SpacesPut(createSpaceRequestBody, authorization)

Create Space

Create a new space.  Parameters: - **body**: Request body containing space details   - **name**: Name of the space   - **organization_id**: UUID of the organization   - **description**: Optional description of the space  Returns: - **201**: Space created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CreateSpaceRequestBody createSpaceRequestBody = new CreateSpaceRequestBody(); // CreateSpaceRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createSpaceAccessV2SpacesPut(createSpaceRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSpaceAccessV2SpacesPut");
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

<a id="createTeamAccessV2TeamsPut"></a>
# **createTeamAccessV2TeamsPut**
> Object createTeamAccessV2TeamsPut(createTeamRequestBody, authorization)

Create Team

Create a new team.  Parameters: - **body**: Request body containing team details   - **name**: Name of the team   - **organization_id**: UUID of the organization   - **description**: Optional description of the team  Returns: - **201**: Team created successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CreateTeamRequestBody createTeamRequestBody = new CreateTeamRequestBody(); // CreateTeamRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createTeamAccessV2TeamsPut(createTeamRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTeamAccessV2TeamsPut");
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

<a id="createTransformInstancesInstanceIdTransformsPost"></a>
# **createTransformInstancesInstanceIdTransformsPost**
> Object createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, authorization)

Create Transform

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    CreateTransformRequestBody createTransformRequestBody = new CreateTransformRequestBody(); // CreateTransformRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.createTransformInstancesInstanceIdTransformsPost(instanceId, createTransformRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTransformInstancesInstanceIdTransformsPost");
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
| **createTransformRequestBody** | [**CreateTransformRequestBody**](CreateTransformRequestBody.md)|  | |
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

<a id="deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete"></a>
# **deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete**
> Object deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete(instanceId, accountId, authorization)

Delete Collaborator

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete(instanceId, accountId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete");
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

<a id="deleteInstanceInstancesInstanceIdDelete"></a>
# **deleteInstanceInstancesInstanceIdDelete**
> Object deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, authorization)

Delete Instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String instanceName = "instanceName_example"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteInstanceInstancesInstanceIdDelete(instanceId, instanceName, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteInstanceInstancesInstanceIdDelete");
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

<a id="deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete"></a>
# **deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**
> Object deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, schemaId, authorization)

Delete Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String uid = "uid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete(moduleName, modelName, uid, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **uid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="deleteSpaceAccessV2SpacesSpaceIdDelete"></a>
# **deleteSpaceAccessV2SpacesSpaceIdDelete**
> Object deleteSpaceAccessV2SpacesSpaceIdDelete(spaceId, authorization)

Delete Space

Delete a space and detach it from the instance.  Parameters: - **space_id**: ID of the space to delete  Returns: - **200**: Space deleted successfully - **404**: Space not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteSpaceAccessV2SpacesSpaceIdDelete(spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteSpaceAccessV2SpacesSpaceIdDelete");
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

<a id="deleteTeamAccessV2TeamsTeamIdDelete"></a>
# **deleteTeamAccessV2TeamsTeamIdDelete**
> Object deleteTeamAccessV2TeamsTeamIdDelete(teamId, authorization)

Delete Team

Delete a team.  Parameters: - **team_id**: UUID of the team to delete  Returns: - **200**: Team deleted successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.deleteTeamAccessV2TeamsTeamIdDelete(teamId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTeamAccessV2TeamsTeamIdDelete");
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

<a id="detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete"></a>
# **detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**
> Object detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, schemaId, authorization)

Detach Label

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "artifact"; // String | 
    Integer id = 56; // Integer | 
    String labelField = "labelField_example"; // String | 
    Integer labelId = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete(moduleName, modelName, id, labelField, labelId, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | [enum: artifact, transform, collection] |
| **id** | **Integer**|  | |
| **labelField** | **String**|  | |
| **labelId** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete"></a>
# **detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete**
> Object detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId, authorization)

Detach Space From Instance

Detach a space from a specific instance.  Parameters: - **space_id**: ID of the space to detach - **instance_id**: UUID of the instance to detach the space from (from URL path)  Returns: - **200**: Space detached from instance successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete(spaceId, instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete");
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

<a id="getCallerAccountAccountGet"></a>
# **getCallerAccountAccountGet**
> Object getCallerAccountAccountGet(authorization)

Get Caller Account

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getCallerAccountAccountGet(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCallerAccountAccountGet");
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

<a id="getDbTokenAccessV2InstancesInstanceIdDbTokenGet"></a>
# **getDbTokenAccessV2InstancesInstanceIdDbTokenGet**
> Object getDbTokenAccessV2InstancesInstanceIdDbTokenGet(instanceId, authorization)

Get Db Token

Get a database token for the specified instance.  This token can be used to authenticate with the instance&#39;s database.  Parameters: - **instance_id**: UUID of the instance to get the token for (from URL path)  Returns: - **200**: Database token retrieved successfully   - **token**: The database token - **401**: Unauthorized

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getDbTokenAccessV2InstancesInstanceIdDbTokenGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getDbTokenAccessV2InstancesInstanceIdDbTokenGet");
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

<a id="getInstanceStatisticsInstancesInstanceIdStatisticsGet"></a>
# **getInstanceStatisticsInstancesInstanceIdStatisticsGet**
> Object getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, schemaId, authorization)

Get Instance Statistics

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    List<String> q = Arrays.asList(); // List<String> | In ${module}.${model} format (case-sensitive)
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getInstanceStatisticsInstancesInstanceIdStatisticsGet(instanceId, q, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getInstanceStatisticsInstancesInstanceIdStatisticsGet");
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
| **q** | [**List&lt;String&gt;**](String.md)| In ${module}.${model} format (case-sensitive) | [optional] |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="getIpDebugIpGet"></a>
# **getIpDebugIpGet**
> Object getIpDebugIpGet()

Get Ip

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Object result = apiInstance.getIpDebugIpGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getIpDebugIpGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

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

<a id="getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet"></a>
# **getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**
> Object getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, schemaId, authorization)

Get Non Empty Tables

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet(instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet");
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
| **schemaId** | **UUID**|  | [optional] |
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

<a id="getOrganizationAccessV2OrganizationsOrganizationIdGet"></a>
# **getOrganizationAccessV2OrganizationsOrganizationIdGet**
> Object getOrganizationAccessV2OrganizationsOrganizationIdGet(organizationId, authorization)

Get Organization

Get details of a specific organization.  Parameters: - **organization_id**: UUID of the organization to retrieve  Returns: - **200**: Organization details retrieved successfully - **404**: Organization not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getOrganizationAccessV2OrganizationsOrganizationIdGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getOrganizationAccessV2OrganizationsOrganizationIdGet");
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

<a id="getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost"></a>
# **getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**
> Object getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, schemaId, authorization, getRecordRequestBody)

Get Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String idOrUid = "idOrUid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limitToMany = 10; // Integer | 
    Boolean includeForeignKeys = false; // Boolean | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetRecordRequestBody getRecordRequestBody = new GetRecordRequestBody(); // GetRecordRequestBody | 
    try {
      Object result = apiInstance.getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost(moduleName, modelName, idOrUid, instanceId, limitToMany, includeForeignKeys, schemaId, authorization, getRecordRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **idOrUid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limitToMany** | **Integer**|  | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**|  | [optional] [default to false] |
| **schemaId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getRecordRequestBody** | [**GetRecordRequestBody**](GetRecordRequestBody.md)|  | [optional] |

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

<a id="getRecordsInstancesInstanceIdModulesModuleNameModelNamePost"></a>
# **getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**
> Object getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, schemaId, authorization, getRecordsRequestBody)

Get Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    Integer limitToMany = 10; // Integer | 
    Boolean includeForeignKeys = false; // Boolean | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetRecordsRequestBody getRecordsRequestBody = new GetRecordsRequestBody(); // GetRecordsRequestBody | 
    try {
      Object result = apiInstance.getRecordsInstancesInstanceIdModulesModuleNameModelNamePost(moduleName, modelName, instanceId, limit, offset, limitToMany, includeForeignKeys, schemaId, authorization, getRecordsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRecordsInstancesInstanceIdModulesModuleNameModelNamePost");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limitToMany** | **Integer**|  | [optional] [default to 10] |
| **includeForeignKeys** | **Boolean**|  | [optional] [default to false] |
| **schemaId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getRecordsRequestBody** | [**GetRecordsRequestBody**](GetRecordsRequestBody.md)|  | [optional] |

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

<a id="getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet"></a>
# **getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**
> Object getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, schemaId, authorization)

Get Relation Counts

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    Integer id = 56; // Integer | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet(moduleName, modelName, id, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **id** | **Integer**|  | |
| **instanceId** | **UUID**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet"></a>
# **getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**
> Object getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, authorization)

Get Relations

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet(moduleName, modelName, instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
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

<a id="getSchemaInstancesInstanceIdSchemaGet"></a>
# **getSchemaInstancesInstanceIdSchemaGet**
> Object getSchemaInstancesInstanceIdSchemaGet(instanceId, authorization)

Get Schema

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getSchemaInstancesInstanceIdSchemaGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSchemaInstancesInstanceIdSchemaGet");
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

<a id="getSpaceAccessV2SpacesSpaceIdGet"></a>
# **getSpaceAccessV2SpacesSpaceIdGet**
> Object getSpaceAccessV2SpacesSpaceIdGet(spaceId, authorization)

Get Space

Get details of a specific space.  Parameters: - **space_id**: ID of the space to retrieve  Returns: - **200**: Space details retrieved successfully - **404**: Space not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getSpaceAccessV2SpacesSpaceIdGet(spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSpaceAccessV2SpacesSpaceIdGet");
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

<a id="getTeamAccessV2TeamsTeamIdGet"></a>
# **getTeamAccessV2TeamsTeamIdGet**
> Object getTeamAccessV2TeamsTeamIdGet(teamId, authorization)

Get Team

Get details of a specific team.  Parameters: - **team_id**: UUID of the team to retrieve  Returns: - **200**: Team details retrieved successfully - **404**: Team not found

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getTeamAccessV2TeamsTeamIdGet(teamId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTeamAccessV2TeamsTeamIdGet");
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

<a id="getTreeInstancesInstanceIdTreeGet"></a>
# **getTreeInstancesInstanceIdTreeGet**
> Object getTreeInstancesInstanceIdTreeGet(instanceId, entityType, schemaId, authorization)

Get Tree

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String entityType = "artifact"; // String | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.getTreeInstancesInstanceIdTreeGet(instanceId, entityType, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTreeInstancesInstanceIdTreeGet");
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
| **entityType** | **String**|  | [enum: artifact, transform] |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost"></a>
# **getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**
> Object getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, schemaId, authorization, getValuesRequestBody)

Get Values

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String fieldPath = "fieldPath_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    GetValuesRequestBody getValuesRequestBody = new GetValuesRequestBody(); // GetValuesRequestBody | 
    try {
      Object result = apiInstance.getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost(moduleName, modelName, fieldPath, instanceId, limit, offset, schemaId, authorization, getValuesRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **fieldPath** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **schemaId** | **UUID**|  | [optional] |
| **authorization** | **String**|  | [optional] |
| **getValuesRequestBody** | [**GetValuesRequestBody**](GetValuesRequestBody.md)|  | [optional] |

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

<a id="grantS3PermissionsStoragesS3BucketNamePermissionsPut"></a>
# **grantS3PermissionsStoragesS3BucketNamePermissionsPut**
> Object grantS3PermissionsStoragesS3BucketNamePermissionsPut(bucketName, s3PermissionsRequest, awsAccountId, awsUserName, authorization)

Grant S3 Permissions

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String bucketName = "bucketName_example"; // String | 
    S3PermissionsRequest s3PermissionsRequest = new S3PermissionsRequest(); // S3PermissionsRequest | 
    String awsAccountId = "767398070972"; // String | 
    String awsUserName = "lamin-manager"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.grantS3PermissionsStoragesS3BucketNamePermissionsPut(bucketName, s3PermissionsRequest, awsAccountId, awsUserName, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#grantS3PermissionsStoragesS3BucketNamePermissionsPut");
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
| **bucketName** | **String**|  | |
| **s3PermissionsRequest** | [**S3PermissionsRequest**](S3PermissionsRequest.md)|  | |
| **awsAccountId** | **String**|  | [optional] [default to 767398070972] |
| **awsUserName** | **String**|  | [optional] [default to lamin-manager] |
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

<a id="groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost"></a>
# **groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**
> Object groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, schemaId, authorization)

Group By

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    GroupByRequestBody groupByRequestBody = new GroupByRequestBody(); // GroupByRequestBody | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost(moduleName, modelName, instanceId, groupByRequestBody, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **groupByRequestBody** | [**GroupByRequestBody**](GroupByRequestBody.md)|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet"></a>
# **listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet**
> Object listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet(instanceId, authorization)

List Collaborators

List all collaborators of an instance.  Parameters: - **instance_id**: UUID of the instance to list collaborators for (from URL path)  Returns: - **200**: List of instance collaborators retrieved successfully  Requires read access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet");
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

<a id="listDirectoryInstancesInstanceIdEntityTypeGet"></a>
# **listDirectoryInstancesInstanceIdEntityTypeGet**
> Object listDirectoryInstancesInstanceIdEntityTypeGet(entityType, instanceId, path, schemaId, authorization)

List Directory

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String entityType = "artifact"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String path = ""; // String | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listDirectoryInstancesInstanceIdEntityTypeGet(entityType, instanceId, path, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listDirectoryInstancesInstanceIdEntityTypeGet");
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
| **entityType** | **String**|  | [enum: artifact, transform] |
| **instanceId** | **UUID**|  | |
| **path** | **String**|  | [optional] [default to ] |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet"></a>
# **listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet**
> Object listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet(instanceId, authorization)

List Instance Spaces

List all spaces attached to an instance.  Parameters: - **instance_id**: UUID of the instance to list spaces for (from URL path)  Returns: - **200**: List of spaces attached to the instance retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet(instanceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet");
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

<a id="listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet"></a>
# **listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet**
> Object listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet(spaceId, authorization)

List Instances Using Space

List all instances that have this space attached.  Parameters: - **space_id**: ID of the space to check  Returns: - **200**: List of instances using the space retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet(spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet");
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

<a id="listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet"></a>
# **listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet**
> Object listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet(organizationId, authorization)

List Organization Members

List all members of an organization.  Parameters: - **organization_id**: UUID of the organization to list members for  Returns: - **200**: List of organization members retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listOrganizationMembersAccessV2OrganizationsOrganizationIdMembersGet");
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

<a id="listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet"></a>
# **listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet**
> Object listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet(organizationId, authorization)

List Organization Spaces

List all spaces in an organization.  Parameters: - **organization_id**: UUID of the organization to list spaces for  Returns: - **200**: List of spaces retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet");
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

<a id="listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet"></a>
# **listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet**
> Object listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet(organizationId, authorization)

List Organization Teams

List all teams in an organization.  Parameters: - **organization_id**: UUID of the organization to list teams for  Returns: - **200**: List of teams retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet(organizationId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet");
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

<a id="listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet"></a>
# **listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet**
> Object listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet(spaceId, authorization)

List Space Collaborators

List all collaborators of a space.  Parameters: - **space_id**: ID of the space to list collaborators for  Returns: - **200**: List of space collaborators retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet(spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet");
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

<a id="listTeamMembersAccessV2TeamsTeamIdMembersGet"></a>
# **listTeamMembersAccessV2TeamsTeamIdMembersGet**
> Object listTeamMembersAccessV2TeamsTeamIdMembersGet(teamId, authorization)

List Team Members

List all members of a team.  Parameters: - **team_id**: UUID of the team to list members for  Returns: - **200**: List of team members retrieved successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.listTeamMembersAccessV2TeamsTeamIdMembersGet(teamId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTeamMembersAccessV2TeamsTeamIdMembersGet");
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

<a id="moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut"></a>
# **moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut**
> Object moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut(instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId, schemaId, authorization)

Move Record To Space

Move a record to a specific space.  Parameters: - **space_id**: ID of the space to move the record to - **body**: Request body containing record details   - **module_name**: Module name of the record   - **model_name**: Model name of the record   - **record_id**: ID of the record to move in the space - **instance_id**: UUID of the instance (from URL path) - **schema_id**: UUID of the schema (from URL path)  Returns: - **200**: Record moved to the space successfully  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer instanceDbSpaceId = 56; // Integer | 
    AttachSpaceToRecordRequestBody attachSpaceToRecordRequestBody = new AttachSpaceToRecordRequestBody(); // AttachSpaceToRecordRequestBody | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut(instanceDbSpaceId, attachSpaceToRecordRequestBody, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut");
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
| **instanceDbSpaceId** | **Integer**|  | |
| **attachSpaceToRecordRequestBody** | [**AttachSpaceToRecordRequestBody**](AttachSpaceToRecordRequestBody.md)|  | |
| **instanceId** | **UUID**|  | [optional] |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="proxyS3S3PathGet"></a>
# **proxyS3S3PathGet**
> Object proxyS3S3PathGet(path)

Proxy S3

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      Object result = apiInstance.proxyS3S3PathGet(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#proxyS3S3PathGet");
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
| **path** | **String**|  | |

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

<a id="proxyS3S3PathGet_0"></a>
# **proxyS3S3PathGet_0**
> Object proxyS3S3PathGet_0(path)

Proxy S3

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      Object result = apiInstance.proxyS3S3PathGet_0(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#proxyS3S3PathGet_0");
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
| **path** | **String**|  | |

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

<a id="proxyS3S3PathGet_1"></a>
# **proxyS3S3PathGet_1**
> Object proxyS3S3PathGet_1(path)

Proxy S3

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      Object result = apiInstance.proxyS3S3PathGet_1(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#proxyS3S3PathGet_1");
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
| **path** | **String**|  | |

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

<a id="proxyS3S3PathGet_2"></a>
# **proxyS3S3PathGet_2**
> Object proxyS3S3PathGet_2(path)

Proxy S3

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      Object result = apiInstance.proxyS3S3PathGet_2(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#proxyS3S3PathGet_2");
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
| **path** | **String**|  | |

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

<a id="proxyS3S3PathGet_3"></a>
# **proxyS3S3PathGet_3**
> Object proxyS3S3PathGet_3(path)

Proxy S3

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String path = "path_example"; // String | 
    try {
      Object result = apiInstance.proxyS3S3PathGet_3(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#proxyS3S3PathGet_3");
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
| **path** | **String**|  | |

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

<a id="registerDbServerDbServerRegisterPost"></a>
# **registerDbServerDbServerRegisterPost**
> Object registerDbServerDbServerRegisterPost(registerDbServerBody, authorization)

Register Db Server

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    RegisterDbServerBody registerDbServerBody = new RegisterDbServerBody(); // RegisterDbServerBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.registerDbServerDbServerRegisterPost(registerDbServerBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#registerDbServerDbServerRegisterPost");
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
| **registerDbServerBody** | [**RegisterDbServerBody**](RegisterDbServerBody.md)|  | |
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

<a id="registerFormInstancesInstanceIdFormsPost"></a>
# **registerFormInstancesInstanceIdFormsPost**
> Object registerFormInstancesInstanceIdFormsPost(instanceId, registerFormRequest, authorization)

Register Form

Register a form for a specific instance.  Parameters: - **body**: Request body containing form details   - **key**: Key of the form   - **data**: Form data   - **schema_uid**: UID of the schema  Returns: - **201**: Form registered successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    RegisterFormRequest registerFormRequest = new RegisterFormRequest(); // RegisterFormRequest | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.registerFormInstancesInstanceIdFormsPost(instanceId, registerFormRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#registerFormInstancesInstanceIdFormsPost");
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
| **registerFormRequest** | [**RegisterFormRequest**](RegisterFormRequest.md)|  | |
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

<a id="removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete"></a>
# **removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete**
> Object removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, authorization)

Remove Collaborator

Remove a collaborator from an instance.  Parameters: - **instance_id**: UUID of the instance (from URL path) - **account_id**: UUID of the account to remove (mutually exclusive with team_id) - **team_id**: UUID of the team to remove (mutually exclusive with account_id)  Returns: - **200**: Collaborator removed successfully - **400**: Invalid input (e.g., both account_id and team_id provided)  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete(instanceId, accountId, teamId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete");
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

<a id="removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete"></a>
# **removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete**
> Object removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId, authorization)

Remove Organization Member

Remove a member from an organization.  Parameters: - **organization_id**: UUID of the organization to remove the member from - **account_id**: UUID of the account to remove from the organization  Returns: - **200**: Organization member removed successfully - **404**: Member not found in organization

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete(organizationId, accountId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#removeOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdDelete");
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

<a id="removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete"></a>
# **removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete**
> Object removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId, authorization)

Remove Space Collaborator

Remove a collaborator (account or team) from a space.  Parameters: - **space_id**: ID of the space to remove the collaborator from - **account_id**: UUID of the account to remove (mutually exclusive with team_id) - **team_id**: UUID of the team to remove (mutually exclusive with account_id)  Returns: - **200**: Collaborator removed from space successfully - **400**: Invalid input (e.g., both account_id and team_id provided or neither provided)

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UUID teamId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete(spaceId, accountId, teamId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete");
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

<a id="removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete"></a>
# **removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete**
> Object removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete(teamId, accountId, authorization)

Remove Team Member

Remove a member from a team.  Parameters: - **team_id**: UUID of the team to remove the member from - **account_id**: UUID of the account to remove from the team  Returns: - **200**: Team member removed successfully - **404**: Member not found in team

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete(teamId, accountId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete");
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

<a id="transferOwnershipInstancesInstanceIdOwnerHandlePatch"></a>
# **transferOwnershipInstancesInstanceIdOwnerHandlePatch**
> Object transferOwnershipInstancesInstanceIdOwnerHandlePatch(handle, instanceId, schemaId, authorization)

Transfer Ownership

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String handle = "handle_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.transferOwnershipInstancesInstanceIdOwnerHandlePatch(handle, instanceId, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#transferOwnershipInstancesInstanceIdOwnerHandlePatch");
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
| **schemaId** | **UUID**|  | [optional] |
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

<a id="updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch"></a>
# **updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch**
> Object updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, authorization)

Update Collaborator

Update a collaborator&#39;s permissions on an instance.  Parameters: - **instance_id**: UUID of the instance (from URL path) - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to update (mutually exclusive with team_id)   - **team_id**: UUID of the team to update (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **200**: Collaborator updated successfully - **400**: Invalid input (e.g., both account_id and team_id provided)  Requires admin access to the instance

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UpdateCollaboratorRequestBody updateCollaboratorRequestBody = new UpdateCollaboratorRequestBody(); // UpdateCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch(instanceId, updateCollaboratorRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch");
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

<a id="updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch"></a>
# **updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch**
> Object updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch(instanceId, accountId, role, authorization)

Update Collaborator

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    String role = "admin"; // String | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch(instanceId, accountId, role, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch");
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
| **accountId** | **UUID**|  | |
| **role** | **String**|  | [enum: admin, write, read] |
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

<a id="updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch"></a>
# **updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch**
> Object updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody, authorization)

Update Organization Member

Update an organization member&#39;s details.  Parameters: - **organization_id**: UUID of the organization the member belongs to - **account_id**: UUID of the account to update - **body**: Request body containing updated member details   - **role**: Role of the member in the organization  Returns: - **200**: Organization member updated successfully - **404**: Member not found in organization

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID organizationId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UpdateOrganizationMemberRequestBody updateOrganizationMemberRequestBody = new UpdateOrganizationMemberRequestBody(); // UpdateOrganizationMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch(organizationId, accountId, updateOrganizationMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateOrganizationMemberAccessV2OrganizationsOrganizationIdMembersAccountIdPatch");
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

<a id="updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch"></a>
# **updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**
> Object updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, schemaId, authorization)

Update Record

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    String uid = "uid_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch(moduleName, modelName, uid, instanceId, body, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **uid** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **body** | **Object**|  | |
| **schemaId** | **UUID**|  | [optional] |
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

<a id="updateSpaceAccessV2SpacesSpaceIdPatch"></a>
# **updateSpaceAccessV2SpacesSpaceIdPatch**
> Object updateSpaceAccessV2SpacesSpaceIdPatch(spaceId, updateSpaceRequestBody, authorization)

Update Space

Update a space&#39;s details.  Parameters: - **space_id**: ID of the space to update - **body**: Request body containing updated space details   - **name**: Optional new name for the space   - **description**: Optional new description for the space  Returns: - **200**: Space updated successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UpdateSpaceRequestBody updateSpaceRequestBody = new UpdateSpaceRequestBody(); // UpdateSpaceRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateSpaceAccessV2SpacesSpaceIdPatch(spaceId, updateSpaceRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSpaceAccessV2SpacesSpaceIdPatch");
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

<a id="updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch"></a>
# **updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch**
> Object updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody, authorization)

Update Space Collaborator

Update a collaborator&#39;s permissions in a space.  Parameters: - **space_id**: ID of the space to update the collaborator in - **body**: Request body containing collaborator details   - **account_id**: UUID of the account to update (mutually exclusive with team_id)   - **team_id**: UUID of the team to update (mutually exclusive with account_id)   - **role**: Role of the collaborator  Returns: - **200**: Collaborator updated successfully - **400**: Invalid input (e.g., both account_id and team_id provided) - **404**: Collaborator not found in space

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID spaceId = UUID.randomUUID(); // UUID | 
    UpdateSpaceCollaboratorRequestBody updateSpaceCollaboratorRequestBody = new UpdateSpaceCollaboratorRequestBody(); // UpdateSpaceCollaboratorRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch(spaceId, updateSpaceCollaboratorRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch");
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

<a id="updateTeamAccessV2TeamsTeamIdPatch"></a>
# **updateTeamAccessV2TeamsTeamIdPatch**
> Object updateTeamAccessV2TeamsTeamIdPatch(teamId, updateTeamRequestBody, authorization)

Update Team

Update a team&#39;s details.  Parameters: - **team_id**: UUID of the team to update - **body**: Request body containing updated team details   - **name**: Optional new name for the team   - **description**: Optional new description for the team  Returns: - **200**: Team updated successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UpdateTeamRequestBody updateTeamRequestBody = new UpdateTeamRequestBody(); // UpdateTeamRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateTeamAccessV2TeamsTeamIdPatch(teamId, updateTeamRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateTeamAccessV2TeamsTeamIdPatch");
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

<a id="updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch"></a>
# **updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch**
> Object updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody, authorization)

Update Team Member

Update a team member&#39;s details.  Parameters: - **team_id**: UUID of the team the member belongs to - **account_id**: UUID of the account to update - **body**: Request body containing updated member details   - **role**: Role of the member in the team  Returns: - **200**: Team member updated successfully - **404**: Member not found in team

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID teamId = UUID.randomUUID(); // UUID | 
    UUID accountId = UUID.randomUUID(); // UUID | 
    UpdateTeamMemberRequestBody updateTeamMemberRequestBody = new UpdateTeamMemberRequestBody(); // UpdateTeamMemberRequestBody | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch(teamId, accountId, updateTeamMemberRequestBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch");
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

<a id="uploadArtifactInstancesInstanceIdArtifactsUploadPost"></a>
# **uploadArtifactInstancesInstanceIdArtifactsUploadPost**
> Object uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, authorization, kwargs)

Upload Artifact

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    String authorization = "authorization_example"; // String | 
    String kwargs = "kwargs_example"; // String | 
    try {
      Object result = apiInstance.uploadArtifactInstancesInstanceIdArtifactsUploadPost(instanceId, _file, authorization, kwargs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#uploadArtifactInstancesInstanceIdArtifactsUploadPost");
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
| **_file** | **File**|  | |
| **authorization** | **String**|  | [optional] |
| **kwargs** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut"></a>
# **upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut**
> Object upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, body, conflictColumns, schemaId, authorization)

Upsert Records

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://aws.us-east-1.lamin.ai/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String moduleName = "moduleName_example"; // String | 
    String modelName = "modelName_example"; // String | 
    UUID instanceId = UUID.randomUUID(); // UUID | 
    Object body = null; // Object | 
    List<String> conflictColumns = Arrays.asList(); // List<String> | 
    UUID schemaId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut(moduleName, modelName, instanceId, body, conflictColumns, schemaId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#upsertRecordsInstancesInstanceIdModulesModuleNameModelNameUpsertPut");
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
| **moduleName** | **String**|  | |
| **modelName** | **String**|  | |
| **instanceId** | **UUID**|  | |
| **body** | **Object**|  | |
| **conflictColumns** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **schemaId** | **UUID**|  | [optional] |
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

