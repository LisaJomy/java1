package datatypes;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=s.nextInt();
		if(x%2==0) {
			System.out.println("The number is even");
			}else {
				System.out.println("The number is odd");
			}
	}

}
