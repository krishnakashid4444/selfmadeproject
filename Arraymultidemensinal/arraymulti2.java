//jagged array


package Arraymultidemensinal;

public class arraymulti2 {

	public static void main(String[] args) {
		
		int [][]a=new int [3][ ];// for outer array
	// int [] [ ]a=new int [3] [7];
		a[0]=new int[4];           // for inner array
		a[1]=new int [2];
		a[2]=new int [9];
		
		for (int i=0;i<a.length;i++)

		{
			System.out.println(a[i].length);
		}
	}

}
