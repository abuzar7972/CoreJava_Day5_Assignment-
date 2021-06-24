package com.bridgelabz.flipcoinUt;
import java.util.Scanner;
import java.util.Random;
public class FlipCoinUt {
	Scanner scanner;
	public FlipCoinUt() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
	}
	public void Flip(int n) {
		int heads=0; 
		int tails=0;
		int a,b;
		// TODO Auto-generated method stub
		for (int i=0;i<=n;i++) {
			Random check = new Random();
			int x = check.nextInt();
			if (x>0.2) {
				System.out.println("Heads");
				heads =  heads+1;
			}
			else {
				System.out.println("Tails");
				tails = tails+1;
			}
		}
		a = ( heads*100)/n;
		b = ( tails*100)/n;
	System.out.println("Percentage heads :: " +a);
	System.out.println("Percentage tails :: " +b);
	}
}