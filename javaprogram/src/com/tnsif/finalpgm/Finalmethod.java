package com.tnsif.finalpgm;

class Father {
	int a = 90;

	void display() {
		System.out.println("welcomejava");
	}
}

public class Finalmethod {
	// @Override //we cannot override
	final void display() {
		System.out.println("python");
	}
}
