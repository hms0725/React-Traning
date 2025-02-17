package com.example.reactRemote.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3001")//react개발서버허용
@RequestMapping("/api")
public class RestMainController {
	
	@GetMapping("/")
	public String home() {
		return "index"; //src/main/resources/templates/index.html
	}
	
	
	
	@GetMapping("/data")
	public String test() {
		return "Hello React!";
	}
	

}
