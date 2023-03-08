// wap to find largest of each row of the matrix.


package Arraymultidemensinal;

import java.util.Scanner;

public class arraymultilargest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [][]a=new int [n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				a[i][j]=sc.nextInt();
				//System.out.println(a[i][j]);
			}
		}
		
		//int large=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int large=Integer.MIN_VALUE;
			for (int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>large)
				{
					large= a[i][j];
				}
				//System.out.println(large);
			}
			System.out.println(large);
			
		}
		
		
		

	}

}
