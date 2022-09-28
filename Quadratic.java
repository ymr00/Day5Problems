package functionalprogrames;

import java.util.Scanner;

public class Quadratic {
	static void roots(int a, int b, int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println("delta is : " + delta);
		System.out.println("Root 1 of x : " + x1);
		System.out.println("Root 2 of x : " + x2);

	}

	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("enter a ");
			int a = s.nextInt();
			System.out.println("enter b");
			int b = s.nextInt();
			System.out.println("enter c");
			int c = s.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
		s.close();
	}


}
