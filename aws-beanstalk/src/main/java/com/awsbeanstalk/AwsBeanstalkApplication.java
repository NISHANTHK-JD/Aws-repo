package com.awsbeanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkApplication.class, args);
	}

	@GetMapping("/")
	public String welcome()
	{
		return "welcomet to aws beanstalk";
	}
	
	@GetMapping("/hello/{name}")
	public String welcome(@PathVariable String name)
	{
		return "Hi " +name + " Welcome to aws beanstalk";
	}
}
