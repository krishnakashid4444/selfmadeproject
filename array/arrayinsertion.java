package array;

import java.util.Arrays;

public class arrayinsertion {

	public static void main(String[] args) {
		
		
		int []a= {11,4,7,5,82,6,13,2};
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
				
			}
			a[j]=temp;
		}
           System.out.println(Arrays.toString(a));
	}

}
