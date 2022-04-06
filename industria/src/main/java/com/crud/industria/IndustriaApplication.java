package com.crud.industria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IndustriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndustriaApplication.class, args);
	}

	@RequestMapping("/")
	public String home(){
		return "http://localhost:8080/";
	}

}
