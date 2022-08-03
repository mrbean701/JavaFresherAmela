//package com.example.controller;
//
//import com.example.dto.LoginInfoDto;
//import com.example.entity.User;
//import com.example.service.IUserService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.security.Principal;
//
//@RestController
//@RequestMapping(value = "api/v1/login")
//@CrossOrigin("*")
//public class LoginController {
//    @Autowired
//    private IUserService service;
//
//    @GetMapping()
//    public ResponseEntity<?> login(Principal principal){
//        String username = principal.getName();
//        User entity = service.getUserByUsername(username);
//
//        // convert entity --> dto
//        LoginInfoDto dto = new LoginInfoDto(entity.getId(),entity.getFullName());
//
//        return new ResponseEntity<>(dto, HttpStatus.OK);
//    }
//}
