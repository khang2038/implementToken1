package com.example.implementtoken1.controller;

import com.example.implementtoken1.entities.User;
import com.example.implementtoken1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping({"/register-new-user"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping({"/for-admin"})
    public String forAdmin(){
        return "this URL is only accessible by the admin";
    }

    @GetMapping({"/for-user"})
    public String forUser(){
        return "this URL is only accessible by the user";
    }
}
