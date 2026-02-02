package com.tnsif.constructordemo;

import java.util.Scanner;

public class Constomerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		 Customer c=new  Customer();
		 c.setCustomername(name);
		 c.setCustomeraddress(address);
		 c.setCustomerid(id);
		 
		 System.out.println(c);
		 
		 Customer c1 =new Customer();
		boolean output=c1 instanceof Customer;
		 System.out.println(output);
		 

	}

}
