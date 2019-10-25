package OctMethodsHW;

import java.util.Scanner;

public class EligibleToVote6 {
	
	static void vote(int age) {
		if(age>=18) {
			System.out.println("The person is eligible to vote");
		}
		else {
			System.out.println("The person is not eligible to vote");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the Age:" );
		int age =s.nextInt();
		vote(age);
	
	}	

}
