package com.example.connectly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectly.model.Transport;

public interface CarRepo extends JpaRepository<Transport,Integer> {

}
