package com.tnsif.Construcor;

public class Demo {
	Demo() {
		System.out.println("welcome to java");
		System.out.println("default");
	}

	Demo(int a, int b) {
		System.out.println("2 params");
	}

	Demo(String s) {
		System.out.println("one parameter");
	}

	Demo(int a, String f) {
		System.out.println("mixed params");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(2, "naveen");
		Demo d2 = new Demo(4, 44);
		Demo d3 = new Demo("abc");
	}
}