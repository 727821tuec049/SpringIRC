package com.example.EducationalLoan011.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan011.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel,Integer> {

}
