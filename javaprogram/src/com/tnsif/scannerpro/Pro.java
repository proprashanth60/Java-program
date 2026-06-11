package com.tnsif.scannerpro;
import java.util.Scanner;

public class Pro {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num1 = sc.nextInt();
	        System.out.print("Enter a number: ");
	        int num2 = sc.nextInt();
	        
	        System.out.println("Before swapping:");
	        System.out.println("a = " + num1);
	        System.out.println("b = " + num2);

	        int temp = num1;
	        num1 = num2;
	        num2 = temp;
	    }
}
	        
	        

	        