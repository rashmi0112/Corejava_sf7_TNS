package com.tnsif.polymorphismdemo;
//demo for constructor overload
public class Student {
	String name;
	int age;
	int marks;
	double cgpa;
	
	 Student(){
		
		System.out.println("default constructor");
	}
	Student(String name){
		this.name=name;
		System.out.println("name "+name);
	}
	Student(String name , int age){
		this.name=name;
		this.age=age;
		System.out.println("name "+name +" Age "+age);
	}
	Student(int marks, double cgpa ){
		this.marks=marks;
		this.cgpa=cgpa;
		System.out.println("marks "+marks +"cgpa "+cgpa);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("RASHMI");
		Student s3=new Student("YASHASWINI",8);
		Student s4=new Student(234,8.0);// TODO Auto-generated method stub

	}

} 
// polymorphism - 2 type 
// 1. compile time(Early Binding (Static Binding)) - can acheived through methodoverloading
// 2.run time Late Binding (Dynamic Binding) - can acheived through methodoverriding

