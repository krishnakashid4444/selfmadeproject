// wap to find all the prime factors of a number


package javaed;

public class primefactor {

	public static void main(String[] args) {
		int n=4;
		
		
           for (int i=1;i<=n;i++)
           {
        	   if(n%i==0)
        	   {
        		   if(prime(i)) 
        		   {
        			System.out.println(i);   
        		   }
        		   
        	   }
           }
	
	   
	
	}
	
	
	public static boolean prime(int n)
	{
		int count=0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
