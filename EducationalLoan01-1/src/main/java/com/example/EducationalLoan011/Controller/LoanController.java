package com.example.EducationalLoan011.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EducationalLoan011.Model.LoanApplicationModel;
import com.example.EducationalLoan011.Model.UserModel;
import com.example.EducationalLoan011.Service.LoanService;

@RestController
@RequestMapping("/user")
public class LoanController {
public LoanService lser;
@Autowired
@GetMapping("/ad")
 public Optional<UserModel>readbyid(@PathVariable("id")int id)

    {

   	 return lser.getUserModelbyId(id);

    }
@PostMapping("/id")

    public UserModel create(@RequestBody UserModel id)

    {

   	 return lser.adduser(id);
   	 }

	 
	 @PutMapping("/id")

     public UserModel update(@RequestBody UserModel id)
	 {

    	 return lser.update(id);

     }

	 
          @DeleteMapping("/delete")

     public String delete(@PathVariable("id")int id)

     {

    	 lser.delete(id);



    	 return "Deletion was successful";

     }
          @PostMapping("/lid")

          public LoanApplicationModel create(@RequestBody LoanApplicationModel loanId)

          {

         	 return lser.adduser(loanId);

          }

      	 @PutMapping("/lid")

           public LoanApplicationModel update(@RequestBody LoanApplicationModel loanId)

           {

          	 return lser.update(loanId);

           }

            @DeleteMapping("/delete")

           public String delete1(@PathVariable("loanId")int loanId)

           {

          	 lser.delete(loanId);

          	 return "Deletion was successful";

           }
            @GetMapping("/get/{id}")
            public LoanApplicationModel getdata(@PathVariable("id")int id)
            {
            	return lser.getdata(id);
            }
}




