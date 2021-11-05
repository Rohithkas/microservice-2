package com.training.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice2")
public class Controller 
{
	@GetMapping("/micro2")
	public String micro2()
	{
		return "microservice2 is working !!! ";
	}
}