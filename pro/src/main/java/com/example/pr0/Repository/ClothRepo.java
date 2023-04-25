package com.example.pr0.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proj.ClothStore;

public interface ClothRepo extends JpaRepository<ClothStore,Integer>{
	
}
