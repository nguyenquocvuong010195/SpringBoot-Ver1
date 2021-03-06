package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/" })
public class PageController {

	@GetMapping
	public String initPage() {
		return "index";
	}

	@GetMapping("/login") 
	public String getLogin() {
		return "login";
	}
	
}