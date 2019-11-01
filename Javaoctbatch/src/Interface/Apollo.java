package Interface;

public class Apollo extends GlobalPatientData implements USmedical,UKmedical,Indianmedical{

	@Override
	public void physioServices() {
	System.out.println("USphysioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("USoncologyServices");	
	}

	@Override
	public void orthopedicServices() {
		System.out.println("USorthopedicServices");	
	}

	@Override
	public void ENTServices() {
	System.out.println("UKENTServices");
	}

	@Override
	public void ambulanceServices() {
	System.out.println("UKambulanceServices");	
	}

	@Override
	public void emergenccyServices() {
		System.out.println("IndianemergenccyServices");	
	}

	@Override
	public void neuroServices() {
		System.out.println("IndianneuroServices");

	}

	@Override
	public void pediatricServices() {
		System.out.println("IndianpediatricService");	
	}
		
		
	//non overriden method	
		
	public void OPTServices() {
		System.out.println("ApolloOPTServices");	
		
	}	
		
	public void medicalInsurance() {
		System.out.println("ApollomedicalInsurance");	
		
	}		
		
		
	public void pathologyServices() {
		System.out.println("ApollopathologyServices");	
		
	}
//new method added
	@Override
	public void RadiologyServices() {
		// TODO Auto-generated method stub
		
	}
//
	@Override
	public void polioServices() {
		// TODO Auto-generated method stub
		
	}		
			
		
		
		
		
		
		
	

}
