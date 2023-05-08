package com.example.EducationalLoan011.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoan011.Model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer> {
	

}
