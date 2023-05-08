package com.example.Project01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project01.Model.ClothStore;
import com.example.Project01.Repository.ClothRepo;
import com.example.Project01.Service.ClothService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
public class ClothController {
	@Autowired
	public ClothService cser;
	@Tag(name = "CustomerDetails",description = "Customer")
	@PostMapping("/Classy")
	
	public ClothStore addDetails(@RequestBody ClothStore kr)
	{
		return cser.saveinfo(kr);
	}
	@Tag(name="GetStores", description="getdetails endpoint")
	@GetMapping("/getClothStore")
	public List<ClothStore>getDetails()
	{
		return cser.getInfo();
	}
	@Tag(name="DeleteDetails",description="delete endpoint")
	@DeleteMapping("/Classy/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion was success";
	}
	@Tag(name="UpdateDetails",description="update counters endpoint")
		@PutMapping("/update/counters")
		public ClothStore updatequery(@RequestBody ClothStore gifts)
		{
			return cser.updatecounter(gifts);
			
		}
	
	@PutMapping("/update")
	public ClothStore updateDetails(@RequestBody ClothStore kr)
	{
		return cser.updateInfo(kr);
	}
	//sorting and pagination
	//sorting by descending order
	@Tag(name="Sorting",description="Descending")
	@GetMapping("/sortDesc/{gifts}")
	public List<ClothStore>sortGifts(@PathVariable("gifts")String gifts)
	{
		return cser.sortDesc(gifts);
	}
	//sorting by ascending order
	@Tag(name="sorting",description="Ascending")
	@GetMapping("/sortAsc/{gifts}")
	public List<ClothStore>sortgifts(@PathVariable("gifts")String gifts)
	{
		return cser.sortAsc(gifts);
	}
	@Tag(name="Pagination")
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<ClothStore>pagination(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return cser.pagination(pgn,pgs);
	}
	 //pagination ans sorting
	@Tag(name="PaginationAndSorting")
	@GetMapping("/pagination/{pgn}/{pgs}/{gifts}")
	public List<ClothStore>pagesorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("gifts")String gifts)
	{
		return cser.pagesorting(pgn,pgs,gifts);
	}
	  @Autowired
	  public ClothRepo trends;
	
	      
	@Tag(name="getbygifts")
	@GetMapping("bygifts/{counters}")
	public List<ClothStore>getGifts(@PathVariable("counters")int counters)
	{
		return trends.bygifts(counters);
	}
	@Tag(name="getbycounters")
	@GetMapping("/startend/{start}/{end}")
	public List<ClothStore>statendcounters(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return trends.startEnd(start, end);
	}
	@Tag(name="deletebycounters")
	@DeleteMapping("/delete/{counters}/{gifts}")
	public String deletecounter(@PathVariable("counters")int counters,@PathVariable("gifts")String gifts)
	{
		trends.deletecounter(counters, gifts);
		return "Deleted";
	}
	//jpql 
	@Tag(name="jpqlget")
	@GetMapping("/jpql/between/{start}/{end}")
	public List<ClothStore>getbtw(@PathVariable("start") int start,@PathVariable("end") int end)
	{
		return trends.getbtw(start,end);
	}
	@Tag(name="jpqldelete")
		@DeleteMapping("/jpql/{counters}")
		public String deletejpql(@PathVariable("counters") int counters)
		{
			trends.deletejpql(counters);
			return "Deleted sucessfully";
		}
	@Tag(name="jpqlupdate")
	@PutMapping("update/{gifts}/{counters}")
	public String updatejpql(@PathVariable("gifts")String gifts,@PathVariable("counters")int counters)
	{
		trends.updateByQuery(gifts,counters);
		return "Updated sucessfully";
		
	}
	
	
	
	
}