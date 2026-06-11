package com.tnsif.exception;
import java.util.Scanner;

public class Exceptionscanner {
	
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try {
	            System.out.println("Enter first number:");
	            int a = sc.nextInt();

	            System.out.println("Enter second number:");
	            int b = sc.nextInt();

	            System.out.println("Result = " + (a / b));
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero");
	        } catch (Exception e) {
	            System.out.println("Invalid input");
	        }

	        sc.close();
	    }
	}