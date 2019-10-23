package Homework;

import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,i, oddSum = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		System.out.print("1");
		for(i = 3; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
				
				System.out.print("+" +i);
				
			}
		}
		
		System.out.println("\n The Sum of Odd Numbers upto " + number +"  =  " + oddSum);	
				
				
				
	}

}
