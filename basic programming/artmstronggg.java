// wap to find armstrong from 1 to 1000


package javaed;

public class artmstronggg {

	public static void main(String[] args)
	{
	       
		//int n=153;
		
		
		for (int i=1;i<=1000;i++)
		{
			
			int temp=i;
			int sum=0;
			int count = countOfDigits(i);
			
		
		while(i!=0)
		{
			int d=i%10;
			sum=sum + pow(d,count);
			i=i/10;
			
		
		
			
		}
		if(sum==temp)
		{
			System.out.println("armstrong number");
		}
		n=temp;
		else
		{
			System.out.println("Not a armstrong number");
		}
		
		}
		

	}
	
	 public static int pow(int n,int p)
	 {
		 int res=1;
		 for(int i=1; i<=p; i++)
		 {
			 res= res *n;
		 }
		 return res;
	 }
	 
	 public static int countOfDigits(int n)
	 {
		 int count=0;
		 while(n!=0)
		 {
			 count++;
			 n=n/10;
			 
		 }
		 return count;
		 
	 }
	 

}
