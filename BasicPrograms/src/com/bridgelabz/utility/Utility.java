package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	
	
	public void getPowerOfTwo(int n) {
		// TODO Auto-generated method stub
		if (n>=0 && n<=31)
		{
			int power = 0;
			for (int i=0; i<=n; i++)
			{
				power = (i<<1);
				System.out.println("2^n"+i+" = " +power);
			}
		}	
		else
			System.out.print("Invalid number");
	}
}
