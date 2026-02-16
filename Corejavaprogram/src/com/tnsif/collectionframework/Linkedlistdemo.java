package com.tnsif.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {
// linkedlist
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("aaa");
		l.add("giri");
		l.add("anushma");
		
		
		//l.add(1); error blz it wont store int as we define string only
	  System.out.println(l);
	  
	  l.addFirst("bbb");
	  l.addLast("Geetha");
	  System.out.println(l);
	  

	  
	  l.remove(2);
		System.out.println(l);
		
		for(String cars:l) {
			System.out.println(cars);
	  
	}
	}
}


