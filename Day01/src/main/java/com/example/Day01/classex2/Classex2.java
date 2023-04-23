package com.example.Day01.classex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Classex2 {
public String name="Harini";
@GetMapping("/name")
public String getName() {
	return "Welcome "+name;
}
}
