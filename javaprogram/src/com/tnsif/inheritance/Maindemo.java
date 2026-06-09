package com.tnsif.inheritance;
class Father {
	int money = 4444444;
	String car = "BMW";

	void favdrink() {
		System.out.println("coffee");
	}

}

class Son extends Father {
	String cycle = "pink";

	void read() {
		System.out.println("java");
	}

}
public class Maindemo {
	public static void main(String[] args) {
		Father f = new Father();
		f.favdrink();

		Son s = new Son();
		System.out.println(s.money);
		System.out.println(s.car);

		s.favdrink();

		System.out.println(s.cycle);
		s.read();
	}
}

