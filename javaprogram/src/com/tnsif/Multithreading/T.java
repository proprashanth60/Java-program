package com.tnsif.Multithreading;
public class T extends Thread {
	Synchronization e;

	T(Synchronization e) {// constructor
		this.e = e;
	}

	@Override
	public void run() {
		e.display();
	}

}

