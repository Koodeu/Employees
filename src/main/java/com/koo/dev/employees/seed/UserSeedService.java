package com.koo.dev.employees.seed;

import com.koo.dev.employees.model.User;
import com.koo.dev.employees.models.RoleType;
import com.koo.dev.employees.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class UserSeedService {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User("Adam", "Kowal", "adam@wp.pl", "sadawea", RoleType.ADMIN);
            User user2 = new User("Michał", "Rumpert", "mike@wp.pl", "2f4234d", RoleType.EMPLOYEE);
            User user3 = new User("Tomek", "Pluta", "tom@wp.pl", "13dd4a66sdf", RoleType.MANAGER);
            User user4 = new User("Viola", "Mirowska", "viola@wp.pl", "heyaaf", RoleType.EMPLOYEE);
                userRepository.saveAll(List.of(user1, user2, user3, user4));

        };
    }
}