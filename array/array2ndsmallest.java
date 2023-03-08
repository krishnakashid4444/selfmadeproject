// write a program to print 2nd LARGEST number.

package array;

public class array2ndsmallest {

	public static void main(String[] args) {
		
		int [] a= {15,7,11,9,15};		   //  {5,7,1,9} {5,7,9,1}
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				slarge =large;
				
				large=a[i];
			
				
			}
			else if (a[i]>slarge && a[i] !=large)
			{
				slarge=a[i];
				
			}
		}
		System.out.println(large);
		System.out.println(slarge);
		

	}

}
