package com.tnsif.Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
	public static void main(String[] args) {
		List<String> f = new ArrayList<String>();

		f.add("apple");
		f.add("mango");
		f.add("orange");
		f.add("orange");
		f.add("mango");

		// f.add(9);

		System.out.println(f);

		System.out.println(f.get(0));

		System.out.println(f.set(1, "dragon fruit"));
		System.out.println(f);

		for (String h : f) {
			System.out.println(h);
		}

//		System.out.println(f.remove(0));
//		
//		f.clear();
//		System.out.println(f);

	}
}


