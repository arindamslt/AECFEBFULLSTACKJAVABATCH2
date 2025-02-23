package com.arindam.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="tst")
//@Scope("prototype")
@Scope("singleton")
public class Test {
private String testid;
private String testnm;
private Integer testduration;
private String tsoftware;
public Test() {
	super();
	// TODO Auto-generated constructor stub
}
public Test(String testid, String testnm, Integer testduration, String tsoftware) {
	super();
	this.testid = testid;
	this.testnm = testnm;
	this.testduration = testduration;
	this.tsoftware = tsoftware;
}
public String getTestid() {
	return testid;
}
public void setTestid(String testid) {
	this.testid = testid;
}
public String getTestnm() {
	return testnm;
}
public void setTestnm(String testnm) {
	this.testnm = testnm;
}
public Integer getTestduration() {
	return testduration;
}
public void setTestduration(Integer testduration) {
	this.testduration = testduration;
}
public String getTsoftware() {
	return tsoftware;
}
public void setTsoftware(String tsoftware) {
	this.tsoftware = tsoftware;
}
@Override
public String toString() {
	return "Test [testid=" + testid + ", testnm=" + testnm + ", testduration=" + testduration + ", tsoftware="
			+ tsoftware + "]";
}


}
