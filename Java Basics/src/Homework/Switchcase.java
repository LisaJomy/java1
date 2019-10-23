package Homework;

public class Switchcase {

	public static void main(String[] args) {

int day = 1;
String dayvalue = null;
switch (day) {
	case 1:
	dayvalue="Mon";
	break;
	
	case 2:
		dayvalue="Tue";
	break;

	case 3:
		dayvalue="Wed";
	break;
	
	case 4:
		dayvalue="Thu";
	break;
	
	case 5:
		dayvalue="Fri";
	break;

	case 6:
		dayvalue="Sat";
	break;

	case 7:
		dayvalue="Sun";
	break;


default:
	System.out.println("This  is a invalid day");
	break;
}
System.out.println(dayvalue);
	}

}
