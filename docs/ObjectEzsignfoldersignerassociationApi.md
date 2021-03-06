# ObjectEzsignfoldersignerassociationApi

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ezsignfoldersignerassociationCreateObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationDeleteObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
[**ezsignfoldersignerassociationGetChildrenV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetChildrenV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren | Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
[**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
[**ezsignfoldersignerassociationGetObjectV1**](ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation


<a name="ezsignfoldersignerassociationCreateObjectV1"></a>
# **ezsignfoldersignerassociationCreateObjectV1**
> EzsignfoldersignerassociationCreateObjectV1Response ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request)

Create a new Ezsignfoldersignerassociation

The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldersignerassociationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi(defaultClient);
    List<EzsignfoldersignerassociationCreateObjectV1Request> ezsignfoldersignerassociationCreateObjectV1Request = Arrays.asList(); // List<EzsignfoldersignerassociationCreateObjectV1Request> | 
    try {
      EzsignfoldersignerassociationCreateObjectV1Response result = apiInstance.ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationCreateObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationCreateObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ezsignfoldersignerassociationCreateObjectV1Request** | [**List&lt;EzsignfoldersignerassociationCreateObjectV1Request&gt;**](EzsignfoldersignerassociationCreateObjectV1Request.md)|  |

### Return type

[**EzsignfoldersignerassociationCreateObjectV1Response**](EzsignfoldersignerassociationCreateObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful response |  -  |

<a name="ezsignfoldersignerassociationDeleteObjectV1"></a>
# **ezsignfoldersignerassociationDeleteObjectV1**
> EzsignfoldersignerassociationDeleteObjectV1Response ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID)

Delete an existing Ezsignfoldersignerassociation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldersignerassociationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi(defaultClient);
    Integer pkiEzsignfoldersignerassociationID = 56; // Integer | The unique ID of the Ezsignfoldersignerassociation
    try {
      EzsignfoldersignerassociationDeleteObjectV1Response result = apiInstance.ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationDeleteObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation |

### Return type

[**EzsignfoldersignerassociationDeleteObjectV1Response**](EzsignfoldersignerassociationDeleteObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignfoldersignerassociationGetChildrenV1"></a>
# **ezsignfoldersignerassociationGetChildrenV1**
> ezsignfoldersignerassociationGetChildrenV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldersignerassociationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi(defaultClient);
    Integer pkiEzsignfoldersignerassociationID = 56; // Integer | The unique ID of the Ezsignfoldersignerassociation
    try {
      apiInstance.ezsignfoldersignerassociationGetChildrenV1(pkiEzsignfoldersignerassociationID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetChildrenV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The element you are trying to work on does not exist |  -  |

<a name="ezsignfoldersignerassociationGetInPersonLoginUrlV1"></a>
# **ezsignfoldersignerassociationGetInPersonLoginUrlV1**
> EzsignfoldersignerassociationGetInPersonLoginUrlV1Response ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID)

Retrieve a Login Url to allow In-Person signing

This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldersignerassociationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi(defaultClient);
    Integer pkiEzsignfoldersignerassociationID = 56; // Integer | The unique ID of the Ezsignfoldersignerassociation
    try {
      EzsignfoldersignerassociationGetInPersonLoginUrlV1Response result = apiInstance.ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetInPersonLoginUrlV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation |

### Return type

[**EzsignfoldersignerassociationGetInPersonLoginUrlV1Response**](EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |
**422** | The syntax of the request is valid but the request cannot be completed. Look for detail in body. |  -  |

<a name="ezsignfoldersignerassociationGetObjectV1"></a>
# **ezsignfoldersignerassociationGetObjectV1**
> EzsignfoldersignerassociationGetObjectV1Response ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID)

Retrieve an existing Ezsignfoldersignerassociation

### Example
```java
// Import classes:
import eZmaxAPI.ApiClient;
import eZmaxAPI.ApiException;
import eZmaxAPI.Configuration;
import eZmaxAPI.auth.*;
import eZmaxAPI.models.*;
import com.ezmax.api.ObjectEzsignfoldersignerassociationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://prod.api.appcluster01.ca-central-1.ezmax.com/rest");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    ObjectEzsignfoldersignerassociationApi apiInstance = new ObjectEzsignfoldersignerassociationApi(defaultClient);
    Integer pkiEzsignfoldersignerassociationID = 56; // Integer | The unique ID of the Ezsignfoldersignerassociation
    try {
      EzsignfoldersignerassociationGetObjectV1Response result = apiInstance.ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObjectEzsignfoldersignerassociationApi#ezsignfoldersignerassociationGetObjectV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pkiEzsignfoldersignerassociationID** | **Integer**| The unique ID of the Ezsignfoldersignerassociation |

### Return type

[**EzsignfoldersignerassociationGetObjectV1Response**](EzsignfoldersignerassociationGetObjectV1Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**404** | The element you are trying to work on does not exist |  -  |

