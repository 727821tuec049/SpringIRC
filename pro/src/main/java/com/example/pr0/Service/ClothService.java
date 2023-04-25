package com.example.pr0.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pr0.Repository.ClothRepo;

import proj.ClothStore;
@Service
public class ClothService {
	@Autowired
public ClothRepo trends;
public ClothStore saveinfo(ClothStore c) 
{
	return trends.save(c);
}

}
