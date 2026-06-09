package com.tnsif.encapsulation;

public class Encapsulation2 {
	int serialnumber;
	String name;
	int age;

	void show() {
		System.out.println(serialnumber + " " + name + " " + age);
	}

	public static void main(String[] args) {
		Encapsulation2 e = new Encapsulation2();
		e.serialnumber = 9;
		e.name = "D Boss";
		e.age = 6;

		e.show();
	}

}

