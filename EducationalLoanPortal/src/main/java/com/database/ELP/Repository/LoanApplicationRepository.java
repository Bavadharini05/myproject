package com.database.ELP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.ELP.model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {

}
