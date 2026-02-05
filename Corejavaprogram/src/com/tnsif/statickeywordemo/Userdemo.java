package com.tnsif.statickeywordemo;

public class Userdemo {
	String Username;
	static String appname="instaclone";// shared by all users
	
	Userdemo(String Username){
		this.Username=Username;
	}
	//method
	void showdetails() {
		System.out.println("user : "+Username +" "+"App : "+appname);
	}
	public static void main(String[] args) {
		Userdemo d1=new Userdemo("rashmi");
		Userdemo d2=new Userdemo("kavana");
		
		d1.showdetails();
		d2.showdetails();// TODO Auto-generated method stub

	}

}
