package com.tnsif.polymorphismdemo;

public class SBI extends RBI {
	
	@Override
	int getrateofinterest()
	{
		return 7;
	}


	public static void main(String[] args) {
		
		SBI d=new SBI();
		System.out.println(d.getrateofinterest());
	}

}
