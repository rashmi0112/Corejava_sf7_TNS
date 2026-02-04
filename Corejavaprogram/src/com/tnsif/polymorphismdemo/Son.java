package com.tnsif.polymorphismdemo;
//child class

public class Son extends Father {
String p="rohith";
	
	@Override
	void drinking() {
		System.out.println("boost");
		super.drinking();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.drinking();
		
	}

}
