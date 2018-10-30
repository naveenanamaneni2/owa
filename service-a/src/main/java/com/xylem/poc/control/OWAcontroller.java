package com.xylem.poc.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class OWAcontroller {
	
	@GetMapping("/a")
	public String test() {
		System.out.println("Done-Service-A");
		return "Done-Service-A";
	}

}
