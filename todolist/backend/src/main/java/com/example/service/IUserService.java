package com.example.service;

import com.example.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    User getUserByUsername(String username);
}
