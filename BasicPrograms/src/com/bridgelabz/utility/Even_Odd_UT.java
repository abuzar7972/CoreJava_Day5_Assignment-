package com.bridgelabz.utility;

import java.util.Scanner;

public class Even_Odd_UT {
	Scanner scanner;
	public Even_Odd_UT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check(int n) {
		// TODO Auto-generated method stub
		if (n%2 == 0)
		{
			System.out.println("Entered number is even:: " +n);
		}
		else {
			System.out.println("Entered number is odd:: " +n);
		}
	}
}
