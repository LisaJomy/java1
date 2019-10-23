package datatypes;

public class Callbyvalue {
int p;
int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callbyvalue obj = new Callbyvalue();
		
		int x=30;
		int y = 20;
		System.out.println(obj.testsum(x,y));
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testsum(int a,int b) {
		//a=30;
		//b=40;
		int c=a+b;
		return c;
}
	
	public void swap(Callbyvalue  t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
}