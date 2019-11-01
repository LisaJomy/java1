package Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		
Company c= new Company();
c.setName("lisa");
System.out.println(c.getName());
c.setEngine("Apollo");
System.out.println(c.getEngine());
c.setLogo("Apple");
System.out.println(c.getLogo());
c.setRevenue(2000);
System.out.println(c.getRevenue());

	}
}
