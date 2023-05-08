package com.example.Login01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Login01.Model.LoginForm;

public interface LoginRepo extends JpaRepository<LoginForm,Integer> 
{
LoginForm findByusername(String username);

}
