package com.tnsif.interfacedemo;
//demo for nested interface
public interface Myinterface {
void calculateArea();
	
	// nested interface
	interface Myinnerinterface{
		int id=20;
		void print();
	}
}
