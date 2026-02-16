package com.tnsif.collectionframework;
import java.util.Vector;
public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		// add element
		 
		v.add(10);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(200);
		v.add(100);
		
		v.set(4, 76);
		
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		for(int f:v) {
			System.out.println(f);
		}
		
		System.out.println(v.size());
		v.clear();
		System.out.println(v);
	}

}
