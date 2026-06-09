package com.tnsif.Construcor;

class User1 {
	String name;
	int age;

	// default constr
	User1() {
		name = "Guest";
		age = 5;
		System.out.println("Guest profile created!!");
	}

	// parameter const
	User1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("User Created:" + " | " + "NAME: " + name + " | " + "AGE: " + age + " | ");
	}
}

public class Constructordemo {
	public static void main(String[] args) {
		User1 t1 = new User1();
		User1 t2 = new User1("alice", 25);
	}
}