package com.tnsif.stringpgm;
public class Equalsdemo {
	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "aaa";
		String s3 = new String("aaa");
		String s4 = "bbb";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}