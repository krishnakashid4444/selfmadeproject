package array;

import java.util.Arrays;

public class arrayaddmiddle {

	public static void main(String[] args) {
		
		int []a = {1,3,4,5};
		System.out.println(Arrays.toString(a));
		a=add(12,1,a);
		System.out.println(Arrays.toString(a));
		a=add(9,15,a);
		System.out.println(Arrays.toString(a));
		
		

	}
	
	public static int[] add (int element, int index, int [] a)
	{
		if (index <0 || index > a.length)
		{
		         System.out.println("Not valid index");
		         return a;
			}
		
		int[] b= new int[a.length + 1];
		b[index] = element;
		for(int i= 0; i<b.length; i++)
		{
			if(i<index)
			{
				b[i]=a[i];
				
			}
			else
			{
				b[i+1] = a[i];
				
			}
		}
		return b;
	}

}
