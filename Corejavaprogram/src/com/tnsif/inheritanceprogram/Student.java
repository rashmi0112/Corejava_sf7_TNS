package com.tnsif.inheritanceprogram;
//child class
public class Student extends Course {
String Student="amit";
	
	void studentcourse() {
		System.out.println(Student);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.showcourse();
		s.studentcourse();
	}

}
