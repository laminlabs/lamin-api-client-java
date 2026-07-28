

# AddSpaceCollaboratorRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **UUID** | Account UUID. Mutually exclusive with team_id. |  [optional] |
|**teamId** | **UUID** | Team UUID. Mutually exclusive with account_id. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Space role for the collaborator. |  [optional] |
|**addGuestIfMissing** | **Boolean** | For account collaborators, add the account as an organization guest first when it is not already an organization member. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |



