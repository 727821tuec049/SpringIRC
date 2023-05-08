package com.example.Project01.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project01.Model.LoginPage;
import com.example.Project01.Service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/run")

public class LoginController {
@Autowired
private LoginService lser;
@Tag(name="login")
@PostMapping("/login")
public String login(@RequestBody Map<String,String>loginData)
{
	String username = loginData.get("username");
    String password = loginData.get("password");
    String result = lser.checkLogin(username, password);
    return result;
}
@Tag(name="userDetails")
@PostMapping("/adduser")

	public LoginPage AddUser(@RequestBody LoginPage lp)
	{
		return lser.addUser(lp);
	}
@Tag(name="getuser")
@GetMapping("/getu")
public List<LoginPage> listAll()
{
	return lser.getUser();
}
@Tag(name="deletebyid")
@DeleteMapping("/delete/{id}")
public String delete (@PathVariable int id)
{
	return lser.deleteById(id);
}
}


