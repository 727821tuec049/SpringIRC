package com.example.Project20.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project20.Model.ClothStore;

public interface ClothRepo extends JpaRepository<ClothStore,Integer> {

}
