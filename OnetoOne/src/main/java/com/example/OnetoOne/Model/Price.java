package com.example.OnetoOne.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Price {
	@Id
	private int qno;
	private String qname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Price answer;
public int getQno() {
	return qno;
}
public void setQno(int qno) {
	this.qno = qno;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public Price getAnswer() {
	return answer;
}
public void setAnswer(Price answer) {
	this.answer = answer;
}

}
