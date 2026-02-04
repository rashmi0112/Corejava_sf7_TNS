package com.tnsif.superkeyworddemo;

//parent class
class Notification{
	String message="default notification"; // variable
}

//child class
class Pushnotification extends Notification{
	String message="push notificiation from whstp";
	
	void notification() {
		System.out.println("child message "+ message);
		System.out.println("parent message "+ super.message);
	}
}

public class Superwithvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pushnotification p=new Pushnotification();
		p.notification();
	}

}
