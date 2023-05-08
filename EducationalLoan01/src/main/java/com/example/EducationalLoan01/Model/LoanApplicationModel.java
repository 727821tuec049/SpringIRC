package com.example.EducationalLoan01.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
@Id
private int loanId;
private String loantype;
private String applicantName;
private String applicantAddress;
private String applicantMobile;
private String applicantEmail;
private String applicantAadhaar;
private String applicantPan;
private String applicantSalary;
private String loanAmountRequired;
private String loanRepaymentMonths;


}
