package com.example.Project1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project1.Model.ClothStore;
import com.example.Project1.Service.ClothService;
@RestController
public class ClothController {
	@Autowired
public ClothService cser;
	@PostMapping("/Classy")
public ClothStore  addDetails(@RequestBody ClothStore kr)
{
	return cser.saveinfo(kr);
}
}
