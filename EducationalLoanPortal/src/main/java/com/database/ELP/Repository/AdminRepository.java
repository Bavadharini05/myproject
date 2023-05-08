package com.database.ELP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.ELP.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

}
