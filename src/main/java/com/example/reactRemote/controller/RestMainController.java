package com.example.reactRemote.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")//react개발서버허용
@RequestMapping("/api")
public class RestMainController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Welcome to the site!");
		return "runner"; //src/main/resources/templates/index.html
	}
	
	@GetMapping("/data")
	public String test() {
		
		return "Hello React!";
	}
	

}
