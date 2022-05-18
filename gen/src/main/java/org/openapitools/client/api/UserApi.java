/*
 * Users
 * User
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.util.UUID;
import org.openapitools.client.model.UserDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient localVarApiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createUser
     * @param userDto  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserCall(UserDto userDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userDto;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createUserValidateBeforeCall(UserDto userDto, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userDto' is set
        if (userDto == null) {
            throw new ApiException("Missing the required parameter 'userDto' when calling createUser(Async)");
        }
        

        okhttp3.Call localVarCall = createUserCall(userDto, _callback);
        return localVarCall;

    }

    /**
     * Creates a user.
     * 
     * @param userDto  (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public UserDto createUser(UserDto userDto) throws ApiException {
        ApiResponse<UserDto> localVarResp = createUserWithHttpInfo(userDto);
        return localVarResp.getData();
    }

    /**
     * Creates a user.
     * 
     * @param userDto  (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> createUserWithHttpInfo(UserDto userDto) throws ApiException {
        okhttp3.Call localVarCall = createUserValidateBeforeCall(userDto, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a user. (asynchronously)
     * 
     * @param userDto  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserAsync(UserDto userDto, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = createUserValidateBeforeCall(userDto, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserById
     * @param userId string id of user to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User that was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserByIdCall(UUID userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserByIdValidateBeforeCall(UUID userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUserById(Async)");
        }
        

        okhttp3.Call localVarCall = deleteUserByIdCall(userId, _callback);
        return localVarCall;

    }

    /**
     * deletes user by ID
     * 
     * @param userId string id of user to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User that was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteUserById(UUID userId) throws ApiException {
        deleteUserByIdWithHttpInfo(userId);
    }

    /**
     * deletes user by ID
     * 
     * @param userId string id of user to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User that was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserByIdWithHttpInfo(UUID userId) throws ApiException {
        okhttp3.Call localVarCall = deleteUserByIdValidateBeforeCall(userId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * deletes user by ID (asynchronously)
     * 
     * @param userId string id of user to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> User that was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserByIdAsync(UUID userId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserByIdValidateBeforeCall(userId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchUserById
     * @param userId Parameter description in CommonMark or HTML. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchUserByIdCall(UUID userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchUserByIdValidateBeforeCall(UUID userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling fetchUserById(Async)");
        }
        

        okhttp3.Call localVarCall = fetchUserByIdCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Returns a user by ID.
     * 
     * @param userId Parameter description in CommonMark or HTML. (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public UserDto fetchUserById(UUID userId) throws ApiException {
        ApiResponse<UserDto> localVarResp = fetchUserByIdWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Returns a user by ID.
     * 
     * @param userId Parameter description in CommonMark or HTML. (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> fetchUserByIdWithHttpInfo(UUID userId) throws ApiException {
        okhttp3.Call localVarCall = fetchUserByIdValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a user by ID. (asynchronously)
     * 
     * @param userId Parameter description in CommonMark or HTML. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. User ID must be an integer and larger than 0. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization information is missing or invalid. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchUserByIdAsync(UUID userId, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchUserByIdValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for fetchUsers
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully returned requested users! </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchUsersCall(String firstname, String lastname, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (firstname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("firstname", firstname));
        }

        if (lastname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("lastname", lastname));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call fetchUsersValidateBeforeCall(String firstname, String lastname, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = fetchUsersCall(firstname, lastname, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of users.
     * Returns users
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @return List&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully returned requested users! </td><td>  -  </td></tr>
     </table>
     */
    public List<UserDto> fetchUsers(String firstname, String lastname) throws ApiException {
        ApiResponse<List<UserDto>> localVarResp = fetchUsersWithHttpInfo(firstname, lastname);
        return localVarResp.getData();
    }

    /**
     * Returns a list of users.
     * Returns users
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @return ApiResponse&lt;List&lt;UserDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully returned requested users! </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<UserDto>> fetchUsersWithHttpInfo(String firstname, String lastname) throws ApiException {
        okhttp3.Call localVarCall = fetchUsersValidateBeforeCall(firstname, lastname, null);
        Type localVarReturnType = new TypeToken<List<UserDto>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of users. (asynchronously)
     * Returns users
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully returned requested users! </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchUsersAsync(String firstname, String lastname, final ApiCallback<List<UserDto>> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchUsersValidateBeforeCall(firstname, lastname, _callback);
        Type localVarReturnType = new TypeToken<List<UserDto>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modifyUserById
     * @param userId  (required)
     * @param userDto  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The specified user ID is invalid (not a number) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User unauthorized. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyUserByIdCall(UUID userId, UserDto userDto, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userDto;

        // create path and map variables
        String localVarPath = "/api/v1/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyUserByIdValidateBeforeCall(UUID userId, UserDto userDto, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling modifyUserById(Async)");
        }
        
        // verify the required parameter 'userDto' is set
        if (userDto == null) {
            throw new ApiException("Missing the required parameter 'userDto' when calling modifyUserById(Async)");
        }
        

        okhttp3.Call localVarCall = modifyUserByIdCall(userId, userDto, _callback);
        return localVarCall;

    }

    /**
     * Modifies user by ID
     * 
     * @param userId  (required)
     * @param userDto  (required)
     * @return UserDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The specified user ID is invalid (not a number) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User unauthorized. </td><td>  -  </td></tr>
     </table>
     */
    public UserDto modifyUserById(UUID userId, UserDto userDto) throws ApiException {
        ApiResponse<UserDto> localVarResp = modifyUserByIdWithHttpInfo(userId, userDto);
        return localVarResp.getData();
    }

    /**
     * Modifies user by ID
     * 
     * @param userId  (required)
     * @param userDto  (required)
     * @return ApiResponse&lt;UserDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The specified user ID is invalid (not a number) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User unauthorized. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserDto> modifyUserByIdWithHttpInfo(UUID userId, UserDto userDto) throws ApiException {
        okhttp3.Call localVarCall = modifyUserByIdValidateBeforeCall(userId, userDto, null);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Modifies user by ID (asynchronously)
     * 
     * @param userId  (required)
     * @param userDto  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> User Updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The specified user ID is invalid (not a number) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A user with the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> User unauthorized. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyUserByIdAsync(UUID userId, UserDto userDto, final ApiCallback<UserDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyUserByIdValidateBeforeCall(userId, userDto, _callback);
        Type localVarReturnType = new TypeToken<UserDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}