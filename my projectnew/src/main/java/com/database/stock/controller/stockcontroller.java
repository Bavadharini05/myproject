package com.database.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.stock.model.Stockmodel;
import com.database.stock.service.stockservice;

@RestController
public class stockcontroller {
	@Autowired
	public stockservice sser;
	@PostMapping("/Components")
	public Stockmodel savedetails(@RequestBody Stockmodel hi) 
	
	{
		return sser.savedetails(hi);
	}
	@DeleteMapping("/Components/{hi}")
	public String deletedetails(@PathVariable("hi")int hi)
	{
		sser.deletedetails(hi);
		return "deleted";
		
	}
	@GetMapping("/Components/{hi}")
	public Object getdetails(@PathVariable("hi")int hi)
	{
		return sser.getdetails(hi);
	}
	@PutMapping("/updatestock")
	
	public Stockmodel updatedetails(@RequestBody Stockmodel hi)
	{
		return sser.updateInfo(hi);
	}
	//sorting 
	@GetMapping("/sortdes/{cname}")
	public List<Stockmodel>sortComponent(@PathVariable("cname")String cname)
	{
		return sser.sortdesc(cname);
	}
	//pagination
	@GetMapping("/pagination/{cno}/{csizo}")
	public List<Stockmodel>paginationData1(@PathVariable("cno")int cno,@PathVariable("csizo")int csize)
	{
		return sser.paginationData(cno,csize);
	}
	//pagination and sorting
	@GetMapping("/paginationSorting/{cno}/{csize}/{cname}")
	public List<Stockmodel>paginationSorting(@PathVariable("cno")int cno,@PathVariable("csize")int csize,@PathVariable("cname")String cname)
	{
		return sser.paginationAndSorting(cno,csize,cname);
	}
	
}

