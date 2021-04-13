package com.sonarQube.test.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		try {
			return "Greetings from Spring Boot!";
		}
		catch (Exception e) {
			// will never happen
		}
		return "Ooops!";
	}

}