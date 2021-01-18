package com.serviceone.gserviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GserviceoneApplication {

	public static void main(String[] args) {

		SpringApplication.run(GserviceoneApplication.class, args);
	}

	@Value("${message:default}")
	private String message;

	@GetMapping("/message")
	public String getData(){
		return message;
	}

}
