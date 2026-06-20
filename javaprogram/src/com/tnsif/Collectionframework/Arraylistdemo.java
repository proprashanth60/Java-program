package com.tnsif.Collectionframework;

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(2);
		al.add("Chicken");
		al.add(9.0);
		al.add('d');

		System.out.println(al);

		// al.clear();
		// System.out.println(al);
//		al.getFirst();
		System.out.println(al.getFirst());

		al.set(3, "Berry");
		System.out.println(al);
	}
}