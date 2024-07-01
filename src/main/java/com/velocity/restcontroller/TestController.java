package com.velocity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getTestData")
	public String getTestData() {
		return "this is springboot Security Message";
	}

}
