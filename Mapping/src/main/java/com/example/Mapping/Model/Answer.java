package com.example.Mapping.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Answer {
@Id
private int ansno;
private String answer;
public int getAnsno() {
	return ansno;
}
public void setAnsno(int ansno) {
	this.ansno = ansno;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

}
