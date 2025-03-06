package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@Column(length = 10)
	private String uname;
	@Column(length = 10,nullable = false)
	private String pass;
	@Column(length = 25,nullable = false)
	private String nm;
	@Column(length =30,nullable = false)
	private String email;
	@Column(length = 10,nullable = false)
	private String phno;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String uname, String pass, String nm, String email, String phno) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.nm = nm;
		this.email = email;
		this.phno = phno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Register [uname=" + uname + ", pass=" + pass + ", nm=" + nm + ", email=" + email + ", phno=" + phno
				+ "]";
	}
	

}
