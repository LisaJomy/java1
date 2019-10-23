package OctjavaHW;

import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar= new ArrayList();
System.out.println(ar.size());
ar.add(100);//0
ar.add(300);//1
ar.add(500);//2
ar.add(600);//3
ar.add(700);//4
ar.add(200);//5


System.out.println(ar.size());

System.out.println(ar.get(2));
ar.remove(5);

System.out.println(ar.size());
//System.out.println(ar.get(7));
System.out.println(ar.size());
//System.out.println(ar.get(5));
System.out.println(ar.get(4));
ar.remove(2);
System.out.println(ar.get(2));


//to print all the values from the arraylist

for(int i=0;i<ar.size();i++)
System.out.println(ar.get(i));
System.out.println("***");






	}

}
