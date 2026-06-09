package com.tnsif.superkeyword;

class Notification {
	String msg = "Default notification";
}

class Pushnotification extends Notification {
	String msg = "push notification from whatsapp";

	void noti() {
		System.out.println("child msg: " + msg);
		System.out.println("parent msg: " + super.msg);
	}
}

public class Supervariable {
	public static void main(String[] args) {
		Pushnotification p = new Pushnotification();
		p.noti();
	}
}