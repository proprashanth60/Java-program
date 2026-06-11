package com.tnsif.exception;

public class Nullpointerexceptiondemo {
	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		

		System.out.println("Welcome to the java session");
	}

}


