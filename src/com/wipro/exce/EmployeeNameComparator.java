package com.wipro.exce;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpid().compareTo(o2.getEmpid());
	}

}
