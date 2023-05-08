package com.example.Mapping.Model;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
@Id
private int qno;
private String qname;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn
private List<Answer>ans;
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
public List<Answer> getAns() {
	return ans;
}
public void setAns(List<Answer> ans) {
	this.ans = ans;
}

}
