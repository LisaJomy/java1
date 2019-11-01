package ConstuctorHW;

import java.util.ArrayList;
import java.util.Arrays;

public class UniversityGetSet {
	//variables
	String name;
	String country;
	String establisheDate;
	static ArrayList<String> courses= new ArrayList<String>(Arrays.asList("Aviation","BiomedicalEngineering","Business","GeneralEngineering"));
	
//getter and setter
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getEstablisheDate() {
	return establisheDate;
}

public void setEstablisheDate(String establisheDate) {
	this.establisheDate = establisheDate;
}
//main method

public static void main(String[] args) {
	
	UniversityGetSet t=new UniversityGetSet();
	 t.setName("SanJose University");
	 t.setCountry("California"); 
	 t.setEstablisheDate("01-11-1857");
	 
	 
	 
	 System.out.println(t.getName());
	
	 System.out.println(t.getCountry());
	
	 System.out.println(t.getEstablisheDate());	
	 
	 System.out.println(courses);
	}

}
