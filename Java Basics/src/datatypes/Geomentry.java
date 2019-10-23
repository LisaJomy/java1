package datatypes;



public class Geomentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square a =new Square();
		a.area1(4);
		Circle b =new Circle();
		b.area2(4);
		Rectangle c =new Rectangle();
		c.area3(4,5);
	}

}
class Square{
	void area1(int s) {
		int a,p;
		a=s*s;
		p= 4*s;
		System.out.println(a);
		System.out.println(p);
	}
}
	
class Circle{
	void area2(int r) {
		double p=3.14;
		double a; 
		a=p*r*r;
		p= 2*p*r;
		System.out.println(a);
		System.out.println(p);
	}
	
}
class Rectangle{
	void area3(int l,int b) {
		int a,p; 
		a=l*b;
		p= 4*(l + b);
		System.out.println(a);
		System.out.println(p);
	}
}
	

