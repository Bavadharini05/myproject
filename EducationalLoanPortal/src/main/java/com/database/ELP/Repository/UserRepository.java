package com.database.ELP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.ELP.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
