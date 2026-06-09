package com.tnsif.Construcor;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("id: " + id);
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {
		Student s = new Student(101, "prashanth");
		Student s1 = new Student(102, "nitin");

		s.display();
		s1.display();
	}
}


