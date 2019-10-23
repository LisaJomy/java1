package OctjavaHW;

import java.util.ArrayList;

public class ArrayFirstAndLast {

	public static void main(String[] args) {
	//ArrayList 2.	
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		System.out.println(ar);
		ar.add(0,"Orange");
		ar.add(5,"white");
		System.out.println(ar);
		
	}

}
