package OctjavaHW;

import java.util.ArrayList;

public class UpdateArray {

	public static void main(String[] args) {
		
		//ArrayList 4.
		ArrayList<String> ar= new ArrayList<String>();

		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		System.out.println(ar);
		
		ar.set(3,"White");
		System.out.println(ar);
		ar.set(4,"Black");
		System.out.println(ar);
	}

}
