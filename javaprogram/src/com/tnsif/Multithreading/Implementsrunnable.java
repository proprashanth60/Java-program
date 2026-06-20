package com.tnsif.Multithreading;


	class Eclipse1 implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("Eclipse" + " " + Thread.currentThread().getId());
			}
		}
	}

	public class Implementsrunnable {
		public static void main(String[] args) {
			Eclipse1 e = new Eclipse1(); // step1
			Thread obj = new Thread(e);
			obj.start();
			System.out.println("Main id" + " " + Thread.currentThread().getId());
		}
	}


