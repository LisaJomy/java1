package datatypes;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car();
		a.Model();
		Bicycle b = new Bicycle();
		b.Make();
	}

}
class Vehicle{
	void speedLimit() {
		System.out.println("The speed limit is 60 miles/Hour ");
	}

	void NumberOfWheels() {
		System.out.println("It should be a four wheel Drive");
	}
	void NoOfPassengers() {
		System.out.println("Only four passengers");
		
	}
}
class Car extends Vehicle{
	void Model() {
		System.out.println("Benz");	
	}
}
class Bicycle extends Vehicle{
	void Make() {
		System.out.println("Lady Bird");	
	}
}
