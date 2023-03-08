//write a program to find product of all the elements in the array which are divisible by 3


package array;

public class arrayproduct {

	public static void main(String[] args) {
		
		int prod = 1;
		int []a= {1,2,3,4,5,6,9};
		for (int i=1;i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				prod = prod * a[i];
				
			}
				
		}
           System.out.println(prod);
	}

}
