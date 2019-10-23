package Homework;

import java.util.Scanner;

public class NummerOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
		
	 System.out.print(" Please Enter the Number : ");
	  
	   int n=sc.nextInt();
	   int k=n;
	   int count=0;
	   System.out.print(" Please Enter the Number to search : ");  
       int x=sc.nextInt();
       while(n>0) {
    	   
    	   if(x==n%10) 
    		   
    		   count=count+1;
    	   
    	 
    		   n=n/10;
    	   
       }
       System.out.println(x+" in"+ k+" is"+ count);
       
       
       
       
       
       
       
	}

}
