package array;

import java.util.Arrays;

public class arrayselection {

	public static void main(String[] args) {
		
		int []a= {3,5,1,2,4};
		for(int i =0; i<a.length;i++)
		{
			int min=i;
			
	    for(int j=i+1;j<a.length;j++)
	    {
	    	if(a[j]<a[min])
	    	{
	    		min=j;
	    	}
	    }
	    int temp=a[i];
	    a[i]=a[min];
	    a[min]=temp;

	}
		System.out.println(Arrays.toString(a));

}
}

			
