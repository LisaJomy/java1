package OctjavaHW;

import java.util.ArrayList;

public class ArrayListEmpty {

	public static void main(String[] args) {
		//ArrayList 10.
		ArrayList<String> ar= new ArrayList<String>();

   ar.add("Red");
   ar.add("Blue");
   ar.add("Green");
   ar.add("Yellow");
   ar.add("Purple");
   ar.add("Orange");
   ar.add("White");
   System.out.println(ar);
   ar.removeAll(ar);
   System.out.println(ar);
	}

}
