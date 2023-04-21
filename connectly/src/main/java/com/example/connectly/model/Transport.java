package com.example.connectly.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transport")
public class Transport {
	@Id
	@Column(name="cid")
private int cid;
private String cmodel;
private int milage;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCmodel() {
	return cmodel;
}
public void setCmodel(String cmodel) {
	this.cmodel = cmodel;
}
public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}

}
