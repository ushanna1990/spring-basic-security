package com.basic.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicSecurityController {
	
	@GetMapping("/greet")
	public String getMessage() {
		return "Good Morning";
	}

}
