package com.example.service;

import com.example.model.Process;
import com.example.model.ResponseUser;
import com.example.model.User;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.model.Process.userName;

@Service
public class UserService<userName> implements IUserService{
   @Autowired
    private IUserRepository repository ;


//   @Override
//    public User getUserByUsername(String userName){
//       return repository.findByUserName(userName);
//   }


@Override
    public boolean login(String userName, String password){
        List<User> users = repository.findAll();
        for(User user : users){
            if(user.getUserName().compareTo(userName) == 0 && user.getPassword().compareTo(password) == 0){
                Process.userName = user.getUserName();
                Process.id = user.getId();
                return true;
            }
        }
        Process.userName = null;
        return false;
    }

    @Override
    public ResponseUser RegiterUser(User user) {
        short id = 1;
        List<User> users = repository.findAll();
        for(User u : users){
            if (u.getUserName().compareTo(user.getUserName()) == 0) {
                return new ResponseUser("Create User false", null);
            }
            if(u.getId() == id) {
                id++; // increment
            }

        }

        user.setId(id);
        user.setPassword(new BCryptPasswordEncoder(6).encode(user.getPassword()));
        return new ResponseUser("Create User", repository.save(user));
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

//    @Override
//    public List<User> getAllUsers() {
//        return repository.findAll();
//    }
//
//    @Override
//    public Optional<User> getUserByID(Short id) {
//        return repository.findById(id);
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        return null;
//    }

    @Query("SELECT u.* FROM User u WHERE u.UserName LIKE %?1%")
    public User findByUserName(String userName) {
    return repository.findByUserName(userName);
    };

}
