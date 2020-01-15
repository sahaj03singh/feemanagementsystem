package com.surbhi.model;

public class Accountant {
 private int userid;
 private String name;
 private String password;
 private String email;
 private String sex;
 private int contact;
 private String type;
 
public Accountant(String name, String password, String email, String sex, int contact, String type) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.sex = sex;
	this.contact = contact;
	this.type = type;
}
public Accountant(int userid, String name, String password, String email, String sex, int contact, String type) {
	super();
	this.userid = userid;
	this.name = name;
	this.password = password;
	this.email = email;
	this.sex = sex;
	this.contact = contact;
	this.type = type;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Accountant [userid=" + userid + ", name=" + name + ", password=" + password + ", email=" + email + ", sex="
			+ sex + ", contact=" + contact + ", type=" + type + "]";
}

 
}
