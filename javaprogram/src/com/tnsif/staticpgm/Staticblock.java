package com.tnsif.staticpgm;

public class Staticblock {
	static {
		System.out.println("Am static");
	}

	public static void main(String[] args) {
		System.out.println("Am main");
	}

}