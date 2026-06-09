package com.tnsif.interfacepgm;

interface Notification {
	void notifyuser(String msg);
}

class Emailnotification implements Notification {

	@Override
	public void notifyuser(String msg) {
		// TODO Auto-generated method stub
		System.out.println("sending email: " + msg);
	}

}

class SMSnotification implements Notification {

	@Override
	public void notifyuser(String msg) {
		// TODO Auto-generated method stub
		System.out.println("sending sms: " + msg);

	}

}

public class Functionainterface {
	public static void main(String[] args) {
		Notification n = new Emailnotification();
		Notification s = new SMSnotification();
		n.notifyuser("Hello via Email");
		s.notifyuser("Hello via SMS");
	}
}