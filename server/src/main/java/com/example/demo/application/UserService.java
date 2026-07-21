package com.example.demo.application;

import com.example.demo.domain.model.User;
import com.example.demo.domain.repo.UserRepo;
import jdk.internal.classfile.impl.AbstractPoolEntry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static jdk.internal.classfile.impl.AbstractPoolEntry.hashString;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepo userRepo;

    public User createUser(User newUser) {
        User existingUser = userRepo.findByEmail(newUser.getEmail());
        if (existingUser != null) {
            throw new RuntimeException("Email " + newUser.getEmail() + "exists");
        }
        String hashedPassword = hashString(newUser.getPassword(), "SHA-256");
        newUser.setPassword(hashedPassword);
        return userRepo.save(newUser);
    }

    private String hashString(String input, String algorithm) {
        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            byte[] hashBytes = digest.digest(input.getBytes());
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }
}
