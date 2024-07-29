package com.wipro.exce;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//return o1.getEmpid().compareTo(o2.getEmpid());
		return o2.getEmpname().compareTo(o1.getEmpname());
		
	}

}
