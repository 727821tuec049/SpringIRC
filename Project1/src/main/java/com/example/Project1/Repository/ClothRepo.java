package com.example.Project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project1.Model.ClothStore;

public interface ClothRepo extends JpaRepository<ClothStore,Integer> {

}
