package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="cl")
public class Client {
	@Value("${cid}")
private String cid;
	@Value("${cname}")
private String cname;
	@Value("${friends}")
private List<String> friends;
	@Value("${phno}")
private Set<String> phno;
	@Value("#{${purchase}}")
private Map<String,Double> purchase;
	@Value("#{${pinfo}}")
private Properties pinfo;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String cid, String cname, List<String> friends, Set<String> phno, Map<String, Double> purchase,
			Properties pinfo) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.friends = friends;
		this.phno = phno;
		this.purchase = purchase;
		this.pinfo = pinfo;
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
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getPhno() {
		return phno;
	}
	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}
	public Map<String, Double> getPurchase() {
		return purchase;
	}
	public void setPurchase(Map<String, Double> purchase) {
		this.purchase = purchase;
	}
	public Properties getPinfo() {
		return pinfo;
	}
	public void setPinfo(Properties pinfo) {
		this.pinfo = pinfo;
	}
	@Override
	public String toString() {
		return "Client [cid=" + cid + ", cname=" + cname + ", friends=" + friends + ", phno=" + phno + ", purchase="
				+ purchase + ", pinfo=" + pinfo + "]";
	}


}
