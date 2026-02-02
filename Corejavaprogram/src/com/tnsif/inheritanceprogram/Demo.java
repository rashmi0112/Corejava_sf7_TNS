package com.tnsif.inheritanceprogram;
//demo for multilevel inheritance
//parent class

 class Demo {
	 void devicetype() {
			System.out.println("iam an electronic device");
		}
		}

		//son
		class Phone extends Demo{
			void brand() {
				System.out.println("brand:samsung");
			}
		}

		//grandson
		class Smartphone extends Phone{
			void Smartphone() {
				System.out.println("features: camera, internet");
			}
		}

		