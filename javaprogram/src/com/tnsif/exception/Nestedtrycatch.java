package com.tnsif.exception;

public class Nestedtrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="TNS";
		int slength=str1.length();//3
		System.out.println("string length"+slength);
		String str2=null;
		int y=6;
		try {
			try {
				System.out.println(str1.charAt(y));
			}
			catch(StringIndexOutOfBoundsException n)
			{
				System.out.println(n.getMessage());
			}
			System.out.println("string length"+str2.length());
		}
		finally {
			System.out.println("completed");
		}

	}
	

}
