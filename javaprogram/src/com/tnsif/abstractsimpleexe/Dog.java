package com.tnsif.abstractsimpleexe;

//2. A Concrete Class (A specific implementation)
public class Dog extends Animal {
	// We are forced to complete the makeSound() method here
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}