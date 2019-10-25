package OctMethodsHW;

import java.util.Scanner;

public class Product2 {
	
	
	public int Multiply(int n,int m) {
		int temp;
		temp=n*m;
		return temp;
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the first number:" );
		int n =s.nextInt();
		System.out.println("Enter the Second number:");
		int m =s.nextInt();
		
		Product2 d= new Product2();
		System.out.println("The product is:"+d.Multiply(n, m));
		
	}
	
	
	
	

}
