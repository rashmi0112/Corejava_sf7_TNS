package com.tnsif.constructordemo;
//demo for constructor 

public class Constructorexam {
	Constructorexam(){
		System.out.println("default con");	
		}
		Constructorexam(int a){
			System.out.println("1 parameter");	
		}
		Constructorexam(String b, int s){
			System.out.println("2 parameter");	
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexam c=new Constructorexam();
		Constructorexam c1=new Constructorexam("rash",7);
		Constructorexam c2=new Constructorexam(5);
	}

}
