package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_dtl")
public class Customer {
	@Id
	@Column(length = 10)
private String cid;
	@Column(length = 25,nullable = false)
private String cname;
	@OneToOne
	@JoinColumn(name="adhar_no")
private Adhar adhar;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cid, String cname, Adhar adhar) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.adhar = adhar;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", adhar=" + adhar + "]";
	}
	
	
}
