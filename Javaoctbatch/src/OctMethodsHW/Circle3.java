package OctMethodsHW;

import java.util.Scanner;

public class Circle3 {
	
	public double area(int r) {
	double a;
	double p =3.14;
		a=p*r*r;
		return a;
	}
	
	public double Circumfrence(int r) {
		double c;
		double p =3.14;
			c=2*p*r;
			return c;
		}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the radius:" );
		int r =s.nextInt();
		
		Circle3 d= new Circle3();
		System.out.println("The area is:"+d.area(r));
		
		System.out.println("The Circumfrence is:"+d.Circumfrence(r));
		
		
		
	}

}
