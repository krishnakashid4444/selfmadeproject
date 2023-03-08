package javaed;

public class interview {

	public static void main(String[] args) {
	      
		int n=2345;
		System.out.println(sum(n));
		System.out.println(oddDigit(n));
		System.out.println(diff(n));
	}
	
	public static String sum(int n)
	{
		int sum=0;
		int d=0;
		while(n!=0) 
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
			
		}
		if(sum%d==0)
		{
			return "yes";
		}
		else 
		{
			return"no";
		}
	}
	
	
	
	
	public static int diff(int n)
	{
		int evensum=0;
		int oddsum=0;
		while(n!=0) 
		{
			int d= n%10;
			if(d%2==0)
			{
				evensum=evensum + d;
			}
			else
			{
				oddsum=oddsum + d;
				
			}
			n= n/10;
		}
		int diff=oddsum - evensum;
		return diff;
	}
	
	public static String oddDigit(int n)
	{
		boolean b=false;
		while(n!=0)
		{
			int d=n%10;
			if(d%2 != 0)
			{
				b=true;
				break;
				
			}
			n=n/10;
			
		}
		if(b)
		{
			return "yes";
			
		}
		else
		{
			return"no";
			
		}
	}

}
