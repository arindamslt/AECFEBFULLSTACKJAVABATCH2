package com.arindam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="employee_dtls")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	@Column(length = 25,nullable = false)
	private String ename;
	@Column(name="job",length = 25)
	private String edesig;
	private Double sal;
	@Temporal(TemporalType.DATE)
	private Date hiredt;
	@Temporal(TemporalType.TIMESTAMP)
	private Date workhr;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eid, String ename, String edesig, Double sal, Date hiredt, Date workhr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesig = edesig;
		this.sal = sal;
		this.hiredt = hiredt;
		this.workhr = workhr;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesig() {
		return edesig;
	}
	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Date getHiredt() {
		return hiredt;
	}
	public void setHiredt(Date hiredt) {
		this.hiredt = hiredt;
	}
	public Date getWorkhr() {
		return workhr;
	}
	public void setWorkhr(Date workhr) {
		this.workhr = workhr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesig=" + edesig + ", sal=" + sal + ", hiredt="
				+ hiredt + ", workhr=" + workhr + "]";
	}
	

}
