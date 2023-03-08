package array;

public class arraysmallestno {

	public static void main(String[] args) {
		 
		int [] a= {5,7,1,9};
		int small = Integer.MAX_VALUE;
		for(int i=0; i <a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
				
			}
			
		}
		System.out.println(small);

	}

}
