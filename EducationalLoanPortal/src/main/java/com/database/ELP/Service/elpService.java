package com.database.ELP.Service;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.database.ELP.Repository.AdminRepository;
import com.database.ELP.Repository.LoanApplicationRepository;
//import com.database.ELP.Repository.LoginRepository;
import com.database.ELP.Repository.UserRepository;
import com.database.ELP.model.LoanApplicationModel;
//import com.database.ELP.model.AdminModel;
//import com.database.ELP.model.LoanApplicationModel;
//import com.database.ELP.model.LoginModel;
import com.database.ELP.model.UserModel;
@Service
public class elpService {
	@Autowired
	public UserRepository urepo;
//	public LoginRepository lrepo;
//	public AdminRepository arepo;
	public LoanApplicationRepository larepo;
//Usermodel
	public UserModel savedetails(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.save(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		urepo.deleteById(id);
		
	}

	public Object getdetails(int id) {
		// TODO Auto-generated method stub
		return urepo.findById(id);
	}

	public UserModel updateInfo(UserModel id) {
		// TODO Auto-generated method stub
		return urepo.saveAndFlush(id);
	}
		//LoanApplication

	public LoanApplicationModel save(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return larepo.save(id);
	}

	public void deletela(int id) {
		// TODO Auto-generated method stub
		larepo.deleteById(id);
	}

	public Object getdetails3(int id) {
		// TODO Auto-generated method stub
		return larepo.findById(id);
	}

	public LoanApplicationModel updateInfo(LoanApplicationModel id) {
		// TODO Auto-generated method stub
		return larepo.saveAndFlush(id);
	}

	}


	

	
