package com.tnsif.abstraction;

public class Abstractdemo {
	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle r = new Rectangle();

		System.out.println("Square");
		sq.calcarea();
		sq.show();

		System.out.println("Rectangle");
		r.calcarea();
		r.show();
	}
}
