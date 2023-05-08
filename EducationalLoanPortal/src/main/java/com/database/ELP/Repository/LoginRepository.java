package com.database.ELP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.ELP.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {




}
