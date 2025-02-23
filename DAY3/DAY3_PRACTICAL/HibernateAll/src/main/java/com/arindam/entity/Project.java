package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	@Id
	@Column(length = 10)
private String projid;
	@Column(length = 25,nullable = false)
private String projnm;
	@Column(length = 25,nullable = false)
private String tech;
private Integer duration;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(String projid, String projnm, String tech, Integer duration) {
	super();
	this.projid = projid;
	this.projnm = projnm;
	this.tech = tech;
	this.duration = duration;
}
public String getProjid() {
	return projid;
}
public void setProjid(String projid) {
	this.projid = projid;
}
public String getProjnm() {
	return projnm;
}
public void setProjnm(String projnm) {
	this.projnm = projnm;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public Integer getDuration() {
	return duration;
}
public void setDuration(Integer duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Project [projid=" + projid + ", projnm=" + projnm + ", tech=" + tech + ", duration=" + duration + "]";
}

}
