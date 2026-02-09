package com.tnsif.interfacedemo;
//multiple  level inheritance
public class Demo implements Interfacetwo,Interfaceone{

	@Override
	public void print() {
		System.out.println("welcome");
		
	}

	@Override
	public void show() {
		System.out.println("hello world");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
		d.show();
	}
}
