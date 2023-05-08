package com.example.Mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	    info =@Info(
	        title = "Mapping",
	        version = "1.1.2",
		        description = "OneToMany",
		        contact = @Contact(
		        		name = "Max",
		        		email = "Max@123"
		        		)
	        )
	    )

public class MappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

}
