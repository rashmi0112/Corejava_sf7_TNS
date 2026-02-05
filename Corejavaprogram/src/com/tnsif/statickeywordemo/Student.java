package com.tnsif.statickeywordemo;
//demo for static method
public class Student {
	int rollno;
	String name;
	static String college="IIT";
	
	//static method change value
	
	static void change() {
		college="nagarjuna";
		
	}
	Student(int r,String s){
		rollno=r;
		name=s;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student.change();
		
		Student s1=new Student(1,"aaa");
		Student s2=new Student(2,"ccc");
		Student s3=new Student(3,"bbb");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
