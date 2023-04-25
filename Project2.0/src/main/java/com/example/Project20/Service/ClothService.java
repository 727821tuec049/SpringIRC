package com.example.Project20.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project20.Model.ClothStore;
import com.example.Project20.Repository.ClothRepo;

@Service
public class ClothService {
@Autowired
public ClothRepo trends;
public ClothStore saveinfo(ClothStore c)
{
	return trends.save(c);
}
}
