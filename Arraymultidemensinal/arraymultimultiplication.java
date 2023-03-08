package Arraymultidemensinal;

public class arraymultimultiplication {

	public static void main(String[] args) {
		
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{1,1,0},{0,0,2},{1,1,0}};
		int sum[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum[i][j]=0;
				for (int k = 0; k < sum.length; k++) {
					sum[i][j]+=a[i][k] *b[k][j];
				}
				
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
