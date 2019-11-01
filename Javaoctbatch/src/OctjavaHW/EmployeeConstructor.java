package OctjavaHW;

public class EmployeeConstructor {
String name;
int age;
String dept;
int empId;
static String companyname="IBM";
//creating constructors

public EmployeeConstructor() {
	System.out.println(("This is a default constructor...."));
}

public EmployeeConstructor(int age) {
	System.out.println("This is one param const..."+ age);
	}


public EmployeeConstructor(String dept) {
	System.out.println("This is one param const..."+ dept);
	}





	public EmployeeConstructor(String name, int age, String dept, int empId) {

	this.name = name;
	this.age = age;
	this.dept = dept;
	this.empId = empId;
}
	
	

	public EmployeeConstructor(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		
		EmployeeConstructor e= new EmployeeConstructor();
		e.name="neena";
		e.age=25;
		e.dept="QA";
		e.empId=104;
		
		
		EmployeeConstructor e2= new EmployeeConstructor(25);
		EmployeeConstructor e3= new EmployeeConstructor("QA");
		
		EmployeeConstructor e4= new EmployeeConstructor("Deepa",25,"QA",102);
		System.out.println(e4.name+e4.age+e4.dept+e4.empId);
System.out.println(EmployeeConstructor.companyname);
	}

}
