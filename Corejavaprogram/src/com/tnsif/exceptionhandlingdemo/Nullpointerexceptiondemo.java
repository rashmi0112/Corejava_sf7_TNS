package com.tnsif.exceptionhandlingdemo;
//NULL POINTER
public class Nullpointerexceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
		System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("welcome to exception handling");
	}

}
