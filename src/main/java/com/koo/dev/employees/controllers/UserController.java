package com.koo.dev.employees.controllers;

import com.koo.dev.employees.models.UserDto;
import com.koo.dev.employees.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class UserController implements com.koo.dev.employees.api.UserApi {

 private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        return com.koo.dev.employees.api.UserApi.super.createUser(userDto);
    }

    @Override
    public ResponseEntity<Void> deleteUserById(UUID userId) {
        userService.deleteUserById(userId);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<UserDto> fetchUserById(UUID userId) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserDto>> fetchUsers(String firstname, String lastname) {
        List<UserDto> userDtoList = userService.fetchAllUsers();
        return ResponseEntity.ok(userDtoList);

    }

    @Override
    public ResponseEntity<UserDto> modifyUserById(UUID userId, UserDto userDto) {
        return com.koo.dev.employees.api.UserApi.super.modifyUserById(userId, userDto);
    }
}
