package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Short> {

    Optional<User> findByUserAndPassword(String userName, String password);
    @Query(value = "SELECT u.* FROM  User u WHERE userName LIKE %?1%")
    User findByUserName(String userName);

}
