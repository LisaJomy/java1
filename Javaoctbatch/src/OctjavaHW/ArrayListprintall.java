package OctjavaHW;

import java.util.ArrayList;

public class ArrayListprintall {

	public static void main(String[] args) {
		// ArrayList 12.
		ArrayList<String> ar= new ArrayList<String>();
		
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		ar.add("Orange");
		ar.add("White");
		System.out.println(ar);
		System.out.println();
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
