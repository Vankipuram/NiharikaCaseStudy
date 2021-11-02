package com.signin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SignupSiginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignupSiginApplication.class, args);
	}

}
