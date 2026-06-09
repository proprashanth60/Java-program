package com.tnsif.interfacepgm;

interface SmartDevice {
	void turnon();

	void turnoff();

	void getstatus();
}

class Smartlight implements SmartDevice {

	@Override
	public void turnon() {

		System.out.println("smart light is on");
	}

	@Override
	public void turnoff() {

		System.out.println("smart light is off");
	}

	@Override
	public void getstatus() {

		System.out.println("smart light is standly mode");
	}

}
public class Interfacedemo1 {

	public static void main(String[] args) {
		Smartlight s = new Smartlight();
		s.turnon();
		s.turnoff();
		s.getstatus();
	}

}
