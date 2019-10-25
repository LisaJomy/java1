package OctMethodsHW;

import java.util.Scanner;

public class PrimeorNot7 {
	
	static void PorN(int n) {
		
		int flag=0;
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				flag=flag + 1;
			}
		}
		
		
			if(flag==2) {
				System.out.println("The entered number is prime");
			}
			else {
				System.out.println("The entered number is not prime");
			}
	
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the number:" );
		int n =s.nextInt();
		PorN( n);
		

	}
}

