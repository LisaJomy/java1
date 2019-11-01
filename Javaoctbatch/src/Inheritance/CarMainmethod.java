package Inheritance;

public class CarMainmethod {
//Method Overriding-when we a method both in parent as well as  child class with same name and same number of parameters
	//Method Overloading- within the same class we have diffrent methods with same name but different number of parameters
	
	//Polymorphism --Both method overloading and method overriding is known as polymorphism in java
	//because In overloading also we create different forms of same method
				//In overriding also we create different forms of same method(Inheritance concept)
	
	//Top casting --overridden method will be called by parent reference variable
	
	//Can i override static method--No No
	
	//To prevent inheritance use --Final keyword(prevent inheritance) the start method cannot be overriden
	//If a class is declared final - it cannot be inherited by other classes--it cannot be parent for any class
	
	public static void main(String[] args) {
		

		
		BMW b= new BMW();
		
		b.start();
		b.stop();
		b.autoparking();
		b.fillfuel();
		b.engine();
		
		System.out.println("******");
		Car c=new Car();
		c.start();
		c.stop();
		c.fillfuel();
		c.engine();
		
		System.out.println(("***8888888***"));
		//Top casting/Dynamic Polymorphism---child class object is referred by parent class reference variable
		
		Car c1= new BMW();
		c1.start();//only overridden method will be called (BMW method)
		c1.stop();
		c1.fillfuel();
		c1.engine();
		
		
		
		
		//I cannot access start() of car because parent cannot inherit child properties
		Vechicle v=new BMW();
		v.engine();
		
		//down casting--classcastException
		BMW b1= (BMW)new Car();//not allowed compiler will allow but at run time it will give an error

		
		
	}

}
