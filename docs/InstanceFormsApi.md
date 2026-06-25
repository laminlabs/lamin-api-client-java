# InstanceFormsApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registerFormInstancesInstanceIdFormsPost**](InstanceFormsApi.md#registerFormInstancesInstanceIdFormsPost) | **POST** /instances/{instance_id}/forms | Register Form |


<a id="registerFormInstancesInstanceIdFormsPost"></a>
# **registerFormInstancesInstanceIdFormsPost**
> Object registerFormInstancesInstanceIdFormsPost(instanceId, registerFormRequest, spaceId, authorization)

Register Form

Register a form for a specific instance.  Parameters: - **body**: Request body containing form details   - **key**: Key of the form   - **data**: Form data   - **schema_uid**: UID of the schema  Returns: - **200**: Form registered successfully

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.InstanceFormsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    InstanceFormsApi apiInstance = new InstanceFormsApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    RegisterFormRequest registerFormRequest = new RegisterFormRequest(); // RegisterFormRequest | 
    UUID spaceId = UUID.randomUUID(); // UUID | 
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.registerFormInstancesInstanceIdFormsPost(instanceId, registerFormRequest, spaceId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceFormsApi#registerFormInstancesInstanceIdFormsPost");
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

