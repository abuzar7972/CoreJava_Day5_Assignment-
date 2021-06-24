package com.bridgelabz.utility;

import java.util.Scanner;

public class LargestUT {
	Scanner scanner;
	public LargestUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Enter number1:: ");
		int a = scanner.nextInt();
		System.out.println("Enter number2:: ");
		int b = scanner.nextInt();
		System.out.println("Enter number3:: ");
		int c = scanner.nextInt();
		if (a>b && a>c) {
			System.out.println("number 1 is grater:: " +a);
		}
		else if (b>a && b>c) {
			System.out.println("number 2 is grater:: " +b);
		}
		if (c>a && c>b) {
			System.out.println("number 3 is grater:: " +c);
		}
	}
  }

