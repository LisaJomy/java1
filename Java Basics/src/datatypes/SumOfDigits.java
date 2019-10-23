package datatypes;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int m=s.nextInt();
		while(m>0) {
			n=m%10;
			sum = sum +n;
			m=m/10;

		}
		System.out.println("The sum of numbers is :"+ sum);
	}

}
