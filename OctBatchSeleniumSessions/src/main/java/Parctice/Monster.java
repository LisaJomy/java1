package Parctice;

public class Monster {
	String species;
	static String location;
	
	public static void setLocation(String newlocation) {
		location=newlocation;
	}
	public static String getLocation() {
		return location;
	}
	public void setSpecies(String newSpecies) {
		species=newSpecies;
	}
	public String getSpecies() {
		return species;
	}
	public static void main(String[] args) {
	
        Monster dracula=new Monster();
		Monster wolfman=new Monster();
		
		Monster.setLocation("Mumbai");
		Monster.setLocation("Delhi");
		
		System.out.println(dracula.getLocation());
		
		System.out.println(wolfman.getLocation());
		
		dracula.setSpecies("Vampire");
		wolfman.setSpecies("Muppet");
		System.out.println(dracula.getSpecies());
		System.out.println(wolfman.getSpecies());
	}

}
