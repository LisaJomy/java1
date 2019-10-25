import java.util.Scanner;



public class Vote {
	public boolean vot(int age) {
		if(age>=18) {
			System.out.println("The person is eligible to vote");
		}
		else {
			System.out.println("The person is not eligible to vote");
		}
		return true;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);	
		System.out.println("Enter the Age:" );
		int age =s.nextInt();
		Vote gg=new Vote();
	System.out.println(gg.vot(age));
	
	}

}
