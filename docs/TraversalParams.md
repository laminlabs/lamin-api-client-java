

# TraversalParams

Parameters that define the hierarchical traversal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**values** | [**List&lt;TraversalParamsValuesInner&gt;**](TraversalParamsValuesInner.md) | A list of values for the specified &#39;field&#39; to begin the traversal from. |  |
|**kind** | [**KindEnum**](#KindEnum) | The direction of traversal |  |
|**field** | **String** | The field on the model to use for identifying starting records (e.g., &#39;id&#39;, &#39;uid&#39;). |  [optional] |
|**depth** | **Integer** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| ANCESTORS | &quot;ancestors&quot; |
| DESCENDANTS | &quot;descendants&quot; |



