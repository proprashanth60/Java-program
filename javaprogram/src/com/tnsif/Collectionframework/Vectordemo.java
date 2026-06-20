package com.tnsif.Collectionframework;

import java.util.List;
import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		List<Integer> num = new Vector<>();

		num.add(2);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(7);

		System.out.println(num);
		System.out.println(num.get(4));
		System.out.println(num.getFirst());
		System.out.println(num.contains(7));

		num.remove(Integer.valueOf(7));
		System.out.println(num);

		System.out.println("size of the vector is: " + num.size());

	}
}