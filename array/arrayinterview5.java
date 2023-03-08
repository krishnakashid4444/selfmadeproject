//// wap to find maximum product of 2 integers in array.


package array;

public class arrayinterview5 {

	public static void main(String[] args) {
		
		
		int a[]= {2,3,5,7,-7,5,8,-5};
		int max_product=Integer.MIN_VALUE;
		
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				 
				 if (a[i]*a[j]>max_product)
				 {
					 max_product=a[i]*a[j];
				 }
			}
			
		}
		System.out.println(max_product);
		

	}

}


