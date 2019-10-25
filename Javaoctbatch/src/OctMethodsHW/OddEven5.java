package OctMethodsHW;

import java.util.Scanner;

public class OddEven5 {
	
	static void oddeven(int n) {
		
	if(n%2==0)	{
		System.out.println("The number is even");
	}else {
		System.out.println("The number is odd");
	}

}

	   public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the number:" );
		int n =s.nextInt();
		oddeven(n);

	}

}
