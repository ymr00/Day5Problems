package basiccoreproblems;

import java.util.Scanner;

public class Day5_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : ");
        int first = s.nextInt();
        System.out.println("Enter second number : ");
		int second = s.nextInt();

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        s.close();

        // Value of first is assigned to temporary
        int temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }

}
