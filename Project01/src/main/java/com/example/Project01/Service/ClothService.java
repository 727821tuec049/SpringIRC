package com.example.Project01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project01.Model.ClothStore;
import com.example.Project01.Repository.ClothRepo;
@Service
public class ClothService {
	@Autowired
	public ClothRepo trends;
	public ClothStore saveinfo(ClothStore c)
	{
		return trends.save(c);




	}
	public List<ClothStore> getInfo() {
		// TODO Auto-generated method stub
		return trends.findAll();
	}
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		trends.deleteById(id);
	}
	public  ClothStore updateInfo(ClothStore kr) {
		// TODO Auto-generated method stub
		return trends.saveAndFlush(kr);
	}
	
}
