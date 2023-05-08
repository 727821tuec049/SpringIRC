package com.example.OnetoOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OnetoOne.Model.Price;

public interface PriceRepo extends JpaRepository<Price,Integer>{

}
