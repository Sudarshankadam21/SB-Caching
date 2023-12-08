package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {
	//localhost:9494/employees/3- for getting data.
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
