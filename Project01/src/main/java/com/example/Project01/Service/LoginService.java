package com.example.Project01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project01.Model.LoginPage;
import com.example.Project01.Repository.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo lrepo;
public String checkLogin(String username,String password)
{
	LoginPage user=lrepo.findByusername(username);
	if(user==null)
	{
		return"No user Found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Login successful";
		}
		else
		{
			return "Login Failed";
		}
	}
}
public LoginPage addUser(LoginPage lp)
{
	return lrepo.save(lp);
}
public List<LoginPage>getUser()
{
	return lrepo.findAll();
}
public String deleteById(int id)
{
	lrepo.deleteById(id);
	return "Deleted";
}
}
