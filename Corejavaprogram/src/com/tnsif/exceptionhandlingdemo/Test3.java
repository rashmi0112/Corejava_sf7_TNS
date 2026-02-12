package com.tnsif.exceptionhandlingdemo;
import java.io.IOException;
// EXCEPTION WITH NO MATCHING CATCH BLOCK
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(9/0);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
		finally {
			System.out.println("thank you");
		}
	}

}
