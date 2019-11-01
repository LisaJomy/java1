package OctjavaHW;

public class StudentCmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentConstructor s=new studentConstructor();
		
		  studentConstructor s3=new studentConstructor("geetha",34); 
		  studentConstructor s1=new studentConstructor("Reena",45,"Suwanee"); 
		  System.out.println(s1.name);
		  System.out.println(s1.id);
		  
		s1.display();
		 
	
	}

}
