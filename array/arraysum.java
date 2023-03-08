// sum of array element.


package array;

public class arraysum {

	public static void main(String[] args) {
		
		
		int sum=0;
		int []a= {10,15,20,35,30};
		for (int i=1;i<a.length;i++)
		{
			sum = sum + a[i];
			
		}
		
		System.out.println("sum="+sum);

	}

}
