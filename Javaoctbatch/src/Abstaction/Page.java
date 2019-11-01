package Abstaction;

public abstract class Page {
	public Page() {
		System.out.println("constuctor of page class");
	}
	public abstract void title();
	public abstract void url();
	public abstract void footerLinks();
	
	//non abstract class
	public void logo() {
		System.out.println("Page ...logo");
	}
	
	
	
	
	
	
	

}
