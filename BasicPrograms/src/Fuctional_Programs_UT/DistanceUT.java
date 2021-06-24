package Fuctional_Programs_UT;

import java.util.Scanner;

public class DistanceUT {
	Scanner scanner;
	
	public DistanceUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		double distance=0;
		System.out.println("Enter value of x:: ");
		double x = scanner.nextInt();
		System.out.println("Enter value of y:: ");
		double y = scanner.nextInt();
		double a = Math.pow(x,x);
		double b = Math.pow(x,x);
		double c = a+b;
		distance = Math.sqrt(c);
		System.out.println(":: " +distance);
		
		
	}
}
