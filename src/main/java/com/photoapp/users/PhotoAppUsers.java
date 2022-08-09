package com.photoapp.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppUsers {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppUsers.class, args);
	}

}
