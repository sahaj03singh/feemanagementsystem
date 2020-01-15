package com.surbhi.model;

public class Student {
 private int rollNo;
 private String name;
 private String password;
 private String email;
 private String course;
 private String sex;
 private double fee;
 private double paid;
 private double due;
 private String contact;
 private String type;
 
 public Student()
 {
	 System.out.println("constructor built");
 }

public Student(int rollNo, String name, String password, String email, String course, String sex, double fee,
		double paid, double due, String contact, String type) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.password = password;
	this.email = email;
	this.course = course;
	this.sex = sex;
	this.fee = fee;
	this.paid = paid;
	this.due = due;
	this.contact = contact;
	this.type = type;
}

public Student(String name, String password, String email, String course, String sex, double fee, double paid,
		double due, String contact, String type) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.course = course;
	this.sex = sex;
	this.fee = fee;
	this.paid = paid;
	this.due = due;
	this.contact = contact;
	this.type = type;
}

public Student(int rollNo, String name, String email, double due, String contact) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.email = email;
	this.due = due;
	this.contact = contact;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
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

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public double getFee() {
	return fee;
}

public void setFee(double fee) {
	this.fee = fee;
}

public double getPaid() {
	return paid;
}

public void setPaid(double paid) {
	this.paid = paid;
}

public double getDue() {
	return due;
}

public void setDue(double due) {
	this.due = due;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
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
	return "Student [rollNo=" + rollNo + ", name=" + name + ", password=" + password + ", email=" + email + ", course="
			+ course + ", sex=" + sex + ", fee=" + fee + ", paid=" + paid + ", due=" + due + ", contact=" + contact
			+ ", type=" + type + "]";
}

}
