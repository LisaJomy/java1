package OctjavaHW;

public class MethodOverloadingPractice {

	public static void main(String[] args) {
		
//Method Overloading-within the same class when we have different methods with same name but different number of parameters and theit type ang sequence also different
	
	
		MethodOverloadingPractice obj = new MethodOverloadingPractice();
		obj.login("lisa.selenium@gmail.com", 12345);
	

	}
public void login() {
	System.out.println("Login with 0 parameter");
}

public void login(String name) {
	System.out.println("Login with 1 parameter");
}

public void login(String username,String Password) {
	System.out.println("Login with 2 parameter");
}
// cannot do this , this is again duplicate both string
/*public void login(String email,String Password) {
	System.out.println("Login with 2 parameter");*/
//This is overloaded method
public void login(int phone,String Password) {
	System.out.println("Login with 2 different datatype  parameter");
}
// the sequence in which parameters are placed
public void login(String username,int phone) {
	System.out.println("Login with 2 different datatype  parameter");
}










}








