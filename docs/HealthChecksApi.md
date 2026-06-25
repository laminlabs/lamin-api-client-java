# HealthChecksApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCheckHealthGet**](HealthChecksApi.md#healthCheckHealthGet) | **GET** /health | Health Check |


<a id="healthCheckHealthGet"></a>
# **healthCheckHealthGet**
> Object healthCheckHealthGet()

Health Check

### Example
```java
// Import classes:
import ai.lamin.lamin_api_client.ApiClient;
import ai.lamin.lamin_api_client.ApiException;
import ai.lamin.lamin_api_client.Configuration;
import ai.lamin.lamin_api_client.models.*;
import ai.lamin.lamin_api_client.api.HealthChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api");

    HealthChecksApi apiInstance = new HealthChecksApi(defaultClient);
    try {
      Object result = apiInstance.healthCheckHealthGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthChecksApi#healthCheckHealthGet");
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

