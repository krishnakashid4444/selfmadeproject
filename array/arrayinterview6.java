// // write a program to find missing integer from the array of range 1 to n where all the elements are randomly store


package array;

public class arrayinterview6 {

	public static void main(String[] args) {
	   
		int a[]= {6,3,5,1,2};
		
		int n=a.length +1;
		int sum1=(n*(n+1))/2;
		int sum2=0;
		
		for (int i=0;i<a.length;i++)
		{
			sum2=sum2 + a[i];
          
			
		}System.out.println(sum1-sum2);

	}

}
