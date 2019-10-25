package OctMethodsHW;

import java.util.Scanner;

public class MaxMin4 {
	
	public void max(int x,int y,int z) {
		if(x>y && x>z) {
			System.out.println("The Maximum is :"+ x);
			}
		else if(y>z) {
				System.out.println("The Maximum is :"+ y);
			}
		else {
			System.out.println("The Maximum is :"+ z);
		   }
		}
		
	public void min(int x,int y,int z) {
			if(x<y && x<z) {
				System.out.println("The Mininmum is :"+ x);
				}
			else if(y<z) {
					System.out.println("The Mininmum  is :"+ y);
				}
			else {
				System.out.println("The Mininmum  is :"+ z);
			}
	}
	
   public static void main(String[] args) {
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the first number:" );
		int x =s.nextInt();
		System.out.println("Enter the Second number:");
		int y =s.nextInt();	
		System.out.println("Enter the Third number:");
		int z =s.nextInt();	
		
		MaxMin4 d= new MaxMin4();
		d.max(x, y, z);
		MaxMin4 d2= new MaxMin4();
		d2.min(x, y, z);
		
	}

}
