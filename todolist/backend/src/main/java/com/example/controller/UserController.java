package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

//    @Autowired
//    private IUserService service;
//
//    @GetMapping()
//    public List<User> getAllUsers() {
//        return service.getAllUsers();
//    }
//
//    @GetMapping(value = "/{id}")
//    public User getUserByID(@PathVariable(name = "id") Short id) {
//        return service.getUserByID(id);
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
