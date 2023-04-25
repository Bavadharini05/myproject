package com.database.stock.repositay;



import org.springframework.data.jpa.repository.JpaRepository;

import com.database.stock.model.Stockmodel;

public interface stockRepo extends JpaRepository<Stockmodel, Integer> {

}