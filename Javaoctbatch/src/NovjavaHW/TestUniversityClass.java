package NovjavaHW;

public class TestUniversityClass {

	public static void main(String[] args) {
		
		//Parent class object
		University u= new University();
		
		u.regularClasses();
		u.classroom();
		u.eveningClasses();
		u.playGround();
		System.out.println("*********");
		//child class objects
		
		Stanford s= new Stanford();
		s.classroom();
		s.regularClasses();
		s.eveningClasses();
		s.playGround();
		//specific to Stanford
		s.PHDCourses();
		System.out.println("*********");
		MIT m= new MIT();
		
		m.classroom();
		m.eveningClasses();
		m.regularClasses();
		m.playGround();
		//specific to MIT
		m.specialSessions();
		System.out.println("*********");
		NYU n= new NYU();
		n.classroom();
		n.eveningClasses();
		n.playGround();
		n.regularClasses();
		//specific to NYU
		n.DualDegreeCourse();
		
		System.out.println("*********");
		//Top casting
		University u1=new Stanford();
		u1.classroom();
		u1.eveningClasses();
		u1.regularClasses();
		u1.playGround();
		System.out.println("*********");
		
		//Down  casting
		Stanford s1=(Stanford)new University();
		
		
		
		
		
		
		
	}

}
