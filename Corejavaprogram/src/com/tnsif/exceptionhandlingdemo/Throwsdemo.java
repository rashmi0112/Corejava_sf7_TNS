package com.tnsif.exceptionhandlingdemo;
import java.io.IOException;//check input/output values
public class Throwsdemo {
	// yashaswini
	void m1() 
	{ // no exception
		System.out.println("no exception");	
		}
	//bhuvana
	void m2() throws ArithmeticException,ArrayIndexOutOfBoundsException// unchecked exceptions both are
	{
			System.out.println("device error");// unchecked(runtime exception)exception they dont check during run time
		//so they will execute finely
	}
		// kavana
		void m3() throws ArithmeticException,IOException{// checked exception during compile time so it will throw exception
			System.out.println("file error");// ioexception is checked,arthimeticexception is unchecked 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwsdemo t=new Throwsdemo();
		t.m1();
//		try {
//		t.m2();
//		}
//		catch(ArithmeticException r) {
//			System.out.println(r);
//		}
		
		t.m2();// ArrayIndexOutOfBoundsException is unchecked exception
		// so it will run without throwing exception
		//t.m3();
		
	try {
		t.m3();
		}
		catch(ArithmeticException s) {
			System.out.println(s);
	}
		catch(IOException g) {
		System.out.println(g);		}
	}

}
