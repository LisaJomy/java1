package datatypes;

public class Hospital {

	public static void main(String[] args) {
		Surgeon a =new Surgeon();
		a.doc_details();
		a.surgeon_details();
		
	}

}
class Doctor{
	
	void doc_details() {
		System.out.println("I am the child");
	}
}


class Surgeon extends Doctor{
 void surgeon_details() {
	System.out.println("I am a surgeon");
}
}

