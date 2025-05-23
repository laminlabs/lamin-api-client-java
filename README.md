# lamin-api-client

![Maven Central Version](https://img.shields.io/maven-central/v/ai.lamin/lamin-api-client)
[![javadoc](https://javadoc.io/badge2/ai.lamin/lamin-api-client/javadoc.svg)](https://javadoc.io/doc/ai.lamin/lamin-api-client) 

Lamin API
- API version: 0.1.0
  - Build date: 2025-05-10T19:58:41.182141089+02:00[Europe/Brussels]
  - Generator version: 7.12.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ai.lamin</groupId>
  <artifactId>lamin-api-client</artifactId>
  <version>0.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'lamin-api-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'lamin-api-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "ai.lamin:lamin-api-client:0.0.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lamin-api-client-0.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://aws.us-east-1.lamin.ai/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut**](docs/DefaultApi.md#addCollaboratorAccessV2InstancesInstanceIdCollaboratorsPut) | **PUT** /access_v2/instances/{instance_id}/collaborators | Add Collaborator
*DefaultApi* | [**addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut**](docs/DefaultApi.md#addCollaboratorInstancesInstanceIdCollaboratorsAccountIdPut) | **PUT** /instances/{instance_id}/collaborators/{account_id} | Add Collaborator
*DefaultApi* | [**addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut**](docs/DefaultApi.md#addSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPut) | **PUT** /access_v2/spaces/{space_id}/collaborators | Add Space Collaborator
*DefaultApi* | [**addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut**](docs/DefaultApi.md#addTeamMemberAccessV2TeamsTeamIdMembersAccountIdPut) | **PUT** /access_v2/teams/{team_id}/members/{account_id} | Add Team Member
*DefaultApi* | [**attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut**](docs/DefaultApi.md#attachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdPut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Attach Label
*DefaultApi* | [**attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut**](docs/DefaultApi.md#attachSpaceToInstanceAccessV2SpacesSpaceIdInstancesInstanceIdPut) | **PUT** /access_v2/spaces/{space_id}/instances/{instance_id} | Attach Space To Instance
*DefaultApi* | [**checkDbAccessDebugDbAccessPost**](docs/DefaultApi.md#checkDbAccessDebugDbAccessPost) | **POST** /_debug/db-access | Check Db Access
*DefaultApi* | [**checkDbServerAccessDbServerCheckAccessPost**](docs/DefaultApi.md#checkDbServerAccessDbServerCheckAccessPost) | **POST** /db/server/check-access | Check Db Server Access
*DefaultApi* | [**createInstanceInstancesPut**](docs/DefaultApi.md#createInstanceInstancesPut) | **PUT** /instances | Create Instance
*DefaultApi* | [**createRecordInstancesInstanceIdModulesModuleNameModelNamePut**](docs/DefaultApi.md#createRecordInstancesInstanceIdModulesModuleNameModelNamePut) | **PUT** /instances/{instance_id}/modules/{module_name}/{model_name} | Create Record
*DefaultApi* | [**createSpaceAccessV2SpacesPut**](docs/DefaultApi.md#createSpaceAccessV2SpacesPut) | **PUT** /access_v2/spaces | Create Space
*DefaultApi* | [**createTeamAccessV2TeamsPut**](docs/DefaultApi.md#createTeamAccessV2TeamsPut) | **PUT** /access_v2/teams | Create Team
*DefaultApi* | [**deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete**](docs/DefaultApi.md#deleteCollaboratorInstancesInstanceIdCollaboratorsAccountIdDelete) | **DELETE** /instances/{instance_id}/collaborators/{account_id} | Delete Collaborator
*DefaultApi* | [**deleteInstanceInstancesInstanceIdDelete**](docs/DefaultApi.md#deleteInstanceInstancesInstanceIdDelete) | **DELETE** /instances/{instance_id} | Delete Instance
*DefaultApi* | [**deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete**](docs/DefaultApi.md#deleteRecordInstancesInstanceIdModulesModuleNameModelNameUidDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Delete Record
*DefaultApi* | [**deleteSpaceAccessV2SpacesSpaceIdDelete**](docs/DefaultApi.md#deleteSpaceAccessV2SpacesSpaceIdDelete) | **DELETE** /access_v2/spaces/{space_id} | Delete Space
*DefaultApi* | [**deleteTeamAccessV2TeamsTeamIdDelete**](docs/DefaultApi.md#deleteTeamAccessV2TeamsTeamIdDelete) | **DELETE** /access_v2/teams/{team_id} | Delete Team
*DefaultApi* | [**detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete**](docs/DefaultApi.md#detachLabelInstancesInstanceIdModulesModuleNameModelNameIdLabelFieldLabelIdDelete) | **DELETE** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/{label_field}/{label_id} | Detach Label
*DefaultApi* | [**detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete**](docs/DefaultApi.md#detachSpaceFromInstanceAccessV2SpacesSpaceIdInstancesInstanceIdDelete) | **DELETE** /access_v2/spaces/{space_id}/instances/{instance_id} | Detach Space From Instance
*DefaultApi* | [**getDbTokenAccessV2InstancesInstanceIdDbTokenGet**](docs/DefaultApi.md#getDbTokenAccessV2InstancesInstanceIdDbTokenGet) | **GET** /access_v2/instances/{instance_id}/db_token | Get Db Token
*DefaultApi* | [**getInstanceStatisticsInstancesInstanceIdStatisticsGet**](docs/DefaultApi.md#getInstanceStatisticsInstancesInstanceIdStatisticsGet) | **GET** /instances/{instance_id}/statistics | Get Instance Statistics
*DefaultApi* | [**getIpDebugIpGet**](docs/DefaultApi.md#getIpDebugIpGet) | **GET** /_debug/ip | Get Ip
*DefaultApi* | [**getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet**](docs/DefaultApi.md#getNonEmptyTablesInstancesInstanceIdNonEmptyTablesGet) | **GET** /instances/{instance_id}/non_empty_tables | Get Non Empty Tables
*DefaultApi* | [**getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost**](docs/DefaultApi.md#getRecordInstancesInstanceIdModulesModuleNameModelNameIdOrUidPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/{id_or_uid} | Get Record
*DefaultApi* | [**getRecordsInstancesInstanceIdModulesModuleNameModelNamePost**](docs/DefaultApi.md#getRecordsInstancesInstanceIdModulesModuleNameModelNamePost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name} | Get Records
*DefaultApi* | [**getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet**](docs/DefaultApi.md#getRelationCountsInstancesInstanceIdModulesModuleNameModelNameIdCountsGet) | **GET** /instances/{instance_id}/modules/{module_name}/{model_name}/{id}/counts | Get Relation Counts
*DefaultApi* | [**getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet**](docs/DefaultApi.md#getRelationsInstancesInstanceIdSchemaModuleNameModelNameGet) | **GET** /instances/{instance_id}/schema/{module_name}/{model_name} | Get Relations
*DefaultApi* | [**getSchemaInstancesInstanceIdSchemaGet**](docs/DefaultApi.md#getSchemaInstancesInstanceIdSchemaGet) | **GET** /instances/{instance_id}/schema | Get Schema
*DefaultApi* | [**getSpaceAccessV2SpacesSpaceIdGet**](docs/DefaultApi.md#getSpaceAccessV2SpacesSpaceIdGet) | **GET** /access_v2/spaces/{space_id} | Get Space
*DefaultApi* | [**getTeamAccessV2TeamsTeamIdGet**](docs/DefaultApi.md#getTeamAccessV2TeamsTeamIdGet) | **GET** /access_v2/teams/{team_id} | Get Team
*DefaultApi* | [**getTreeInstancesInstanceIdTreeGet**](docs/DefaultApi.md#getTreeInstancesInstanceIdTreeGet) | **GET** /instances/{instance_id}/tree | Get Tree
*DefaultApi* | [**getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost**](docs/DefaultApi.md#getValuesInstancesInstanceIdModulesModuleNameModelNameFieldsFieldPathPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/fields/{field_path} | Get Values
*DefaultApi* | [**grantS3PermissionsStoragesS3BucketNamePermissionsPut**](docs/DefaultApi.md#grantS3PermissionsStoragesS3BucketNamePermissionsPut) | **PUT** /storages/s3/{bucket_name}/permissions | Grant S3 Permissions
*DefaultApi* | [**groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost**](docs/DefaultApi.md#groupByInstancesInstanceIdModulesModuleNameModelNameGroupByPost) | **POST** /instances/{instance_id}/modules/{module_name}/{model_name}/group-by | Group By
*DefaultApi* | [**listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet**](docs/DefaultApi.md#listCollaboratorsAccessV2InstancesInstanceIdCollaboratorsGet) | **GET** /access_v2/instances/{instance_id}/collaborators | List Collaborators
*DefaultApi* | [**listDirectoryInstancesInstanceIdEntityTypeGet**](docs/DefaultApi.md#listDirectoryInstancesInstanceIdEntityTypeGet) | **GET** /instances/{instance_id}/{entity_type} | List Directory
*DefaultApi* | [**listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet**](docs/DefaultApi.md#listInstanceSpacesAccessV2SpacesInstancesInstanceIdGet) | **GET** /access_v2/spaces/instances/{instance_id} | List Instance Spaces
*DefaultApi* | [**listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet**](docs/DefaultApi.md#listInstancesUsingSpaceAccessV2SpacesSpaceIdInstancesGet) | **GET** /access_v2/spaces/{space_id}/instances | List Instances Using Space
*DefaultApi* | [**listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet**](docs/DefaultApi.md#listOrganizationSpacesAccessV2SpacesOrganizationsOrganizationIdGet) | **GET** /access_v2/spaces/organizations/{organization_id} | List Organization Spaces
*DefaultApi* | [**listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet**](docs/DefaultApi.md#listOrganizationTeamsAccessV2TeamsOrganizationsOrganizationIdGet) | **GET** /access_v2/teams/organizations/{organization_id} | List Organization Teams
*DefaultApi* | [**listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet**](docs/DefaultApi.md#listSpaceCollaboratorsAccessV2SpacesSpaceIdCollaboratorsGet) | **GET** /access_v2/spaces/{space_id}/collaborators | List Space Collaborators
*DefaultApi* | [**listTeamMembersAccessV2TeamsTeamIdMembersGet**](docs/DefaultApi.md#listTeamMembersAccessV2TeamsTeamIdMembersGet) | **GET** /access_v2/teams/{team_id}/members | List Team Members
*DefaultApi* | [**moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut**](docs/DefaultApi.md#moveRecordToSpaceAccessV2SpacesSpaceIdRecordAttachmentsPut) | **PUT** /access_v2/spaces/{space_id}/record-attachments | Move Record To Space
*DefaultApi* | [**proxyS3S3PathGet**](docs/DefaultApi.md#proxyS3S3PathGet) | **GET** /s3/{path} | Proxy S3
*DefaultApi* | [**proxyS3S3PathGet_0**](docs/DefaultApi.md#proxyS3S3PathGet_0) | **HEAD** /s3/{path} | Proxy S3
*DefaultApi* | [**proxyS3S3PathGet_1**](docs/DefaultApi.md#proxyS3S3PathGet_1) | **PUT** /s3/{path} | Proxy S3
*DefaultApi* | [**proxyS3S3PathGet_2**](docs/DefaultApi.md#proxyS3S3PathGet_2) | **POST** /s3/{path} | Proxy S3
*DefaultApi* | [**proxyS3S3PathGet_3**](docs/DefaultApi.md#proxyS3S3PathGet_3) | **DELETE** /s3/{path} | Proxy S3
*DefaultApi* | [**registerDbServerDbServerRegisterPost**](docs/DefaultApi.md#registerDbServerDbServerRegisterPost) | **POST** /db/server/register | Register Db Server
*DefaultApi* | [**registerFormInstancesInstanceIdFormsPost**](docs/DefaultApi.md#registerFormInstancesInstanceIdFormsPost) | **POST** /instances/{instance_id}/forms | Register Form
*DefaultApi* | [**removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete**](docs/DefaultApi.md#removeCollaboratorAccessV2InstancesInstanceIdCollaboratorsDelete) | **DELETE** /access_v2/instances/{instance_id}/collaborators | Remove Collaborator
*DefaultApi* | [**removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete**](docs/DefaultApi.md#removeSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsDelete) | **DELETE** /access_v2/spaces/{space_id}/collaborators | Remove Space Collaborator
*DefaultApi* | [**removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete**](docs/DefaultApi.md#removeTeamMemberAccessV2TeamsTeamIdMembersAccountIdDelete) | **DELETE** /access_v2/teams/{team_id}/members/{account_id} | Remove Team Member
*DefaultApi* | [**transferOwnershipInstancesInstanceIdOwnerHandlePatch**](docs/DefaultApi.md#transferOwnershipInstancesInstanceIdOwnerHandlePatch) | **PATCH** /instances/{instance_id}/owner/{handle} | Transfer Ownership
*DefaultApi* | [**updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch**](docs/DefaultApi.md#updateCollaboratorAccessV2InstancesInstanceIdCollaboratorsPatch) | **PATCH** /access_v2/instances/{instance_id}/collaborators | Update Collaborator
*DefaultApi* | [**updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch**](docs/DefaultApi.md#updateCollaboratorInstancesInstanceIdCollaboratorsAccountIdPatch) | **PATCH** /instances/{instance_id}/collaborators/{account_id} | Update Collaborator
*DefaultApi* | [**updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch**](docs/DefaultApi.md#updateRecordInstancesInstanceIdModulesModuleNameModelNameUidPatch) | **PATCH** /instances/{instance_id}/modules/{module_name}/{model_name}/{uid} | Update Record
*DefaultApi* | [**updateSpaceAccessV2SpacesSpaceIdPatch**](docs/DefaultApi.md#updateSpaceAccessV2SpacesSpaceIdPatch) | **PATCH** /access_v2/spaces/{space_id} | Update Space
*DefaultApi* | [**updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch**](docs/DefaultApi.md#updateSpaceCollaboratorAccessV2SpacesSpaceIdCollaboratorsPatch) | **PATCH** /access_v2/spaces/{space_id}/collaborators | Update Space Collaborator
*DefaultApi* | [**updateTeamAccessV2TeamsTeamIdPatch**](docs/DefaultApi.md#updateTeamAccessV2TeamsTeamIdPatch) | **PATCH** /access_v2/teams/{team_id} | Update Team
*DefaultApi* | [**updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch**](docs/DefaultApi.md#updateTeamMemberAccessV2TeamsTeamIdMembersAccountIdPatch) | **PATCH** /access_v2/teams/{team_id}/members/{account_id} | Update Team Member


## Documentation for Models

 - [AddCollaboratorRequestBody](docs/AddCollaboratorRequestBody.md)
 - [AddSpaceCollaboratorRequestBody](docs/AddSpaceCollaboratorRequestBody.md)
 - [AddTeamMemberRequestBody](docs/AddTeamMemberRequestBody.md)
 - [AttachSpaceToRecordRequestBody](docs/AttachSpaceToRecordRequestBody.md)
 - [CreateSpaceRequestBody](docs/CreateSpaceRequestBody.md)
 - [CreateTeamRequestBody](docs/CreateTeamRequestBody.md)
 - [DbUrlRequest](docs/DbUrlRequest.md)
 - [Dimension](docs/Dimension.md)
 - [GetRecordRequestBody](docs/GetRecordRequestBody.md)
 - [GetRecordsRequestBody](docs/GetRecordsRequestBody.md)
 - [GetValuesRequestBody](docs/GetValuesRequestBody.md)
 - [GroupByRequestBody](docs/GroupByRequestBody.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [Measure](docs/Measure.md)
 - [OrderByColumn](docs/OrderByColumn.md)
 - [RegisterDbServerBody](docs/RegisterDbServerBody.md)
 - [RegisterFormRequest](docs/RegisterFormRequest.md)
 - [Role](docs/Role.md)
 - [Role1](docs/Role1.md)
 - [S3PermissionsRequest](docs/S3PermissionsRequest.md)
 - [UpdateCollaboratorRequestBody](docs/UpdateCollaboratorRequestBody.md)
 - [UpdateSpaceCollaboratorRequestBody](docs/UpdateSpaceCollaboratorRequestBody.md)
 - [UpdateSpaceRequestBody](docs/UpdateSpaceRequestBody.md)
 - [UpdateTeamMemberRequestBody](docs/UpdateTeamMemberRequestBody.md)
 - [UpdateTeamRequestBody](docs/UpdateTeamRequestBody.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorLocInner](docs/ValidationErrorLocInner.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



