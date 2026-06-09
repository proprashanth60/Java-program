package com.tnsif.abstractsimpleexe;

//3. Another Concrete Class
public class Cat extends Animal {
	// We are forced to complete the makeSound() method here as well
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}