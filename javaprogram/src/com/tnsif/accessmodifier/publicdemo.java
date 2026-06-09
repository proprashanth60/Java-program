package com.tnsif.accessmodifier;

public class publicdemo {
	public int a = 9; // data member
		private String b = "Pro";

		char w = 'i';

		protected int s = 7;

		public void display() {// function or method or member function
			System.out.println("welcome");
		}

		public static void main(String[] args) {
			publicdemo p = new publicdemo();

			System.out.println(p.a);
			System.out.println(p.b);
			System.out.println(p.s);
			System.out.println(p.w);
		}
	}

	
