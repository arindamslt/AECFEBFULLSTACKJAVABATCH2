package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "/")
public class Employee {
	private String eid;
	private String ename;
	private List<String> colleague;
	private Set<String> phno;
	private Map<String,Double> tcost;
	private Properties pinfo;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eid, String ename, List<String> colleague, Set<String> phno, Map<String, Double> tcost,
			Properties pinfo) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.colleague = colleague;
		this.phno = phno;
		this.tcost = tcost;
		this.pinfo = pinfo;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getColleague() {
		return colleague;
	}
	public void setColleague(List<String> colleague) {
		this.colleague = colleague;
	}
	public Set<String> getPhno() {
		return phno;
	}
	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}
	public Map<String, Double> getTcost() {
		return tcost;
	}
	public void setTcost(Map<String, Double> tcost) {
		this.tcost = tcost;
	}
	public Properties getPinfo() {
		return pinfo;
	}
	public void setPinfo(Properties pinfo) {
		this.pinfo = pinfo;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", colleague=" + colleague + ", phno=" + phno + ", tcost="
				+ tcost + ", pinfo=" + pinfo + "]";
	}
	
	
	

}
