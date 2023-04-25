package com.example.Project01.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.Model.ClothStore;

public interface ClothRepo extends JpaRepository<ClothStore,Integer> {

}
