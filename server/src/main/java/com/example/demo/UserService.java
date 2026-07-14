package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepo  userRepo;
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
