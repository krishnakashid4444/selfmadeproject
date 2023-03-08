package javaed;

public class sumfactors {

	public static void main(String[] args) {
		int n=6;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
		
		

	}

}
