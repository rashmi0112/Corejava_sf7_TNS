package com.tnsif.superkeyworddemo;
//demo for super method


//parent class
class Payment1{
	void process() {  // method or function
		System.out.println("processing payment");
	}
}

//child class

class Gpay extends Payment1{
	void process() {
		System.out.println("processing payment via gpay");
	}
	
	void completetransaction() {
		super.process();
		process();
	}
}






public class Superwithmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gpay g=new Gpay();
		g.completetransaction();
	}

}
