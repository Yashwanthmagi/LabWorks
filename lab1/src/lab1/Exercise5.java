/**
	 * calculate the sum of first n natural numbers which are divisible by 3 or 5.
	 * @author Yashwanth
	 *
	 */package lab1;

public class Exercise5 {

	public static void main(String[] args) {
		int number=10;
		System.out.println(sumofnaturalnumber(number));
	}
	public static int sumofnaturalnumber(int number)
	{
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(i%3==0)
			{
				sum+=i;
			}
			else if(i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
