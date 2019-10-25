package OctMethodsHW;

import java.util.Scanner;

public class DisplayGrades8 {

	static void grade(int marks) {
		
	if(marks>=91 && marks<=100)	{
		System.out.println("Grade is AA");
	}
	else if(marks>=81 && marks<=90) {
		System.out.println("Grade is AB");
	}
	else if (marks>=71 && marks<=80)
	{
		System.out.println("Grade is BB");	
	}
	else if (marks>=61 && marks<=70)
	{
		System.out.println("Grade is BC");	
	}
	else if (marks>=51 && marks<=60)
	{
		System.out.println("Grade is CD");	
	}	
	else if (marks>=41 && marks<=50)
	{
		System.out.println("Grade is DD");	
	}	
	else	
	{
		System.out.println("Grade is Fail");	
	}
		
		
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter students mark:" );
		int marks =s.nextInt();
		grade(marks);
		
	}

}
