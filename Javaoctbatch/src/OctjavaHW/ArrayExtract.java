package OctjavaHW;

import java.awt.List;
import java.util.ArrayList;

public class ArrayExtract {

	public static void main(String[] args) {
		//ArrayList 8.
		ArrayList<String> ar= new ArrayList<String>();
	
		ar.add("yellow");//0
		ar.add("Green");//1
		ar.add("Blue");//2
		ar.add("Orange");//3
		ar.add("White");//4
		ar.add("Indigo");//5


		System.out.println(ar);
		  ArrayList<String> al2 = new ArrayList<String>(ar.subList(1, 4));
		  System.out.println(al2);
		// List<String> xx1= ar.subList(0,3);
      // System.out.println(xx1);
	}

}
