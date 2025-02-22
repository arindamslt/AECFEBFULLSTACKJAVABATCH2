package com.arindam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private String regno;
private String sname;
private String sdept;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String regno, String sname, String sdept) {
	super();
	this.regno = regno;
	this.sname = sname;
	this.sdept = sdept;
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdept() {
	return sdept;
}
public void setSdept(String sdept) {
	this.sdept = sdept;
}
@Override
public String toString() {
	return "Student [regno=" + regno + ", sname=" + sname + ", sdept=" + sdept + "]";
}

}
