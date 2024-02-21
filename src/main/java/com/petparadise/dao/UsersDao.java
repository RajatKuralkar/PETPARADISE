package com.petparadise.dao;

import com.petparadise.entities.Pets;
import com.petparadise.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersDao extends JpaRepository<Users, Long> {
    @Query("select u from Users u where u.roles is not null")
    List<Users> findAllUsersNonValues();

    Users findByEmail(String email);
}
