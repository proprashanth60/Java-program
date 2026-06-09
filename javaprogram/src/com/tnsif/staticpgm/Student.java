package com.tnsif.staticpgm;

public class Student {
	int rollno;
	String name;
	static String clg = "IIT";

	// static method change value
	static void change() {
		clg = "IISC";
		// name = "rashmi";
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + clg);
	}

	public static void main(String[] args) {
		Student.change();
		Student s1 = new Student(1, "pro");
		Student s2 = new Student(2, "huli");
		Student s3 = new Student(3, "d boss");
		Student s4 = new Student(4, "virat kohli");

		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}