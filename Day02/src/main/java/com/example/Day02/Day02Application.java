package com.example.Day02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day02Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day02Application.class, args);
		Person p=new Person(1,"Shivasri",16);
		ObjectMapper o=new ObjectMapper();
		String str=o.writeValueAsString(p);
		System.out.println(str);
		
	}

}
