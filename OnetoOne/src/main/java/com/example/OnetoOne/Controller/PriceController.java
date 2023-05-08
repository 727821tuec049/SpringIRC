package com.example.OnetoOne.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnetoOne.Model.Price;
import com.example.OnetoOne.Repository.PriceRepo;
@RestController
public class PriceController {
@Autowired
PriceRepo prepo;
@PostMapping("/map")
public String addDetails(@RequestBody Price p)
{
	prepo.save(p);
	return "Saved succesfully ";
}
}
