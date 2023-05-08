package com.example.Project01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Project01.Model.ClothStore;
import com.example.Project01.Repository.ClothRepo;
@Service
public class ClothService {
	@Autowired
	public ClothRepo trends;
	public ClothStore saveinfo(ClothStore kr)
	{
		return trends.save(kr);



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
	//Sorting descending order
	public List<ClothStore>sortDesc(String gifts)
	{
		return trends.findAll(Sort.by(gifts).descending());
	}
	//sort ascending order
	public List<ClothStore> sortAsc(String gifts) {
		// TODO Auto-generated method stub
		return trends.findAll(Sort.by(gifts).ascending());
		
	}
	//pagination
	public List<ClothStore>paginationData(int pgn,int pgs)
	{
		Page<ClothStore>p =trends.findAll(PageRequest.of(pgn, pgs));
		return p.getContent();
	}
	public List<ClothStore> pagination(int pgn, int pgs) {
		Page<ClothStore>p =trends.findAll(PageRequest.of(pgn, pgs));
		return p.getContent();
	}
	public List<ClothStore> pagesorting(int pgn, int pgs, String gifts) {
		// TODO Auto-generated method stub
		Page<ClothStore>p=trends.findAll(PageRequest.of(pgn, pgs,Sort.by(gifts).ascending()));
				return p.getContent();
						
						
	}
	public ClothStore updatecounter(ClothStore k)
	{
		return trends.saveAndFlush(k);
	}
	
}