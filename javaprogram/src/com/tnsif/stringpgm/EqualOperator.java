package com.tnsif.stringpgm;

public class EqualOperator {
	public static void main(String[] args) {
		String s1 = "pro";
		String s2 = "pro";
		String s3 = new String("pro");
		String s4 = "alice";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);

	}
}