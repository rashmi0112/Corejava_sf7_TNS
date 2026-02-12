package com.tnsif.exceptionhandlingdemo;
// exception handling
public class Arthimaticeexceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50/5;
		System.out.println(num1);
		
		int num2=500/100;
		System.out.println(num2);
		
		try {
		int num3=30/0;
		System.out.println(num3);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		int num4=50/50;
		System.out.println(num4);
	}

}
