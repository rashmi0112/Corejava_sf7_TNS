package com.tnsif.finaldemo;
//demo for final method

class Platform{
	//final 
	void caluculate() {
		System.out.println("base discount=10%");
	}
}
class Amazon extends Platform{
	@Override
	void caluculate() {
		System.out.println("base discount=20%");
	}
}
public class Finalmethod {

}
