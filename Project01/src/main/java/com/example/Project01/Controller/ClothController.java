package com.example.Project01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project01.Model.ClothStore;
import com.example.Project01.Service.ClothService;

@RestController
public class ClothController {
	@Autowired
	public ClothService cser;
	@PostMapping("/Classy")
	
	public ClothStore addDetails(@RequestBody ClothStore kr)
	{
		return cser.saveinfo(kr);
	}
	@GetMapping("/getClothStore")
	public List<ClothStore>getDetails()
	{
		return cser.getInfo();
	}
	@DeleteMapping("/Classy/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion was success";
	}
	@PutMapping("/update")
	public ClothStore updateDetails(@RequestBody ClothStore kr)
	{
		return cser.updateInfo(kr);
	}
}