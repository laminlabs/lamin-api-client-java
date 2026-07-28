

# UpdateSpaceCollaboratorRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **UUID** | Account UUID. Mutually exclusive with team_id. |  [optional] |
|**teamId** | **UUID** | Team UUID. Mutually exclusive with account_id. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | New space role. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |



