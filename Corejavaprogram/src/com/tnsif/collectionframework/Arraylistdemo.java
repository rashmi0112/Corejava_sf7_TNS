package com.tnsif.collectionframework;
// collection is framework where group of homo or hetero elements are stored.
import java.util.ArrayList;
// with out generic way
public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList a=new ArrayList();
    a.add(5);//int
    a.add("rashmi");//str
    a.add(5.7f);//float
    a.add('d');// char
    System.out.println(a);
    a.remove(2);
    System.out.println(a);
    a.size();
    System.out.println(a.size());
    a.add("home");
    System.out.println(a);
    
	}

}
