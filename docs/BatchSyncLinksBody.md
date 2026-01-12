

# BatchSyncLinksBody

The request body for the batch synchronization endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instructions** | [**List&lt;SyncInstruction&gt;**](SyncInstruction.md) | A list of synchronization instructions to be processed in a single batch. |  |
|**listKey** | **String** | The name of the column whose values are being synchronized (e.g., &#39;ulabel_id&#39;). This must be the same for all instructions in the batch. |  |



