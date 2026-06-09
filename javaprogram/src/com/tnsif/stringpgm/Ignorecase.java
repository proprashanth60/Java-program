package com.tnsif.stringpgm;

public class Ignorecase {
	public static void main(String[] args) {
		String s1 = "prashanth";
		String s2 = "PRASHANTH";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
	}
}