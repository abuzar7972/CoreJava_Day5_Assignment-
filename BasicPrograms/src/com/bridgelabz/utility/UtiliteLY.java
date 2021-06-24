package com.bridgelabz.utility;
import java.util.Scanner;
public class UtiliteLY {
	Scanner scanner;
	public UtiliteLY() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check(int n) {
		// TODO Auto-generated method stub
		if (n%4 == 0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
	}
	
}
