
public class Overriddeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	name2 b = new name2();
	b.test1();
	b.test1();

	}

}
class name1{
	void test1()
	{
	System.out.println("hello");	
	}
	
}

class  name2 extends name1{
	void test1(int a) {
		System.out.println(40);
	}
	
}