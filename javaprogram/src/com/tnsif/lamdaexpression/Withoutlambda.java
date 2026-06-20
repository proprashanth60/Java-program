package com.tnsif.lamdaexpression;

@FunctionalInterface
interface Drawablee {
	public void draw(); // abstract method
}

class Test implements Drawablee {
	int width = 10;

	@Override
	public void draw() {
		System.out.println("drawing: " + width);

	}

}

public class Withoutlambda {
	public static void main(String[] args) {
		Drawablee d = new Test();
		d.draw();

	}
}