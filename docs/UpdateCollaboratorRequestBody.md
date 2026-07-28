

# UpdateCollaboratorRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | New instance role. |  |
|**accountId** | **UUID** | Account UUID. Mutually exclusive with team_id. |  [optional] |
|**teamId** | **UUID** | Team UUID. Mutually exclusive with account_id. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| READ | &quot;read&quot; |
| WRITE | &quot;write&quot; |



