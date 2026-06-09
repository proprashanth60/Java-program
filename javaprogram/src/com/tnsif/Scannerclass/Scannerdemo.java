package com.tnsif.Scannerclass;
import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the id");
		int id = sc.nextInt();
		System.out.println("enter the address");
		String address = sc.next();
	}
}