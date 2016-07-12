package org.gireeshma.reddy.dto;
/*
 * This class acts as the bean.
 */
public class User {
public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
private String userName;
private String password;
private String age;
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
private String email;
private String number;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private int userId;
}
