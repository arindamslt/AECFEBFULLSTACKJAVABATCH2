package com.arindam.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="order_dtls")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date odt;
	@Column(length = 10,nullable = false)
	private String fid;
	private Integer oqty;
	@Column(length = 10,nullable = false)
	private String uname;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer oid, Date odt, String fid, Integer oqty, String uname) {
		super();
		this.oid = oid;
		this.odt = odt;
		this.fid = fid;
		this.oqty = oqty;
		this.uname = uname;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Date getOdt() {
		return odt;
	}
	public void setOdt(Date odt) {
		this.odt = odt;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public Integer getOqty() {
		return oqty;
	}
	public void setOqty(Integer oqty) {
		this.oqty = oqty;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", odt=" + odt + ", fid=" + fid + ", oqty=" + oqty + ", uname=" + uname + "]";
	}
	

}
