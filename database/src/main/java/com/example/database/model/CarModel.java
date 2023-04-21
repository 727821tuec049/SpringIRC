package com.example.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CarModel")
public class CarModel {
@Id
 private int cid;
 private String cname;
 private int milage;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}
 
}
