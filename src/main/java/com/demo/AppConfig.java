package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {

	@RequestMapping("/hello")
	public String vamsi() {
		return "Hello World";
	}
}
