package com.example.demo.service;

import com.example.demo.exception.UserAlreadyRegisteredException;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) throws UserAlreadyRegisteredException {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyRegisteredException("User with username " + user.getUsername() + " is already registered");
        }
        userRepository.save(user);
    }

    @Override
    public User fetchUserDetails(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserNotFoundException("User not found with username: " + username);
        }
        return user;
    }
}