package datatypes;

import java.util.Scanner;

public class GSprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
        System.out.println("Enter the new number:");
        int n= s.nextInt();
        int flag =0;
        for(int i=1;i<=n;i++) {
        	
        if(n%i==0)	
        	flag=flag+1;	
        }
        if(flag==2) {
        	System.out.println("The given number is prime");
        }else {
        	System.out.println("The given number is not prime");
        }
	}

}
