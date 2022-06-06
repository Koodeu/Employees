package com.koo.dev.employees.services;
import com.koo.dev.employees.converters.UserEntityToUserDtoConverter;
import com.koo.dev.employees.models.UserDto;
import com.koo.dev.employees.repositories.UserRepository;
import com.koo.dev.employees.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserEntityToUserDtoConverter userEntityToUserDtoConverter;

    public UserService(UserRepository userRepository, UserEntityToUserDtoConverter userEntityToUserDtoConverter) {
        this.userRepository = userRepository;
        this.userEntityToUserDtoConverter = userEntityToUserDtoConverter;
    }

    public List<UserDto> fetchAllUsers() {
        List<User> allUsers = userRepository.findAll();
        List<UserDto> userDtos = allUsers.stream().map(userEntityToUserDtoConverter::toDto).collect(Collectors.toList());
        return userDtos;
    }


    public void deleteUserById(UUID id){
        if(!userRepository.existsById(id)){
            throw new NoSuchElementException("User with given ID " + id + "does not exist in database");
        }
        userRepository.deleteById(id);
    }aedar
}
