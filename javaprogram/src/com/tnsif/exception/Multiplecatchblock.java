package com.tnsif.exception;

public class Multiplecatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[4]; // 4 element 0-3
		try {
			number[8]=40/0;
		}catch(ArithmeticException e) {
			System.out.println("good evening"+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("goodmorning"+r.getMessage());
	}
		finally {
			System.out.println("hello word");
		}

}
}
