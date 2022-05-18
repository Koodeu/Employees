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

import org.openapitools.client.ApiException;
import java.util.UUID;
import org.openapitools.client.model.UserDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Creates a user.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserDto userDto = null;
        UserDto response = api.createUser(userDto);

        // TODO: test validations
    }
    
    /**
     * deletes user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserByIdTest() throws ApiException {
        UUID userId = null;
        api.deleteUserById(userId);

        // TODO: test validations
    }
    
    /**
     * Returns a user by ID.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserByIdTest() throws ApiException {
        UUID userId = null;
        UserDto response = api.fetchUserById(userId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of users.
     *
     * Returns users
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUsersTest() throws ApiException {
        String firstname = null;
        String lastname = null;
        List<UserDto> response = api.fetchUsers(firstname, lastname);

        // TODO: test validations
    }
    
    /**
     * Modifies user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyUserByIdTest() throws ApiException {
        UUID userId = null;
        UserDto userDto = null;
        UserDto response = api.modifyUserById(userId, userDto);

        // TODO: test validations
    }
    
}
