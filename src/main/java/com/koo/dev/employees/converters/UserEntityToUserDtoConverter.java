package com.koo.dev.employees.converters;

import com.koo.dev.employees.model.User;
import com.koo.dev.employees.models.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserEntityToUserDtoConverter {

    public UserDto toDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setRoleType(user.getRoleType());
        return userDto;
    }
}
