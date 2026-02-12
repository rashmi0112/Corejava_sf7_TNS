package com.tnsif.exceptionhandlingdemo;
//exception with matching catch block
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(6/0);
		}
		catch(Exception t) {
			System.out.println(t);
		}
		finally {
			System.out.println("HI");
		}// FINALL WILL ALWAYS EXCEUTE DESPITE OF EXCEPTION ARE THERE OR NOT
	}

}
