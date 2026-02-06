package com.tnsif.abstractiondemo;

public class Square  extends Shape{
private float side;
	
	public Square() {
		side=2.0f;
	}

	public Square(float side) {
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.calarea();
		s.show();
	}

}
