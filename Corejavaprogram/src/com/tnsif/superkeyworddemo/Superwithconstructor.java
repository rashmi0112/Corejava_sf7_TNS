package com.tnsif.superkeyworddemo;
//demo for super with constructor 

class User{
	User(){  // constructor
		System.out.println("user account created");
	}
}
class Adminuser extends User{
	Adminuser(){
		super();  // calls user const
		System.out.println("welcome");
	}
}
public class Superwithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adminuser a=new Adminuser();
	}

}
