package OctjavaHW;

import java.util.ArrayList;

public class ArraylistRetreive3 {

	public static void main(String[] args) {
		//ArrayList 3.
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
	}

}
