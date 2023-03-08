// wap to make all the elements of the array divisible by k by performing 
// decrement operation. print the the total no of decrement.

package array;

public class Arrayinterview2 {

	public static void main(String[] args) {
		
		int n=5;
		int k=6;
		int []a= {5,9,12,16,25};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int remainder =a[i] %k;
			sum = sum +remainder;
			
			
		}
		System.out.println(sum);
		

		
		

	}

}



