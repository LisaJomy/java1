package datatypes;

import java.util.Scanner;

public class GSSep4thHW {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		// TODO Auto-generated method stub
 Sample1 obj = new Sample1();
 
 obj.method1();
 obj.method2();
 obj.method3();
	}

	
}

class Sample1{
	//int ab = 10;
	Scanner s = new Scanner(System.in);
	
	int x=s.nextInt();
	
	//Method1 to check a number is positive or negative
	void method1() {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =s.nextInt();*/
		if (x>0) {
			System.out.println("The number is positive:");
		}else {
			System.out.println("The number is negative:");

		}
	}
	
	//Method2 to check a number is odd or even
	void method2()	{
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=s.nextInt();*/
		if(x%2==0) {
			System.out.println("The number is even");
			}else {
				System.out.println("The number is odd");
			}
		//System.out.println(ab+);
	}
	
	//Method3 to find the sum of digits
	void method3() {
		int n,sum=0;
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int m=s.nextInt();*/
		while(x>0) {
			n=x%10;
			sum = sum +n;
			x=x/10;

		}
		System.out.println("The sum of numbers is :"+ sum);
	}

}
