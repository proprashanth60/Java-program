package com.tnsif.polymorphism;

class Payment {
	void makepaymment() {
		System.out.println("processing payment...");
	}
}

class UPIpayment extends Payment {
	void makepayment() {
		super.makepaymment();
		System.out.println("payment using UPI");
	}
}

class CardPayment extends Payment {
	void makepayment() {
		System.out.println("Payment using credit card");
	}
}

public class PaymentTest {
	public static void main(String[] args) {
		UPIpayment u = new UPIpayment();
		u.makepayment();

		CardPayment c = new CardPayment();
		c.makepayment();
	}
}