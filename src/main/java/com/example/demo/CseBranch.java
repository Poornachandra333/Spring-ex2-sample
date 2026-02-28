package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseBranch {

	
	@GetMapping("/course")
	public String project() {
		return "Project enabled successfully";
	}
	
}
