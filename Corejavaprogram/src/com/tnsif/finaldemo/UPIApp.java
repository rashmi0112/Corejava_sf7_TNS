package com.tnsif.finaldemo;

public class UPIApp {
	final int Max_limit=10000; // daily tranfer limit

	void show() {
		System.out.println(Max_limit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPIApp u=new  UPIApp();
		 u.show();
	 //u.Max_limit=30000;// u can't change the value
	}

}
