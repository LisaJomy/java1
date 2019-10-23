package Homework;

public class Binarypattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=1;i<=6;i++){ 
		for(int j=1;j<i;j++){
			
			//System.out.println(i+"==================="+(i+j)+"============="+j);
			if((i+j)%2==0){
			System.out.print("0");
			   }
			else
			   {
			System.out.print("1");
			   }

			}
			System.out.println();
			}
	}

}
