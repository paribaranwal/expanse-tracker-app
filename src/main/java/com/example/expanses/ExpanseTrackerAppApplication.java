package com.example.expanses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ExpanseTrackerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpanseTrackerAppApplication.class, args);
	}
}
