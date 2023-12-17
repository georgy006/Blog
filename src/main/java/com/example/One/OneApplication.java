package com.example.One;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com/example/One/controllers"})
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

}
