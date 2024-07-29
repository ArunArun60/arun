package com.wipro.exce;

import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		TreeSet<Employee> al= new TreeSet<>(new EmployeeNameComparator());
		
		al.add(new Employee(100,"Raju"));
		al.add(new Employee(500,"Rk"));
		al.add(new Employee(200,"Aju"));
		al.add(new Employee(100,"Rm"));
		
		//Collections.sort(al);
		//Collections.sort(al, new MyComparator());
		for(Employee e:al) {
			System.out.println(e.getEmpid()+" " +e.getEmpname());
		}

     }
}
