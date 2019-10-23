package OctjavaHW;

/*Write a program to create a static array, having following cricket data 
--name,age,team name,DOB,gender,Strike Rate
---Try to create multiple object arrays for different players
---Try to print all the values of each player on the console */

public class Multiplearray {

	public static void main(String[] args) {
Object cricket[]= {"Tom",29,"The Record Setters","09-05-1990",62.04,'M'};
	//System.out.println(cricket.length);	
		for(int b=0;b<cricket.length;b++) {
			System.out.println(cricket[b]);
		}
		System.out.println();
Object cricket1[]= {"Rahul",30,"The Record Setters","09-05-1989",64.04,'M'};			
			
for(int b1=0;b1<cricket1.length;b1++) {
	System.out.println(cricket1[b1]);
}	
	System.out.println();		
	Object cricket2[]= {"Tendulkar",28,"The Record Setters","16-11-1991",70.04,'M'};			

	for(int b2=0;b2<cricket2.length;b2++) {
		System.out.println(cricket2[b2]);
	}			
	System.out.println();
	Object cricket3[]= {"Davis",29,"The Record Setters","14-07-1990",61.01,'M'};			
	for(int b3=0;b3<cricket3.length;b3++) {
		System.out.println(cricket3[b3]);
		}			
	System.out.println();
	
	Object cricket4[]= {"James",28,"The Record Setters","06-12-1991",58.01,'M'};			
	for(int b4=0;b4<cricket4.length;b4++) {
		System.out.println(cricket4[b4]);
		}			
	}

}
