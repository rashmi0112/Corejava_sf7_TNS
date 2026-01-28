package com.tnsif.scannerdemo;

import java.util.Scanner;

public class Personexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter person name");
		String name=sc.next();
		
		System.out.println("enter person income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation t=new Taxcalculation();
		t.calculatetax(pp);
		
		System.out.println("after tax calculation");
		System.out.println(pp);
	}

}
