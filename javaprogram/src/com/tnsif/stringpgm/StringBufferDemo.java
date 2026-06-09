package com.tnsif.stringpgm;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer b = new StringBuffer("Welcome!!");
		b.append(" to my HOME");

		System.out.println(b);

		System.out.println(b.delete(2, 5));
		System.out.println(b);

		System.out.println(b.reverse());

		System.out.println(b.replace(1, 3, "PYTHON"));

		System.out.println(b.charAt(6));
	}
}