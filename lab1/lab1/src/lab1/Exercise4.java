/**
 * then prints out all the prime numbers up to that Integer
 * @author Yashwanth
 *
 */
package lab1;

public class Exercise4 {

			 public static void main(String args[])
			   {		
			      int i =0;
			      int n=20;
			      int num =0;
			      String  primeNumbers = "";
			      for (i = 1; i <= n; i++)  	   
			      { 		 		  
			         int counter=0; 		  
			         for(num =i; num>=1; num--)
			         {
				    if(i%num==0)
				    {
					counter = counter + 1;
				    }
				 }
				 if (counter ==2)
				 {
				    primeNumbers = primeNumbers + i + " ";
				 }	
			      }	
			      System.out.println("Prime numbers from 1 to "+ n+" are :");
			      System.out.println(primeNumbers);
			   }
}
 