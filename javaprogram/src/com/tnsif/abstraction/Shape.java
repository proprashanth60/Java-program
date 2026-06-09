package com.tnsif.abstraction;

//program to define abstract class

public abstract class Shape { // abstract class
	protected float area;

	abstract void calcarea(); // abstract method

	void carea() {
	} // non-abstract method

	static void sum() {
	} // static method

	final void data() {
	} // final methodd

	void show() {
		System.out.println("Area of shape: " + area);
	} // concrete method

}