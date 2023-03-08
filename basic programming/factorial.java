package javaed;

public class factorial {

	public static void main(String[] args) {
		
		for(int n=1;n<=5;n++)
		{
			int prod=1;
			for(int i=1;i<=n;i++)
			{
				prod=prod*i;
				
			}
			System.out.println(prod);
		}

	}

}
