package Interface;

public class TestMain {

	public static void main(String[] args) {
		
		Apollo ap =new Apollo();
	
	ap.emergenccyServices();
	ap.ENTServices();
	ap.medicalInsurance();
	ap.ambulanceServices();
	ap.OPTServices();
	ap.neuroServices();
	ap.medicalInsurance();
	ap.pathologyServices();
	System.out.println("The min fee is   "+USmedical.med_fee);
	USmedical.Services_911();
	Indianmedical.dengueServices();
	ap.internship();
	ap.getPatientHistory();
	
	
	System.out.println("**************");
	USmedical us = new Apollo();
	
	us.oncologyServices();
	us.orthopedicServices();
	us.physioServices();
	us.internship();
	System.out.println("**************");
	UKmedical uk =new Apollo();
	uk.ambulanceServices();
	uk.ENTServices();
	
	
	}

}
