package com.tnsif.Collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();

		a.push(3);
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(7);
		System.out.println(a);

		System.out.println("top element: " + a.peek());

		System.out.println(a.pop());
		System.out.println(a);

		System.out.println("is stack empty? " + a.isEmpty());

		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}