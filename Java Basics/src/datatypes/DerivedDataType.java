package datatypes;

public class DerivedDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
	
		System.out.println(a.charAt(4));
		char b = a.charAt(7);
		System.out.println(b);
		System.out.println(a.compareTo("Jello World"));
		System.out.println(a.contains("Hello"));
		System.out.println(a.length());
		
		String[] c = a.split(" ");
		//System.out.println(c);
		
	
	}

}
