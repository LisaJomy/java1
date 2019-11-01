package OctjavaHW;

public class C {
	 int x,y;

	    C()
	    {     
	        this(1);// ->> works fine if written here
	        System.out.println("1");
	       }

	    C(int a)
	    {
	    	this(12.3,4);
	        System.out.println("2");
	    }
	    
	    C(double d,int e){
	    	System.out.println("3");
	    }

	public static void main(String[] args) {
		 C obj1=new C();  
	}

}
