package Abstaction;

public class Loginpage extends Page {
//Constructor
	public Loginpage() {
		System.out.println("Login page constuctor");
	}
	
	
	
	
	@Override
	public void title() {
	System.out.println("Login page");	
	}

	@Override
	public void url() {
		System.out.println("http://www.google.com");
		
	}

	@Override
	public void footerLinks() {
	System.out.println("Privacy policy");
		
	}
	
	
	public void dologin() {
		System.out.println("loginto ap");
	}
	
	
	
	

}
