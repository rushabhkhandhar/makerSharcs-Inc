package com.example.demo.service;


import com.example.demo.model.User;
import com.example.demo.exception.UserAlreadyRegisteredException;


public interface UserService {
    void registerUser(User user) throws UserAlreadyRegisteredException;
    User fetchUserDetails(String username);
}
