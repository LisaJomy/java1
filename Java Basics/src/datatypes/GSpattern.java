package datatypes;

import java.util.Scanner;

public class GSpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern obj = new Pattern();
		obj.patt();
	}

}
class Pattern{
void  patt() {
	
	for (int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
	
}

}