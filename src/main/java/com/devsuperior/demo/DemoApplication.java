package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("-----------------ENCODE-------------> " + bCryptPasswordEncoder.encode("123456"));

		boolean result = bCryptPasswordEncoder.matches("123456", "$2a$10$.0TZoWqVhVxMrrN6zMnwWul7Ow.F5dkQ/HO1q1E4Ec5Ij.IJJpWza");

		System.out.println("Resultado: " + result);
	}
}
