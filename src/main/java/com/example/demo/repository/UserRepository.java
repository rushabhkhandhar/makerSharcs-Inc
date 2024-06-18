package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private static final Map<String, User> userMap = new HashMap<>();

    public void save(User user) {
        userMap.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return userMap.get(username);
    }
}
