package com.bridgelabz.programs;

import com.bridgelabz.utility.Even_Odd_UT;

public class evenOrodd {
	public static void main(String[] args) {
		Even_Odd_UT utility = new Even_Odd_UT();
		System.out.println("Enter number to check even or odd:: ");
		int n = utility.getIntValue();
		utility.check(n);
	}

}
