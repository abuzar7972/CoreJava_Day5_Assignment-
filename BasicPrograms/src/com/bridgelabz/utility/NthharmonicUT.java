package com.bridgelabz.utility;

import java.util.Scanner;

public class NthharmonicUT {
	Scanner scanner;
	public NthharmonicUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check(int n) {
		double b=0.0;
		// TODO Auto-generated method stub
		for (int i=0; i<=n; i++) {
			b=b+1.0/n;
			System.out.println("Nth harmonic:: " +b);
		}
		
	}
	
}
