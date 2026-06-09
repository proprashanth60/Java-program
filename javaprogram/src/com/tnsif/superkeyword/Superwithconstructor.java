package com.tnsif.superkeyword;

//demo for super constructor

class User1 {
	User1() {
		System.out.println("user acc created...");
	}
}

class Admin extends User1 {
	Admin() {
		super(); // calls user constructor
		System.out.println("admin granted!!!");
	}
}
public class Superwithconstructor {
	public static void main(String[] args) {
		Admin a = new Admin();
	}
}