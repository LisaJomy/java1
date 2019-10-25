package OctMethodsHW;

import java.util.Scanner;

public class Sum1 {
 public int add(int n,int m) {
	int sum;
	sum=n+m;
	 return sum;
	 
 }
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);	
	System.out.println("Enter the first number:" );
	int n =s.nextInt();
	System.out.println("Enter the Second number:");
	int m =s.nextInt();
	
	
	Sum1 d= new Sum1();
	System.out.println("The sum is:"+d.add(n, m));
	
	
	}

}
