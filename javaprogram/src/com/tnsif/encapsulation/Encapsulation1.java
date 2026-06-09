package com.tnsif.encapsulation;

public class Encapsulation1 {
	// properties
		private int id;
		private String name;

		// getter and setter method
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static void main(String[] args) {
			Encapsulation1 e1 = new Encapsulation1();

			// setting the values using setters
			e1.setId(121);
			e1.setName("Prashanth");

			// getting the values using getters
			System.out.println(e1.getId());
			System.out.println(e1.getName());
		}

	}

	