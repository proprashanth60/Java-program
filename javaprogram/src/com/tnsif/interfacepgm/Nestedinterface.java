package com.tnsif.interfacepgm;

public class Nestedinterface implements Myinterface.MyInnerInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("welcome!!!");
	}

	public static void main(String[] args) {
		Nestedinterface n = new Nestedinterface();
		n.print();
		System.out.println(n.id);
		System.out.println(Nestedinterface.id);
	}

}
