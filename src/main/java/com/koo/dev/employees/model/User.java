package com.koo.dev.employees.model;


import com.koo.dev.employees.models.RoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends com.koo.dev.employees.model.BaseEntity {



    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;


    public User(String firstName, String lastName, String email, String password, com.koo.dev.employees.models.RoleType roleType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roleType = roleType;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }
}
