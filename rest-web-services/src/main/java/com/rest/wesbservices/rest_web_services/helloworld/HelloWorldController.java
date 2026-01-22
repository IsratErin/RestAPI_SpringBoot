package com.rest.wesbservices.rest_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping(path = "/hello-israt")
	public String helloIsrat() {
		return "Hello Israt!!";
	}
	
	@GetMapping(path = "/my-name")
	public MyNameBean myNameBean() {
		return new MyNameBean("Israt Jahan Erin");
	}
	
	@GetMapping(path = "/my-name/{username}")
	public MyNameBean myNameBeanPathVariable(@PathVariable String username) {
		return new MyNameBean(String.format("Hi I am %s", username));
	}
}
