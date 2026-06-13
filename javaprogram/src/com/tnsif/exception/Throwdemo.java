package com.tnsif.exception;

public class Throwdemo {
	static void withdraw(int balence,int amount) {
		if(amount>balence) {
			throw new RuntimeException("insufficient balence");
			
			
		}
		System.out.println("money withdrw successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwdemo.withdraw(50000,10000);

	}

}
