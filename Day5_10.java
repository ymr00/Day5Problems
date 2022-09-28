package basiccoreproblems;

import java.util.Scanner;

public class Day5_10 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number: ");
	    double n1 = reader.nextInt();
	    System.out.println("Enter second number: ");
	    double n2 = reader.nextInt();
	    System.out.println("Enter thrid number: ");
	    double n3 = reader.nextInt();
	    
	    reader.close();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }

}
