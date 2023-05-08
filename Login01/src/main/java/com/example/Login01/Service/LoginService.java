package com.example.Login01.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login01.Model.LoginForm;

@Service
public class LoginService
{
@Autowired
private LoginFormRepository repository;
public String checkLogin(String username,String password)
{
LoginForm user=repository.findByusername(uname);
if(user.getPassword().equals(password))
}
{
	return"Login Succesfull";
}

}
