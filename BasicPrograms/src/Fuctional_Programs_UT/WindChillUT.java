package Fuctional_Programs_UT;

import java.util.Scanner;

public class WindChillUT {
Scanner scanner;
	
	public WindChillUT() {
		scanner = new Scanner(System.in);
	}
	public int getIntValue() {
		return scanner.nextInt();
		}
	public void check() {
		System.out.println("Enter value of t:: ");
		double t = scanner.nextInt();
		System.out.println("Enter value of v:: ");
		double v = scanner.nextInt();
		double va1 = (float) (t*0.6215);
		System.out.println(":: " +va1);
		double va2 = (float) ((0.4275*t)-35.75);
		System.out.println(":: " +va2);
		double va3 = (Math.pow(v,0.16));
		double va4 = va2*va3;
		System.out.println(":: " +va4);
		double w = (float) (35.75+va1+va4);
		System.out.println("Wind :: " +w);
	}
}
