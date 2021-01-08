/**
	 *to check if a number is a power of two or not
	 * @author Yashwanth
	 *
	 */package lab1;

public class Exercise8 {

	static boolean ispowerofTwo(int n)
	{
		if(n==0)
			return false;
		
		return (int)(Math.ceil((Math.log(n) / Math.log(2))))==(int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	
  public static void main(String[] args) {
	  if(ispowerofTwo(31))
		  System.out.println("Yes");
	  else
		  System.out.println("No");
		  
	}

}
