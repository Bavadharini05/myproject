package com.database.ELP.Controller;

//import java.util.List;
//import java.util.Map;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.ELP.Service.elpService;
import com.database.ELP.model.LoanApplicationModel;
//import com.database.ELP.model.LoginModel;
//import com.database.ELP.model.AdminModel;
//import com.database.ELP.model.LoanApplicationModel;
//import com.database.ELP.model.LoginModel;
import com.database.ELP.model.UserModel;


@RestController
public class elpcontroller {
	@Autowired
	public elpService eser;
	//user
	@PostMapping("/user/id")
	public UserModel savedetails(@RequestBody UserModel id) 
	
	{
		return eser.savedetails(id);
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		eser.delete(id);
		return "deleted";
		
	}
	@GetMapping("/getuser")
	public Object getdetails(@PathVariable("id")int id)
	{
		return eser.getdetails(id);
	}
	
	@PutMapping("/update")
	
	public UserModel updatedetails(@RequestBody UserModel id)
	{
		return eser.updateInfo(id);
	}
	
	 //LoanApplication
@PostMapping("/lapp")
public LoanApplicationModel savedetails1(@RequestBody LoanApplicationModel id) 

{
	return eser.save(id);
}
@DeleteMapping("/deletelapp/{id}")
public String delete2(@PathVariable("id")int id)
{
	eser.deletela(id);
	return "deleted";
	
}

@GetMapping("/getlapp")
public Object getdetails3(@PathVariable("id")int id)
{
	return eser.getdetails3(id);
}
@PutMapping("/updatelapp")

public LoanApplicationModel update(@RequestBody LoanApplicationModel id)
{
	return eser.updateInfo(id);
}
}

