package com.company.greetingapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingNameInput
{
	@GetMapping
	public String Greeting(final @RequestParam String name)
	{
		if (name == null || name == "")
			return "What Was Your Name Again?";
		else
			return "Hello, " + name;
	}
}
