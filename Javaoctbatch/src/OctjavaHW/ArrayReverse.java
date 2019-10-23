package OctjavaHW;

import java.util.ArrayList;

public class ArrayReverse {

	public static void main(String[] args) {
		// ArrayList 7.
//int a[]= {20,40,60,80,90};
ArrayList<Integer> a = new	ArrayList<Integer>();	
a.add(20);
a.add(40);
a.add(60);
a.add(80);
a.add(90);

for(int i=0;i<a.size();i++)
{
System.out.println(a.get(i));
}

System.out.println();
for(int i=4;i>=0;i--) {
		  
System.out.println(a.get(i));
}		  
		 
		 






	}

}
