package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RControllerr {

	@GetMapping("/k1")
	public String run() {
		return "Rajesh -r11";
	}

	@PostMapping("/k2")
	public String run1() {
		return "Rajesh -r22";
	}

	@GetMapping("/k3")
	public String run3() {
		return "Rajesh -r33";
	}
}
