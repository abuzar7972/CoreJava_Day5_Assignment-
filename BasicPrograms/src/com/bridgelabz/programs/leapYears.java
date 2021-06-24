package com.bridgelabz.programs;

import com.bridgelabz.utility.UtiliteLY;

public class leapYears {
	public static void main(String[] args) {
		UtiliteLY utiliti = new UtiliteLY();
		System.out.println("Enter year to check leap year or not");
		int n = utiliti.getIntValue();
		utiliti.check(n);
	}

}
