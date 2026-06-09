package com.tnsif.abstractsimpleexe;

//1. The Abstract Class (The Blueprint)
public abstract class Animal {
	// Abstract method: Has no body. Child classes MUST create the body for this.
	public abstract void makeSound();

	// Regular method: Has a body. All child classes inherit this exactly as is.
	public void sleep() {
		System.out.println("Zzz... sleeping...");
	}
}