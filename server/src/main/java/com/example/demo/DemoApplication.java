package com.example.demo;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.Query;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String @NonNull ... args) throws Exception{
		String emailTest="alex123@gmail.com";
		User existingUser = userRepo.findByEmail(emailTest);
		if(existingUser==null) {
			String simplePassword = "parola1";
			String hashedPassword = hashString(simplePassword, "SHA-256");
			User userTest = new User("Alex", emailTest, hashedPassword);
			userRepo.save(userTest);
			System.out.println("user saved in data base");
		}else{
			System.out.println("email already exists");
		}
	}
	public static String hashString(String input, String algorithm) {
		try {
			MessageDigest digest = MessageDigest.getInstance(algorithm);
			byte[] hashBytes = digest.digest(input.getBytes());
			return bytesToHex(hashBytes);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	public static String bytesToHex(byte[] hash) {
		StringBuilder hexString = new StringBuilder();
		for (byte b : hash) {
			hexString.append(String.format("%02x", b));
		}
		return hexString.toString();
	}

}
