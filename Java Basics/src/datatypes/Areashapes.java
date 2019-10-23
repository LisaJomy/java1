package datatypes;

public class Areashapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areashapes a = new Areashapes();
		a.area1(4);
		a.area1(5,2);
        a.area1(2.5);
	}
void area1(int s) {
		int t;
		t=s * s;
		System.out.println(t);
	}
void area1(int l,int b) {
	
	int m;
	m=l*b;
	System.out.println(m);
}
void area1(double r) {
	double p;
	
	double pi=3.14;
	p= pi*r*r;
	System.out.println(r);
	System.out.println(p);
	}
}
