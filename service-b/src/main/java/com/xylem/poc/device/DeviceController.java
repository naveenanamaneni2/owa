package com.xylem.poc.device;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DeviceController {

	@GetMapping("/b")
	public String test() {
		System.out.println("Done-Service-B");
		return "Done-Service-B";
	}
	
}
