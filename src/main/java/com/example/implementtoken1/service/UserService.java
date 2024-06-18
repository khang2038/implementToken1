package com.example.implementtoken1.service;

import com.example.implementtoken1.entities.User;
import com.example.implementtoken1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public void initRolesAndUser(){

    }
}
