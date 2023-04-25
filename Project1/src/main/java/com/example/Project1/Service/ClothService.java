package com.example.Project1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project1.Model.ClothStore;
import com.example.Project1.Repository.ClothRepo;


@Service
public class ClothService {
	@Autowired

public ClothRepo trends;
public ClothStore saveinfo(ClothStore c)
{
	return trends.save(c);




}
}
