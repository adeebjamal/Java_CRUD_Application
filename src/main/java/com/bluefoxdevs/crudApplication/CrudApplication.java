package com.bluefoxdevs.crudApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		System.out.println("Application started...");
		SpringApplication.run(CrudApplication.class, args);
	}

}