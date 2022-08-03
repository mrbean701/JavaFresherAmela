package com.example.controller;

import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("/register")
    public String getPageRegister(@ModelAttribute User user) {

        return "Register.html";
    }

    @GetMapping("/login")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user", new User());
        return "login.html";
    }

//
//    @GetMapping(value = "/{id}")
//    public Optional<User> getUserByID(@PathVariable(name = "id") Short id) {
//        return service.getUserByID(id);
//    }
//
//    @GetMapping()
//    public ResponseEntity<?> getAllUsers(){
//        List<User> entities = service.getAllUsers();
//
//        return new ResponseEntity<>(entities, HttpStatus.OK);
//    }
//
//    @GetMapping(value="/username/{userName}")
//    public User getUserByUserName(@PathVariable(name = "userName") String userName) {
//        return service.getUserByUserName(userName);
//    }
//
//    @PostMapping()
//    public void createUser(@RequestBody UserForm form) {
//        service.createUser(form.toEntity());
//    }
//
//    @DeleteMapping(value="/{id}")
//    public void deleteUser(@PathVariable(name = "id") Short id) {
//        service.deleteUser(id);
//    }

}
