package com.tnsif.Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//demo for comparator (Multiple sorting)
class College {
	String name;
	int rollno;
	String address;

	public College(String name, int rollno, String address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}

	void display() {
		System.out.println("name: " + name + " | " + "rollno: " + rollno + " | " + "address: " + address);
	}

}

//sort by name
class Namecomparator implements Comparator<College> {
	@Override
	public int compare(College o1, College o2) {
		return o1.name.compareTo(o2.name);
	}
}

//sort by rollno
class RollnoComparator implements Comparator<College> {
	@Override
	public int compare(College o1, College o2) {
		return Integer.compare(o1.rollno, o2.rollno);
	}
}

//sort by address
class Adresscomparator implements Comparator<College> {
	@Override
	public int compare(College o1, College o2) {
		return o1.address.compareTo(o2.address);
	}
}

public class Comparatordemo {
	public static void main(String[] args) {
		List<College> p1 = new ArrayList<>();
		p1.add(new College("Meg ", 1, "Bangalore"));
		p1.add(new College("Bhoo", 4, "Mandya"));
		p1.add(new College("Kusuma", 3, "Mangalore"));
		p1.add(new College("Dev", 2, "Udupi"));

		// sort by name
		Collections.sort(p1, new Namecomparator());
		System.out.println("sort by name: ");
		for (College t : p1) {
			t.display();
		}

		// sort by rollno
		Collections.sort(p1, new RollnoComparator());
		System.out.println("sort by rollno: ");
		for (College t : p1) {
			t.display();
		}
	}
}