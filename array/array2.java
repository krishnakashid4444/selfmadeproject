package array;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of array");
		
		int size =sc.nextInt();
		int[] a=new int [size];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter the array elements");
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i ]+ " ");
		}
		
		

	}

}
