package com.tnsif.abstraction;

public class Rectangle extends Shape {
	private float length, breadth;

	public Rectangle() { // default constructor
		this.length = 5.0f;
		this.breadth = 2.0f;
	}

	public Rectangle(float length, float breadth) { // parameterized constructor
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void calcarea() {
		area = length * breadth;
	}
}