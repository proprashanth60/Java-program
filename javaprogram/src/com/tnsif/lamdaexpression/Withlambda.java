package com.tnsif.lamdaexpression;

interface Drawable {
	public void draw();

}

public class Withlambda {
	public static void main(String[] args) {
		int width = 10;
		// with lambda
		Drawable d = () -> {
			System.out.println("Drawing: " + width);
		};
		d.draw();
	}
}