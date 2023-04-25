package com.example.pr0.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pr0.Service.ClothService;

import proj.ClothStore;
@RestController

public class ClothController
{
	@Autowired
public ClothService cser;
@PostMapping("/classy")
public ClothStore addDetails(@RequestBody ClothStore kr)
{
	return cser.saveinfo(kr);

} 
}
