package com.example.OnetoOne.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Collections {
@Id
private int ansno;
private String ans;
public int getAnsno() {
	return ansno;
}
public void setAnsno(int ansno) {
	this.ansno = ansno;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
}
