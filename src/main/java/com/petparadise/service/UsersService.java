package com.petparadise.service;


import com.petparadise.dto.UsersDTO;
import com.petparadise.entities.Users;

import java.util.List;

public interface UsersService {

    List<Users> displayAllUsers();

    String deleteUsers(Long uid);

    Users addUsers(UsersDTO usr);

    Users updateUsers(Users usr);

    Users loginUsers(String email,String password);

}
