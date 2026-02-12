package com.tnsif.exceptionhandlingdemo;
// NO EXCEPTION
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("java ");
		}
		catch(ArithmeticException s) {
		System.out.println(s.getMessage());	
		}
		finally {
			System.out.println("COURSE");
		}
	}

}
