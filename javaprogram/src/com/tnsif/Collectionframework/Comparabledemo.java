package com.tnsif.Collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Person1 implements Comparable<Person1> {
	String name;
	int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void displayinfo() {
		System.out.println("Name: " + name + " " + "age: " + age);
	}

	@Override
	public int compareTo(Person1 o) {
		return this.name.compareTo(o.name);
		// return Integer.compare(this.age, o.age); //this is to compare age

	}
}

public class Comparabledemo {
	public static void main(String[] args) {
		ArrayList<Person1> a1 = new ArrayList<>();
		a1.add(new Person1("John", 30));
		a1.add(new Person1("Donn", 10));
		a1.add(new Person1("Bob", 20));
		a1.add(new Person1("Tommy", 25));

		Collections.sort(a1);

		for (Person1 h : a1) {
			h.displayinfo();
		}
	}
}