# UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /users | Creates a user.
[**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /api/v1/users/{userId} | deletes user by ID
[**fetchUserById**](UserApi.md#fetchUserById) | **GET** /api/v1/users/{userId} | Returns a user by ID.
[**fetchUsers**](UserApi.md#fetchUsers) | **GET** /users | Returns a list of users.
[**modifyUserById**](UserApi.md#modifyUserById) | **PUT** /api/v1/users/{userId} | Modifies user by ID


<a name="createUser"></a>
# **createUser**
> UserDto createUser(userDto)

Creates a user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    UserDto userDto = new UserDto(); // UserDto | 
    try {
      UserDto result = apiInstance.createUser(userDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#createUser");
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
 **userDto** | [**UserDto**](UserDto.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | User Created |  -  |
**400** | Bad request. User ID must be an integer and larger than 0. |  -  |
**401** | Authorization information is missing or invalid. |  -  |
**404** | A user with the specified ID was not found. |  -  |

<a name="deleteUserById"></a>
# **deleteUserById**
> deleteUserById(userId)

deletes user by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID userId = new UUID(); // UUID | string id of user to delete
    try {
      apiInstance.deleteUserById(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserById");
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
 **userId** | [**UUID**](.md)| string id of user to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | User that was deleted |  -  |
**400** | Bad request. User ID must be an integer and larger than 0. |  -  |
**401** | Authorization information is missing or invalid. |  -  |
**404** | A user with the specified ID was not found. |  -  |

<a name="fetchUserById"></a>
# **fetchUserById**
> UserDto fetchUserById(userId)

Returns a user by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID userId = new UUID(); // UUID | Parameter description in CommonMark or HTML.
    try {
      UserDto result = apiInstance.fetchUserById(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#fetchUserById");
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
 **userId** | [**UUID**](.md)| Parameter description in CommonMark or HTML. |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request. User ID must be an integer and larger than 0. |  -  |
**401** | Authorization information is missing or invalid. |  -  |
**404** | A user with the specified ID was not found. |  -  |

<a name="fetchUsers"></a>
# **fetchUsers**
> List&lt;UserDto&gt; fetchUsers(firstname, lastname)

Returns a list of users.

Returns users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    String firstname = "Adam"; // String | 
    String lastname = "lastname_example"; // String | 
    try {
      List<UserDto> result = apiInstance.fetchUsers(firstname, lastname);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#fetchUsers");
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
 **firstname** | **String**|  | [optional]
 **lastname** | **String**|  | [optional]

### Return type

[**List&lt;UserDto&gt;**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned requested users! |  -  |

<a name="modifyUserById"></a>
# **modifyUserById**
> UserDto modifyUserById(userId, userDto)

Modifies user by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserApi apiInstance = new UserApi(defaultClient);
    UUID userId = new UUID(); // UUID | 
    UserDto userDto = new UserDto(); // UserDto | 
    try {
      UserDto result = apiInstance.modifyUserById(userId, userDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#modifyUserById");
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
 **userId** | [**UUID**](.md)|  |
 **userDto** | [**UserDto**](UserDto.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | User Updated |  -  |
**400** | The specified user ID is invalid (not a number) |  -  |
**404** | A user with the specified ID was not found. |  -  |
**401** | User unauthorized. |  -  |

