package com.tnsif.Collectionframework;
import java.util.HashSet;

public class Hashsetmethod {
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();

		// add()
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(80);
		s.add(199);
		s.add(1);

		System.out.println(s);

		// size()
		System.out.println(s.size());
		System.out.println(s.contains(80));
		s.remove(9);
		System.out.println(s);

		// addAll()
		HashSet<Integer> s2 = new HashSet<>();
		s2.add(70);
		s2.add(10);
		s2.add(55);
		s2.add(44);
		s2.add(710);
		s2.add(6);


		System.out.println(s2);

		s.remove(s2);

		System.out.println(s2);

	}
}