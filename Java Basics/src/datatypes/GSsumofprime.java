package datatypes;

import java.util.Scanner;

public class GSsumofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= s.nextInt();
		
		//int n=100;
		int sum=0;
		Sumofprime obj = new Sumofprime();
		
		for(int i=0;i<=n;i++) {
			if(obj.isprime(i) == true)
				sum = sum + i;
			}
	System.out.println("the sum of prime number is"+ sum);
	}

}

class Sumofprime{
	boolean isprime(int n) {
		int flag =0;


for(int i=1;i<=n;i++) {
	
if(n%i==0)	
	flag=flag+1;	
}
if(flag==2) {
	return true;
}else {
	return false;
}
}
}