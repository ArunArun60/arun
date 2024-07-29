package com.wipro.exce;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Employee> al= new ArrayList();
		
		al.add(new Employee(100,"Raju"));
		al.add(new Employee(500,"Rk"));
		al.add(new Employee(200,"Aju"));
		al.add(new Employee(100,"Rm"));
		
		//Collections.sort(al);
		Collections.sort(al, new MyComparator());
		for(Employee e:al) {
			System.out.println(e.getEmpid()+" " +e.getEmpname());
		}
	}

}
