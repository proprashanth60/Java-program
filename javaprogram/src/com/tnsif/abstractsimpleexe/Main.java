package com.tnsif.abstractsimpleexe;

//4. Running the Code
public class Main {
	public static void main(String[] args) {

		// Animal genericAnimal = new Animal();
		// ^ THIS WILL CAUSE AN ERROR! You cannot create an object of an abstract class.

		Dog myDog = new Dog();
		myDog.makeSound(); // Prints: Woof! Woof!
		myDog.sleep(); // Prints: Zzz... sleeping... (inherited from Animal)

		Cat myCat = new Cat();
		myCat.makeSound(); // Prints: Meow!
		myCat.sleep(); // Prints: Zzz... sleeping... (inherited from Animal)
	}
}
