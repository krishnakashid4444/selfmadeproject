package array;

import java.util.Arrays;

public class arrayupdation {

	public static void main(String[] args) {
		
		int []a= {1,0,3,4};
		System.out.println(Arrays.toString(a));
		a=update(1,2,a);
		System.out.println(Arrays.toString(a));
		a=update(-4,0,a);
		System.out.println(Arrays.toString(a));
		a=update(9,55,a);
		System.out.println(Arrays.toString(a));

	}
	
	public static int[] update(int index, int element, int []a)
	{
		if(index <0 || index >=a.length)
		{
			System.out.println("index not found");
			return a;
		}
		a[index]=element;
		return a;
		
	}
	

}
