package ConstuctorHW;

import java.util.ArrayList;
import java.util.Arrays;

public class University {

	
//variables
String name;
String country;
String establisheDate;
static ArrayList<String> courses= new ArrayList<String>(Arrays.asList("Aviation","BiomedicalEngineering","Business","GeneralEngineering"));

	
	  //constuctor with all parameters 
public University(String name, String country, String establisheDate) {
	  
	  this.name = name; 
	  this.country = country; 
	  this.establisheDate =establisheDate;
	 }
	  
	  //constructor with different parameters 
public University(String name, String country) {
	  
	  this.name = name; 
	  this.country = country; 
	  }
	 




public static void main(String[] args) {	
		
		
	University u1=new University("Sanjose University" ," California","01-12-1857");	
		
		System.out.println(u1.name+"   "+u1.country+"    "+u1.establisheDate+"    "+courses);
		
		
	}

}
