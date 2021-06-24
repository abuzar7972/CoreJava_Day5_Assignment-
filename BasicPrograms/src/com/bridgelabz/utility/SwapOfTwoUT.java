package com.bridgelabz.utility;
import java.util.Scanner;
public class SwapOfTwoUT {
	Scanner scanner;
	public SwapOfTwoUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number:: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter 2nd number:: ");
		int number2 = scanner.nextInt();
		int c = number1;
		number1 = number2;
		number2=c;
		System.out.println("number1 :: " +number1);
		System.out.println("number2 :: " +number2);
		
	}
}
