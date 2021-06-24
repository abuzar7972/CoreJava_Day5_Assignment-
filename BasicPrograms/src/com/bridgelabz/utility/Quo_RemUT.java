package com.bridgelabz.utility;
import java.util.Scanner;

public class Quo_RemUT {
	Scanner scanner;
	public Quo_RemUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Enter dividend:: ");
		int dividend = scanner.nextInt();
		System.out.println("Enter divisor:: ");
		int divisor = scanner.nextInt();
		
	
		    int quotient = dividend / divisor;
		    int remainder = dividend % divisor;

		    System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
		
	}
	
	

}
