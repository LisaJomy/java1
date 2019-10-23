package datatypes;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
	
	ArrayList<Character> a = new ArrayList<Character>();
	a.add('a');
	a.add('b');
		System.out.println(a.get(0));
		a.add('c');
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		
		a.add(1,'d');
		System.out.println(a.get(1));
		System.out.println(a.get(0));
		System.out.println(a.get(2));
		a.remove(2);
		
		System.out.println(a.get(1));
		System.out.println(a.get(0));
	
		
		
		
		
	}
		
		
	}
	
	


