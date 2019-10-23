package Homework;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
int t,digit,temp,rem,count=0,sum=0;	
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
	int n = s.nextInt();


t=n;temp=n;
while(n!=0) {
	digit = n%10;
	count=count+1;
	n=n/10;
}
while(t!=0) {
	rem=t%10;
	sum=(int)(sum + Math.pow(rem,count));
	t=t/10;
}
if(sum==temp) {
	System.out.println("This is a armstrong number");
}else {
	System.out.println("This is a not a armstrong number");
}
	

	
	}

}
