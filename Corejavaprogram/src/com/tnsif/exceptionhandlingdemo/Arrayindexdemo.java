package com.tnsif.exceptionhandlingdemo;
// ARRAY INDEX OUT OF BOund exceptions
public class Arrayindexdemo {
// ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[4];
       try 
       {
    	   System.out.println("i am rashmi");// it will excecute this line as exception didn't occur yet
    	   int i=arr[5];
    	   System.out.println(i);
    	   System.out.println("CSE");
       }
       catch(ArrayIndexOutOfBoundsException ae)
       
       {
    	   System.out.println(ae);
       }
	}

}
