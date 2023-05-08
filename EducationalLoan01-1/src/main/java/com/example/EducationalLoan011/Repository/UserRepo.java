package com.example.EducationalLoan011.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan011.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer> {

}
