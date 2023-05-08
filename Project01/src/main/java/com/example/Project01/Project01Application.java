package com.example.Project01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@OpenAPIDefinition(
	    info =@Info(
	        title = "ClothStore",
	        version = "1.1.2",
		        description = "Cloth",
		        contact = @Contact(
		        		name = "Max",
		        		email = "Max@123"
		        		)
	      )
	   )

public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}

}
