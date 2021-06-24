package com.bridgelabz.programs;

import com.bridgelabz.utility.NthharmonicUT;

public class nthharmonic {
	public static void main(String[] args) {
		NthharmonicUT utility = new NthharmonicUT();
		System.out.println("Enter number of harmonic");
		int n = utility.getIntValue();
		utility.check(n);
	}

}
