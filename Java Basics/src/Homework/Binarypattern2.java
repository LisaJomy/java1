package Homework;

import java.util.Scanner;

public class Binarypattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the number:");
 /*String a =s.next();
	int k=Integer.parseInt(a);*/
    int k = s.nextInt();
	int x=1;
	for(int i=1;i<=k+1;i++)
	{
		//System.out.println("i========"+i);
		for(int j =1;j<i;j++)
		{
			//System.out.println(j+"***************x"+x);
			System.out.print(x%2);
			x++;
			
		}
		System.out.println();
	}
 
	}

}
