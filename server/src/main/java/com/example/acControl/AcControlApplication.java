package com.example.acControl;

import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcControlApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(AcControlApplication.class, args);
	}


	@Override
	public void run(String @NonNull ... args) throws Exception {

	}
}
