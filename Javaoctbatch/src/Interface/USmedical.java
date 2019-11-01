package Interface;

public interface USmedical extends WHO {
	int med_fee=10;
	public void physioServices();
	
	public void oncologyServices();
	
	public void orthopedicServices();
	
	public void RadiologyServices();
	
//java1.8 we can have static method but with method body
	
public static void 	Services_911() {
	System.out.println("USServices_911");
}
	
	
default void internship() {
	System.out.println("USinternship");
}
	
	
	
	
}
