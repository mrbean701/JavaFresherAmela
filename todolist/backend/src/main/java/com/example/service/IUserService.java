package com.example.service;

import com.example.model.ResponseUser;
import com.example.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends UserDetailsService {
    public ResponseUser RegiterUser(User user);

    public boolean login(String username, String password);




//    User getUserByUsername(String username);
//
//
//    void updateTask(short id, TaskFormForUpdating form);
//
//    List<User> getAllUsers();
//
//    Optional<User> getUserByID(Short id);
}
