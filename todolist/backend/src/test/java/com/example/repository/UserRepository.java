package com.example.repository;

import com.example.model.User;

public class UserRepository {
    private final UserRepository userRepository;

    public UserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }
}
