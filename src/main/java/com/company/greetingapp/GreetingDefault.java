package com.company.greetingapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingDefault
{
	@GetMapping
	public String Greeting()
	{
		return String.format("Input Your Name In Search Bar Like This: http://localhost:8080/hello?name=EnterYourNameHere");
	}
}
