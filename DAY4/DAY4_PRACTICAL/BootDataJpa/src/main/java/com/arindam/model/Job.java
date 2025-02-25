package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
	@Id
	@Column(length = 10)
	private String jobid;
	@Column(length = 25,nullable = false)
	private String jobnm;
	@Column(length = 25,nullable = false)
	private String compnm;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String jobid, String jobnm, String compnm) {
		super();
		this.jobid = jobid;
		this.jobnm = jobnm;
		this.compnm = compnm;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJobnm() {
		return jobnm;
	}
	public void setJobnm(String jobnm) {
		this.jobnm = jobnm;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobnm=" + jobnm + ", compnm=" + compnm + "]";
	}
	

}
