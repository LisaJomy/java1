package datatypes;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n =s.nextInt();
	if (n>0) {
		System.out.println("The number is positive:");
	}else
		System.out.println("The number is negative:");

	}

}
