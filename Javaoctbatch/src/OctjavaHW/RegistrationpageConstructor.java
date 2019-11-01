package OctjavaHW;

public class RegistrationpageConstructor {
	
	String firstname;//m
	String lastname;//m
	long phoneNumber;//m
	String emailid;//m
	String password;//m
	String address;
	String dob;
	String dlnumber;
	String gender;
	boolean agelimit;
	int opt;//m
	//constructor with all parameters
	public RegistrationpageConstructor(String firstname, String lastname, long phoneNumber, String emailid,
			String password, String address, String dob, String dlnumber, String gender, boolean agelimit, int opt) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailid = emailid;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.dlnumber = dlnumber;
		this.gender = gender;
		this.agelimit = agelimit;
		this.opt = opt;
	}
	
	//with mandatory 
	public RegistrationpageConstructor(String firstname, String lastname, long phoneNumber, String emailid,
			String password, int opt) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailid = emailid;
		this.password = password;
		this.opt = opt;
	}
	//default must always be created---rule
	public  RegistrationpageConstructor() {
		System.out.println("How are you doing?...");
		
	}
	
	public void doregistration() {
		System.out.println(firstname+lastname+ phoneNumber);
	}
	
	
	
	
	
	

}
