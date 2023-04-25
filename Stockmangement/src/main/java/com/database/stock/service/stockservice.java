package com.database.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.database.stock.controller.stockmodel;
import com.database.stock.model.Stockmodel;
import com.database.stock.repositay.stockRepo;

@Service
public class stockservice {
@Autowired
stockRepo srepo;

public Stockmodel savedetails(Stockmodel hi) {
	// TODO Auto-generated method stub
  return	 srepo.save(hi);

}

public void deletedetails(int hi) {
	// TODO Auto-generated method stub
	 srepo.deleteById(hi);
}
public Object getdetails(int hi) {
	// TODO Auto-generated method stub
	return srepo.findById(hi);
}

public Stockmodel updateInfo(Stockmodel hi) {
	// TODO Auto-generated method stub
	return srepo.saveAndFlush(hi);
}






}
