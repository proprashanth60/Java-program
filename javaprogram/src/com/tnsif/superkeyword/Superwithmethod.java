package com.tnsif.superkeyword;

class Payment1 {
	void process() {
		System.out.println("processing payment using standard gateway");
	}
}

class Gpay extends Payment1 {
	@Override
	void process() {
		System.out.println("processing payment using gpay ");
	}

	void completetransaction() {
		super.process(); // parent
		process(); // child
	}
}

public class Superwithmethod {
	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.completetransaction();
	}
}