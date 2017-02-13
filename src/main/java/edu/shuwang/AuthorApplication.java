package edu.shuwang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.shuwang.SeedData;

@SpringBootApplication
public class AuthorApplication {

	@Autowired
    private SeedData seedData;
	
	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args);
	}
}
