package com.example.connectly.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.connectly.Service.CarService;
import com.example.connectly.model.Transport;

@RestController
public class CarController {  
	
	@Autowired
public CarService cser;
 @PostMapping("/vehicle")
public Transport addDetails(@RequestBody Transport cr)
{
	return cser.saveinfo(cr);
}
}
