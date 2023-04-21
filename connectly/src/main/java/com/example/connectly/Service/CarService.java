package com.example.connectly.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.connectly.Repository.CarRepo;
import com.example.connectly.model.Transport;

@Service
public class CarService {
@Autowired
public CarRepo crepo;
public Transport saveinfo(Transport t)
{
  
	return crepo.save(t);
}

}
