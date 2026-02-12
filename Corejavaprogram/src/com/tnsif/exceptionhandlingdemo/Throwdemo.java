package com.tnsif.exceptionhandlingdemo;
//throw keyword
public class Throwdemo {
	void validate(int age) {
		if(age<18) 
		{
			throw new ArithmeticException("u're not eligiable");
		}
		else 
		{
			System.out.println("u're eligiable");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwdemo t=new Throwdemo();
		
		t.validate(18);//condition satisfied so no exception
		t.validate(3);
		//exception is  occur cause the input value/condition is not satisfied or 
	}

}
