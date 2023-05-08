package com.example.Login01.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginForm {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int counters;
private String username;
private String password;
public int getCounters() {
	return counters;
}
public void setCounters(int counters) {
	this.counters = counters;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "LoginForm [counters=" + counters + ", username=" + username + ", password=" + password + "]";
}


}
