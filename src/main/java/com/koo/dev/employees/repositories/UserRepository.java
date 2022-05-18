package com.koo.dev.employees.repositories;

import com.koo.dev.employees.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Override
    boolean existsById(UUID uuid);

    @Query(value = "SELECT u FROM User u where (LOWER(u.email)=LOWER(:mail))")
    Optional<User>findByUserEmail(@Param("mail") String mail);

}
