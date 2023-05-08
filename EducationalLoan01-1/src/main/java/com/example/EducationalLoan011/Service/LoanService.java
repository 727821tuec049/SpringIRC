package com.example.EducationalLoan011.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoan011.Model.LoanApplicationModel;
import com.example.EducationalLoan011.Model.UserModel;
import com.example.EducationalLoan011.Repository.LoanApplicationRepo;
//import com.example.EducationalLoan011.Repository.LoginRepo;
import com.example.EducationalLoan011.Repository.UserRepo;
@Service
public class LoanService {
@Autowired

		

		public UserRepo rep;

		

		public UserModel adduser(UserModel usModel)

		{

		return rep.save(usModel);

		}



		public Optional<UserModel> getUserModelbyId(int id)

		{

		return rep.findById(id);

		}

		public UserModel update (UserModel id)

		{

		return rep.saveAndFlush(id);

		}

		public void delete(int id)

		{

		rep.deleteById(id);

		}

		

	public LoanApplicationRepo repe;

		

		public LoanApplicationModel adduser(LoanApplicationModel usmodel)

		{

		return repe.save(usmodel);

		}

		public LoanApplicationModel update (LoanApplicationModel loanId)

		{

		return repe.saveAndFlush(loanId);

		}

		public void delete1(int loanId)

		{

		repe.deleteById(loanId);

		}



		public LoanApplicationModel getdata(int id) {
			// TODO Auto-generated method stub
			return repe.getById(id);
		}

		

		







	}

