package datatypes;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,Total=0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s1.nextInt();
		while(n>0) {
			m=n%10;
		Total = Total +m;
			n=n/10;

		}
		System.out.println("The sum of numbers is :"+ Total);
	}

}
