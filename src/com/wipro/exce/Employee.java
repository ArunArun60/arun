package com.wipro.exce;

import java.util.Collections;

public class Employee implements Comparable<Employee> {
	private Integer empid;
	private String empname;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	public Employee(Integer empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	//@Override
	public int compareTo(Employee o) {
		
	 ////if(this.getEmpid()>o.getEmpid()) {
		 //return 1;
	//}
	 //else if(this.getEmpid()<o.getEmpid()) {
		// return -1;
		 
	// }
	// else {
		 //return 0;
	 //}
		return this.getEmpname().compareTo(o.getEmpname());
		//return this.getEmpid().compareTo(o.getEmpid());
	}
	
}
