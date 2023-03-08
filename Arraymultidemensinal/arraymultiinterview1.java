// wap to find row number and column number of a element present in the matrix and calculate the sum of row number and 
// column number if the sum is even calculate the sum of digits of all the even numbers and if the sum is odd find the 
// sum of digits of all the odd numbers.




package Arraymultidemensinal;

import java.util.Scanner;

public class arraymultiinterview1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int [][]a=new int[n][n];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
            int x=sc.nextInt();
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
            	for(int j=0;j<a[i].length;j++)
            	{
            		if(a[i][j]==x)
            		{
            			sum=i+j;
            			break;
            		}
            	}
            }
            if(sum %2==0)
            {
            	int sum1=0;
            	for(int i=0;i<a.length;i++)
            	{
            		for(int j=0;j<a[i].length;j++)
            		{
            			if(a[i][j]%2==0)
            			{
            				while(a[i][j]!=0)
            				{
            					int d =a[i][j]%10;
            					sum1 = sum1 +d;
            					a[i][j]=a[i][j]/10;
            				}
            			}
            		}
            	}
            	System.out.println(sum1);
            }
            else
            {
            	int sum1=0;
            	for(int i=0;i<a.length;i++)
            	{
            		for(int j=0;i<a[i].length;j++)
            		{
            			if(a[i][j]%2!=0)
            			{
            				while(a[i][j]!=0)
            				{
            					int d= a[i][j]%10;
            					sum1 = sum1 + d;
            					a[i][j]=a[i][j]/10;
            				}
            			}
            		}
            	}
            	System.out.println(sum1);
            }
         }

}



