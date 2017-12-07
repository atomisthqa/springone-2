package com.atomist;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class SpringoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringoneApplication.class, args);
	}
}
