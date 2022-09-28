package basiccoreproblems;

import java.util.Scanner;

public class Day5_6 {

	  public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
			System.out.println("enter  a number for dividend : ");
			int dividend = s.nextInt();
			System.out.println("enter  a number for divisor : ");
			int divisor = s.nextInt();

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    s.close();

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	  }

}
