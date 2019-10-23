package Homework;

public class Mult54thproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n =5,result;
          int ctr_even=0,ctr_odd=0;
          for (int i=1;i<=30;i++) {
        	  result = n * i;
        	  System.out.println("The multiples of 5 is:"+ n +"*"+ i + "=" + result);
			
		
			 if(result %2==0)
				 System.out.println("It is a even number"+ "\t" +result); 
			 else
			 System.out.println("It is a odd number"+"\t" + result);
			 
			 
			 
			 
			 if(result % 2 == 0)
				{         
		          ctr_even++;
				}
				else
				   ctr_odd++;	
		    }                 
		    System.out.printf("\nNumber of even elements : %d",ctr_even);
			System.out.printf("\nNumber of odd elements : %d",ctr_odd);
			System.out.printf("\n"); 
			 
			 
			 
			 
			
        }
          
        	  
          }
          
      
        
          
          
	


