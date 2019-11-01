package OctjavaHW;

public class studentConstructor {
	
	  String name; int id; String city;
	  
	  public studentConstructor(String name, int id) {
	  
	  this.name = name; 
	  this.id = id; 
	  }
	  
	  public studentConstructor(String name, int id, String city) {
	  
	  this(name,id);
	  this.city = city;
	  }
	  public studentConstructor() {
	  System.out.println("This is a default constructor"); 
	  }
	 
		
  public void display() {
	 System.out.println(name+"     "+id+"        "+city); 
		
  }	
		
		
		
		
		
		
		
		
		
		
		
		
  	

}
