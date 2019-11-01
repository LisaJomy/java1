package Abstaction;

public class Testpage {

	public static void main(String[] args) {
		
		Loginpage l=new Loginpage();
		
		
		  l.footerLinks();
		  l.title();
		  l.url(); 
		  l.dologin();
		  l.logo();
		  
		  System.out.println("******");
		  Page p=new Loginpage();
		  p.title();
		  p.footerLinks();
		  p.url();
		  p.logo();
		 
		
		
		
	}

}
