package javaed;

public class perfectnumber1 {

	public static void main(String[] args) {
		
		for(int n=2;n<=10000;n++)
		{
			  int sum=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum = sum+i;
				}
			}
			if(sum==n)
			{
				System.out.println(n);
			}
		}
		

	}

}
