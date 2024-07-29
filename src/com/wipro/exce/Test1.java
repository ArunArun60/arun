package com.wipro.exce;

public class Test1 {
	
	public static void main(String[] args) {
		
		int a=4,b=0;
		try {
		int z = a/b;
		System.out.print("division is:" + z);
	}
    catch(ArithmeticException ae) {
    	
    	System.out.println("for division by zero");
    }
		catch(NumberFormatException ne) {
			
			System.out.println("for in valide input");
		}
	}
}
