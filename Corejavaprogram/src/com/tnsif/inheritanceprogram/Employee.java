package com.tnsif.inheritanceprogram;
//parent class
 class Employee {
	 void company() {
			System.out.println("company : Techcorp");
		}
	}


	//child class1
	class Developer extends Employee{
		void role() {
			System.out.println("role : software developer");
		}
	}

	//child class2
	class Tester extends Employee{
		void role() {
			System.out.println("Role:QA Tester");
		}
	}



