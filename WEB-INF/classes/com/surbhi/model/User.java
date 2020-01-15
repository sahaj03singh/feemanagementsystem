package com.surbhi.model;

public class User {
private int userId;
private String name;
private String password;
private String type;
public User()
{
	System.out.println("constructor built");
}

public User(String name, String password, String type) {
	super();
	this.name = name;
	this.password = password;
	this.type = type;
}

public User(int userId, String name, String password, String type) {
	super();
	this.userId = userId;
	this.name = name;
	this.password = password;
	this.type = type;
}

public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", type=" + type + "]";
}


}
