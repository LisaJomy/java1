package datatypes;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading a = new overloading();
		a.area1(4);
		a.area1(5);
        a.area1(123.456);
	}
void area1(int s) {
	int a;
		a=s * s;
		System.out.println(a);
	}
void area1(int l,int b) {
	int a1;
	a1=l*b;
	System.out.println(a1);
}
void area1(double r) {
	double a2;
	double pi=0.13;
	a2=pi*r*r;
	System.out.println(a2);
}
}
