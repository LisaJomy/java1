package OctjavaHW;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {
		//ArrayList 4.
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		ar.add("Orange");
		ar.add("White");
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		ar.remove(3);
		System.out.println(ar);
	}

}
