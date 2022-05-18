package main.java.com.koo.dev.employees.converters;

import com.koo.dev.employees.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDtoToEntityConverter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User convertUserDtoToUserEntity(com.koo.dev.employees.models.UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoleType(userDto.getRoleType());
        return user;
    }

}
