
/**
	*  Create a method that can accept an array of String objects and sort in alphabetical order.
	*  The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. 
	*  Return the resulting array.
	*  Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
	*/
package lab2;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		String[] arr= { "s", "e", "u", "b", "k", "m", "z"};
         sortString(arr);
	}
	public static void sortString(String[] arr)
	{
		int n=0;
		Arrays.sort(arr);
		n=arr.length;
		if(n%2!=0)
		{
		for(int i=0;i<n/2+1;i++)
		{
			
		System.out.print(arr[i].toUpperCase()+" ");
		}
		for(int i=n/2+1;i<n;i++)
		{
			System.out.print(arr[i].toLowerCase()+" ");
		}
		
		}
		else 
		{
			for(int i=0;i<n/2;i++)
			{
				System.out.print(arr[i].toUpperCase()+" ");
			}
			for(int i=n/2;i<n;i++)
			{
				System.out.print(arr[i].toLowerCase()+" ");
			}
		}
		
		
	}


}