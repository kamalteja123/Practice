package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/home")
	public String goHome()
	{
		return "indedgfgfdsx";
	}
	@RequestMapping("/contact")
	public String getContact()
	{
		return "getting Contact";
	}

}
