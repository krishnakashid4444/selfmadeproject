// wap to find all the perfect squares and cubes in a range.

package array;

import java.util.Scanner;

public class arrayinterview {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				int q=sc.nextInt();
		int [] a=new int[q];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<=a.length;j++)
			{
				if(isperfectSquare(j))
				{
					count++;
					
				}
				else if(isPerfectCube(j))
				{
					count++;
				}
			}
			System.out.println(count);
			}
			
		}
		
		public static boolean isPerfectCube(int n)
		{
			for(int i=1; i*i*i<=n;i++)
			{
				if(i*i*i==n)
				{
					return true;
				}
			}
			return false;
	
	    }
		
		
		public static boolean isperfectSquare(int n)
		{
			for(int i=1;i*i<=n;i++)
			{
				if(i*i==n)
				{
					return true;
				}
			}
			return false;
		}

}
