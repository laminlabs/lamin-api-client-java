

# BatchSyncResponse

The detailed response model for a batch synchronization operation, including the lists of records that were processed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** |  |  |
|**deleted** | **List&lt;Map&lt;String, Object&gt;&gt;** | A list of the records that were deleted. |  |
|**inserted** | **List&lt;Map&lt;String, Object&gt;&gt;** | A list of the records that were inserted, including server-added audit fields. |  |
|**kept** | **Integer** | The number of records that already existed and were kept. |  |



