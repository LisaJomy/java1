package OctjavaHW;

public class RegTestConstructor {
	
	
	
	
	
	

	public static void main(String[] args) {
		

		RegistrationpageConstructor e= new RegistrationpageConstructor();
		
		RegistrationpageConstructor e1= new RegistrationpageConstructor("Tom", "cruise", 6567893, "jisa@gmail.com",
				"test", "431 northolt parkway, suwanee,GA", "02-02-1980","87893434", "male", true, 9090);
		
		System.out.println(e1.firstname+e1.lastname);
		e1.doregistration();
	}

}
