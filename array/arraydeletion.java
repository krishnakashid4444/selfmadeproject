package array;

import java.util.Arrays;

public class arraydeletion {

	public static void main(String[] args) {
		int []a = {1,2,5,4};
		System.out.println(Arrays.toString(a));
		a=remove(2,a);
		System.out.println(Arrays.toString(a));
		a=remove(-3,a);
		System.out.println(Arrays.toString(a));;
		a=remove(4,a);
		System.out.println(Arrays.toString(a));
	
		
	}
	
	public static int []remove (int index,int []a){
		if(index <0 || index >=a.length) 
		{
			System.out.println("index not found");
			return a;
		}
		int [] b=new int [a.length - 1];
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
				
			}
			else
			{
				b[i]=a[i+1];
				
			}
		}
		return b;
	}

}
