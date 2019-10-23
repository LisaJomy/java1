package OctjavaHW;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=s.nextInt();
System.out.println("Entar the second number:");
int num2=s.nextInt();
System.out.println("Enter the third number:");
int num3=s.nextInt();
System.out.println("Enter the fourth number:");
int num4=s.nextInt();

if (num1>num2) 
	{
	 if(num1>num3)
	 {
	   if(num1>num4)
	   		{
		   System.out.println("The greatest is:"+num1);
	   		}
	   else {
		   System.out.println("The greatest is:"+num4);
	   		}
	 }
	}
else if (num2>num3)
					{
						if (num2>num4)
						{
							System.out.println("The greatest is:"+num2);
						}
						else
						{
							System.out.println("The greatest is:"+num4);
						}
	
					}
else if(num3>num4)
                 {
	                System.out.println("The greatest is:"+num3);
                 }
else           {
	 				System.out.println("The greatest is:"+num4);
                }


	}

}
