package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class powerOfTwo {
	public static void main(String[] args) {
	Utility utility = new Utility();
	System.out.println("Enter the value of power");
	int n = utility.getIntValue();
	utility.getPowerOfTwo(n);
	}
}
