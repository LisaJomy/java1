package OctjavaHW;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSwap {

	public static void main(String[] args) {
		//ArrayList 9.
		ArrayList<String> ar= new ArrayList<String>();

		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		ar.add("Orange");
		ar.add("White");
		System.out.println(ar);
		
		Collections.swap(ar, 1, 3);
		System.out.println(ar);
		
	}

}
