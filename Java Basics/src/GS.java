import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GS {

	public static void main(String[] args) {
	LocalDate k= LocalDate.now();	
System.out.println(k);
	LocalDate f= k.minusDays(2);
	System.out.println(f);
	LocalDate r= k.plusDays(2);
	System.out.println(r);
	
	//displays what is given
	LocalDate g=LocalDate.of(2019,02,13);
	System.out.println(g);
	
	
	
	
	System.out.println(g.isLeapYear());
	System.out.println(g.getDayOfMonth());
	System.out.println(g.lengthOfMonth());
	
	System.out.println(g.lengthOfYear());
	
	System.out.println("****");
	
	LocalDate gg=LocalDate.of(2019,10,3) ;
	LocalDateTime gg1=gg.atTime(3,25,45);
	System.out.println(gg1);
	System.out.println("****");
	
	LocalTime rr=LocalTime.now() ;
	System.out.println(rr);
	
	System.out.println("****");
	
	LocalTime gg4=LocalTime.of(3,45,56) ;
	System.out.println(gg4);
	
	LocalTime dd= gg4.minusHours(2);
	System.out.println(dd);
	LocalTime ee1= gg4.minusMinutes(2);
	System.out.println(ee1);
	LocalTime ff1= gg4.plusHours(2);
	System.out.println(ff1);
	System.out.println("*******0ct 19*******");
	
	

	
	
	
	
	
	
	
	
	}

}
