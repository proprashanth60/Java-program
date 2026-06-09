package com.tnsif.staticpgm;

public class Employee {
	int eid;
	String name;
	static String companyname = "TNS";

	// constructor
	Employee(int e, String n) {
		eid = e;
		name = n;
	}

	void display() {
		System.out.println(eid + " " + name + " " + companyname);

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "abs");
		Employee e2 = new Employee(2, "xyz");

		e1.display();
		e2.display();
	}
}