package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Short> {


    public User findById(User id);

    // public User findByUsername(String username);

    //  User getUserByUserName(String userName);

//    @Query("SELECT u FROM u User WHERE UserName = ?1")
//    User getUserByUserName(String userName);

    // public boolean isUserExistsByUsername(String userName);

}
