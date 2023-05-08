package com.example.Project01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.Model.LoginPage;

public interface LoginRepo  extends JpaRepository<LoginPage,Integer>{
	LoginPage findByusername(String username);

}
