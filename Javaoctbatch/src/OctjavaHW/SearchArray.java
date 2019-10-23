package OctjavaHW;

import java.util.ArrayList;

public class SearchArray {

	public static void main(String[] args) {
		//ArrayList 6.
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Yellow");
		ar.add("Purple");
		System.out.println(ar);
		
		if (ar.contains("White")){
			System.out.println("The colour is present");
		}
			else
			{
				System.out.println("The colour is not present");
			}
		
	}

}
