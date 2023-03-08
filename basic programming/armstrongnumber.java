// armstrong number



package javaed;

public class armstrongnumber {

	public static void main(String[] args)
	{
	       
		int n=153;
		int temp=n;
		int sum=0;
		int count = countOfDigits(n);
		while(n!=0)
		{
			int d=n%10;
			sum=sum + pow(d,count);
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
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
