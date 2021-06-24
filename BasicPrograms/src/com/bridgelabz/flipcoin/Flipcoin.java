package com.bridgelabz.flipcoin;

import com.bridgelabz.flipcoinUt.FlipCoinUt;

public class Flipcoin {
	public static void main(String[] args) {
		FlipCoinUt flipcoin = new FlipCoinUt();
		System.out.println("Enter the number of flips");
		int n = flipcoin.getIntValue();
		flipcoin.Flip(n);
	}
}
