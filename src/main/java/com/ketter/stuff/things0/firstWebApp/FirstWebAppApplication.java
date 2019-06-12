package com.ketter.stuff.things0.firstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class FirstWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebAppApplication.class, args);
		System.out.println("http://localhost:8080");

	}



}
