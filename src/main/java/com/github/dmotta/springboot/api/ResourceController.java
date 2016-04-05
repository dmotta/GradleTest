package com.github.dmotta.springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	 @RequestMapping("/resource")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }
}
